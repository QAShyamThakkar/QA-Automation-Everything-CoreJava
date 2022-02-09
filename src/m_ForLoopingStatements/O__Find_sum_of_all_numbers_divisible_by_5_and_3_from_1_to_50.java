package m_ForLoopingStatements;

public class O__Find_sum_of_all_numbers_divisible_by_5_and_3_from_1_to_50 {

//	Explain the same in EXCEL

	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <= 50; i++) {

			if (i % 5 == 0 && i % 3 == 0) {
				result = result + i;
			}

		}

		System.out.println(result);
	}

}
