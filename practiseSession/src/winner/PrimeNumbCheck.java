package winner;

public class PrimeNumbCheck {

	public static void main(String args[]) {
		int num = 9, temp;
		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		// If isPrime is true then the number is prime else not
		if (isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}
}
