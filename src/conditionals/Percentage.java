package conditionals;

import java.util.Locale;
import java.util.Scanner;

public class Percentage {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.CANADA);
		
		System.out.println("Enter your salary to know the increase");
		double salary = sc.nextDouble();
		
		if (salary <= 1000) {
			double newSalary = (salary%20) + salary;
			System.out.println("New salary = " + newSalary);
		}
		else if (salary >=1000 && salary <=1500) {
			double newSalary = (salary%15) + salary;
			System.out.println("New salary = " + newSalary);
		}
		else {
			double newSalary = (salary%10) + salary;
			System.out.println("New salary = " + newSalary);
		}
		
		sc.close();

	}

}

