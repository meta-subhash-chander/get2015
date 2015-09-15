/****************************************************************************************
Name            : Car
Revision Log    : 2015-09-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used store description of car
                :
****************************************************************************************/
package model;

public class Car extends Vehicle {

	private boolean AC;
	private boolean powerSteering;
	private boolean accessoryKit;

	public boolean isAC() {
		return AC;
	}

	public void setAC(boolean aC) {
		AC = aC;
	}

	public boolean isPowerSteering() {
		return powerSteering;
	}

	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	public boolean isAccessoryKit() {
		return accessoryKit;
	}

	public void setAccessoryKit(boolean accessoryKit) {
		this.accessoryKit = accessoryKit;
	}
	/**
	 * This method calculateOnRoadPrice is used to calculate on road price of car 
	 * @return : total price of car include all acclessory.
	 */
	@Override
	public double calculateOnRoadPrice() {
		double onRoadPrice = 0.0;
		if (this.isAC()) {
			onRoadPrice = onRoadPrice + 5000;

		}

		if (isAccessoryKit()) {
			onRoadPrice = onRoadPrice + 10000;

		}

		if (isPowerSteering()) {
			onRoadPrice = onRoadPrice + 3000;

		}

		return super.calculateOnRoadPrice() + onRoadPrice;
	}

	@Override
	public String toString() {
		return super.toString() + " AC=" + AC + ", powerSteering="
				+ powerSteering + ", accessoryKit=" + accessoryKit;
	}

}
