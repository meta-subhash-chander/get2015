import java.util.Scanner;
  /**
   * Java program to find Reminder using recursion.
   * At first this programe take two integer input x,y 
   * and give the Reminder if x divided by y; 
   * @author Subhash Chander
   */
public class Reminder {
    /**
      * This method is used to find Reminder.  
	  * @param x This is the first parameter to Reminder_Function.
	  * @param y This is the second parameter to Reminder_Function.
	  * @return Return the Reminder if x divided by y.
	  */
	int Reminder_Function(int x, int y) {
		if (x >= 0 && y > 0) {
			return x % y;
		}
		return -1;
	}
	
	/**
	 * This is the main method which makes use of Reminder_Function.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		int number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter two numbers to find Reminder  ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		sc.close();
		Reminder rem = new Reminder();
		int Reminder_value = rem.Reminder_Function(number1, number2);
		System.out.println(Reminder_value);
	}

}
