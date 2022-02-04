package i.Switch;

public class B_Calculator {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter b");
//		int b = sc.nextInt();
//		
//		sc.nextLine();
//		System.out.println("Enter Operator");
//		String operator = sc.nextLine();

		int a = 16; 
		int b = 10;
		String operator = "-";

		switch (operator) {

		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println(a / b);

		default:
		}

	}
}
