package j.aNested_If_Else;

public class D2_PrintMaxNumberFromThreeNumbers {
	public static void main(String[] args) {
		int a = 199, b = 133, c = 291;

		if (a > b && a > c) {
			System.out.println("A is greatest");
		} else if (b > c) {
			System.out.println("B is greatest");
		} else {
			System.out.println("C is greatest");
		}

	}
}
