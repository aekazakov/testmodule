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

	/*
	A string representing an output.
	*/
	typedef string output;

	/*
	Returns an output string
	user_name - a name of user.
	*/
	funcdef get_string(workspace_name,user_name) returns (output) authentication required;
};
