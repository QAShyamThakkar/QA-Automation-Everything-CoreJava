package h.Ladder_IF_Else_Condition;

public class D_NameOfDayFromNumber {

	// 0 - Sun, 1-Mon,..., 6-Sat

	public class NameOfDayFromNumber {
		public static void main(String args[]) {
			int num = 1;

			if (num == 0) {
				System.out.println("Sunday");
			} else if (num == 1) {
				System.out.println("Monday");
			} else if (num == 2) {
				System.out.println("Tuesday");
			} else if (num == 3) {
				System.out.println("Wed");
			} else if (num == 4) {
				System.out.println("Thursday");
			} else if (num == 5) {
				System.out.println("Fri");
			} else if (num == 6) {
				System.out.println("Sat");
			} else {
				System.out.println("Please enter number from 0 to 6 only...");
			}

		}

	}
}