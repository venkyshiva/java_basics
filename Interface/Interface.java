class Interface implements DoIt
{
	
	private int id = 0;
	
	static int cnt = 0;
	
	public static void main(String args[]) {	
		
		System.out.println("Interface Main boot");
		
		Do d = new Do();
		
		d.doSomeThing();
		d.doSomeThingElse();
		
		Interface i = new Interface();
		i.doSomeThing();
		i.doSomeThingElse();
		
	}
	
	public Interface() 
	{
		this.id = cnt++;
	}
	
	public void doSomeThing() {
		
		System.out.println("ID ="+this.id);
	}
	public void doSomeThingElse() {
		System.out.println("ID ID ="+this.id);
	}
	
	public void add() {
		System.out.println("ID ID ID ="+this.id);
	}
}