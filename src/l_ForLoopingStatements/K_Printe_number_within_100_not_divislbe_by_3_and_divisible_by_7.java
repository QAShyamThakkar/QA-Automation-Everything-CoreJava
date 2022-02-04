package l_ForLoopingStatements;

public class K_Printe_number_within_100_not_divislbe_by_3_and_divisible_by_7 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {

			if (i % 3 != 0 && i % 7 != 0) {
				System.out.println(i);
			}
		}
	}

}
