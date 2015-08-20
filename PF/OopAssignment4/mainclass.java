/****************************************************************************************
Name            : main class
Revision Log    : 2015-08-17: Subhash Chander : created.
                : 
                : 
Use             : This class is use to all train reservation system classes. 
                :
 ****************************************************************************************/
import java.io.IOException;
import java.util.Scanner;

public class mainclass {

	public static void main(String args[]) throws IOException {

		try{
		new MenuMain();
		}
		catch (Exception e){
			System.out.println("enter valid input");
			new MenuMain();
			
		}
	}

}
