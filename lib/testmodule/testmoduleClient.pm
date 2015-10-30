package testmodule::testmoduleClient;

use JSON::RPC::Client;
use POSIX;
use strict;
use Data::Dumper;
use URI;
use Bio::KBase::Exceptions;
my $get_time = sub { time, 0 };
eval {
    require Time::HiRes;
    $get_time = sub { Time::HiRes::gettimeofday() };
};

use Bio::KBase::AuthToken;

# Client version should match Impl version
# This is a Semantic Version number,
# http://semver.org
our $VERSION = "0.1.0";

=head1 NAME

testmodule::testmoduleClient

=head1 DESCRIPTION


A KBase module: testmodule
This sample module contains one small method - count_contigs.


=cut

sub new
{
    my($class, $url, @args) = @_;
    

    my $self = {
	client => testmodule::testmoduleClient::RpcClient->new,
	url => $url,
	headers => [],
    };

    chomp($self->{hostname} = `hostname`);
    $self->{hostname} ||= 'unknown-host';

    #
    # Set up for propagating KBRPC_TAG and KBRPC_METADATA environment variables through
    # to invoked services. If these values are not set, we create a new tag
    # and a metadata field with basic information about the invoking script.
    #
    if ($ENV{KBRPC_TAG})
    {
	$self->{kbrpc_tag} = $ENV{KBRPC_TAG};
    }
    else
    {
	my ($t, $us) = &$get_time();
	$us = sprintf("%06d", $us);
	my $ts = strftime("%Y-%m-%dT%H:%M:%S.${us}Z", gmtime $t);
	$self->{kbrpc_tag} = "C:$0:$self->{hostname}:$$:$ts";
    }
    push(@{$self->{headers}}, 'Kbrpc-Tag', $self->{kbrpc_tag});

    if ($ENV{KBRPC_METADATA})
    {
	$self->{kbrpc_metadata} = $ENV{KBRPC_METADATA};
	push(@{$self->{headers}}, 'Kbrpc-Metadata', $self->{kbrpc_metadata});
    }

    if ($ENV{KBRPC_ERROR_DEST})
    {
	$self->{kbrpc_error_dest} = $ENV{KBRPC_ERROR_DEST};
	push(@{$self->{headers}}, 'Kbrpc-Errordest', $self->{kbrpc_error_dest});
    }

    #
    # This module requires authentication.
    #
    # We create an auth token, passing through the arguments that we were (hopefully) given.

    {
	my $token = Bio::KBase::AuthToken->new(@args);
	
	if (!$token->error_message)
	{
	    $self->{token} = $token->token;
	    $self->{client}->{token} = $token->token;
	}
        else
        {
	    #
	    # All methods in this module require authentication. In this case, if we
	    # don't have a token, we can't continue.
	    #
	    die "Authentication failed: " . $token->error_message;
	}
    }

    my $ua = $self->{client}->ua;	 
    my $timeout = $ENV{CDMI_TIMEOUT} || (30 * 60);	 
    $ua->timeout($timeout);
    bless $self, $class;
    #    $self->_validate_version();
    return $self;
}




=head2 count_contigs

  $return = $obj->count_contigs($workspace_name, $contigset_id)

=over 4

=item Parameter and return types

=begin html

<pre>
$workspace_name is a testmodule.workspace_name
$contigset_id is a testmodule.contigset_id
$return is a testmodule.CountContigsResults
workspace_name is a string
contigset_id is a string
CountContigsResults is a reference to a hash where the following keys are defined:
	contig_count has a value which is an int

</pre>

=end html

=begin text

$workspace_name is a testmodule.workspace_name
$contigset_id is a testmodule.contigset_id
$return is a testmodule.CountContigsResults
workspace_name is a string
contigset_id is a string
CountContigsResults is a reference to a hash where the following keys are defined:
	contig_count has a value which is an int


=end text

=item Description

Count contigs in a ContigSet
contigset_id - the ContigSet to count.

=back

