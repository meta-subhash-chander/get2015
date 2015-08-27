/****************************************************************************************
Name            : Queuet
Revision Log    : 2015-08-27: Subhash chander : created.
                : 
                : 
Use             : This class is used to perform queue operation.
                :
 ****************************************************************************************/
package collegecounseling;

//class having implementation of queue methods
public class Queue {
	
	Object listForQueue[];
	
	int front = -1;
	int rear = -1;
	public Queue(int n) {
		listForQueue = new Object[n];
		
	}
	/**
	 * enQueue method : Method is used for insert an element in stack
	 * 
	 * @param: item : item to insert
	 * 
	 * */
  
	void enQueue (Object item ) {
		if(rear==-1) {
			rear = 0;
			front = 0;
			listForQueue[rear] = item;
		}
		else {
			listForQueue[++rear] = item;
		}
	}
	/**
	 * deQueue method : Method is used to perform delete operation
	 * 
	 * @return: item : item that deleted
	 * 
	 * */
	Object deQueue() {
		Object object;
		if(front==rear+1 || front == -1) {
			throw new NullPointerException("Queue is empty");
		}
		else {
				
				object = listForQueue[front];
				front++;
		}
		return object;
	}
	/**
	 * makeEmpty method : method to make the queue empty
	 * 
	 * 
	 * */ 
	void makeEmpty(){
		front=-1;
		rear=-1;
		
	}

	/**
	 * getFront method : method to get front of the queue
	 * 
	 * @return: item : front of the queue
	 * 
	 * */
	Object getFront() {
		if (front == rear + 1 || front == -1) {
			throw new NullPointerException("Queue is empty");

		} else {
			return listForQueue[front];
		}

	}
	
}

