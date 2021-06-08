package practiceSession;
/* remove duplicate from String */

public class RemoveDuplicateFromString {
	void duplicateRemove(String string) {
		char[] chars = string.toCharArray();
		char[] char2 = new char[12];
		boolean repeatedChar;
		for (int i = 0; i < chars.length; i++) {
			repeatedChar = false;

			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					repeatedChar = true;
					chars[i] = chars[i + 1];
					break;
				}
			}
			if (repeatedChar == false) {
				System.out.print(chars[i]);
			}
		}

	}

	public static void main(String[] args) {
		RemoveDuplicateFromString name = new RemoveDuplicateFromString();
		name.duplicateRemove("abcdefedcba");
	}
}
