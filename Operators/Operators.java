class Operators {

	public static void main(String args []) {
		
		System.out.println("-----Arithmetic Operators-----");

		int i,j = 10,k;

		i = j + 1;

		k = i * 10;

		System.out.println("i ="+i);

		System.out.println("j ="+j);

		System.out.println("k ="+k);

		k -= i;

		i /= j;

		System.out.println("i ="+i);

		System.out.println("j ="+j);

		System.out.println("k ="+k);

		String firstStr = "Hey, How ";

		String secondStr = "are you?";

		secondStr = firstStr + secondStr;

		System.out.println("First String ="+firstStr);

		System.out.println("Second String ="+secondStr);

		System.out.println("\n\n\n-----Unary Operators-----");


		int a = 1,b = 2, c = b + 1;


		++a;
		
		System.out.println("Postfix ++a ="+a);
		
		
		System.out.println("Prefix  a++ ="+a++);	

		
		System.out.println("Prefix  ++a ="+a);			
	}
}