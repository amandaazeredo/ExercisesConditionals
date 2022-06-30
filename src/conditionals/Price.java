package conditionals;

import java.util.Scanner;

public class Price {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter ther product price:");
		
		/*product price
		cheap <= 10
		normal <= 15
		kind expensive <= 17
		really expensive >= 20*/
		
		double price = scan.nextDouble();
		
		if (price <= 10) {
			System.out.println("This is cheap, you should buy it");
		}
		else if (price > 10 && price <= 15) {
			System.out.println("This is the usual price for this product, you may can ask for a discount");
		}
		else if (price >15 && price <=17) {
			System.out.println("This is kind expensive, you should shearch more");
		}
		else {
			System.out.println("This is really expensive, don't buy it");
		}
		
		scan.close();
	}

}
