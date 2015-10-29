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

import us.kbase.kbasegenomes.ContigSet;
import us.kbase.workspace.ObjectIdentity;
import us.kbase.workspace.WorkspaceClient;
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
     * <p>Original spec-file function name: test_tomtom</p>
     * <pre>
     * Returns a test tomtom output
     * </pre>
     * @param   arg1   instance of original type "workspace_name" (A string representing a workspace name.)
     * @return   instance of original type "output" (A string representing an output.)
     */
    @JsonServerMethod(rpc = "testmodule.test_tomtom", async=true)
    public String testTomtom(String arg1, AuthToken authPart, RpcContext... jsonRpcContext) throws Exception {
        String returnVal = null;
        //BEGIN test_tomtom
		Process p = Runtime.getRuntime().exec(commandLine);
		BufferedReader br = new BufferedReader(new InputStreamReader(
				p.getInputStream()));
		String line;
		while ((line = br.readLine()) != null) {
			returnVal += line;
		}

        //END test_tomtom
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
