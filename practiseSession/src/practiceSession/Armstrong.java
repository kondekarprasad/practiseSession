package practiceSession;

import java.util.Scanner;

public class Armstrong {
	int reminder, calc, temp;

	private void m1() {

		Scanner scanner = new Scanner(System.in);
		System.out.println();
		int number = scanner.nextInt();
		temp=number;
		for (int i = 0; i <= 3; i++) {
			reminder = temp % 10;
			temp = temp / 10;
			calc = calc + (reminder * reminder * reminder);

		}
		if (calc == number) {
			System.out.println(number + " is armstrong");

		}else {
			System.out.println("not armstrong");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		new Armstrong().m1();
	}

}
