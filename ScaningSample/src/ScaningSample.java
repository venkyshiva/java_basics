import java.io.*;
import java.util.Scanner;

public class ScaningSample {

	public static void main(String args[]) {
		
		System.out.println("Scanning Sample");
		
		Scanner s = null;
		
		try {
			
			s = new Scanner(new BufferedReader(new FileReader("in.txt")));
			
			s.useDelimiter(",\\s");
			
			while(s.hasNext()) {
				
				System.out.println(s.next());				
				
			}
		}catch(IOException e ){
			e.getStackTrace();
		}
		
		s.close();
	}
}
