import java.util.Scanner;

public class InfixToPostfix {
	
	
	
 
	public static void main(String ad[]){
		
		StackUsingLinkList stack=new StackUsingLinkList(); 
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter proper infix string");
		String infix=scan.next();
		String postfix ="";
		InfixToPostfix obj=new InfixToPostfix();
		
		int len=infix.length();
		
		for(int i=0 ; i<len ;i++)
		{
			char ch=infix.charAt(i);
			if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
				postfix+=',';
				if( stack.top==null)
				{
					stack.push(ch);
					
				}
				else if(obj.precedence(ch)>obj.precedence((char)  stack.top.object)){
					stack.push(ch);
					
					
				}
				else {
					while(stack.top!=null&&obj.precedence(ch)<obj.precedence((char)  stack.top.object)){
							postfix+=","+stack.top.object;
							stack.pop();
							
					}
					stack.push(ch);
				}	
			}
			else if(ch=='(')
			{
				stack.push(ch);
			}
			else if(ch==')')
			{
				while((char) stack.top.object!='('){
					postfix+=","+stack.top.object;
					
					stack.pop();
					
				}
				stack.pop();
				
			}
			else {
				postfix+=ch;
			}
		}

		while(stack.top!=null){
			

		postfix+=","+stack.top.object;
		stack.pop();
		}
		
		System.out.print("Postfix Expression is : "+postfix);
	
		scan.close();
		
	}

	public int precedence(char ch){
		int output=0;
		if(ch=='+'||ch=='-'){
			output= 1;
		}
		else if(ch=='*'||ch=='/'){
			output= 2;
		}
		return output;
	}

}

