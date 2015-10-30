package us.kbase.meme;

public class MemeServerConfig {
	
	//File and directory paths
	//Where temporary files would be created? 
	protected static String WORK_DIRECTORY = "/tmp/meme";// = "/var/tmp/meme"; 

	//Other options

	protected static final String MAST_RUN_RESULT_TYPE = "MEME.MastRunResult";
	protected static final String MEME_PSPM_COLLECTION_TYPE = "MEME.MemePSPMCollection";
	protected static final String TOMTOM_RUN_RESULT_TYPE = "MEME.TomtomRunResult";
	protected static final String MEME_RUN_RESULT_TYPE = "MEME.MemeRunResult";

}