=cut

 sub count_contigs
{
    my($self, @args) = @_;

# Authentication: required

    if ((my $n = @args) != 2)
    {
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
							       "Invalid argument count for function count_contigs (received $n, expecting 2)");
    }
    {
	my($workspace_name, $contigset_id) = @args;

	my @_bad_arguments;
        (!ref($workspace_name)) or push(@_bad_arguments, "Invalid type for argument 1 \"workspace_name\" (value was \"$workspace_name\")");
        (!ref($contigset_id)) or push(@_bad_arguments, "Invalid type for argument 2 \"contigset_id\" (value was \"$contigset_id\")");
        if (@_bad_arguments) {
	    my $msg = "Invalid arguments passed to count_contigs:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	    Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
								   method_name => 'count_contigs');
	}
    }

    my $result = $self->{client}->call($self->{url}, $self->{headers}, {
	method => "testmodule.count_contigs",
	params => \@args,
    });
    if ($result) {
	if ($result->is_error) {
	    Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
					       code => $result->content->{error}->{code},
					       method_name => 'count_contigs',
					       data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
					      );
	} else {
	    return wantarray ? @{$result->result} : $result->result->[0];
	}
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method count_contigs",
					    status_line => $self->{client}->status_line,
					    method_name => 'count_contigs',
				       );
    }
}
 


=head2 get_string

  $return = $obj->get_string($workspace_name, $user_name)

=over 4

=item Parameter and return types

=begin html

<pre>
$workspace_name is a testmodule.workspace_name
$user_name is a testmodule.user_name
$return is a testmodule.output
workspace_name is a string
user_name is a string
output is a string

</pre>

=end html

=begin text

$workspace_name is a testmodule.workspace_name
$user_name is a testmodule.user_name
$return is a testmodule.output
workspace_name is a string
user_name is a string
output is a string


=end text

=item Description

Returns an output string
user_name - a name of user.

=back

=cut

 sub get_string
{
    my($self, @args) = @_;

# Authentication: required

    if ((my $n = @args) != 2)
    {
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
							       "Invalid argument count for function get_string (received $n, expecting 2)");
    }
    {
	my($workspace_name, $user_name) = @args;

	my @_bad_arguments;
        (!ref($workspace_name)) or push(@_bad_arguments, "Invalid type for argument 1 \"workspace_name\" (value was \"$workspace_name\")");
        (!ref($user_name)) or push(@_bad_arguments, "Invalid type for argument 2 \"user_name\" (value was \"$user_name\")");
        if (@_bad_arguments) {
	    my $msg = "Invalid arguments passed to get_string:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	    Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
								   method_name => 'get_string');
	}
    }

    my $result = $self->{client}->call($self->{url}, $self->{headers}, {
	method => "testmodule.get_string",
	params => \@args,
    });
    if ($result) {
	if ($result->is_error) {
	    Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
					       code => $result->content->{error}->{code},
					       method_name => 'get_string',
					       data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
					      );
	} else {
	    return wantarray ? @{$result->result} : $result->result->[0];
	}
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method get_string",
					    status_line => $self->{client}->status_line,
					    method_name => 'get_string',
				       );
    }
}
 


=head2 get_output

  $return = $obj->get_output($arg_1)

=over 4

=item Parameter and return types

=begin html

<pre>
$arg_1 is a string
$return is a testmodule.CommandOutput
CommandOutput is a reference to a hash where the following keys are defined:
	command_output has a value which is a testmodule.output
	command_error has a value which is a string
output is a string

</pre>

=end html

=begin text

$arg_1 is a string
$return is a testmodule.CommandOutput
CommandOutput is a reference to a hash where the following keys are defined:
	command_output has a value which is a testmodule.output
	command_error has a value which is a string
output is a string


=end text

=item Description

Takes string, executes it as a commond and returns stderr and stdout output. Very dangerous method.

=back

