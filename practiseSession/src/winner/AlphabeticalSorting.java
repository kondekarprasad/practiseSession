package winner;
/* asked in auto rabbit */
public class AlphabeticalSorting {

	public static void main(String[] args) {
		String temp;
    String s= "java is an object oriented programming language";//alphabetically hello arrange me
		String str[] = s.split(" ");

		// Sorting the strings
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}

		// Displaying the strings after sorting them based on alphabetical order
		for (int i = 0; i <= str.length - 1; i++) {
			System.out.println(str[i]+" " );
		}
	}
}
