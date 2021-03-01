package winner;

public class FibonacciSeries {
	static int temp = 0, placeHolder = 1, fibonacci;

	public static void main(String[] args) {
		for (int i = 1; i < 15; i++) {
			
			fibonacci = temp + placeHolder;
			System.out.print(" " + fibonacci);
			temp = placeHolder;
			placeHolder = fibonacci;
		}
	}
}
