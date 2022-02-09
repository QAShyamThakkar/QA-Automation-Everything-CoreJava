package n_NestedForLoopingStatements;

//    1
//   121
//  12312
// 1234123
//123451234 

public class Pattern_Program_92 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}			
			for (int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			for (int j = 1; j<=i-1 ; j++) {
				System.out.print(j);
			}
		
		

			System.out.println();

		}

	}

}
