package m_ForLoopingStatements;


// 1_+_2_–_3+_4_+_5_–_6_+_7_+_8_–_9_+10

public class R_ {
	
	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <= 10; i++) {

			if (i%3==0) {
				result = result - i;				
			} else {
				result = result + i;
			}
			
		}

		System.out.println(result);
	}	

}
