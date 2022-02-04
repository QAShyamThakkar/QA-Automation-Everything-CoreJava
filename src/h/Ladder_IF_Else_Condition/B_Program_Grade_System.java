package h.Ladder_IF_Else_Condition;

public class B_Program_Grade_System {

	public static void main(String[] args) {

		// up to 40 - Better Luck Next Time!
		// 41 to 60 - B
		// 61 to 80 - A
		// Above 80 - A+

		int Percentage = 92;

		if (Percentage <= 40) {
			System.out.println("Better Luck Next Time!");
		
		} else if (Percentage >= 41 && Percentage <= 60) {
			System.out.println("Okay, you got B");

		} else if (Percentage >= 61 && Percentage <= 80) {
			System.out.println("Excellent, you got A");

		} else {
			System.out.println("Congrats!! Hardwork paid off, you got A+");

		}

	}

}
