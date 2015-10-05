/****************************************************************************************
Name            :  ListMainClass 
Revision Log    : 2015-10-05: Subhash Chander : created.
Use             : This class is used to perform all opertion of list
                :
 ****************************************************************************************/
package generalizedList;

import java.util.Scanner;

import LIST.List;

public class ListMainClass {
	public static void main(String[] args) {
		List list = null;
		Scanner scanner = new Scanner(System.in);
		String input = null;
		int choice = -1;
		do {
			List.printMenu(); 
			while(!scanner.hasNextInt()) {
				System.out.println("Please Enter only Integer!");
				scanner.next();
			}
			choice = scanner.nextInt();
			while(choice < 1 || choice >8) {
				System.out.println("Please enter valid integer!");
				choice = scanner.nextInt();
			}
			switch (choice) {
			case 1:
				System.out.println("Enter the Input ");
				input = scanner.next();
				break;
			case 2:
				if(input == null ) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println(List.isInputValid(input));
				break;
			case 3 :
				if(input == null ) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				list = new List(input);
				break;
			case 4:
				if(input == null ) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				list.traverse();
				break;
			case 5:
				if(input == null ) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println("Max = " + list.max());
				break;
				
			case 6:
				if(input == null ) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println("Sum = " + list.sum());
				break;
				
			case 7:
				if(input == null ) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println("Enter an element to find");
				while(!scanner.hasNextInt()) {
					System.out.println("Please Enter only Integer!");
					scanner.next();
				}
				int searchingElement = scanner.nextInt();
				System.out.println("Find = " + list.find(searchingElement));
				break;
			case 8:
				scanner.close();
				System.exit(0);
			}
		} while(choice != 8 );
		
		// list = new List("(3,4,(1,2),5,6,7,(8))");				
	}
	
	
}
