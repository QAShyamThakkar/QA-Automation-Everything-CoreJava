package e.ExpressionPriorityAssociativity;

public class ExpressionEvaluation {

	public static void main(String[] args) {
//		Java Operator Precedence Table - https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
//
//		Precedence(Priority) - Operator precedence determines the order in which the operators in an expression are evaluated.
//
//		Associativity - If an expression has two operators with similar precedence, 
//						the expression is evaluated according to its associativity 
//					    (either left to right, or right to left)
		
		
//		Example1 - 
		int a = 2, b = 10, c = 4, result;

		result = b * a / c;               	// (5)
		System.out.println(result);
		
		
		result = b / a * c ;					// (20)
		System.out.println(result);
		
		result = a * b / c + a * 10 / b / c - 4; //5+0-4 =1
		System.out.println(result);			
		
		
//		Example2 -
		boolean b1 = true, b2 = false, b3=true, result1;
		
		result1 = b2 && b1 || b3;	
		System.out.println(result1);
		
		result1 = b2 && b1 || b3 && b1 || b2 && b3 && b1 || b3;
		System.out.println(result1);
		
		result1 = b2 && b1 || b3 && b2 && b1 || b3 && b1 || b2 && b1 || b2 && b3 && b1 || b3; //(true always)
		System.out.println(result1);
		
// Note - With one OR operator if we have one value true then we don't need to check whole expression result will be always true		
		
		
	}

}
