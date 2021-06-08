package practiceSession;

import java.util.Scanner;

/*  input  "java is object oriented"
  output "avaj si tcejbo detniero "*/
 
public class ReverseWordsInString {
/*	public static void main(String[] args) {
		String string = "java is object oriented";
		String[] stringArray = string.split(" ");
		for (int i = 0; i < stringArray.length; i++) {
			// System.out.println(stringArray[i]);
			for (int j = stringArray[i].length() - 1; j >= 0; j--) {
				System.out.print(stringArray[i].charAt(j));
			}
		System.out.print(" ");
		}
	}*/
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original string : ");
 
        String originalStr = scanner.nextLine();
        scanner.close();

        String words[] = originalStr.split("\\s");
        String reversedString = "";
 
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
         // Displaying the string after reverse
        System.out.println("Reversed string : " + reversedString);
    }

}
