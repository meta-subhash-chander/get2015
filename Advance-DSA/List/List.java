/****************************************************************************************
Name            :  List 
Revision Log    : 2015-10-05: Subhash Chander : created.
               : 
               : 
Use             : This class is used to perform all opertion of list
               :
 ****************************************************************************************/
package LIST;

public class List {
	ListNode first;
	private int max;
	private int sum;
	private int size;
	private int index;
	private String  input;
	private char currentChar = 0 ;
	public List() {
		first = null;
	}
	/**
	 * List method : constructor to set value of input 
	 * @param: String : input string
	 * */
	public List(String input) {
		max = Integer.MIN_VALUE;
		sum = 0;
		index = 1;
		size = 0;
		this.input = input;
		if (isInputValid(input)) {
			first = createList();
		} else {
			System.out.println("Input is not valid ");
		}
	}
	/**
	 * isInputValid method : method is use to check that input is valid or not
	 * @param: String : input string
	 * @return: boolean result
	 * */
	public static boolean isInputValid(String input) {
		char presentChar = 0;
		int countOpen = 0;
		int countClose = 0;
		int countNumber =0 ;
		int countComma = 0;
		int otherChar = 0;
		int count = 0;
		while( count < input.length()) {
			presentChar = input.charAt(count);
			switch(presentChar) {
			case '(':
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				countOpen++;
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				while( presentChar >= '0' && presentChar <= '9' ) {					
					count++;	
					if(count < input.length()) {
						presentChar = input.charAt(count);
					} else {
						break;
					}
				}
				countNumber++;
				break;
			case ')':
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				countClose++;
				break;
			case ',':
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				countComma++;
				break;
			default :
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				otherChar++;
				break;
			}
		}
		if(countClose != countOpen || countOpen <= 0) {
			return false;
		} else if((countNumber-1) != countComma) {
			return false;
		} else if(otherChar != 0) {
			return false;
		}
		return true; 
		
	}
	/**
	 * isEmpty method :check that list is empty
	 * @return: boolean result
	 * */
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * createList method :Generate the list
	 * @return: ListNode
	 * */
	private ListNode createList( ) {
		ListNode list = null;
		ListNode prev = null;		
		int flag = 1;
			if(index < input.length()) {
				currentChar = input.charAt(index);
			}
			
			do{
				switch (currentChar) {
				case '(':
					index++;
					System.out.println(list);
					ListNode newNode = new ListNode();
					newNode.setFlag(1);
					newNode.setData(createList());
					newNode.setNext(null);
					
					
					if(list == null) {
						list = newNode;
						prev = newNode;
					} else {
						prev.setNext(newNode);
						prev = newNode;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					String number = Character.toString(currentChar);
					index++;
					
						currentChar = input.charAt(index);
					
					while( currentChar >= '0' && currentChar <= '9' ) {
					
						number += currentChar;
						index++;
				
							currentChar = input.charAt(index);
					
					}
					int data = Integer.parseInt(number);
					size++;
					ListNode newNode1 = new ListNode();
					newNode1.setFlag(0);
					newNode1.setData(data);
					newNode1.setNext(null);
					if(list == null) {
						list = newNode1;
						prev = newNode1;
					} else {
						prev.setNext(newNode1);
						prev = newNode1;
					}
					
					break;
				
				case ',':
					index++;
					
					currentChar = input.charAt(index);
					break;
				case ')' :
					flag = 0;
					index++;
					if(index < input.length()) {
						currentChar = input.charAt(index);
					}
					System.out.println(list);
					return list;
				default:
						flag = 0;
						break;
				}
				
			} while( flag != 0 || index < input.length());
		return list;
		
	}
	/**
	 * traverse method : method is use to traverse the list
	 * */
	public void traverse(){
		if(isEmpty()) {
			System.out.println("The list is empty");
			return;
		}
		traverseAllList(first);
	}
	/**
	 * traverseAllList method : method is use to traverse the list
	 * @param : first node to start traverse
	 * */
	public void traverseAllList(ListNode first) {
		while(first != null ) {
			if(first.getFlag() == 0){
				System.out.print(first.getData() + ", ");
				sum += (Integer)first.getData();
				if(max<(Integer)first.getData()) {
					max =(Integer)first.getData();
				}
				first = first.getNext();
			} else {
				ListNode first1 = (ListNode)first.getData();
				traverseAllList(first1);
				first = first.getNext();
			}
		}
		
	}
	/**
	 * findElement method : method is use find element into  list
	 * @param : first node to start traverse
	 * @param : element to search
	 * @return : boolean result
	 * */
	private boolean findElement(ListNode first,int searchingElement) {
		boolean isFound = false;
		while(first != null ) {
			if(first.getFlag() == 0){
			
				if(searchingElement == (Integer)first.getData()) {
					isFound = true;
				}
				first = first.getNext();
			} else {
				ListNode first1 = (ListNode)first.getData();
				isFound = (findElement(first1, searchingElement) || isFound);
				first = first.getNext();
			}
		}
		return isFound;
	}
	/**
	 * max method : max element into  list
	 * @return : max element
	 * */
	public int max() {
		if(size ==0 ) {
			System.out.println("There is no element in List");
		}
		return max;		
	}
	/**
	 * sum method : sum of all element into  list
	 * @return :  element sum
	 * */
	public int sum() {
		if(size ==0 ) {
			System.out.println("There is no element in List");
		}
		return sum;
	}
	/**
	 * find method : method is use find element into  list
	 * @param : element to search
	 * @return : boolean result
	 * */
	public boolean find(int searchingElement) {
		if(size ==0 ) {
			System.out.println("There is no element in List");
			return false;
		} 
		
		return findElement(first, searchingElement);
	}
	
	/**
	 * size method : method is use size of list
	 * @return :size of list
	 * */
	@SuppressWarnings("unused")
	private int size() {
		return size;
	}
	public static void printMenu(){
		System.out.println(" Enter 1for give the input \n 2 for the Check the validity of input \n 3 "
				+ "for the list Creation \n 4 for the list display \n 5 for the Maximum Number in List \n 6 for the Sum Of elements "
				+ "\n 7 to find the element in List \n 8 for Exit");
	}
}
