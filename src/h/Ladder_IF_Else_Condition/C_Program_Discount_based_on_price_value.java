package h.Ladder_IF_Else_Condition;

public class C_Program_Discount_based_on_price_value {

	public static void main(String[] args) {

		double price = 5000;

		// price < 100 ---> 5%
		// price > 100 && < 200 --> 10%
		// price 200 to 500 --->20
		// 500 up then 30%

		// Find Final Invoice Amount

		if (price < 100) {
			System.out.println(price - (price * 5 / 100));
		} else if (price >= 100 && price < 200) {
			System.out.println(price - (price * 10 / 100));
		} else if (price >= 200 && price < 500) {
			System.out.println(price - (price * 20 / 100));
		} else {
			System.out.println(price - (price * 30 / 100));
		}
	}

}
