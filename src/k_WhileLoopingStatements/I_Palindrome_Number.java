package k_WhileLoopingStatements;

// a number (such as 16461) that remains the same when its digits are reversed.

public class I_Palindrome_Number {
	public static void main(String[] args) {
		int num= 12321;
		int reversed=0;

		while (num!=0) {
			
			reversed=reversed*10+num%10;
			num=num/10;
			
		}System.out.println(reversed);
		
		
	}
	
	
	
	
	

}