=cut

 sub get_output
{
    my($self, @args) = @_;

# Authentication: required

    if ((my $n = @args) != 1)
    {
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
							       "Invalid argument count for function get_output (received $n, expecting 1)");
    }
    {
	my($arg_1) = @args;

	my @_bad_arguments;
        (!ref($arg_1)) or push(@_bad_arguments, "Invalid type for argument 1 \"arg_1\" (value was \"$arg_1\")");
        if (@_bad_arguments) {
	    my $msg = "Invalid arguments passed to get_output:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	    Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
								   method_name => 'get_output');
	}
    }

    my $result = $self->{client}->call($self->{url}, $self->{headers}, {
	method => "testmodule.get_output",
	params => \@args,
    });
    if ($result) {
	if ($result->is_error) {
	    Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
					       code => $result->content->{error}->{code},
					       method_name => 'get_output',
					       data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
					      );
	} else {
	    return wantarray ? @{$result->result} : $result->result->[0];
	}
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method get_output",
					    status_line => $self->{client}->status_line,
					    method_name => 'get_output',
				       );
    }
}
 


=head2 find_motifs_with_meme_from_ws

  $output_id = $obj->find_motifs_with_meme_from_ws($arg_1, $workspace_name, $MemeRunParameters)

=over 4

=item Parameter and return types

=begin html

<pre>
$arg_1 is a string
$workspace_name is a testmodule.workspace_name
$MemeRunParameters is a testmodule.MemeRunParameters
$output_id is a string
workspace_name is a string
MemeRunParameters is a reference to a hash where the following keys are defined:
	mod has a value which is a string
	nmotifs has a value which is an int
	minw has a value which is an int
	maxw has a value which is an int
	nsites has a value which is an int
	minsites has a value which is an int
	maxsites has a value which is an int
	pal has a value which is an int
	revcomp has a value which is an int
	source_ref has a value which is a testmodule.sequence_set_ref
	source_id has a value which is a string
sequence_set_ref is a string

</pre>

=end html

=begin text

$arg_1 is a string
$workspace_name is a testmodule.workspace_name
$MemeRunParameters is a testmodule.MemeRunParameters
$output_id is a string
workspace_name is a string
MemeRunParameters is a reference to a hash where the following keys are defined:
	mod has a value which is a string
	nmotifs has a value which is an int
	minw has a value which is an int
	maxw has a value which is an int
	nsites has a value which is an int
	minsites has a value which is an int
	maxsites has a value which is an int
	pal has a value which is an int
	revcomp has a value which is an int
	source_ref has a value which is a testmodule.sequence_set_ref
	source_id has a value which is a string
sequence_set_ref is a string


=end text

=item Description

Returns kbase id of MemeRunResult object that contains results of a single MEME run
MEME will be run with -dna -text parameters
string ws_name - workspace id to save run result
MemeRunParameters params - parameters of MEME run

=back

=cut

 sub find_motifs_with_meme_from_ws
{
    my($self, @args) = @_;

# Authentication: required

    if ((my $n = @args) != 3)
    {
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
							       "Invalid argument count for function find_motifs_with_meme_from_ws (received $n, expecting 3)");
    }
    {
	my($arg_1, $workspace_name, $MemeRunParameters) = @args;

	my @_bad_arguments;
        (!ref($arg_1)) or push(@_bad_arguments, "Invalid type for argument 1 \"arg_1\" (value was \"$arg_1\")");
        (!ref($workspace_name)) or push(@_bad_arguments, "Invalid type for argument 2 \"workspace_name\" (value was \"$workspace_name\")");
        (ref($MemeRunParameters) eq 'HASH') or push(@_bad_arguments, "Invalid type for argument 3 \"MemeRunParameters\" (value was \"$MemeRunParameters\")");
        if (@_bad_arguments) {
	    my $msg = "Invalid arguments passed to find_motifs_with_meme_from_ws:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	    Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
								   method_name => 'find_motifs_with_meme_from_ws');
	}
    }

    my $result = $self->{client}->call($self->{url}, $self->{headers}, {
	method => "testmodule.find_motifs_with_meme_from_ws",
	params => \@args,
    });
    if ($result) {
	if ($result->is_error) {
	    Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
					       code => $result->content->{error}->{code},
					       method_name => 'find_motifs_with_meme_from_ws',
					       data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
					      );
	} else {
	    return wantarray ? @{$result->result} : $result->result->[0];
	}
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method find_motifs_with_meme_from_ws",
					    status_line => $self->{client}->status_line,
					    method_name => 'find_motifs_with_meme_from_ws',
				       );
    }
}
 


