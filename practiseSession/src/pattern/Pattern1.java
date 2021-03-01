package pattern;

public class Pattern1 {

	void method1() {
		for (int i = 0; i < 7; i++) {
			System.out.println();

			for (int j = 7; j >= 0; j--) {
				if (j > i) {
					System.out.print(" ");

				} else {
					System.out.print(" " + i);
				}

			}
		}

	}

	public static void main(String[] args) {
		new Pattern1().method1();

	}

}
