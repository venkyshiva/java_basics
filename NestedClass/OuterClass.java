class OuterClass extends MainClass{


	private int _oi = 19;

	OuterClass() {
		
		System.out.println("Outer Class Counstructor");
		System.out.println("_oi ="+_oi);
		System.out.println("this._oi ="+this._oi);
			
	}
	
	public void add() {
		System.out.println("Outer add()");
		
	}
	
	private class NestedClass extends OuterClass{
		
		private int _ni = 10;
		
		NestedClass() {
			
			System.out.println("Nested Class Counstructor");
			System.out.println("_ni ="+_ni);
			System.out.println("this._ni ="+this._ni);
			System.out.println("this._oi ="+_oi);
		}
		
		public void add() {
			System.out.println("Nested add()");
		}
	}
	
	static class StaticNested {
	
		StaticNested() {
			System.out.println("StaticNested class called");
		}
	}
	
	public static void main(String args[]) {
		
			OuterClass oc = new OuterClass(); // Outer class.
			
			OuterClass.NestedClass ns = oc.new NestedClass(); // Nested class of OuterClass
			
			OuterClass.StaticNested sn = new OuterClass.StaticNested();
	}
}