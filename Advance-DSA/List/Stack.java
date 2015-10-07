/****************************************************************************************
Name            :  Stack 
Revision Log    :  2015-10-05: Subhash Chander : created.
                : 
                : 
Use             : This class is used to perform all opertion of stack
                :
 ****************************************************************************************/
public class Stack {
	private int top;
	private int size;
	private Object stack[];
	/**
	 * Stack method : constractor 
	 * @param : size of stack
	 * */
	public Stack(int size) {

		this.size = size;
		top = -1;
		stack = new Object[size];
	}
	 /**
   	 * getTop method : get Top value of stack
   	 * @return :Top value 
   	 * */
	public int getTop() {
		return top;
	}
	 /**
   	 * setTop method : set Top value of stack
   	 * @param :Top value 
   	 * */
	public void setTop(int top) {
		this.top = top;
	}
	 /**
   	 * push method : push element into stack
   	 * @param :object item
   	 * */
	public void push(Object item) {

		if (top >= size - 1) {
			System.out.println("Stack overflow");

		} else {
			top = top + 1;
			stack[top] = item;
		}

	}
	 /**
   	 * pop method : pop element into stack
   	 * @return :object item
   	 * */
	public Object pop() {
		Object elementToPop = null;
		if (size == -1) {
			System.out.println("Stack underflow");
		} else {

			elementToPop = stack[top];
			top--;

		}

		return elementToPop;
	}
	 /**
   	 * isEmpty method : check that stack is empty or not
   	 * */
	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;

	}
	 /**
   	 * peek method : peek element into stack
   	 * @return :object item
   	 * */
	public Object peek() {
		Object t = null;
		if (top >= size) {
			System.out.println("stack overflow");
		} else if (top == -1) {

			System.out.println("Stack underflow");
		} else {
			t = stack[top];
		}
		return t;
	}

}
