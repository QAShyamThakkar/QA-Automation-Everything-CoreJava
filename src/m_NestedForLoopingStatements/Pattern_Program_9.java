package m_NestedForLoopingStatements;

//5
//5 4  	
//5 4 3 
//5 4 3 2
//5 4 3 2 1

public class Pattern_Program_9 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >5-i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();

		}

	}

}