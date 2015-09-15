/****************************************************************************************
Name            : Bike
Revision Log    : 2015-09-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used store description of Bike
                :
****************************************************************************************/
package model;

public class Bike extends Vehicle {

	private boolean selfStart;

	private double helmetPrize;

	public boolean isSelfStart() {
		return selfStart;
	}

	public void setSelfStart(boolean selfStart) {
		this.selfStart = selfStart;
	}

	public double getHelmetPrize() {
		return helmetPrize;
	}

	public void setHelmetPrize(double helmetPrize) {
		this.helmetPrize = helmetPrize;
	}
	/**
	 * This method calculateOnRoadPrice is used to calculate on road price of bike
	 * @return : total price of bike include all acclessory.
	 */
	@Override
	public double calculateOnRoadPrice() {
		double onRoadPrice = 0;
		if (isSelfStart()) {
			onRoadPrice = onRoadPrice + 1000;

		}

		onRoadPrice = onRoadPrice + getHelmetPrize();
		return super.calculateOnRoadPrice() + onRoadPrice;
	}

	@Override
	public String toString() {
		return super.toString() + " selfStart=" + selfStart + ", helmetPrize="
				+ helmetPrize;
	}

}
