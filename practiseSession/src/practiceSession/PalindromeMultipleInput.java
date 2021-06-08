package practiceSession;

import java.util.Scanner;

/* asked in persistent */
public class PalindromeMultipleInput {

	public static void main(String[] args) {

		PalindromeMultipleInput test = new PalindromeMultipleInput();
		test.m1();

	}

	void m1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int i = scanner.nextInt();

		String[] strings = new String[i];
		System.out.println("enter " + i + " strings");

		for (int j = 0; j < strings.length; j++) {
			strings[j] = scanner.next();

		}
		for (int j = 0; j < strings.length; j++) {
			String s = strings[j];
			StringBuffer buffer = new StringBuffer(s);
			buffer.reverse();
			String newString = buffer.toString();

			if (newString.equals(s)) {
				System.out.println("yes   " + s);

			} else {
				System.out.println("no   " + s);
			}

		}
		scanner.close();

	}

}
