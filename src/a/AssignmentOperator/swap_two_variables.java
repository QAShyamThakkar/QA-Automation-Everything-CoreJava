package a.AssignmentOperator;

public class swap_two_variables {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		int temp_c;

		temp_c = a; // a=100, b=200 temp_c=100
		a = b; // a=200, b=200 temp_c=100
		b = temp_c; // a=200, b=100 temp_c=100

		System.out.println(a);
		System.out.println(b);
	}

}
