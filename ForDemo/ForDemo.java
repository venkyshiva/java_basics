class ForDemo {

	public static void main(String args[]){

		System.out.println("-----For Demo-----");

		for (int i=0; i < 10; i++) {
			System.out.println("i = "+ i);
		}

		// new method of for control statment in Java.

		int[] a = {0,1,2,3,4,5,6,7,8,9};

		for (int i : a )
		{
			System.out.println("i = "+ a[i]);
		}

	}
}
