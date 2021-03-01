package winner;

public class SortLengthWise {
	String[] string1 = { "java", "is", "object", "oriented", "programming" };

	void method1() {
		for (int i = 0; i < string1.length; i++) {
			for (int j = 0; j < string1.length; j++) {
				if (string1[i].length() < string1[j].length()) {

					String temp = string1[j];
					string1[j] = string1[i];
					string1[i] = temp;
				}
			}
		}
		for (int i = 0; i < string1.length; i++) {
			System.out.print(string1[i] + " ");
		}
	}

	public static void main(String[] args) {
		new SortLengthWise().method1();
	}
}