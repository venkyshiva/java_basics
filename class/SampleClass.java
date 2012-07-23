class SampleClass
{

	public static void main(String args[]){
	
		System.out.println("Sample Class");
			
		/*One o;		
		o = new One();*/
		
		//Two t;
		//t = new Two();
		//t.add();
		
		//System.out.println(t.getData("Venkat",10,10.4d));
		//System.out.println(t.getData(10,10.4d,"Justin"));
		
		//System.out.printf("%d",9);
		
		One o = new One();
		Test test;
		
		test = new Test();
		
		test.changeData(o);
		
		System.out.println("From boot main()");
		o.toStrings();
	}
	
}