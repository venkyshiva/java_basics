import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;



public final class TryCatch implements MouseMotionListener, MouseListener{
	
	private JFrame jf;
	private JTextField txt;
	private JLabel lbl;
	
	private ServerSocket sc;
	
	public static final int SERVER_PORT = 9999;
	
	public TryCatch(){
		
		jf = new JFrame("Try Catch");
		txt = new JTextField();
		lbl = new JLabel("Click and drag me...");
		
		//sc = new SocketServer();
	}
	
	public void launchFrame(){
		
		jf.add(lbl, BorderLayout.NORTH);
		jf.add(txt, BorderLayout.SOUTH);
		
		jf.addMouseListener(this);
		jf.addMouseMotionListener(this);
		
		jf.setSize(300,200);
		jf.setVisible(true);
	}
	
	public static void main(String args[])
	{
		TryCatch tc = new TryCatch();
		tc.launchFrame();
	}
	
	
	public void mouseMoved(MouseEvent e) {
		
	}
	
	public void mouseDragged(MouseEvent e){
		String s = "Mouse dragged at X ="+e.getX() + "Y ="+e.getY();
		
		txt.setText(s);
	}
	
	public void mouseClicked(MouseEvent e){
		String s = "Mouse cliked at X ="+e.getX() + "Y ="+e.getY();
		
		txt.setText(s);
	}
	public void mouseEntered(MouseEvent e){
		String s = "Mouse entered at X ="+e.getX() + "Y ="+e.getY();
		
		txt.setText(s);
	}
	
	public void mouseReleased(MouseEvent e){}
	
	public void mouseExited(MouseEvent e){
		String s = "Mouse exited at X ="+e.getX() + "Y ="+e.getY();
		
		txt.setText(s);
	}
	public void mousePressed(MouseEvent e){}

}
