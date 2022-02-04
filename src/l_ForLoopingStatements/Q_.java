package l_ForLoopingStatements;

// 1_+_10_+_2_+_9_+_3_+_8_+_4_+_7_+_5_+_6

public class Q_ {

	public static void main(String[] args) {

		int result =0;
		for (int i = 1, j = 10; i <= 5 || j >= 6; i++, j--) {

			result = result +i+j;
		}
			System.out.println(result);
	}
	
	
}
