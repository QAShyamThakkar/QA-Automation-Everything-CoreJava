package k_WhileLoopingStatements;

public class G_Reverse_number {
	public static void main(String[] args) {
		int num = 1234;
		int reversed = 0;
		while (num != 0) {

			reversed = reversed * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(reversed);
	}

}
