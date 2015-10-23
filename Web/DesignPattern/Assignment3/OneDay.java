/****************************************************************************************
Name            : OneDay
Revision Log    : 2015-10-22: Subhash Chander : created.
                : 
                : 
Use             : create the oneDay cricket  
 ****************************************************************************************/
package Assignment3;

public class OneDay extends Cricket {
	/**
	 * gameTime method : define method gameTime use : gamrtime of OneDay
	 */
	@Override
	void gameTime() {
		System.out.println("Game time for oneday is 1 day");
	}

	/**
	 * numberOfOvers method : define method numberOfOvers use : number Of Overs
	 * in cricket OneDay
	 */
	@Override
	void numberOfOvers() {
		System.out.println("50 overs");
	}

	/**
	 * ticketRate method : define method ticketRate use : ticket Rate of cricket
	 * OneDay
	 */
	@Override
	void ticketRate() {
		System.out.println("600 rs");
	}
}
