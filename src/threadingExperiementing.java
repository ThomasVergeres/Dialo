import java.net.*;

import java.io.IOException;

public class threadingExperiementing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(InetAddress.getByName("test.dialo.net"));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
