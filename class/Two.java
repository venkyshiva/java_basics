class Two extends One{

	Two() {
		
	}
	
	public String getData(String str, int i, double d){
		
		return new String("Str ="+str
						  +"int ="+i
						  +"dbl ="+d);
	}
	
	public String getData(int i, double d, String str){
		
		return new String("Str ="+str
						  +"int ="+i
						  +"dbl ="+d);
	}
	
	public int add() {
		System.out.println("Two::add()");
		return super.add();
	}
	
	
}