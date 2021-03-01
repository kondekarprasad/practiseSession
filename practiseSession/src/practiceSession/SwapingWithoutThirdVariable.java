package practiceSession;

import java.util.Scanner;

public class SwapingWithoutThirdVariable {
	 static void swap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a: ");
		int a = scanner.nextInt();
		System.out.print("enter b: ");
		int b = scanner.nextInt();
		System.out.println("before value of a: " + a + " value of b: " + b);
		// swapping logic
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after value of a: " + a + " value of b: " + b);

		scanner.close();
	}

	public static void main(String[] args) {
		 SwapingWithoutThirdVariable.swap();

	}

}
