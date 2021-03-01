package winner;

public class AdditionOfhighestAndLowestThree {

	int[] abc = { 10, 3, 1, 4, 9, 12, 21, 7 };
	int temp = 0;

	public static void main(String[] args) {
		new AdditionOfhighestAndLowestThree().m();
	}

	void m() {
		for (int i = 0; i < abc.length; i++) {
			for (int j = i; j < abc.length; j++) {
				int temp = 0;
				if (abc[i] > abc[j]) {
					temp = abc[i];
					abc[i] = abc[j];
					abc[j] = temp;
				}
			}
		}
		for (int i = 0; i < abc.length; i++) {
			System.out.print(abc[i] + " ");
		}
		/*int temp = abc[1] + abc[2] + abc[0];
		int temp2 = abc[abc.length - 1] + abc[abc.length - 2] + abc[abc.length - 3];
		System.out.println("addition of highest is" + temp);
		System.out.println("addition of lowest is" + temp2);*/

	}

}
