class One implements INumeric
{
	
	private int x,y;
	
	One(){
		//this(1);
		
		x = 10;
		y = 11;
		
		toStrings();
		
		//System.out.println("Default Constructor");
	}
	
	One(int i){
		
		//System.out.println("Parameterized Constructor i= "+i);
	}
	
	public int add() {
		System.out.println("One::add()");
		
		return 0;
	}
	
	public void setXpos(int x) {
		this.x = x;
	}
	
	public void setYpos(int y) {
		this.y = y;
	}
	
	public void toStrings(){
		
		System.out.println("x ="+x
						  +"y ="+y);
	}
	
}
