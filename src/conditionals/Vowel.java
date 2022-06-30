package conditionals;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a letter:");
		String letter = sc.next();
		
		if(letter.length()>1) {
			System.out.println("invalid letter");
		}
		
		else if (letter.equalsIgnoreCase("a")|| letter.equalsIgnoreCase("e") ||
				letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") ||
				letter.equalsIgnoreCase("u"))
				{
			System.out.println("vowel");
		}
		else {
			System.out.println("consonant");
		}
		
		
		sc.close();
	}

}
