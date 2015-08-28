/****************************************************************************************
Name            : BinarySearchTree 
Revision Log    : 2015-08-28: Subhash chander : created.
                : 
                : 
Use             :class have method implementation of BinarySearchTree
                :
****************************************************************************************/

public class BinarySearchTree {

	BinarySearchTreeNode root;
	/**
	 * addNode method :method to add node in Binary Search tree
	 * 
	 * @param: value into node  
	 * @param: name of node
	 * */   
	public void addNode(int key, String name) {

		BinarySearchTreeNode newNode = new BinarySearchTreeNode(key, name);
 
		if (root == null) {

			root = newNode;

		} else {

			BinarySearchTreeNode tempNode = root;
			BinarySearchTreeNode parent;
			while (true) {
				parent = tempNode;
				if (key < tempNode.key) {
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
	 * @param tempNode: root node  
	 * */    
	public void inOrderTraversal(BinarySearchTreeNode tempNode) {

		if (tempNode != null) {
			inOrderTraversal(tempNode.leftChild);
			System.out.println(tempNode);
			inOrderTraversal(tempNode.rightChild);
		}
	}
	/**
	 * preOrderTraversal method : method to show preorder traversal of tree
	 * 
	 * @param tempNode: root node  
	 * */    
	String preOrderTraversal(BinarySearchTreeNode currentNode){
        
        String str1 = null;
		if(currentNode!=null){
               System.out.println(currentNode);
               str1+=currentNode.key;
               preOrderTraversal(currentNode.leftChild);
               preOrderTraversal(currentNode.rightChild);
               return str1;
        }
        return str1;
}   
	/**
	 *postOrderTraversal method : method to show post order traversal of tree
	 * 
	 * @param tempNode: root node  
	 * */  
	public String postOrderTraversal(BinarySearchTreeNode currentNode){
	     
      String str1=null;;
		if(currentNode!=null){
            postOrderTraversal(currentNode.leftChild);
            postOrderTraversal(currentNode.rightChild);
            System.out.println(currentNode);
            str1+=currentNode.key;
            return str1;
        }
		return str1;
}     }
	 
