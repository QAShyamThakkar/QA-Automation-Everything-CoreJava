package k_WhileLoopingStatements;

//A prime number is a number that can only be divided by itself and 1 without remainders.
// List of prime numbers within 10 - 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
//By the usual definition of prime for integers, negative integers can not be prime

public class L_Prime_Number {

	public static void main(String[] args) {
		int num = 10;
		int flag = 0;
		int i = 0;
		while (num > 0) {

			if (num % i == 0) {
				flag++;

			}
			i++;

		}
		if (flag > 2) {
			System.out.println(num+" in Not a Prime Number");
		} else {
			System.out.println(num + " is a Prime Number");
		}
	}

}
