class Test {

	Test() {
	}
	
	public void changeData(One o){
		
		System.out.println("Test::changeData()");
		o.setXpos(100);
		o.setYpos(101);
		System.out.println("Test::changeData().setPos");
		o.toString();
		
		o = new One();
		System.out.println("Test::changeData().setPos @test");
		o.toStrings();
	}
}