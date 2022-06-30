package conditionals;

import java.util.Locale;
import java.util.Scanner;

public class Avarage {
    
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.CANADA);
		
		System.out.println("Enter your grades in these subjects");
		System.out.print("Data Base Development:");
		double grade1 = sc.nextDouble();
		System.out.print("Software Development:");
		double grade2 = sc.nextDouble();

		double avarage = (grade1 + grade2)/2;
		
		if (avarage <7) {
			System.out.println("Disapproved, your avarage is: " + avarage);
		}
		else if (avarage >= 7 && avarage < 10) {
			System.out.println("Approved, your avarage is: " + avarage);
		}
		else {
			System.out.println("Approved with distinction, your avarage is: " + avarage);
		}
		
		sc.close();
		
	}

}
