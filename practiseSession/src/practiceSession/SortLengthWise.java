package practiceSession;

// sort length wise
public class SortLengthWise {
	void sortByLength(String string) {
		String[] strArr = string.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr.length; j++) {
				if (strArr[j].length() > strArr[i].length()) {
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
				/*
				 * if two strings are equal by length then compare by alphabetic order
				 */
				else if (strArr[i].length() == strArr[j].length()) {
					if (strArr[j].compareTo(strArr[i]) > 0) {
						String temp = strArr[i];
						strArr[i] = strArr[j];
						strArr[j] = temp;
					}
				}
			}
		}
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);

		}
	}

	public static void main(String[] args) {
        new SortLengthWise().sortByLength("java is object oriented programming language");
	}
}
/*public class SortLengthWise {
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
}*/
