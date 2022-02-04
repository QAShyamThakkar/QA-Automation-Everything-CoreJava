package l_ForLoopingStatements;

// 5! = 1*2*3*4*5

public class T__Factorial_of_GivenNumber {
	
	public static void main(String[] args) {
		int result = 1;
		int factorial = 5;
		
		for (int i = 1; i <= factorial; i++) {

			result = result*i;
		}

		System.out.println(result);
	}

}
