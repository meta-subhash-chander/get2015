/****************************************************************************************
Name            :  InputValidate 
Revision Log    :  2015-10-05: Subhash Chander : created.
                : 
                : 
Use             : method is use to check that input is valid or not
                :
 ****************************************************************************************/
public class InputValidate {
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

}
