package winner;

// sort length wise
public class NewObj {

	public static void main(String[] args) {
		String string = "java is object oriented programming language";
		String[] strArr = string.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr.length; j++) {
				if (strArr[j].length() > strArr[i].length()) {
					String temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				} else if (strArr[i].length() == strArr[j].length()) {
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

}
