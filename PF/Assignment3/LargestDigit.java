import java.util.Scanner;
/**
 * Java program to findLargestDigit using
 * int LargestDigit_found_function(int n) ,recursive function.
 * At first this programe take  integer input n 
 * and give the LargestDigit as return; 
 * @author Subhash Chander
 */

public class LargestDigit { int max=0,digit=0;
/**
 * This method is used to find largest digit.  
 * @param x This is the first parameter to REMINDER_FUNCTION.
 * @return Return LargestDigit from x.
 */
	int LargestDigit_found_function(int n)
	{
		if(n>0)
		{
			 digit=n%10;
			 if(digit > max)
			 {
				 max=digit;
				 
				 return LargestDigit_found_function(n/10);
			 }
			 return LargestDigit_found_function(n/10);
		}
		else
		return max;
	}
	/**
	 * This is the main method which makes use of LargestDigit_found_function.
	 * @param args Unused.
	 * @return Nothing.
	 */
	 public static void main(String [] args)
		{
		 int number;
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter numbers to find largest digit  ");
			number = sc.nextInt();
			sc.close();
		 LargestDigit ld =new LargestDigit(); 
		int LargestDigit= ld.LargestDigit_found_function(number);
		System.out.println(LargestDigit);
		}
}
