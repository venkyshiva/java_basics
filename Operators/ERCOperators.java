class ERCOperators {

	public static void main(String args[]) {
	
		System.out.println("-----Equality operators-----");
		
		int a,b;
		
		a = 1; b = 2;

		if(a == 1)
			System.out.println("a is equal to 1");

		if(b == 2)
			System.out.println("b is equal to 2");

		if(a == b)
			System.out.println("a is equal to b");

		if(a != b)
			System.out.println("a is not equal to b");


		System.out.println("-----Relational Operators-----");
		
		int x,y,z;

		x = 2; y= 3; z = 2;

		if(x > y)
			System.out.println("x is greaterthan y");

		if(x < y)
			System.out.println("x is lessthan y");

		if(x >= z)
			System.out.println("x is equal to z");


		System.out.println("-----Conditional Operators-----");

		int m,n,p;

		m = 5; n = 5; p = 6;

		boolean u = true;
		

		if(m == 5 && n == 5)
			System.out.println("m and n are equal");

		if(n !=6)
			System.out.println("n is not equal to 6");

		p = u ? m: n;
		
		System.out.println("u is true so p is "+p);
			
		
		
	}
}