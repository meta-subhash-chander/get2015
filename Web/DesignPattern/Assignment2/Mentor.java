/****************************************************************************************
Name            : Mentor
Revision Log    : 2015-10-22: Subhash Chander : created.
                : 
                : 
Use             : create the instance of class 
 ****************************************************************************************/
package Assignment2;

public class Mentor extends LeaveHandler {
	/**
	 * Mentor constructor :use to set day of leave
	 */
	public Mentor(int day) {
		this.day = day;
	}

	/**
	 * leaveApprovalMessage method :use to show leave Approval Message
	 */
	@Override
	protected void leaveApprovalMessage() {
		System.out.println("Leave approved by mentor");
	}
}
