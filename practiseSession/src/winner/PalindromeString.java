package winner;

public class PalindromeString {
	void palindrome() {
		String string = "malayalam";				
/*		char[] checkArray = string.toCharArray();*/
		char[] stringToChar = string.toCharArray();
		int forward, backward = stringToChar.length - 1;
		for (forward = 0; forward < backward; forward++, backward--) {
			char temp = stringToChar[backward];
			stringToChar[backward] = stringToChar[forward];
			stringToChar[forward] = temp;
			String s2= String.valueOf(stringToChar);
		}
		System.out.println(stringToChar);	
	}

	public static void main(String[] args) {
		new PalindromeString().palindrome();
	}

}
