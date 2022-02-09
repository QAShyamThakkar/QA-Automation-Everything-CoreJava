
package m_ForLoopingStatements;

// Prime number - divided by only 1 and itself

public class V__Prime_Number {

	public static void main(String[] args) {
		int num = 11;
		int flag = 0;
		
		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				flag++;

			}
		}
		if (flag > 2) {
			System.out.println(num + " is not a Prime Number");
		} else {
			System.out.println(num + " is a Prime Number");
		}
	}
}
//ORRRRRRRRRRRRRRR
//for (int 2 = 1; i < num; i++) {
//
//	if (num % i == 0) {
//		flag++;
//
//	}
//}
//if (flag > 0) {
//	System.out.println(num + " is not a Prime Number");
//} else {
//	System.out.println(num + " is a Prime Number");
//}
