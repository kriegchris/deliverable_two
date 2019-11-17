package deliverable_two;

import java.util.Scanner;

public class unicodeCalc {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str1;
		String str2;
		char a;
		char c;
		int ascii1; // ASCII code to string 1
		int ascii2; // ASCII code to string 2
		int totalStr1 = 0;
		int totalStr2 = 0;
		int difference;

		// User inputs the first string and it gets assigned to str1.
		System.out.println("Please enter some text for String 1.");
		str1 = input.nextLine();

		// User inputs the second string and it gets assigned to str2.
		System.out.println("Please enter some text for String 2");
		str2 = input.nextLine();

		/*
		 * Loop iterates through string 1, printing out each character, the associated
		 * ASCII code and totals up the values for each character.
		 */
		for (int i = 0; i <= str1.length() - 1; i++) {
			a = str1.charAt(i);
			ascii1 = a;
			totalStr1 = ascii1 + totalStr1;
			System.out.println(str1.charAt(i) + ":" + ascii1);
		}

		System.out.println("");

		// Does the same for string 2.
		for (int j = 0; j <= str2.length() - 1; j++) {
			c = str2.charAt(j);
			ascii2 = c;
			totalStr2 = ascii2 + totalStr2;
			System.out.println(str2.charAt(j) + ":" + ascii2);

		}

		System.out.println("");
		/*
		 * Prints out the absolute value of the difference between string 1 and string
		 * 2.
		 */
		difference = Math.abs(totalStr2 - totalStr1);
		System.out.println("Difference (as absolute value): " + difference);
		input.close();
	}
}
