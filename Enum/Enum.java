public enum Enum {
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	
	static class Days {
		
		static Enum e;
		
		Days(Enum i) {
			e = i;
		}
		
		static void comments() {
			switch(e) {
			
				case SUNDAY:
				case SATURDAY:
					System.out.println("Weekends");
				break;
				
				case MONDAY:
					System.out.println("First day on week :( ");
				break;
				
				default:
					System.out.println("Weekdays");
				
			}
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Boot main via Enum");
		
		System.out.println(Enum.SUNDAY);		
		
		Days first = new Days(Enum.SUNDAY);
		first.comments();
		
		Days sec = new Days(Enum.MONDAY);
		sec.comments();
		
		Days last = new Days(Enum.SATURDAY);
		last.comments();
		
	}
}