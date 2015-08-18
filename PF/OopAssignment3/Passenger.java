/****************************************************************************************
 * Name : Passenger Revision Log : 2015-08-17: Subhash Chander : created. : :
 * Use : This class have all detail of passenger. :
 ****************************************************************************************/

public class Passenger {

	String userName = "";
	String trainNumber = "";
	String ticketId = "";
	String paymentId = "";
	int nSeat = 0;
	int totalAmount = 0;

	public Passenger(String userName, String trainNumber, String ticketId,
			String paymentId, int nSeat, int totalAmount) {
		this.userName = userName;
		this.trainNumber = trainNumber;
		this.nSeat = nSeat;
		this.totalAmount = totalAmount;
		this.ticketId = ticketId;
		this.paymentId = paymentId;
	}
}

class Goods {

	String userName = "";
	String trainNumber = "";
	String ticketId = "";
	String paymentId = "";
	int nWeight = 0;
	int totalAmount = 0;

	public Goods(String userName, String trainNumber, String ticketId,
			String paymentId, int nWeight, int totalAmount) {
		this.userName = userName;
		this.trainNumber = trainNumber;
		this.nWeight = nWeight;
		this.totalAmount = totalAmount;
		this.ticketId = ticketId;
		this.paymentId = paymentId;
	}
}
