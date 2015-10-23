/****************************************************************************************
Name            : T20
Revision Log    : 2015-10-22: Subhash Chander : created.
                : 
                : 
Use             : create the T20 cricket  
 ****************************************************************************************/
package Assignment3;

public class T20 extends Cricket {
	/**
	 * gameTime method : define method gameTime use : gamrtime of T20
	 */
	@Override
	void gameTime() {
		System.out.println("Game time for T20 is 3.5 hour");
	}

	/**
	 * numberOfOvers method : define method numberOfOvers use : number Of Overs
	 * in cricket T20
	 */
	@Override
	void numberOfOvers() {
		System.out.println("20 overs");
	}

	/**
	 * ticketRate method : define method ticketRate use : ticket Rate of cricket
	 * T20
	 */
	@Override
	void ticketRate() {
		System.out.println("300 rs");
	}
}
