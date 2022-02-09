package n_aArray;

public class fForEach {

	public static void main(String[] args) {

		int num[] = { 10, 50, 30, 40 };
		int maxNum = 0;

		for (int i : num) { // here i is directly an element where below-----
			if (i > maxNum) {

				maxNum = i;
			}

		}
		System.out.println(maxNum);

//		for (int i = 0; i < num.length; i++) { // here i is index number and not element
//
//			if (num[i] > maxNum) {
//
//				maxNum = num[i];
//
//			}
//		}
//		System.out.println(maxNum);

	}

}
