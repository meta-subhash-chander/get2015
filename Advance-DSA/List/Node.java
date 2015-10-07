/****************************************************************************************
Name            :  Node 
Revision Log    : 2015-10-05: Subhash Chander : created.
                : 
                : 
Use             : This class is used to perform all opertion of list
                :
 ****************************************************************************************/
public class Node {  

	Node next;
	Object value;
	 /**
   	 * Node constractor : set value of node
   	 * @param : value
   	 * */
	public Node(Object item) {
		value = item;
		next = null;
	}
	 
	/**
	 * default constractor
	 * */
	public Node() {
	}

}
