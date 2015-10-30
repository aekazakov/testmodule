
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

import org.junit.Test;

public class test_java_client {
	
	private static final String USER_NAME = "aktest";
	private static final String PASSWORD = "1475rokegi";
	private String serverUrl = "http://localhost:4107/";
	
	@Test
	public void testTestmoduleServer() throws Exception {
		
		

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

}
