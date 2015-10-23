/****************************************************************************************
Name            : HRManager
Revision Log    : 2015-10-22: Subhash Chander : created.
                : 
                : 
Use             : extends the class leavehandler and define the method leaveApprovalMessage
 ****************************************************************************************/
package Assignment2;

public class HRManager extends LeaveHandler {
	/**
	 * HRManager constructor :use to set day of leave
	 */
	public HRManager(int day) {
		this.day = day;
	}

	/**
	 * leaveApprovalMessage method :use to show leave Approval Message
	 */
	@Override
	protected void leaveApprovalMessage() {
		System.out.println("Leave approved by HR manager");
	}

}
