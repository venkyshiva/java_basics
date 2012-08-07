import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class Streams {
	
	private FileInputStream fIn = null;
	private FileOutputStream fOp = null;
	
	public Streams() throws IOException {
		
		File f = new File("Venky");
		
		System.out.println(f.getAbsolutePath());
		try {
			fIn = new FileInputStream("bin/input.txt");
			fOp = new FileOutputStream("bin/output.txt");
			
			int b;
			
			while(( b = fIn.read()) != -1) {
				
				fOp.write(b);
				System.out.println(b);
			}
		}
		catch(FileNotFoundException xfn){
			System.out.println("Error at initializing file");
			System.out.println("xfn message ="+xfn.getMessage());
		}
		finally {
			
			if(fIn != null)
			{
				fIn.close();
			}
			
			if(fOp != null)
			{
				fOp.close();
			}
		}
				
	}
	
	
	public static void main(String args[])throws FileNotFoundException{
		
		System.out.println("Streams Sample Program");
		
		try{
			Streams st = new Streams();
		}
		catch(IOException io){
			System.out.println("File Not Found");
		}
		finally {
			
		}
		
		
	}
}
