package testmodule;

import java.io.File;
import us.kbase.auth.AuthToken;
import us.kbase.common.service.JsonServerMethod;
import us.kbase.common.service.JsonServerServlet;
import us.kbase.common.service.JsonServerSyslog;
import us.kbase.common.service.RpcContext;

//BEGIN_HEADER
import java.net.URL;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import us.kbase.kbasegenomes.ContigSet;
import us.kbase.meme.MemeServerImpl;
import us.kbase.kbasesequences.SequenceSet;
import us.kbase.meme.MemeRunResult;
import us.kbase.workspace.ObjectIdentity;
import us.kbase.workspace.ObjectSaveData;
import us.kbase.workspace.SaveObjectsParams;
import us.kbase.workspace.WorkspaceClient;
import us.kbase.common.service.UObject;
//END_HEADER

/**
 * <p>Original spec-file module name: testmodule</p>
 * <pre>
 * A KBase module: testmodule
 * This sample module contains one small method - count_contigs.
 * </pre>
 */
public class TestmoduleServer extends JsonServerServlet {
    private static final long serialVersionUID = 1L;

    //BEGIN_CLASS_HEADER
    private final String wsUrl;
    
    private static Thread readInNewThread(final InputStream is, final StringBuilder target) {
    	Thread ret = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(is));
					String line;
					while ((line = br.readLine()) != null) {
						target.append(line).append("\n");
					}
				} catch (IOException ex) {
					throw new IllegalStateException(ex);
				}
			}
    	});
    	ret.start();
    	return ret;
    }
    //END_CLASS_HEADER

    public TestmoduleServer() throws Exception {
        super("testmodule");
        //BEGIN_CONSTRUCTOR
        wsUrl = config.get("workspace-url");
        //END_CONSTRUCTOR
    }

    /**
     * <p>Original spec-file function name: count_contigs</p>
     * <pre>
     * Count contigs in a ContigSet
     * contigset_id - the ContigSet to count.
     * </pre>
     * @param   arg1   instance of original type "workspace_name" (A string representing a workspace name.)
     * @param   arg2   instance of original type "contigset_id" (A string representing a ContigSet id.)
     * @return   instance of type {@link testmodule.CountContigsResults CountContigsResults}
     */
    @JsonServerMethod(rpc = "testmodule.count_contigs", async=true)
    public CountContigsResults countContigs(String arg1, String arg2, AuthToken authPart, RpcContext... jsonRpcContext) throws Exception {
        CountContigsResults returnVal = null;
        //BEGIN count_contigs
        WorkspaceClient wc = new WorkspaceClient(new URL(this.wsUrl), authPart);
        wc.setAuthAllowedForHttp(true);
        ContigSet contigSet = wc.getObjects(Arrays.asList(new ObjectIdentity().withRef(
                arg1 + "/" + arg2))).get(0).getData().asClassInstance(ContigSet.class);
        int contigCount = contigSet.getContigs().size();
        returnVal = new CountContigsResults().withContigCount((long)contigCount);
        //END count_contigs
        return returnVal;
    }

    /**
     * <p>Original spec-file function name: get_string</p>
     * <pre>
     * Returns an output string
     * user_name - a name of user.
     * </pre>
     * @param   arg1   instance of original type "workspace_name" (A string representing a workspace name.)
     * @param   arg2   instance of original type "user_name" (A string representing a user name.)
     * @return   instance of original type "output" (A string representing an output.)
     */
    @JsonServerMethod(rpc = "testmodule.get_string", async=true)
    public String getString(String arg1, String arg2, AuthToken authPart, RpcContext... jsonRpcContext) throws Exception {
        String returnVal = null;
        //BEGIN get_string
        if (arg2.equals("")) arg2="Horatio";
        returnVal = "Alas, poor Yorick! I knew him, " + arg2 + "...";
        //END get_string
        return returnVal;
    }

    /**
     * <p>Original spec-file function name: get_output</p>
     * <pre>
     * Takes string, executes it as a commond and returns stderr and stdout output. Very dangerous method.
     * </pre>
     * @param   arg1   instance of String
     * @return   instance of type {@link testmodule.CommandOutput CommandOutput}
     */
    @JsonServerMethod(rpc = "testmodule.get_output", async=true)
    public CommandOutput getOutput(String arg1, AuthToken authPart, RpcContext... jsonRpcContext) throws Exception {
        CommandOutput returnVal = null;
        //BEGIN get_output
        
        
        StringBuilder output = new StringBuilder("Output lines: \n");
        StringBuilder error = new StringBuilder("Error lines: \n");
		Process p = Runtime.getRuntime().exec(arg1);
		
		Thread outputThread = readInNewThread(p.getInputStream(), output);
		Thread errorThread = readInNewThread(p.getErrorStream(), error);
		outputThread.join();
		errorThread.join();
		p.waitFor();
		
		returnVal = new CommandOutput().withCommandOutput(output.toString()).withCommandError(error.toString());
        //END get_output
        return returnVal;
    }

    /**
     * <p>Original spec-file function name: find_motifs_with_meme_from_ws</p>
     * <pre>
     * Returns kbase id of MemeRunResult object that contains results of a single MEME run
     * MEME will be run with -dna -text parameters
     * string ws_name - workspace id to save run result
     * MemeRunParameters params - parameters of MEME run
     * </pre>
     * @param   arg1   instance of String
     * @param   arg2   instance of original type "workspace_name" (A string representing a workspace name.)
     * @param   arg3   instance of type {@link testmodule.MemeRunParameters MemeRunParameters}
     * @return   parameter "output_id" of String
     */
    @JsonServerMethod(rpc = "testmodule.find_motifs_with_meme_from_ws", async=true)
    public String findMotifsWithMemeFromWs(String arg1, String arg2, MemeRunParameters arg3, AuthToken authPart, RpcContext... jsonRpcContext) throws Exception {
        String returnVal = null;
        //BEGIN find_motifs_with_meme_from_ws
        WorkspaceClient wc = new WorkspaceClient(new URL(this.wsUrl), authPart);
        wc.setAuthAllowedForHttp(true);
        SequenceSet query = wc.getObjects(Arrays.asList(new ObjectIdentity().withRef(
                arg1 + "/" + arg3.getSourceRef()))).get(0).getData().asClassInstance(SequenceSet.class);
        MemeRunResult result = MemeServerImpl.findMotifsWithMeme(query, arg3, arg2);
        returnVal = result.getId(); 
        wc.saveObjects (new SaveObjectsParams().withObjects(Arrays.asList(new ObjectSaveData().withName(arg2).withType("MEME.MemeRunResult").withData(UObject.transformObjectToObject(
				result, UObject.class)))));
        //END find_motifs_with_meme_from_ws
        return returnVal;
    }

    /**
     * <p>Original spec-file function name: find_motifs_with_meme</p>
     * <pre>
     * Returns kbase id of MemeRunResult object that contains results of a single MEME run
     * MEME will be run with -dna -text parameters
     * string ws_name - workspace id to save run result
     * MemeRunParameters params - parameters of MEME run
     * </pre>
     * @param   arg1   instance of String
     * @return   instance of original type "output" (A string representing an output.)
     */
    @JsonServerMethod(rpc = "testmodule.find_motifs_with_meme", async=true)
    public String findMotifsWithMeme(String arg1, AuthToken authPart, RpcContext... jsonRpcContext) throws Exception {
        String returnVal = null;
        //BEGIN find_motifs_with_meme
        //END find_motifs_with_meme
        return returnVal;
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 1) {
            new TestmoduleServer().startupServer(Integer.parseInt(args[0]));
        } else if (args.length == 3) {
            JsonServerSyslog.setStaticUseSyslog(false);
            JsonServerSyslog.setStaticMlogFile(args[1] + ".log");
            new TestmoduleServer().processRpcCall(new File(args[0]), new File(args[1]), args[2]);
        } else {
            System.out.println("Usage: <program> <server_port>");
            System.out.println("   or: <program> <context_json_file> <output_json_file> <token>");
            return;
        }
    }
}
