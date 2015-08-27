/****************************************************************************************
Name            : StackUsingLinkList
Revision Log    : 2015-08-27: Subhash chander : created.
                : 
                : 
Use             : This class is used to perform stack operation.
                :
 ****************************************************************************************/

import java.util.Scanner;

public class StackUsingLinkList {

	Object object;
	StackUsingLinkList next;
	static StackUsingLinkList top = null;

	public StackUsingLinkList() {
		object = null;
		next = null;

	}

	/**
	 * push method : Method is used for insert an element in stack
	 * 
	 * @param: item : item to insert
	 * 
	 * */
	void push(Object item) {
		StackUsingLinkList newnode = new StackUsingLinkList();
		newnode.object = item;
		newnode.next = top;
		top = newnode;
	}

	/**
	 * pop method : Method is used to perform pop operation
	 * 
	 * @return: item : item that deleted
	 * 
	 * */
	Object pop() {
		Object tempObject = top.object;
		if (top != null) {
			top = top.next;

		} else {
			System.out.print("Stack is empty");
		}
		return tempObject;
	}

	/**
	 * display method : Method is used for display stack
	 * 
	 * @return: item : item that deleted
	 * 
	 * */

	void display() {
		StackUsingLinkList curr = top;
		System.out.print("Stack = : ");
		while (curr != null) {
			System.out.print(curr.object + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	/**
	 * isEmpty method : Method is used check that stack is empty or not
	 * 
	 * @return: boolean : true or false
	 * 
	 * */
	public boolean isEmpty() {
		if (top == null) {
			return true;
		}
		return false;
	}

	// Start of main method
	public static void main(String ag[]) {
		StackUsingLinkList stack = new StackUsingLinkList();
		int choice = 0;
		Scanner scan = new Scanner(System.in);

		do {

			System.out
					.println("Enter your choice \n1. push \n2. pop \n3. exit..");
			choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("Enter an item");
				stack.push(scan.next());
				stack.display();
			} else if (choice == 2) {
				System.out.println("Enter removed :" + stack.pop());

				stack.display();
			} else {
				System.out.println("Enter correct choice..");
			}

		} while (choice != 3);

		scan.close();

	}

}
