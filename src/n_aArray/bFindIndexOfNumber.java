package n_aArray;

public class bFindIndexOfNumber {
	public static void main(String[] args) {

		int num[];

		num = new int[100];

		num[0] = 3;
		num[1] = 10;
		num[2] = 18;
		num[3] = 39;
		num[4] = 18;
		
		num[20] = 18;

//	System.out.println(num.length);

		int j = 0;

		int target = 18;
		for (int i = 0; i < num.length; i++) {
			if (target == num[i]) {
				System.out.println(i);
			}

		}
	}
}
