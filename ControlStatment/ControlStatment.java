class ControlStatment {

	public static void main(String args[]) {

		System.out.println("-----Control Statment-----");

		int a, b, c;

		a = 1; b = 2; c = 3;

		if(a > b){

			if(a > c)
			{
				System.out.println("A is Big");
			}
			else if(c > b)
			{
				System.out.println("C is Big");
			}
		}
		else if(b > c) 
		{
			System.out.println("B is Big");
		}
		else
			System.out.println("C is Big");


		System.out.println("----- Switch Statment -----");

		int month = 0;

		String weekDaysName = "";

		switch(month) 
		{
			case 1:
				weekDaysName = "Sunday";
				break;

			case 2:
				weekDaysName = "Monday";
				break;

			case 3:
				weekDaysName = "Tuesday";
				break;

			case 4:
				weekDaysName = "Wednesday";
				break;
			case 5:
				weekDaysName = "Thursday";
				break;
			case 6:
				weekDaysName = "Friday";
				break;
			case 7:
				weekDaysName = "Saturday";
				break;

			default:
				weekDaysName = "Invalid seleceted number.";
				break;
		}

		System.out.println("Seleted week days name is "+weekDaysName);
		
		

	}
}
