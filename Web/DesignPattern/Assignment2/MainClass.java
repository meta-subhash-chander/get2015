/****************************************************************************************
Name            : MainClass
Revision Log    : 2015-10-22: Subhash Chander : created.
                : 
                : 
Use             : create the instance of class 
 ****************************************************************************************/
package Assignment2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int leave;
		LeaveHandler handler = HandlerHelper.initializer();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many leaves do you want?");
		leave = scanner.nextInt();
		handler.handleRequest(leave);
		scanner.close();
	}

}
