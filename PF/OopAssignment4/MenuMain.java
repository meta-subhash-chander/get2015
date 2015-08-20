/****************************************************************************************
Name            : MenuMain
Revision Log    : 2015-08-20: Subhash Chander : created.
                : 
                : 
Use             : This class is use to display the menu 
                :
 ****************************************************************************************/
public class MenuMain  {
	 {
		Menu menu = new Menu();
		ActionableMenuItem item1 = new ActionableMenuItem("Enter 1 to book ticket");
		ActionableMenuItem item2 = new ActionableMenuItem("Enter 2 to send goods");
		ActionableMenuItem item3 = new ActionableMenuItem("Enter 3 to show passenger train chart");
		ActionableMenuItem item4 = new ActionableMenuItem("Enter 4 to show goods train chart");
		ActionableMenuItem item5 = new ActionableMenuItem("Enter 5 to show passenger chart");
		ActionableMenuItem item6 = new ActionableMenuItem("Enter 6 to show Goods chart");
		 
		menu.addMenuItem(item1);
		menu.addMenuItem(item2);
		menu.addMenuItem(item3);
		menu.addMenuItem(item4);
		menu.addMenuItem(item5);
		menu.addMenuItem(item6);
	    menu.display();
	}

}
