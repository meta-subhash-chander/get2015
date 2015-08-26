
public class Queue {

	static int front=0;
	static int rear=0;
	Object queue[]=new Object[100];
	
	
	void enqueue(Object item ){
		queue[rear++]=item;
		
	}
	
	Object dequeue( ){
		return queue[front++];
		
	}
	
	
	void makeEmpty( ){
		front=0;
		rear=0;
	}
	
	Object getFront( ) {
		return queue[front];
	}
	
	boolean isEmpety(){
		if(front==rear){
			return true;
			
		}
		else{
			
		}
		return false;
	}
}
