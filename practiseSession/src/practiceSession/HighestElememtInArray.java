package practiceSession;

public class HighestElememtInArray {
	public static void main(String[] args) {

		int[] a = { 1, 4, 5,10, 2, 6, 9 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}

		}
		System.out.println(max);
	}

}
