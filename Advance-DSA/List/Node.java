/****************************************************************************************
Name            :  Node 
Revision Log    : 2015-10-05: Subhash Chander : created.
               : 
               : 
Use             : This class is used to perform all opertion of list
               :
 ****************************************************************************************/
package generalizedList;

public class Node {
    private Object data;
    private Node next;
    private int tag;
    
    /**
	 * Node method : default constructor 
	 * */
    Node()
    {
	tag=0;
	data=null;
	}
    /**
   	 * Node method :  constructor  to set value of tag and data
   	 * @param :tag of node
   	 * @param : value of node
   	 * */
    Node(int tag,Object data)
    {this.data=data;
    next=null;
    this.tag=tag;
	
    }
    /**
   	 * getNext method : get value of next
   	 * */
    public Node getNext() {
		return next;
	}
    /**
   	 * setNext method : set value of next
   	 * @param :node value
   	 * */

	public void setNext(Node next) {
		this.next = next;
	}
	/**
   	 * getData method : get value of data
   	 * */
	public Object getData() {
        return data;
    }
	/**
   	 * getTag method : get value of tag
   	 * */
    public int getTag() {
        return tag;
    }
    /**
   	 * setTag method : set value of tag
   	 * @param :tag value
   	 * */
    public void setTag(int tag) {
        this.tag = tag;
    }
    /**
   	 * setData method : set value of data
   	 * @param :data value
   	 * */
    public void setData(Object data) {
        this.data = data;
    }
   
}