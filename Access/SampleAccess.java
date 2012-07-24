import TwoPack.*;
import OnePack.*;


class SampleAccess {
	
	public static void main(String args[])  {
		
		// Access Modifiers sample test coding.
		
		/**	 No modifiers	*/
		Two t = new Two();
		
		/** No Modifiers    */
		OneSub os = new OneSub();
		
		/** Protected modifiers		*/		
		// System.out.println("OnePack os::OneSub->One::p ="+os.p);  // Compile time error - Protected members are not accessed out the class.
		
	}
}