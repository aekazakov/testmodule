
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import testmodule.CommandOutput;
import testmodule.TestmoduleClient;
import testmodule.TestmoduleServer;
import us.kbase.auth.AuthService;
import us.kbase.auth.AuthToken;
import us.kbase.common.service.ServerException;
import testmodule.MemeRunParameters;

import org.junit.Test;

public class test_java_client {
	
	private static final String USER_NAME = "aktest";
	private static final String PASSWORD = "1475rokegi";
	private String serverUrl = "http://localhost:4107/";
	
	@Test
	public void testTestmoduleServer() throws Exception {
		
		
		String command = "pwd";


		try {
	    	AuthToken token = AuthService.login(USER_NAME, new String(PASSWORD)).getToken();
	        TestmoduleServer server = new TestmoduleServer();
	        CommandOutput commandOutput = server.getOutput(command, token, null);
	        
	        System.out.println(commandOutput.getCommandOutput());
	        System.out.println(commandOutput.getCommandError());
	        
	        
	    } catch (NullPointerException e) {
	        System.err.println(e.getMessage());
	        e.printStackTrace();
	        throw e;
	    }
	}

	@Test
	public void testTestmoduleClient() throws Exception {
		
		String command = "pwd";

	    try {
	    	AuthToken token = AuthService.login(USER_NAME, new String(PASSWORD)).getToken();
	        URL url = new URL(serverUrl);
	        TestmoduleClient client = new TestmoduleClient(url, token);
	        client.setIsInsecureHttpConnectionAllowed(true);
	        CommandOutput commandOutput = client.getOutput(command, null);
	        
	        System.out.println(commandOutput.getCommandOutput());
	        System.out.println(commandOutput.getCommandError());
	        
	        
	    } catch (ServerException e) {
	        System.err.println(e.getData());
	        e.printStackTrace();
	        throw e;
	    }
	}
/*
	@Test
	public void testMemeRun() throws Exception {
		
		String queryName = "pwd";
		String wsName = "AKtest";

		MemeRunParameters params = new MemeRunParameters();
		params.setMod("oops");
		params.setNmotifs(2L);
		params.setMinw(14L);
		params.setMaxw(24L);
		params.setNsites(0L);
		params.setMinsites(0L);
		params.setMaxsites(0L);
		params.setPal(1L);
		params.setRevcomp(0L);
		params.setSourceId(queryName);
		params.setSourceRef(wsName + "/" + queryName);

    	AuthToken token = AuthService.login(USER_NAME, new String(PASSWORD)).getToken();
        URL url = new URL(serverUrl);
        TestmoduleClient client = new TestmoduleClient(url, token);
        client.setIsInsecureHttpConnectionAllowed(true);
        String result  = client.findMotifsWithMemeFromWs(wsName, "testObject", params, null);
        
        System.out.println(result);
	}
*/

	
	@Test
	public void testMemeRun() throws Exception {
		
		String query = ">209110 upstream\n" +
				"GCCGGGCACGGGCCACCTCATCATCCGAGACTGCGACGTCTTTCATGGGGTCTCCGGTTG" +
				"CTCAAGTATGAGGGTACGATGCCTCCACTCCTGCCCCAAGTCCAGCCGTGCGTGAATGCG" +
				"GTCACGTTCGTCACCATGAGGGTGACCGGGTTGCCGGGTGCGATACGCAGGGCTAACGCT" +
				"GCCATAATCGGGAGAGGAGTATCCACGCTTCCGGTCATGCATCATCCACCCGCATCCGCA" +
				"AGGAGGCCCC\n" +
				">209112 upstream\n" +
				"AGAGTGTGAAGCGGCGGAGGAAGGCGAAGCGTGATGACATGGACATGGGGCCTCCTTGCG" +
				"GATGCGGGTGGATGATGCATGACCGGAAGCGTGGATACTCCTCTCCCGATTATGGCAGCG" +
				"TTAGCCCTGCGTATCGCACCCGGCAACCCGGTCACCCTCATGGTGACGAACGTGACCGCA" +
				"TTCACGCACGGCTGGACTTGGGGCAGGAGTGGAGGCATCGTACCCTCATACTTGAGCAAC" +
				"CGGAGACCCC\n" +
				">209114 upstream\n" +
				"AGGGCAGCCTCTCCCCGCGCATGCCCCTTTCCGGTCACCACCCGGCAACATTCCGTGACC" +
				"ATGTTGCCCCGGCACCGCCACTCTCCGCATAGTCGCACATGCTCCCGTGCCCGCGGGCGC" +
				"AAACCGGGACAACGGGGCGGCTGAGGCTGACGCCCGCCCAACGCACCACCGCCACACAGG" +
				"CACTCCCCATGGGACGACGGGCAAGGGGCGTACGCCACGCATCCACATGACACCATAACC" +
				"GGGAAGACCC\n" +
				">393587 upstream\n" +
				"GCTCCGCATCCAGCAGCTTGACCCCCTCCGGCACCACAAAAAGTGCATGCGGCGCTATTC" +
				"TGCCGCCCGCCGGACGGCCGGACCGTACTGTTGTGCCGGTTGTCGTCATGGCTGCTCCCG" +
				"TAAACTGGTTTTGTCACGATTTTCAGGACATTCGTGACCGCGTTGGCAGACGATACACAA" +
				"CTTCGTAAGTGCGTACATGCAGTAAATACATACTCGCACTTCTGCACACGCATCAAGGAG" +
				"GATTCATCCC\n" +
				">7532041 upstream\n" +
				"TATCCTGCTGCAAATATGTAGAAACCCACATCGTAGTCCGTCCGAAAAGGAGCGGATATC" +
				"ATCGCGGCTACCGGTCACGCTTTTCCGCGCTACCGTGACCGGCTTGAGCTCAACGGACCG" +
				"GAAAGCTTATAGGATATGAACGTCGGAATCTGCGGTTTCGAGAACACCTTCCTGCGGCCC" +
				"GGTTGTTGCTTGAGAGCCTGTAAACACCCTCGGCGGAACACCGCCCAACCTTCGCCAACG" +
				"GACAATGCGA\n" +
				">8501762 upstream\n" +
				"GGGGCACCCTCCCCCAAAAACCTTTATTCGTATTGTCCTATTGTTGCGCAGGGGAAGGGC" +
				"CACACGGCCCTTCCCCTTTTTCTTTGGCGAATCGGGGCATTCCTGTGGGCGCCACGCCCG" +
				"CAGGCATCACGCCGGGGGCCTTTTCCGACAGCATGCCGCTGGCCGTGTCACTGCCCCGTG" +
				"CCACGGTCACCAAGACGAAAGTTTTCGTGCCTCTGTTGCGGCCCCCCGGCCTTTTCGCCA" +
				"CAGTCGGGCC\n";


    	AuthToken token = AuthService.login(USER_NAME, new String(PASSWORD)).getToken();
        URL url = new URL(serverUrl);
        TestmoduleClient client = new TestmoduleClient(url, token);
        client.setIsInsecureHttpConnectionAllowed(true);
        String result  = client.findMotifsWithMeme(query);
        
        System.out.println(result);
	}
}
