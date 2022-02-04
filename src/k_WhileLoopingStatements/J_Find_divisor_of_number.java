package k_WhileLoopingStatements;

public class J_Find_divisor_of_number {
	
	public static void main(String[] args) {
		
		int num = 10;
		int i = 1;

		while (i <= num) {

			if (num % i == 0) {
				System.out.println(i);
			}i++;

		}
		
	}
	

}
