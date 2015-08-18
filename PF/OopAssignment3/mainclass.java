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
		Scanner sc = new Scanner(System.in);
		TrainResevatationSystem trs = new TrainResevatationSystem();

		String userName = "";
		String trainType = "";

		int choice = 0;
		trs.getTrainChart();
		do {

			System.out.println("Enter 1 to book ticket");
			System.out.println("Enter 2 to send goods");
			System.out.println("Enter 3 to show passenger train chart");
			System.out.println("Enter 4 to show goods train chart");
			System.out.println("Enter 5 to show passenger chart");
			System.out.println("Enter 6 to show Goods chart");
			System.out.println("Enter 7 to exit");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
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

			case 7:
				return;

			default:
				System.out.println("Please enter right input");
			}

		} while (choice != 9);

		sc.close();
	}

}
