/****************************************************************************************
 Name            : Test
 Revision Log    : 2015-10-22: Subhash Chander : created.
 Use             : create the Test cricket  
 ****************************************************************************************/
package Assignment3;

public class Test extends Cricket {
	/**
	 * gameTime method : define method gameTime use : gamrtime of Test
	 */
	@Override
	void gameTime() {
		System.out.println("Game time for Test is 5 days");
	}

	/**
	 * numberOfOvers method : define method numberOfOvers use : number Of Overs
	 * in cricket Test
	 */
	@Override
	void numberOfOvers() {
		System.out.println("90 overs/day");
	}

	/**
	 * ticketRate method : define method ticketRate use : ticket Rate of cricket
	 * Test
	 */
	@Override
	void ticketRate() {
		System.out.println("3000 rs");
	}
}
