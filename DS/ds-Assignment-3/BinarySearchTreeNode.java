/****************************************************************************************
Name            : BinaryTreeNode
Revision Log    : 2015-08-28: Subhash chander : created.
                : 
                : 
Use             : this class used to genetate node for binary search tree
                :
****************************************************************************************/
public class BinarySearchTreeNode {
   
    public int key;
    BinarySearchTreeNode leftChild;
    BinarySearchTreeNode rightChild;
    String nameOfNode;
    /**
	 * BinarySearchTreeNode  :constractor use to pass value 
	 * 
	 * @param: value into node  
	 * @param: name of node
	 * */  
    public BinarySearchTreeNode(int key, String name) {
        this.key = key;
        this.nameOfNode = name;
    }
    /**
     *  toString:method is use to return key and name of node
	 * @return  : method is use to return key and name of node
	 *    
	 * */
    public String toString(){
        return nameOfNode+" has a key "+key;
        
    }
    
    
}
