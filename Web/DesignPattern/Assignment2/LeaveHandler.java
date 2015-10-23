/****************************************************************************************
Name            : LeaveHandler
Revision Log    : 2015-10-22: Subhash Chander : created.
                : 
                : 
Use             : This class manage the request of employee according to day of leava
 ****************************************************************************************/
package Assignment2;

public abstract class LeaveHandler {

	public final static int MENTOR = 1;
	public final static int SENIOR_MENTOR = 2;
	public final static int HR_MANAGER = 5;

	protected int day;

	protected LeaveHandler successor;

	/**
	 * setSucessor method :use to set the sucessor of current object
	 */
	public void setSucessor(LeaveHandler successor) {
		this.successor = successor;
	}

	/**
	 * handleRequest method : hendle user request use : manage the request of
	 * employee according to day of leava
	 */
	public void handleRequest(int day) {

		if (this.day >= day) {
			leaveApprovalMessage();
		} else if (this.successor != null) {
			this.successor.handleRequest(day);
		} else {
			System.out.println("Leave can't be approved");
		}

	}

	/**
	 * leaveApprovalMessage method :use to show leave Approval Message
	 */
	abstract protected void leaveApprovalMessage();

}
