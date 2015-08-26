import java.util.Scanner;

public class StackUsingLinkList {

	Object object;
	StackUsingLinkList next;
	static StackUsingLinkList top = null;

	public StackUsingLinkList() {
		object = null;
		next = null;

	}

	void push(Object item) {
		StackUsingLinkList newnode = new StackUsingLinkList();
		newnode.object = item;
		newnode.next = top;
		top = newnode;
	}

	void pop() {
		if (top != null) {
			top = top.next;

		} else {
			System.out.print("Stack is empty");
		}
	}

	void display() {
		StackUsingLinkList curr = top;
		System.out.print("Stack = : ");
		while (curr != null) {
			System.out.print(curr.object + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String ag[]) {
		StackUsingLinkList stack = new StackUsingLinkList();
		int choice = 0;

		do {
			Scanner scan = new Scanner(System.in);
			System.out
					.println("Enter your choice \n1. push \n2. pop \n3. exit..");
			choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("Enter an item");
				stack.push(scan.next());
				stack.display();
			} else if (choice == 2) {
				stack.pop();
				stack.display();
			} else {
				System.out.println("Enter correct choice..");
			}

		} while (choice != 3);

	}

}
