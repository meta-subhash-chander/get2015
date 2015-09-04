package BinarySearchTree;
/****************************************************************************************
 * Name : BinarySearchTree 
 * Revision Log : 2015-09-04: Subhash chander : created.
 * Use :class have method implementation of BinarySearchTree :
 ****************************************************************************************/

public class BinarySearchTree {

	BinarySearchTreeNode root;

	/**
	 * addNode method :method to add node in Binary Search tree
	 * 
	 * @param: value into node
	 * @param: name of node
	 * */
	public void addNode(int value, String name) {

		BinarySearchTreeNode newNode = new BinarySearchTreeNode(value, name);

		if (root == null) {

			root = newNode;

		} else {

			BinarySearchTreeNode tempNode = root;
			BinarySearchTreeNode parent;
			while (true) {
				parent = tempNode;
				if (value < tempNode.value) {
					tempNode = tempNode.leftChild;
					if (tempNode == null) {
						parent.leftChild = newNode;
						return;

					}
				} else {
					tempNode = tempNode.rightChild;
					if (tempNode == null) {
						parent.rightChild = newNode;
						return;

					}
				}
			}

		}

	}

	/**
	 * inOrderTraversal method : method to show inordertraversal of tree
	 * 
	 * @param tempNode
	 *            : root node
	 * */
	public void inOrderTraversal(BinarySearchTreeNode tempNode) {

		if (tempNode != null) {
			inOrderTraversal(tempNode.leftChild);
			System.out.println(tempNode.toString());
			inOrderTraversal(tempNode.rightChild);
		}
	}
}
	 
