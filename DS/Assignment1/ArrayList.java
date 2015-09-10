import java.util.Arrays;

public class ArrayList {
	private static Object[] myStore;
	private static int actualSize = 0;

	public ArrayList() {
		myStore = new Object[10];
	}

	public Object getElement(int index) {
		if (index < actualSize) {
			return myStore[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void addElement(Object obj) {
		if (myStore.length - actualSize <= 5) {
			increaseListSize();
		}
		myStore[actualSize++] = obj;
	}

	public Object removeElementByIndex(int index) {
		if (index < actualSize) {
			Object obj = myStore[index];
			myStore[index] = null;
			int temperaryVarible = index;
			while (temperaryVarible < actualSize) {
				myStore[temperaryVarible] = myStore[temperaryVarible + 1];
				myStore[temperaryVarible + 1] = null;
				temperaryVarible++;
			}
			actualSize--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}

	}
	public Object addElementOnIndex(int index,Object obj) {
		if (index < actualSize) {
			int temperaryVarible = index;
			int temp=actualSize+1;
			while (temperaryVarible < actualSize+1) {
				myStore[temp] = myStore[temp-1];
				temp--;
				temperaryVarible++;
			}myStore[index] = obj;
			actualSize++;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();}
		}
	  void reverseOfArrayList(){

	        for (int i = 0; i < actualSize / 2; i++) {
	            Object temp = myStore[i]; 
	            myStore[i] = myStore[actualSize - 1 - i];
	            myStore[actualSize - 1 - i] = temp;
	        }
	 
	}

	public void removeElementByValue(Object value) {

		int flag = 0;
		int index = 0;
		for (int i = 0; i < actualSize; i++) {
			if (myStore[i] == value) {
				flag = 1;
				index = i;
				break;
			}
		}
		if (flag == 1) {
			for (int i = index + 1; i < actualSize; i++) {
				myStore[i - 1] = myStore[i];
			}
			actualSize--;

			index--;
			System.out.println(value + " deleted");
		} else {
			System.out.println(value + " not exist in list");
		}
	}
 
	public int size() {
		return actualSize;
	}
	 public void removeAll() {
			int flag=0;
			if(actualSize>0){
			 flag=1;
			 
			}
			if(flag==1){
				actualSize=0;
				 
				System.out.println("All elewments are removed from list");
			}
			else
			  System.out.println("list is already empty");
		}
	public int firstOccuerence(int position,Object value)
	 {
		 int index1 = 0,flag=-1;
		  position++;
		 for(int i=position; i < actualSize; i++){
		    	if(myStore[i]==value){
		    		flag=0;
		    		index1=i;
		    		break;
		    	}
		  }
		 if(flag==0){
			return index1;
		 }
		 else{
			return flag;
		 }
	 }

	private void increaseListSize() {
		myStore = Arrays.copyOf(myStore, myStore.length * 2);
		System.out.println("\nNew length: " + myStore.length);
	}

}