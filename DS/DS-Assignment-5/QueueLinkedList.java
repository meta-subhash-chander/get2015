/****************************************************************************************
Name            : QueueLinkedList
Revision Log    : 2015-09-01: Subhash chander : created.
                : 
                : 
Use             : This class is used to perform queue operation.
                :
 ****************************************************************************************/
import java.util.Scanner;

public class QueueLinkedList {

	private int total = 0;

	private Node first = null, last = null;

	public void enqueue(Object element) {
		Node current = last;
		last = new Node();
		last.element = element;

		if (total == 0) {
			first = last;
			total = total + 1;
		} else {
			current.next = last;
			total = total + 1;
		}

	}
	/**
	 * deQueue method : Method is used to perform delete operation
	 * 
	 * @return: item : item that deleted
	 * 
	 * */
	public Object dequeue() {
		if (last == null) {
			System.out.println("Queue is empty");
			return null;
		} else {
			Object element = first.element;
			first = first.next;
			if (--total == 0)
				last = null;
			return element;
		}
	}
	/**
	 * toString method : Method is used to show the queue 
	 * 
	 * @return:        : ELement of queue 
	 * 
	 * */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node tmp = first;
		while (tmp != null) {
			sb.append(tmp.element).append(", ");
			tmp = tmp.next;
		}
		return sb.toString();
	}

	public static void main(String ag[]) {
		QueueLinkedList QueueLinkedListObject = new QueueLinkedList();
		int choice = 0;
		Scanner scan = new Scanner(System.in);

		do {

			System.out
					.println("Enter your choice \n1. Enqueue \n2. Dequeue \n3. Display Queue \n4. exit..");
			choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("Enter an item");
				QueueLinkedListObject.enqueue(scan.next());
			} else if (choice == 2) {
				System.out.println("Elememt removed :"
						+ (QueueLinkedListObject.dequeue()));

			} else if (choice == 3) {
				System.out.println("Elememt  "
						+ (QueueLinkedListObject.toString()));
			} else {
				System.out.println("Enter correct choice..");
			}

		} while (choice != 4);

		scan.close();

	}

}