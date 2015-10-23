/****************************************************************************************
Name            : Cricket
Revision Log    : 2015-10-22: Subhash Chander : created.
                : 
                : 
Use             : abstract class having abstract method gameTime,numberOfOvers ,tickrtRate
 ****************************************************************************************/
package Assignment3;

public abstract class Cricket {
	/**
	 * gameTime method : declere method use : gamrtime of cricket
	 */
	abstract void gameTime();

	/**
	 * numberOfOvers method : declere method use : number Of Overs in cricket
	 * game
	 */
	abstract void numberOfOvers();

	/**
	 * ticketRate method : declere method use : ticket Rate of cricket game
	 */
	abstract void ticketRate();

	/**
	 * play method : declere method use : define game detail
	 */

	public final void play() {

		gameTime();

		numberOfOvers();

		ticketRate();
	}
}