package n_NestedForLoopingStatements;

//    5
//   54  	
//  543 
// 5432
//54321


public class Pattern_Program_91 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}			
			for (int j = 5; j > 5-i; j--) {
				System.out.print(j);
			}

			System.out.println();

		}

	}

}
