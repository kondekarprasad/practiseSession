package practiceSession;

public class Erwin {
	static String str = "i am java i am erwin  ";

	static void find_duplicate_string() {

		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			int counter = 1;
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i].equals(strArr[j])) {
					counter++;
					System.out.println(strArr[j] + " " + counter);

				}

			}

		}
	}

	public static void main(String[] args) {
		Erwin.find_duplicate_string();

	}

}
