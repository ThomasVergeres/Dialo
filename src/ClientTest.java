import java.io.IOException;
import java.io.*;
import java.net.*;

public class ClientTest {

	
	

    public static void main(String[] args) {
		boolean running =  true;
		String me = "75.75.13.191";
		String hn = "";
		int forwardedPort = 8080;
		byte[] buffer = new byte[256];
		String serverIP = "108.167.183.7";
 
        String hostname = me;
        int port = forwardedPort;
 
        try (Socket socket = new Socket(hostname, port)) {
 
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
 
            String time = reader.readLine();
 
            System.out.println(time);
 
 
        } catch (UnknownHostException ex) {
 
            System.out.println("Server not found: " + ex.getMessage());
 
        } catch (IOException ex) {
 
            System.out.println("I/O error: " + ex.getMessage());
        }
    }


}
