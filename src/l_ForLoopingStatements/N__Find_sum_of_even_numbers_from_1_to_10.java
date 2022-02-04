package l_ForLoopingStatements;

public class N__Find_sum_of_even_numbers_from_1_to_10 {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				result = result + i;
			}

		}

		System.out.println(result);
	}

}
