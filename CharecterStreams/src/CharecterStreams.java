import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.awt.*;
import javax.swing.*;
import java.lang.Exception;

public class CharecterStreams {

	public FileReader fR = null;
	public FileWriter fW = null;
	
	public JFrame jF;
	public JTextField txt;
	public JLabel lbl;
	
	public static void main(String args[]){
		
		try {
			CharecterStreams cs = new CharecterStreams();
		}
		catch(IOException err)
		{
			
		}
		
	}
	
	public CharecterStreams() throws IOException{
		
		System.out.println("CharecterStreams");
		try{
			jF = new JFrame("Charecter Reader");
			txt = new JTextField("...");
			lbl = new JLabel("Status: Reading the file...");
			
			txt.setSize(100, 100);
			
			jF.add(txt, BorderLayout.NORTH);
			jF.add(lbl, BorderLayout.SOUTH);
			
			jF.setSize(300,300);
			jF.setVisible(true);

		}
		catch(Exception err){
			//System.out.println("Error at JFrame, JTextField creation...");
			lbl.setText("Error at JFrame, JTextField creation...");
		}
				
		
		try{
			
			fR = new FileReader("reader.txt");
			fW = new FileWriter("writer.txt");
			
			int b;
			
			while((b = fR.read()) != -1){
				
				fW.write(b);
				txt.setText(String.valueOf(b));
			}
		}
		catch(FileNotFoundException err) {
			lbl.setText("File not found, msg="+err.getMessage());
		}
		finally {			
			
			if(fR != null){
				fR.close();
			}
			
			if(fW != null){
				fW.close();
			}
		}
	}
}
