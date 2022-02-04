package k_WhileLoopingStatements;

//  Armstrong_number = Sum of Cube of all its digit is equal to that number
// Eg. 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
// n the range 0 to 999 there exists six Armstrong numbers- 0, 1, 153, 370, 371 and 407

public class H_Armstrong_number {

	public static void main(String[] args) {

		int num = 153, num1=153;
		double armStrong = 0;

		while (num != 0) {

			armStrong = armStrong + Math.pow(num % 10, 3); //Power formula from Math method

			num = num / 10;

		}
		if (armStrong == num1) {
			System.out.println(num1 + " is an Armstrong Number");
		} else {
			System.out.println(num1 + " is Not an Armstrong Number");

		}

	}

}
