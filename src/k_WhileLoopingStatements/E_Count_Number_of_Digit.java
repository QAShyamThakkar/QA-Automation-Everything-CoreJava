package k_WhileLoopingStatements;

public class E_Count_Number_of_Digit {

	public static void main(String[] args) {
		int num = 123536;
		int count = 0;

		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println(count);
	}

}
