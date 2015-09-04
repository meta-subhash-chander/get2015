package BinarySearchTree;
/****************************************************************************************
Name            : BinaryTreeNode
Revision Log    : 2015-09-04: Subhash chander : created.
                : 
                : 
Use             : this class used to genetate node for binary search tree
                :
****************************************************************************************/
public class BinarySearchTreeNode {
   
    public int value;
    BinarySearchTreeNode leftChild;
    BinarySearchTreeNode rightChild;
    String nameOfNode;
    /**
	 * BinarySearchTreeNode  :constractor use to pass value 
	 * 
	 * @param: value into node  
	 * @param: name of node
	 * */  
    public BinarySearchTreeNode(int value, String name) {
        this.value = value;
        this.nameOfNode = name;
    }
    /**
     *  toString:method is use to return key and name of node
	 * @return  : method is use to return key and name of node
	 *    
	 * */
    public String toString(){
        return "RoolNumber:------>" + value + ",Name os student:------> " + nameOfNode ;
        
    }
    
    
}
