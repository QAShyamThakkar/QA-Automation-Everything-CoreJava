package b.ArithmeticOperator;

public class TypeCasting {

	public static void main(String[] args) {
		double a = 50.50;

		int i = (int)a;
		System.out.println(i);
	}

}

//Implicit Type Casting - Java will not any error if we store smaller data type values into larger data type values
//
//Explicit Type Casting - Java will throw error if we try to store larger data type values into smaller one. We need to type cast explicitly
//
//Syntax 
//	
//	larger_datatype a = 4.5; 			double a = 4.5;
//
//	smaller_datatype b = (smaller_datatype)a;	int b = (int) a;
