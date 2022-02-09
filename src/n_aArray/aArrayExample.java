package n_aArray;

public class aArrayExample {
	public static void main(String args[]) {

		// Declaration of single variable
		int num1;

		// Declaration of array
		int num[];

		// initialize array
		num = new int[5];
		
		num[0] = 3;
		num[1] = 10;
		num[2] = 18;
		num[3] = 39;
		num[4] = 89;
		
//		num[6] = 89;
		
		num[2] = 20; // we can change the value
		
		

		// Declaration & initialization in same line

		int listOfNum[] = new int[4];

		// Another way to declare & initialize array

		int numbers[] = { 43, 46, 47, 40, 12, 35 };

		// Find length of an array
		System.out.println(numbers.length);

		// Print all numbers from array
		for (int i = 0; i <= 5; i++) {
			System.out.println(numbers[i]);
		}

	}
}
