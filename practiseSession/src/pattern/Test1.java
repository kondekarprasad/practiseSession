package pattern;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test1().m1();
	}

	private void m1() {
		for (int i = 0, k = 7; i < 7; i++, k--) {
			System.out.println("*");

			for (int j = 0; j <= i; j++) {
				if (j >= j) {
					System.out.print(" ");
				}

			}
		}
	}

}
