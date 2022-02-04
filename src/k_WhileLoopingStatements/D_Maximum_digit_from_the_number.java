package k_WhileLoopingStatements;

public class D_Maximum_digit_from_the_number {

	public static void main(String[] args) {

		int num = 12329;
		int bigNum = 0;
		while (num > 0) {
			
			if (bigNum < num % 10) {
				bigNum = num % 10;
			}
			num = num / 10;
		}
		System.out.println(bigNum);
	}

}
