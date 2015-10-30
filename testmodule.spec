/*
A KBase module: testmodule
This sample module contains one small method - count_contigs.
*/

module testmodule {
	/*
	A string representing a ContigSet id.
	*/
	typedef string contigset_id;
	
	/*
	A string representing a workspace name.
	*/
	typedef string workspace_name;
	
	typedef structure {
	    int contig_count;
	} CountContigsResults;
	
	/*
	Count contigs in a ContigSet
	contigset_id - the ContigSet to count.
	*/
	funcdef count_contigs(workspace_name,contigset_id) returns (CountContigsResults) authentication required;

	/*
	A string representing a user name.
	*/
	typedef string user_name;

	/* Represents WS KBaseSequences.SequenceSet identifier
		@id ws KBaseSequences.SequenceSet
	*/
	typedef string sequence_set_ref;
	
	/* Contains parameters of a MEME run
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

	*/
	typedef structure {
		string mod;
		int nmotifs;
		int minw;
		int maxw;
		int nsites;
		int minsites;
		int maxsites;
		int pal;
		int revcomp;
		sequence_set_ref source_ref;
		string source_id;
	} MemeRunParameters;


	/*
	A string representing an output.
	*/
	typedef string output;

	/*
	A structure containing output and error strings.
	*/

	typedef structure {
	    output command_output;
	    string command_error;
	} CommandOutput;

	/*
	Returns an output string
	user_name - a name of user.
	*/
	funcdef get_string(workspace_name,user_name) returns (output) authentication required;
	
	/*
	Takes string, executes it as a commond and returns stderr and stdout output. Very dangerous method.
	*/
	funcdef get_output(string) returns (CommandOutput) authentication required;
	
	/*
		Returns kbase id of MemeRunResult object that contains results of a single MEME run
		MEME will be run with -dna -text parameters
		string ws_name - workspace id to save run result
		MemeRunParameters params - parameters of MEME run
	*/
	funcdef find_motifs_with_meme_from_ws(string, workspace_name, MemeRunParameters) returns(string output_id) authentication required;

	/*
		Returns kbase id of MemeRunResult object that contains results of a single MEME run
		MEME will be run with -dna -text parameters
		string ws_name - workspace id to save run result
		MemeRunParameters params - parameters of MEME run
	*/
	funcdef find_motifs_with_meme(string) returns(output) authentication required;

};
