/****************************************************************************************
 * Name : Payment Revision Log : 2015-08-17: Subhash Chander : created. : : Use
 * : This class use to store payment information of user for booking ticket. :
 ****************************************************************************************/

public abstract class Payment {
	String paymentId = "";
	String paymentType = "";

}

class CreditCard extends Payment {
	String cardNumber;
	String cvvNumber;

	public CreditCard(String pId, String pt, String ccNumber, String cvv) {
		this.paymentId = pId;
		this.paymentType = pt;
		this.cardNumber = ccNumber;
		this.cvvNumber = cvv;
	}
}

class Wallet extends Payment {

	public Wallet(String pId, String pt) {
		this.paymentId = pId;
		this.paymentType = pt;

	}
}

class NetBanking extends Payment {
	String userName;
	String bank;
	String password;

	public NetBanking(String pId, String pt, String bank, String uName,
			String pwd) {
		this.paymentId = pId;
		this.paymentType = pt;
		this.bank = bank;
		this.userName = uName;
		this.password = pwd;
	}
}