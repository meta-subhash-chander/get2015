package BinarySearchTree;
/****************************************************************************************
Name            : BinarySearchTree 
Revision Log    : 2015-09-04: Subhash chander : created.
                : 
                : 
Use             :class have method implementation of BinarySearchTree
                :
 ****************************************************************************************/
import java.util.Scanner;

public class BinarySearchTreeMainClass {

	public static void main(String[] args) {
		int flag = 0;
		BinarySearchTree tree = new BinarySearchTree();
		while (true) {
			System.out.println("press 1 to add Student into the Tree");
			System.out.println("press 2 to show student in assending order of rool number");
			System.out.println("press 3 to exit");
			Scanner sc = new Scanner(System.in);
			String choice = sc.next();
          int RoolNumberOfStudent=0;
			if (choice.equals("1")) { 
					System.out.println("enter Rool Number of student(Integer)");
				while(!sc.hasNextInt()){
					System.out.println("enter Rool Number of student(Integer)");
					 sc.next();
				}
				RoolNumberOfStudent = sc.nextInt();
				System.out.println("enter name of student");
				String studentName = sc.next();

				tree.addNode(RoolNumberOfStudent, studentName);
				flag = 1;
			} else if (choice.equals("2")) {

				System.out.println("\n inOrderTraversal Traversal of tree\n");

				if (flag == 0) {
					System.out.println("\nSorry ! Tree has No student\n");
				}
				tree.inOrderTraversal(tree.root);
				System.out.println("\n");

			}
			else if (choice.equals("3")) {
				System.exit(0);
			} else {
				System.out.println("\nPlease enter Correct Option\n");
			}

		}

	}

}
