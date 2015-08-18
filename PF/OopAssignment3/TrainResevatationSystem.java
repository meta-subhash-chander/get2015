/****************************************************************************************
Name            : TrainResevatationSystem
Revision Log    : 2015-08-17: Subhash Chander : created.
               : 
               : 
Use             : This class is book ticket by the passenger. 
               :
 ****************************************************************************************/
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TrainResevatationSystem {

	ArrayList<Train> ptrain = new ArrayList<Train>();
	ArrayList<Train> gtrain = new ArrayList<Train>();
	ArrayList<Passenger> passenger = new ArrayList<Passenger>();
	ArrayList<Goods> goods = new ArrayList<Goods>();
	ArrayList<Payment> payment = new ArrayList<Payment>();
	Iterator<Train> iteratorPtrain;
	Iterator<Train> iteratorGtrain;
	Iterator<Passenger> iteratorPassenger;
	Iterator<Goods> iteratorGoods;
	Train tPassenger;
	Train tGoods;
	Passenger passe;
	Goods good;
	Payment pay;
	int count = 0;
	Scanner scanner;

	/**
	 * This method showTrainChart is used to show train chart
	 * 
	 * @param type
	 *            this parameter use to show that train in passenger type or
	 *            goods type.
	 */
	void showTrainChart(String type) {

		if (type.equalsIgnoreCase("p")) {
			iteratorPtrain = ptrain.iterator();
			System.out
					.println("Train Number   Travel-Time		Fare		From to Station		Available Seats");
			while (iteratorPtrain.hasNext()) {
				Train tobject = iteratorPtrain.next();
				System.out.println(tobject.trainNumber + "		"
						+ tobject.timeDuration + "			" + tobject.fare + "			"
						+ tobject.fromToStation + "			" + tobject.seats_weight);
			}
		} else {
			iteratorGtrain = gtrain.iterator();
			System.out
					.println("Train Number   Travel-Time		Fare		From to Station		Available Weight");
			while (iteratorGtrain.hasNext()) {
				Train tobject = iteratorGtrain.next();
				System.out.println(tobject.trainNumber + "		"
						+ tobject.timeDuration + "			" + tobject.fare + "			"
						+ tobject.fromToStation + "			" + tobject.seats_weight);
			}
		}
	}

	/**
	 * This method getTrainChart is used to put value from file to array list
	 * 
	 *
	 */
	void getTrainChart() throws IOException {

		try {
			StringTokenizer stringTokenizer;
			FileInputStream fin = new FileInputStream(
					new File(
							"C:\\Users\\Subhash\\workspace\\OopAssignment3\\src\\train.txt"));
			DataInputStream in = new DataInputStream(fin);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String trainData = "";
			int i = 1;
			String trainType = "", trainId = "", time = "", fare = "", route = "", capacity = "";
			while ((trainData = br.readLine()) != null) {
				stringTokenizer = new StringTokenizer(trainData, ",");
				i = 1;
				while (stringTokenizer.hasMoreTokens()) {
					if (i == 1) {
						trainType = stringTokenizer.nextToken();
					} else if (i == 2) {
						trainId = stringTokenizer.nextToken();
					} else if (i == 3) {
						time = stringTokenizer.nextToken();
					} else if (i == 4) {
						fare = stringTokenizer.nextToken();
					} else if (i == 5) {
						route = stringTokenizer.nextToken();
					} else {
						capacity = stringTokenizer.nextToken();
					}
					i++;
				}
				int f = Integer.parseInt(fare);
				int c = Integer.parseInt(capacity);
				if (trainType.equalsIgnoreCase("P")) {
					tPassenger = new Ptrain(trainType, trainId, time, f, route,
							c);
					ptrain.add(tPassenger);
				} else {
					tGoods = new Gtrain(trainType, trainId, time, f, route, c);
					gtrain.add(tGoods);
				}

			}

			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method allocateTicket is used to book the ticket
	 * 
	 * @param name
	 *            The name of passenger
	 * @param type
	 *            this parameter use to show that train in passenger type or
	 *            goods type.
	 */
	void allocateTicket(String name, String type) {
		String train_Number = "";
		int n_Ticket = 0;
		int n_Weight = 0;
		if (type.equalsIgnoreCase("p")) {

			iteratorPtrain = ptrain.iterator();
			System.out
					.println("Train Number   Travel-Time		Fare		From to Station		Available Seats");
			while (iteratorPtrain.hasNext()) {
				Train tobject = iteratorPtrain.next();
				System.out.println(tobject.trainNumber + "		"
						+ tobject.timeDuration + "			" + tobject.fare + "			"
						+ tobject.fromToStation + "			" + tobject.seats_weight);
			}
		} else {
			iteratorGtrain = gtrain.iterator();
			System.out
					.println("Train Number   Travel-Time		Fare		From to Station		Available Weight");
			while (iteratorGtrain.hasNext()) {
				Train tobject = iteratorGtrain.next();
				System.out.println(tobject.trainNumber + "		"
						+ tobject.timeDuration + "			" + tobject.fare + "			"
						+ tobject.fromToStation + "			" + tobject.seats_weight);
			}
		} scanner = new Scanner(System.in);
		System.out.println("Please Enter From to station as given in list ");
		String station = scanner.nextLine();
		System.out.println("				Train between station");

		if (type.equalsIgnoreCase("p")) {
			iteratorPtrain = ptrain.iterator();
			System.out
					.println("Train Number   Travel-Time		Fare		From to Station		Available Seats");
			while (iteratorPtrain.hasNext()) {
				Train tobject = iteratorPtrain.next();

				if (tobject.fromToStation.equalsIgnoreCase(station)) {
					System.out.println(tobject.trainNumber + "		"
							+ tobject.timeDuration + "			" + tobject.fare
							+ "			" + tobject.fromToStation + "			"
							+ tobject.seats_weight);
				}

			}
			try {
				System.out
						.println("Please Enter the train number to book ticket");
				train_Number = scanner.nextLine();
				System.out.println("Please Enter the number of tickets");
				n_Ticket = scanner.nextInt();
			} catch (Exception e) {
				System.out.print("invalid input");

			}
		} else {
			iteratorGtrain = gtrain.iterator();
			System.out
					.println("Train Number   Travel-Time		Fare		From to Station		Available Weight");
			while (iteratorGtrain.hasNext()) {
				Train tobject = iteratorGtrain.next();
				if (tobject.fromToStation.equalsIgnoreCase(station)) {
					System.out.println(tobject.trainNumber + "		"
							+ tobject.timeDuration + "			" + tobject.fare
							+ "			" + tobject.fromToStation + "			"
							+ tobject.seats_weight);
				}
			}
			try {
				System.out
						.println("Please Enter the train number to send goods");
				train_Number = scanner.nextLine();
				System.out.println("Please Enter the number tonnes weight");
				n_Weight = scanner.nextInt();
			} catch (Exception e) {
				System.out.print("invalid input");

			}
		}

		int totalAmount = this.checkTicket(type, station, train_Number,
				n_Ticket, n_Weight);

		if (!(totalAmount == 0)) {

			// For passenger train
			if (type.equalsIgnoreCase("p")) {
				scanner = new Scanner(System.in);
				String ticketId = train_Number + "_" + (++count);
				System.out
						.println("Enter the mode of payment(Credit card or wallet or e-banking)");
				String pmode = scanner.nextLine();
				String paymentId = "";
				if (pmode.equalsIgnoreCase("credit card")) {
					paymentId = ticketId + "_" + "CC" + count;
					System.out.println("Enter the card number");
					String cNumber = scanner.nextLine();
					System.out.println("Enter the cvv number");
					String cvvNumber = scanner.nextLine();
					pay = new CreditCard(paymentId, pmode, cNumber, cvvNumber);
					payment.add(pay);
				} else if (pmode.equalsIgnoreCase("wallet")) {
					paymentId = ticketId + "_" + "W" + count;
					pay = new Wallet(paymentId, pmode);
					payment.add(pay);
				} else if (pmode.equalsIgnoreCase("wallet")) {
					paymentId = ticketId + "_" + "NB" + count;
					System.out.println("Enter the bank name");
					String bank = scanner.nextLine();
					System.out.println("Enter the user name");
					String uname = scanner.nextLine();
					System.out.println("Enter the password");
					String pwd = scanner.nextLine();
					pay = new NetBanking(paymentId, pmode, bank, uname, pwd);
					payment.add(pay);
				} else {
					System.out
							.println("please select Credit card or wallet or e-banking");
					return;
				}
				System.out
						.println("Your ticket booked succesfully and your ticket id = "
								+ ticketId);
				System.out.println();
				passe = new Passenger(name, train_Number, ticketId, paymentId,
						n_Ticket, totalAmount);
				passenger.add(passe);
			} else { // for goods train
				scanner = new Scanner(System.in);
				String ticketId = train_Number + "_" + (++count);
				System.out
						.println("Enter the mode of payment(Credit card or wallet or e-banking)");
				String pmode = scanner.nextLine();
				String paymentId = "";
				if (pmode.equalsIgnoreCase("credit card")) {
					paymentId = ticketId + "_" + "CC" + count;
					System.out.println("Enter the card number");
					String cNumber = scanner.nextLine();
					System.out.println("Enter the cvv number");
					String cvvNumber = scanner.nextLine();
					pay = new CreditCard(paymentId, pmode, cNumber, cvvNumber);
					payment.add(pay);
				} else if (pmode.equalsIgnoreCase("wallet")) {
					paymentId = ticketId + "_" + "W" + count;
					pay = new Wallet(paymentId, pmode);
					payment.add(pay);
				} else {
					paymentId = ticketId + "_" + "NB" + count;
					System.out.println("Enter the bank name");
					String bank = scanner.nextLine();
					System.out.println("Enter the user name");
					String uname = scanner.nextLine();
					System.out.println("Enter the password");
					String pwd = scanner.nextLine();
					pay = new NetBanking(paymentId, pmode, bank, uname, pwd);
					payment.add(pay);
				}
				System.out
						.println("Your ticket booked succesfully and your ticket id = "
								+ ticketId);
				System.out.println();
				good = new Goods(name, train_Number, ticketId, paymentId,
						n_Weight, totalAmount);
				goods.add(good);
			}
		} else {
			System.out.println("Train booking is not possible");
		}

	}

	/**
	 * This method checkTicket is used to check the availablity of ticket
	 *
	 * @param type
	 *            this parameter use to show that train in passenger type or
	 *            goods type.
	 * @param station
	 *            detail of from to To station .
	 * @param train_number
	 *            The no. of train which passenger want for booking.
	 * @return totalAmount the amount of booking.
	 */
	int checkTicket(String type, String station, String train_Number,
			int n_Ticket, int n_Weight) {
		int totalAmount = 0;
		try {
			if (type.equalsIgnoreCase("p")) {
				iteratorPtrain = ptrain.iterator();
				while (iteratorPtrain.hasNext()) {
					Train tobject = iteratorPtrain.next();
					if (tobject.fromToStation.equalsIgnoreCase(station)
							&& tobject.trainNumber
									.equalsIgnoreCase(train_Number)
							&& tobject.seats_weight >= n_Ticket) {
						tobject.seats_weight -= n_Ticket;
						totalAmount = tobject.fare * n_Ticket;
						return totalAmount;
					}
				}
			} else {
				iteratorGtrain = ((ArrayList<Train>) gtrain).iterator();
				while (iteratorGtrain.hasNext()) {
					Train tobject = iteratorGtrain.next();
					if (tobject.fromToStation.equalsIgnoreCase(station)
							&& tobject.trainNumber
									.equalsIgnoreCase(train_Number)
							&& tobject.seats_weight >= n_Weight) {
						tobject.seats_weight -= n_Weight;
						totalAmount = tobject.fare * n_Weight;

						return totalAmount;
					}
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return totalAmount;
	}

	/**
	 * This method showTicketDetail is used to show the detail of pessanger.
	 *
	 * @param type
	 *            this parameter use to show that train in passenger type or
	 *            goods type.
	 */
	void showTicketDetail(String type) {
		if (type.equalsIgnoreCase("p")) {
			iteratorPassenger = passenger.iterator();
			System.out
					.println("Passenger Name   Ticket ID		Payment ID		Train Id		Booked Seats		Paid Amount");
			while (iteratorPassenger.hasNext()) {
				Passenger tobject = iteratorPassenger.next();
				System.out.println(tobject.userName + "		  " + tobject.ticketId
						+ " 		  " + tobject.paymentId + "  		"
						+ tobject.trainNumber + "  		        " + tobject.nSeat
						+ "		           " + tobject.totalAmount);
			}
		} else {
			iteratorGoods = goods.iterator();
			System.out
					.println("Name	   Ticket ID		Payment ID		Train Id		Booked Weight		Paid Amount");
			while (iteratorGoods.hasNext()) {
				Goods tobject = iteratorGoods.next();
				System.out.println(tobject.userName + "	   " + tobject.ticketId
						+ "		  " + tobject.paymentId + "		    "
						+ tobject.trainNumber + "		 	   " + tobject.nWeight
						+ "	 	 	" + tobject.totalAmount);
			}

		}
	}

}
