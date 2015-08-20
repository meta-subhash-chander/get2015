/****************************************************************************************
 * Name : Passenger Revision Log : 2015-08-20: Subhash Chander : created. : :
 * Use : This class have all detail of passenger. :
 ****************************************************************************************/

public class Passenger {
public Passenger()
{ 
	this.userName="";
	this.trainNumber = "";
	this.ticketId = "";
	this.paymentId = "";
	this.numberofseats = 0;
	this.totalAmount = 0;
 
}
	String userName;
	String trainNumber;
	String ticketId;
	String paymentId;
	int numberofseats;
	double totalAmount;

	public Passenger(String userName, String trainNumber, String ticketId,
			String paymentId, int nSeat, double totalAmount) {
		this.userName = userName;
		this.trainNumber = trainNumber;
		this.numberofseats = nSeat;
		this.totalAmount = totalAmount;
		this.ticketId = ticketId;
		this.paymentId = paymentId;
	}
}

class Goods {
	public Goods(){
		this.userName="";
		this.trainNumber="";
		this.ticketId="";
		this.paymentId="";
		this.totalWeight=0;
		this.totalAmount=0;
	}

	String userName;
	String trainNumber;
	String ticketId;
	String paymentId;
	int totalWeight;
	double totalAmount;

	public Goods(String userName, String trainNumber, String ticketId,
			String paymentId, int nWeight, double totalAmount) {
		this.userName = userName;
		this.trainNumber = trainNumber;
		this.totalWeight = nWeight;
		this.totalAmount = totalAmount;
		this.ticketId = ticketId;
		this.paymentId = paymentId;
	}
}
