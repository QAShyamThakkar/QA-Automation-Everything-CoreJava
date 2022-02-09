package k_WhileLoopingStatements;

// a number (such as 16461) that remains the same when its digits are reversed.

public class I_Palindrome_Number {
	public static void main(String[] args) {

		int originalNum = 12321; // to store vaue, as it is gonne change

		int tempNum = originalNum;
		int reversed = 0;

		while (tempNum != 0) {

			reversed = reversed * 10 + tempNum % 10;
			tempNum = tempNum / 10;

		}
//		System.out.println(reversed);

		if (reversed == originalNum) {

			System.out.println(originalNum + " is a Pallindrome Number");
		} else {
			System.out.println(originalNum + " is Not a Pallindrome Number");
		}

	}

}
