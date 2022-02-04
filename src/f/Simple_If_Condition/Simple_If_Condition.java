package f.Simple_If_Condition;

public class Simple_If_Condition {

//	Purpose - We want to execute block of statements if condition is true otherwise we'll skip that block of statements 
//
//	Example - Driving a car then we'll check are we hungry? then eat and continue
//
//	Flow chart 
//
//	Syntax
//		
//		if(condition){
//			// Block of statements
//		}

	public static void main(String[] args) {
		int fuelLevel = 80;

		System.out.println("1. Starting the drive");

		if (fuelLevel <= 90) {
			System.out.println("2. Filling the fuel");
		}

		System.out.println("3. End the drive");

	}
}
