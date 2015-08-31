import java.io.DataInputStream;
import java.util.Scanner;

/*******************************************************************************************************
 * Name         : MainClass 
 * @author      : Subhash chander 
 * Revision Log : 30 August,2015 
 * Description  : Main class for priority queue
 *************************************************************************************************************/
public class MainClassPriorityQueue {
	/**
	 * Name: main
	 * 
	 * @param args
	 *            Description: User Interface
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DataInputStream abc = new DataInputStream(System.in);
		System.out.println("Priority Queue Test\n");
		PriorityQueue PriorityQueueObject = new PriorityQueue(20);
		int choice=0;
		do {
			System.out.println("1. insert");
			System.out.println("2. Start Processing");
			System.out.println("3. check empty");
			System.out.println("4. check full");
			System.out.println("5. clear");
			System.out.println("6. exit"); 
			   choice = scan.nextInt(); 
			switch (choice) {
			case 1:
				System.out
						.println("\n press 1 : Under Graduate \n press 2 : Graduate press \n press 3 : Professor \n press 4 : Chairman ");
				// To store Priority
				int priority = scan.nextInt();
				PriorityQueueObject.insert(priority);
				try {
					
				} catch (Exception e) {
					System.out.println("Enter the correct Format ");
				}
                break;
			case 2:
				System.out.println("\nJob processed \n\n"
						+ PriorityQueueObject.remove());
				break;
			case 3:
				System.out.println("\nEmpty Status : "
						+ PriorityQueueObject.checkIsEmpty());
				break;
			case 4:
				System.out.println("\nFull Status : "
						+ PriorityQueueObject.checkIsFull());
				break;
			case 5:
				System.out.println("\nPriority Queue Cleared");
				PriorityQueueObject.clearQueue();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Plese provide valid input\n ");
				break;
			}
			 System.out.println("HEllo");
		} while (choice >0 || choice < 7);
	}

}