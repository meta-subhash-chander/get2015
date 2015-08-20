/****************************************************************************************
Name            : ActionableMenuItem
Revision Log    : 2015-08-20: Subhash Chander : created.
                : 
                : 
Use             : In this class we perform the menu action.
                :
 ****************************************************************************************/
import java.io.IOException;
import java.util.Scanner;

public class ActionableMenuItem implements MenuItem {
 
	String displayText;

	String userName = "";
	String trainType = "";

	ActionableMenuItem(String displayText) {
		this.displayText = displayText;
	}

	@Override
	/*
	 *display Function use to display string
	 *  
	 */
	public void display() {
		System.out.println(displayText);

	}

	@Override
	/* takeAction function is use to perform action according to user input
	 * @param choice:user choice from menu
	 *  
	 */
	public void takeAction(int choice) {
		 
		TrainResevatationSystem trs = new TrainResevatationSystem();
		try {
			trs.getTrainChart();
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
		 
			switch (choice) {
			case 1:
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter User name");
				sc = new Scanner(System.in);
				userName = sc.nextLine();
				trainType = "P";
				trs.allocateTicket(userName, trainType);
				break;
			case 2:
				System.out.println("Enter User name");
				sc = new Scanner(System.in);
				userName = sc.nextLine();
				trainType = "G";
				trs.allocateTicket(userName, trainType);
				break;
			case 3:
				System.out.println("				Passenger train chart");
				trainType = "P";
				trs.showTrainChart(trainType);
				break;
			case 4:
				System.out.println("				Goods train chart");
				trainType = "G";
				trs.showTrainChart(trainType);
				break;
			case 5:
				System.out.println("						passenger chart");
				trainType = "P";
				trs.showTicketDetail(trainType);
				break;
			case 6:
				System.out.println("							Goods chart");
				trainType = "G";
				trs.showTicketDetail(trainType);
				break;
			}
		 

	}
}
