 /****************************************************************************************
Name            : SortedLinkList 
Revision Log    : 2015-09-01: Subhash Chander : created.
                : 
                : 
Use             : This class is used to perform all opertion of Sorted Link list
                :
 ****************************************************************************************/
import java.util.Scanner;
 
public class SortedLinkList {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		LinkList linkList = new LinkList();
		String regix = "[0-9]+";
		String choice;
		int index = 0;

		while (true) {
			System.out.println("Enter 1 to insert data item");
			System.out.println("Enter 2 to display LinkList");
			System.out.println("Enter 3 to exit");
			choice = scan.next();
			switch (choice) {
			case "1":
				String dataValue;

				do {
					System.out.println("Enter data value");
					dataValue = scan.next();

				} while (!(dataValue.matches(regix)));

				int data = Integer.parseInt(dataValue);
				LinkList.checkIndexToInsertElement(index, data);
				break;
			case "2":
				if (linkList.sizeOfLinkList() == 0) {
					System.out.println("\nLinkList is Empty\n");
				} else {
					System.out.println("\n" + linkList.list);

				}
				break;
			case "3":
				return;
			default:
				System.out.println("\nEnter correct choice\n");
			}

		}
	}
}
