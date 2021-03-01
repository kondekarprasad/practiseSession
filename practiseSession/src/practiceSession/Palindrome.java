package practiceSession;

public class Palindrome {
	public static void main(String[] args) {
		String str = "malayalam";
		StringBuffer newStr = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			newStr = newStr.append(str.charAt(i));
		}
		newStr.reverse();
		String s = newStr.toString();
		if (s.equals(s)) {
			System.out.println("palindrome");
		}
		System.out.println(str);
		if (str.equalsIgnoreCase(newStr.toString())) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}