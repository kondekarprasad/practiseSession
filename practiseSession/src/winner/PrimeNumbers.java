package winner;

/*top 10 prime no.*/
public class PrimeNumbers {

	public static void main(String[] args) {
		int counter = 0;
		for (int i = 2; i < 40; i++) {
			boolean flag = true;
			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					// non prime
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(i + " counter is " + counter);
				counter++;
			}
		}
	}

}
