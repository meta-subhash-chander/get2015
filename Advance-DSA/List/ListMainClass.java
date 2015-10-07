/****************************************************************************************
Name            :  ListMainClass 
Revision Log    : 2015-10-05: Subhash Chander : created.
Use             : This class is used to perform all opertion of list
                :
 ****************************************************************************************/

import java.util.Scanner;

public class ListMainClass {
	public static void main(String[] args) {
		GenralizeList list = null;
		Scanner scanner = new Scanner(System.in);
		String input = null;
		int choice = -1;
		do {
			printMenu();
			while (!scanner.hasNextInt()) {
				System.out.println("Please Enter only Integer!");
				scanner.next();
			}
			choice = scanner.nextInt();
			while (choice < 1 || choice > 8) {
				System.out.println("Please enter valid integer!");
				choice = scanner.nextInt();
			}
			switch (choice) {
			case 1:
				do {
					System.out.println("Enter the valid Input ");
					input = scanner.next();
				} while (!InputValidate.isInputValid(input));
				break;
			case 2:
				if (input == null) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				list = new GenralizeList(input);
				break;
			case 3:
				if (input == null) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println(list.toString(list.getStart()));
				break;
			case 4:
				if (input == null) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println("Max = "
						+ list.calculateMaximumElement(list.getStart()));
				break;

			case 5:
				if (input == null) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println("Sum = "
						+ list.calculateSum(list.getStart()));
				break;

			case 6:
				if (input == null) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println("Enter an element to find");
				while (!scanner.hasNextInt()) {
					System.out.println("Please Enter only Integer!");
					scanner.next();
				}
				int searchingElement = scanner.nextInt();
				System.out.println("Find = "
						+ list.search(list.getStart(), searchingElement));
				break;
			case 7:
				scanner.close();
				System.exit(0);
			}
		} while (choice != 8);

	}

	public static void printMenu() {
		System.out
				.println(" Enter input according to instruction \n 1 for give the input \n 2 "
						+ "for the list Creation \n 3 for the list display \n 4 for the Maximum Number in List \n 5 for the Sum Of elements "
						+ "\n 6 to find the element in List \n 7 for Exit");
	}

}
