package j.aNested_If_Else;

public class D1_Greatest_number_out_of_three {

	public static void main(String[] args) {

		int a = 199, b = 133, c = 129;

		if (a > b) {

			if (a > c) {
				System.out.println(a + " is greatest");
			} else {
				System.out.println(c + " is greatest");
			}

		} else {

			if (b > c) {
				System.out.println(b + " is greatest");
			} else {
				System.out.println(c + " is greatest");
			}

		}

	}

}
