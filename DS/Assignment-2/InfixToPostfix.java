/****************************************************************************************
Name            : InfixToPostfix
Revision Log    : 2015-08-27: Subhash chander : created.
                : 
                : 
Use             : this class used to convert infix operator to postfix
                :
****************************************************************************************/ 
import java.util.Scanner;

public class InfixToPostfix {
	static StackUsingLinkList StackUsingLinkListObject=new StackUsingLinkList();
	/**
	 * getPriority method :this method return the priority of operator
	 * 
	 * @return: item : return the priority of operator
	 * 
	 * */  
	static int  getPriority(char character ) {
		if( character == '+' || character == '-' ) {
			return 0;
		}
		else if(character == '*' || character == '/') {
				return 1;	
				}
		else if (character == '^' || character == '%'){
			return 2;
		}
		else {
			return 3;
		}
		
	}
	
	//Start of main method
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter infix expression");
		String infix = sc.nextLine();
		String postfix="";
		int i=0;
		int priority = 0;
		char character;
		while(i!=infix.length()) {
			character=infix.charAt(i);
			if((character >= 65 && character <= 90) || (character >= 65 && character <= 122) ) {
				postfix += character;
			}
			else {		
					if(StackUsingLinkListObject.isEmpty()){
						priority=getPriority(character);
						StackUsingLinkListObject.push(character);
					}
					else {
							if(getPriority(character)>=priority){
								StackUsingLinkListObject.push(character);
								priority=getPriority(character);
								
							}
							else{
								while(!(StackUsingLinkListObject.isEmpty())){
									postfix+=StackUsingLinkListObject.pop();
								}
								priority=0;
							}
					}		
			}
			i++;
		}
		while(!(StackUsingLinkListObject.isEmpty())){
			postfix+=StackUsingLinkListObject.pop();
		}	
			System.out.println(" postfix expression = "+postfix);
	}
}
