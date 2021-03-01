package winner;

public class ReverseNumber {
    /* Iterative function to reverse 
    digits of num*/
    static int reversDigits(int num) 
    { 
        int rev_num = 0; 
        while(num > 0) 
        { 
            rev_num = rev_num * 10 + num % 10; 
            num = num / 10; 
        } 
        return rev_num; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int num = 141; 
        System.out.println("Reverse of no. is " 
                           + reversDigits(num)); 
        if (reversDigits(num)==num) {
			System.out.println("palindrome");
		}
        else {
        	System.out.println("not palindrome");
        }
    } 

}

