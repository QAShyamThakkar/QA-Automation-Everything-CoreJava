package i.Switch;

public class A_NameOfDayFromNumber {

	// 0 - Sun, 1-Mon,..., 6-Sat
	// Explain with break and without break;

	public class NameOfDayFromNumber {
		public static void main(String args[]) {
			int num = 5;

			switch (num) {

			case 0: {System.out.println("Sunday");}
				break;
			case 1: {System.out.println("Monday");}
				break;
			case 2: {System.out.println("Tuesday");}
				break;
			case 3: {System.out.println("Wednesday");}
				break;
			case 4: {System.out.println("Thursday");}
				break;
			case 5: {System.out.println("Friday");}
				break;	
			case 6: {System.out.println("Saturday");}
				break;
				
			default: System.out.println("Hey, write number between 0 to 6 only!");
							
			}

//			if (num == 0) {
//				System.out.println("Sunday");
//			} else if (num == 1) {
//				System.out.println("Monday");
//			} else if (num == 2) {
//				System.out.println("Tuesday");
//			} else if (num == 3) {
//				System.out.println("Wed");
//			} else if (num == 4) {
//				System.out.println("Thursday");
//			} else if (num == 5) {
//				System.out.println("Fri");
//			} else if (num == 6) {
//				System.out.println("Sat");
//			} else {
//				System.out.println("Please enter number from 0 to 6 only...");
//			}

		}

	}
}