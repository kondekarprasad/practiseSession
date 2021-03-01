package practiceSession;

import java.util.Scanner;

public class SplitAndAddition {
	static int addition;
	static int noOfIteraion;
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter an integer");
		int givenInteger=scanner.nextInt();
		System.out.println("given Integer"+givenInteger);
		scanner.close();
		/*
		 * logic for SplitAndAddition
		*/
		int tempVariable= givenInteger;
		while (tempVariable>9)
		{
			noOfIteraion=0;
			addition=0;
			while (tempVariable>0) 
				{
				int remainder=tempVariable%10;
				tempVariable=tempVariable/10;;
				 addition=addition+remainder;
		//		 noOfIteraion++;
				}
			tempVariable=addition;

	//		System.out.println( "count is "+noOfIteraion);
			 System.out.println(addition);
		}
		System.out.println("final addiion is:"+addition);
	}
}