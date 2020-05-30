import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
public class Server extends Thread{

	
	public void listen() {
				
		boolean running =  true;
		int forwardedPort = 8080;
		ServerSocket socket;
		byte[] buffer = new byte[256];
		String serverIP = "108.167.183.7";

		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(forwardedPort);
			System.out.println("Server is listening on port " + forwardedPort);

			while(running) 
			{

				Socket client = serverSocket.accept();
				
				System.out.println("New client connected");
				
				InputStream input = client.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(input));
				String line = reader.readLine();
				OutputStream output = client.getOutputStream();
				PrintWriter writer =  new PrintWriter(output, true);
				writer.println("Hello world.");

			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}



		
	}
	

}