=head2 find_motifs_with_meme

  $return = $obj->find_motifs_with_meme($arg_1)

=over 4

=item Parameter and return types

=begin html

<pre>
$arg_1 is a string
$return is a testmodule.output
output is a string

</pre>

=end html

=begin text

$arg_1 is a string
$return is a testmodule.output
output is a string


=end text

=item Description

Returns kbase id of MemeRunResult object that contains results of a single MEME run
MEME will be run with -dna -text parameters
string ws_name - workspace id to save run result
MemeRunParameters params - parameters of MEME run

=back

=cut

 sub find_motifs_with_meme
{
    my($self, @args) = @_;

# Authentication: required

    if ((my $n = @args) != 1)
    {
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
							       "Invalid argument count for function find_motifs_with_meme (received $n, expecting 1)");
    }
    {
	my($arg_1) = @args;

	my @_bad_arguments;
        (!ref($arg_1)) or push(@_bad_arguments, "Invalid type for argument 1 \"arg_1\" (value was \"$arg_1\")");
        if (@_bad_arguments) {
	    my $msg = "Invalid arguments passed to find_motifs_with_meme:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	    Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
								   method_name => 'find_motifs_with_meme');
	}
    }

    my $result = $self->{client}->call($self->{url}, $self->{headers}, {
	method => "testmodule.find_motifs_with_meme",
	params => \@args,
    });
    if ($result) {
	if ($result->is_error) {
	    Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
					       code => $result->content->{error}->{code},
					       method_name => 'find_motifs_with_meme',
					       data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
					      );
	} else {
	    return wantarray ? @{$result->result} : $result->result->[0];
	}
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method find_motifs_with_meme",
					    status_line => $self->{client}->status_line,
					    method_name => 'find_motifs_with_meme',
				       );
    }
}
 
  

sub version {
    my ($self) = @_;
    my $result = $self->{client}->call($self->{url}, $self->{headers}, {
        method => "testmodule.version",
        params => [],
    });
    if ($result) {
        if ($result->is_error) {
            Bio::KBase::Exceptions::JSONRPC->throw(
                error => $result->error_message,
                code => $result->content->{code},
                method_name => 'find_motifs_with_meme',
            );
        } else {
            return wantarray ? @{$result->result} : $result->result->[0];
        }
    } else {
        Bio::KBase::Exceptions::HTTP->throw(
            error => "Error invoking method find_motifs_with_meme",
            status_line => $self->{client}->status_line,
            method_name => 'find_motifs_with_meme',
        );
    }
}

sub _validate_version {
    my ($self) = @_;
    my $svr_version = $self->version();
    my $client_version = $VERSION;
    my ($cMajor, $cMinor) = split(/\./, $client_version);
    my ($sMajor, $sMinor) = split(/\./, $svr_version);
    if ($sMajor != $cMajor) {
        Bio::KBase::Exceptions::ClientServerIncompatible->throw(
            error => "Major version numbers differ.",
            server_version => $svr_version,
            client_version => $client_version
        );
    }
    if ($sMinor < $cMinor) {
        Bio::KBase::Exceptions::ClientServerIncompatible->throw(
            error => "Client minor version greater than Server minor version.",
            server_version => $svr_version,
            client_version => $client_version
        );
    }
    if ($sMinor > $cMinor) {
        warn "New client version available for testmodule::testmoduleClient\n";
    }
    if ($sMajor == 0) {
        warn "testmodule::testmoduleClient version is $svr_version. API subject to change.\n";
    }
}

=head1 TYPES



=head2 contigset_id

=over 4



=item Description

A string representing a ContigSet id.


=item Definition

=begin html

<pre>
a string
</pre>

=end html

=begin text

a string

=end text

=back



=head2 workspace_name

=over 4



=item Description

A string representing a workspace name.


=item Definition

=begin html

<pre>
a string
</pre>

=end html

=begin text

a string

=end text

=back



=head2 CountContigsResults

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
contig_count has a value which is an int

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
contig_count has a value which is an int


=end text

=back



=head2 user_name

=over 4



=item Description

A string representing a user name.


=item Definition

=begin html

<pre>
a string
</pre>

=end html

=begin text

a string

=end text

=back



