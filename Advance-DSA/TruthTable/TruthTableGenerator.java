/****************************************************************************************
Name            :  TruthTableGenerator 
Revision Log    : 2015-10-05: Subhash Chander : created.
               : 
               : 
Use             : This class is used to Generate Truth Table 
               :
 ****************************************************************************************/
package truthTable;

import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;


public class TruthTableGenerator {
	/**
	 * truthTableGenerator method : constructor to set value of input 
	 * @param: String : input string
	 * */
	public void truthTableGenerator(String input) {
		if(Validation.isExpression(input)) {
			String inputPostfix = postfixConvertor(input);
			System.out.println(inputPostfix);
			executeOperation(inputPostfix);
		}
		else {
			System.out.println("Enter Valid Expression");
		}
	}
	/**
	 * countletters method : countletters method is use  to find unique character set 
	 * @param: String : input string in postfix form
	 * @return: unique character set 
	 * */
	private Set<Character> countletters(String inputPostfix) {
		Set<Character> letterSet = new TreeSet<Character>();
		char[] chars = inputPostfix.toCharArray();
		for(char c : chars) {
			if(Character.isLetter(c))
				letterSet.add(c);
		}
		return letterSet;
	}
	/**
	 * executeOperation method : countletters method is use  to evulate truth table operation
	 * @param: String : input string in postfix form
	 * */
	private void executeOperation(String inputPostfix) {

		Set<Character> letterSet = countletters(inputPostfix);
		char res = ' ';
		char[][] chars = binaryCombinations(letterSet.size());
		Iterator<Character> letterSetIterator1 = letterSet.iterator();
		while (letterSetIterator1.hasNext()) {
			char c = letterSetIterator1.next();
			System.out.print(c + "\t");
		}
		System.out.print("Output");
		System.out.println();
		for (int i = 0; i < chars.length; i++) {
			String inputUpdate = inputPostfix;
			int j = 0;
			Iterator<Character> letterSetIterator = letterSet.iterator();
			while (letterSetIterator.hasNext()) {
				char c = letterSetIterator.next();
				inputUpdate = inputUpdate.replace(c, chars[i][j]);
				j++;
			}
			Stack<Character> list = new Stack<Character>();
			char c1; /* result of 1st popping */
			char c2; /* result of 2nd popping */
			for (j = 0; j < inputUpdate.length(); j++) {
				char ch = inputUpdate.charAt(j);
				if (ch == ' ') {
				} else {
					if (Character.isLetter(ch)) {
						list.push(ch);
					} else {
						if (ch == '~') {
							c1 = list.pop();
							list.push(operationPerform(c1, ch));
						} else {
							c1 = list.pop();
							c2 = list.pop();

							switch (ch) {
							case '&':
								list.push(operationPerform(c1, c2, '&'));
								break;
							case '|':
								list.push(operationPerform(c1, c2, '|'));
								break;
							default:
								System.out.println("Invalid operator order!");
							}
						}
					}
				}
			}
			res = list.pop();
			for (int count = 0; count < chars[0].length; count++) {
				System.out.print(chars[i][count] + "\t");
			}
			System.out.println(res);
		}
	}
	/**
	 * executeOperation method : OR ,And  operation evulate   
	 * @param: c1: first character of operation
	 * @param: c2: secound character of operation
	 * @param: op: operator of operation
	 * */
	private Character operationPerform(char c1, char c2, char op) {
		if(op == '&') {
			if(c1 == 'F' || c2 == 'F') {
				return 'F';
			}
			else
				return 'T';
		}
		
		else {
			if(c1 == 'T' || c2 == 'T') {
				return 'T';
			}
			else
				return 'F';
		}
	}
	/**
	 * executeOperation method : not operator  
	 * @param: c1: first character of operation
	 * @param: op: operator of operation
	 * */
	private Character operationPerform(char c1, char op) {
		if(c1 == 'F')
			return 'T';
		else
			return 'F';
	}

	/**
	 * postfixConvertor method : convert infix to post fix
	 * 
	 * @param: String: input string
	 * @return: postfix string
	 * */
	private String postfixConvertor(String input) {
		Stack<Character> stackObj = new Stack<Character>();

		int inputLength = input.length();
		String postfixExpression = "";
		Object poppedItem;
		int countBraces = 0;

		for (int i = 0; i < inputLength; i++) {
			Character temp = new Character(input.charAt(i));

			if (Character.isLetter(temp)) {
				postfixExpression = postfixExpression + temp;
			}

			else if (input.charAt(i) == '(') {
				stackObj.push(temp);
				countBraces++;
			}

			else if (temp == ')') {
				if (countBraces == 0) {
					System.out.println("Invalid Expression");
					return null;
				}

				while (!((char) stackObj.peek() == '(')) {
					poppedItem = stackObj.pop();
					postfixExpression = postfixExpression + poppedItem;
				}
				stackObj.pop();
				countBraces--;
			}

			else if (temp == '&' || temp == '|' || temp == '~') {
				if (stackObj.size() == 0) {
					stackObj.push(temp);
				} else {
					if (input.charAt(i) == '~') {
						if ((char) stackObj.peek() == '~') {
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
						}
					}

					else if (input.charAt(i) == '&') {
						while (stackObj.peek() != '|' && stackObj.peek() != '(') {
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
							if (stackObj.size() == 0)
								break;
						}
					} else if (input.charAt(i) == '|') {
						while (stackObj.size() != 0 && stackObj.peek() != '(') {
							poppedItem = stackObj.pop();
							postfixExpression = postfixExpression + poppedItem;
						}
					}

					stackObj.push(temp);
				}
			}
		}

		while (stackObj.size() != 0) {
			poppedItem = stackObj.pop();
			postfixExpression = postfixExpression + poppedItem;
		}
		return postfixExpression;
	}
	/**
	 * binaryCombinations method : generate the binary Combinations
	 * 
	 * @param:int : number of characters
	 * @return: 2d array of binary Combinations 
	 * */
	private char[][] binaryCombinations(int numberOfCharacters) {
	    int numberOfRows = (int)Math.pow(2, numberOfCharacters);
	    boolean[][] bools = new boolean[numberOfRows][numberOfCharacters];
	    char[][] chars = new char[numberOfRows][numberOfCharacters];
	    for(int i = 0;i<bools.length;i++)
	    {
	        for(int j = 0; j < bools[i].length; j++)
	        {
	            int val = bools.length * j + i;
	            int ret = (1 & (val >>> j));
	            bools[i][j] = ret != 0;
	            if(bools[i][j]) {
	            	chars[i][j] = 'T';
	            }
	            else {
	            	chars[i][j] = 'F';
	            }
	        }
	    }
	    return chars;
	}
}
