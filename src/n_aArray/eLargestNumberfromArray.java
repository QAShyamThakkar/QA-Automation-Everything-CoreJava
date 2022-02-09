package n_aArray;

public class eLargestNumberfromArray {

	public static void main(String[] args) {

		int num[] = { 10, 50, 30, 40 };
		int maxNum = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > maxNum) {

				maxNum = num[i];

			}
		}System.out.println(maxNum);

	}

}
