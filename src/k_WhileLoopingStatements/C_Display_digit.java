package k_WhileLoopingStatements;

public class C_Display_digit {
	public static void main(String[] args) {
		int num = 123;
		while (num > 0) {
			System.out.println(num % 10);
			num = num / 10;
		}
	}

}
