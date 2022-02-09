package zzztest;

public class array {

	int num;

	public static void main(String[] args) {

		int num[];

		num = new int[5];

		num[0] = 3;
		num[1] = 10;
		num[2] = 18;
		num[3] = 39;
		num[4] = 18;

//	System.out.println(num.length);

		int j = 0;
		int sum = 0;

		int target = 18;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];

		}System.out.println(sum);

	}

}
