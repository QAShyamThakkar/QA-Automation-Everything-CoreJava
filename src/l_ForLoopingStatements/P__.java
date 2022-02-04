package l_ForLoopingStatements;

// P__1/2_+_2/3_+_3/4_+…………+_10/11
public class P__ {

	public static void main(String[] args) {

		double result = 0;
		for (double i = 1, j = 2; i <= 10 && j <= 11; i++, j++) {

			result = result + i/j;

		}

		System.out.println(result);

	}
}