=head2 sequence_set_ref

=over 4



=item Description

Represents WS KBaseSequences.SequenceSet identifier
@id ws KBaseSequences.SequenceSet


=item Definition

=begin html

<pre>
a string
</pre>

=end html

=begin text

a string

=end text

=back



=head2 MemeRunParameters

=over 4



=item Description

Contains parameters of a MEME run
string mod - distribution of motifs, acceptable values are "oops", "zoops", "anr"
int nmotifs - maximum number of motifs to find
int minw - minumum motif width
int maxw - maximum motif width
int nsites - number of sites for each motif
int minsites - minimum number of sites for each motif
int maxsites - maximum number of sites for each motif
int pal - force palindromes, acceptable values are 0 and 1
int revcomp - allow sites on + or - DNA strands, acceptable values are 0 and 1
sequence_set_ref source_ref - WS reference to source SequenceSet object
string source_id - id of source SequenceSet object

@optional nmotifs minw maxw nsites minsites maxsites pal revcomp source_ref source_id


=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
mod has a value which is a string
nmotifs has a value which is an int
minw has a value which is an int
maxw has a value which is an int
nsites has a value which is an int
minsites has a value which is an int
maxsites has a value which is an int
pal has a value which is an int
revcomp has a value which is an int
source_ref has a value which is a testmodule.sequence_set_ref
source_id has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
mod has a value which is a string
nmotifs has a value which is an int
minw has a value which is an int
maxw has a value which is an int
nsites has a value which is an int
minsites has a value which is an int
maxsites has a value which is an int
pal has a value which is an int
revcomp has a value which is an int
source_ref has a value which is a testmodule.sequence_set_ref
source_id has a value which is a string


=end text

=back



=head2 output

=over 4



=item Description

A string representing an output.


=item Definition

=begin html

<pre>
a string
</pre>

=end html

=begin text

a string

=end text

=back



=head2 CommandOutput

=over 4



=item Description

A structure containing output and error strings.


=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
command_output has a value which is a testmodule.output
command_error has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
command_output has a value which is a testmodule.output
command_error has a value which is a string


=end text

=back



=cut

package testmodule::testmoduleClient::RpcClient;
use base 'JSON::RPC::Client';
use POSIX;
use strict;

#
# Override JSON::RPC::Client::call because it doesn't handle error returns properly.
#

sub call {
    my ($self, $uri, $headers, $obj) = @_;
    my $result;


    {
	if ($uri =~ /\?/) {
	    $result = $self->_get($uri);
	}
	else {
	    Carp::croak "not hashref." unless (ref $obj eq 'HASH');
	    $result = $self->_post($uri, $headers, $obj);
	}

    }

    my $service = $obj->{method} =~ /^system\./ if ( $obj );

    $self->status_line($result->status_line);

    if ($result->is_success) {

        return unless($result->content); # notification?

        if ($service) {
            return JSON::RPC::ServiceObject->new($result, $self->json);
        }

        return JSON::RPC::ReturnObject->new($result, $self->json);
    }
    elsif ($result->content_type eq 'application/json')
    {
        return JSON::RPC::ReturnObject->new($result, $self->json);
    }
    else {
        return;
    }
}


sub _post {
    my ($self, $uri, $headers, $obj) = @_;
    my $json = $self->json;

    $obj->{version} ||= $self->{version} || '1.1';

    if ($obj->{version} eq '1.0') {
        delete $obj->{version};
        if (exists $obj->{id}) {
            $self->id($obj->{id}) if ($obj->{id}); # if undef, it is notification.
        }
        else {
            $obj->{id} = $self->id || ($self->id('JSON::RPC::Client'));
        }
    }
    else {
        # $obj->{id} = $self->id if (defined $self->id);
	# Assign a random number to the id if one hasn't been set
	$obj->{id} = (defined $self->id) ? $self->id : substr(rand(),2);
    }

    my $content = $json->encode($obj);

    $self->ua->post(
        $uri,
        Content_Type   => $self->{content_type},
        Content        => $content,
        Accept         => 'application/json',
	@$headers,
	($self->{token} ? (Authorization => $self->{token}) : ()),
    );
}



1;
