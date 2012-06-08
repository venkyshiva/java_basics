class SampleArray {
		

	public static void main(String arg[]) {		

		int[] anArray;

		anArray = new int[5];
		
		anArray[0] = 0;
		anArray[2] = 2;
		anArray[3] = 3;
		anArray[1] = 1;
		anArray[4] = 4;

		System.out.println("anArray [0] ="+anArray[0]);
		System.out.println("anArray [1] ="+anArray[1]);
		System.out.println("anArray [2] ="+anArray[2]);
		System.out.println("anArray [3] ="+anArray[3]);
		System.out.println("anArray [4] ="+anArray[4]);		

		System.out.println("anArray.len ="+anArray.length);
	
		System.out.println("=============================");
		System.out.println("========ARRAY COPY======");		

		char[] copyFrom = {'s','e','a','s','o','n'};
		char[] copyTo = new char[3];

		System.out.println(" Before copyFrom ="+new String(copyFrom));
		System.out.println(" Before copyTO ="+new String(copyTo));
		System.arraycopy(copyFrom, 3, copyTo, 0, 3);
		System.out.println(" After copyTO ="+ new String(copyTo));
	
	}
}