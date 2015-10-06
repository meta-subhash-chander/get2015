/****************************************************************************************
Name            :  Node 
Revision Log    : 2015-10-05: Subhash Chander : created.
               : 
               : 
Use             : This class is used to perform all opertion of list
               :
 ****************************************************************************************/
package LIST;


public class Node {
	int flag;
	Object data;
	ListNode next;
	 /**
   	 * getFlag method : get value of flag
   	 * */
	public int getFlag() {
		return flag;
	}
	 /**
   	 * setFlag method : set value of flag
   	 * @param :flag value
   	 * */
	public void setFlag(int flag) {
		this.flag = flag;
	}
	/**
   	 * getData method : get value of data
   	 * */
	public Object getData() {
		return data;
	}
	 /**
   	 * setData method : set value of data
   	 * @param :data value
   	 * */
	public void setData(Object data) {
		this.data = data;
	}
	  /**
   	 * getNext method : get value of next
   	 * */
	public ListNode getNext() {
		return next;
	}
	  /**
   	 * setNext method : set value of next
   	 * @param :node value
   	 * */
	public void setNext(ListNode next) {
		this.next = next;
	}
	/**
   	 * toString method : get value of all attribute
   	 * */
	@Override
	public String toString() {
		return "ListNode [flag=" + flag + ", data=" + data + ", next=" + next
				+ "]";
	}
	
}
