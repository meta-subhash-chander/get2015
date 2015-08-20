/****************************************************************************************
Name            : Menu
Revision Log    : 2015-08-20: Subhash Chander : created.
                : 
                : 
Use             : In this class we arrange the menu through list. 
                :
 ****************************************************************************************/
import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;


public class Menu {
	// Create a list 
List<MenuItem> items = new ArrayList<>();
	
private Scanner scan  = new Scanner(System.in);
	
	/*
	 * Function addMenuItem use to stotr data into list
	 * 
	 */
public void addMenuItem(MenuItem item){
		
items.add(item);
	
}
	/*display function use to display data from from list
	 * 
	 */
public void display() {
		
while (true) {
			
for (MenuItem i : items) {
			
	i.display();
		
	}
			
int choice = scan.nextInt();
			
MenuItem i = items.get(choice - 1) ;
		
	i.takeAction(choice);
		
}
		

	}

}

