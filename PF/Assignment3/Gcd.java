import java.util.Scanner;
/**
 * Java program to find greatest commen diviser using recursion.
 * At first this programe take two integer input x,y 
 * and give the Gcd of x and y; 
 * @author Subhash Chander
 */
public class Gcd {
	 /**
     * This method is used to find greatest commen diviser using recursion.  
	  * @param x This is the first parameter to GcdFunction.
	  * @param y This is the second parameter to GcdFunction.
	  * @return Return Gcd of x and y; 
	  */
	 int GcdFunction(int number1, int number2) {
	        
	        if(number2 == 0){
	            return number1;
	        }
	        return GcdFunction(number2, number1%number2);
	    }
	
	 /**
		 * This is the main method which makes use of GcdFunction method.
		 * @param args Unused.
		 * @return Nothing.
		 */
	 public static void main(String [] args)
	{
	    int number1, number2;
	    Scanner sc =new Scanner(System.in);
	    System.out.println("\nEnter two numbers to find Gcd   ");
	    number1=sc.nextInt();
	    number2=sc.nextInt();
	    sc.close();
	    Gcd Gcd1 =new Gcd();
	   int n= Gcd1.GcdFunction(number1, number2); 
	    if (n>=0)
	    	System.out.println( n);
	    else
	    	System.out.println("\nInvalid input!!!\n");
	    
}}
