import java.io.*;
import java.net.*;

public class ClientServerSample {

	public static void main(String args[]) {
		
		Socket s = null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		try {
			
			s = new Socket("taranis", 7);
			
			out = new PrintWriter(s.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));			
			
			String sysOut;
			
			BufferedReader sysIn = new BufferedReader(new InputStreamReader(System.in));
			
			while((sysOut = sysIn.readLine()) != null){
				
				out.println(sysOut);
				
				System.out.println(in.readLine());
			}
			
		}
		catch(Exception e) {
			System.out.println("Error msg ="+e.getMessage());
		}
	}
}
