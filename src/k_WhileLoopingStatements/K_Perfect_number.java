package k_WhileLoopingStatements;

//a perfect number is a positive integer that is equal to the sum of its positive divisors

//excluding the number itself.
// 6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number
//  perfect numbers from 1 to 100 = 6 and 28. 

public class K_Perfect_number {

	public static void main(String[] args) {

		int num = 28;
		int i = 1;
		int result = 0;
		
		while (i < num) { // not <= because excluding the number itself.

			if (num % i == 0) {
				result = result + i;
			}
			i++;
		}
		if (num == result) {
			System.out.println(num + " is a Perfect number");

		} else {
			System.out.println(num + " is not a Perfect number");
		}
	}
}