package winner;

class ReversedString {

	public void reverse() {
		String str = "SATYA";
		StringBuffer newStr = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			newStr = newStr.append(str.charAt(i));
		}
		System.out.println(newStr);
	}
//god of geeks      s k e e g   f o   d o g 
	void reverseLogically() {
		String string = "god of geeks";
		char[] stringToChar = string.toCharArray();
		int forward, backward;

		backward = stringToChar.length - 1;
		for (forward = 0; forward < backward; forward++, backward--) {

			char temp = stringToChar[backward];
			stringToChar[backward] = stringToChar[forward];
			stringToChar[forward] = temp;
		}
		for (int i = 0; i < stringToChar.length; i++) {
			System.out.print(stringToChar[i] + " ");
			// abcdedcba
		}
	}

	public static void main(String[] args) {
		ReversedString name = new ReversedString();
	//	name.reverse();
		name.reverseLogically();
	}

}