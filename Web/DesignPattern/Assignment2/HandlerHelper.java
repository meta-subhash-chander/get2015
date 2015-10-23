/****************************************************************************************
Name            : HandlerHelper
Revision Log    : 2015-10-22: Subhash Chander : created.
                : 
                : 
Use             : create the instance of class 
 ****************************************************************************************/
package Assignment2;

public class HandlerHelper {
	/**
	 * initializer method : create the instance of class 
	 * use : Create the instance of fileHandler and consoleHandler
	 */
	public static LeaveHandler initializer() {
		LeaveHandler mentor = new Mentor(LeaveHandler.MENTOR);
		LeaveHandler seniorMentor = new SeniorMentor(LeaveHandler.SENIOR_MENTOR);
		LeaveHandler hrManager = new HRManager(LeaveHandler.HR_MANAGER);

		mentor.setSucessor(seniorMentor);
		seniorMentor.setSucessor(hrManager);

		return mentor;
	}

}
