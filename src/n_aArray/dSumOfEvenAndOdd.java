package n_aArray;

public class dSumOfEvenAndOdd {
	public static void main(String[] args) {
		int numbers[] = { 4, 6, 7, 0, 3, 5 };

		int sumEvn = 0;
		int sumOdd = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				sumEvn = sumEvn + numbers[i];
			} else {
				sumOdd = sumOdd + numbers[i];
			}

		}

		System.out.println("sum of odd numbers = " + sumOdd);
		System.out.println("sum of eve numbers = " + sumEvn);
	}
}
