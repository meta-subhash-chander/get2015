/****************************************************************************************
Name            : Car
Revision Log    : 2015-09-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used store description of car
                :
****************************************************************************************/
package com.model;

public class Car extends Vehicle {

	private boolean AC;
	private boolean powerSteering;
	private boolean accessoryKit;
	/**
	 * isAC method :This method is get detail that car have isAC or not
	 * 
	 * @return : return boolean value
	 */
	public boolean isAC() {
		return AC;
	}
	/**
	 * setAC method :This method is set detail that  have isAC or not
	 * @param : take boolean parameter
	 */
	public void setAC(boolean aC) {
		AC = aC;
	}
	/**
	 * isPowerSteering method :This method is get detail that car have PowerSteering or not
	 * 
	 * @return : return boolean value
	 */
	public boolean isPowerSteering() {
		return powerSteering;
	}
	/**
	 * setPowerSteering method :This method is set detail that  have PowerSteering or not
	 * @param : take boolean parameter
	 */
	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}
	/**
	 * isAccessoryKit method :This method is get detail that car have AccessoryKit or not
	 * 
	 * @return : return boolean value
	 */
	public boolean isAccessoryKit() {
		return accessoryKit;
	}
	/**
	 * setAccessoryKit method :This method is set detail that  have AccessoryKit or not
	 * @param : take boolean parameter
	 */
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
	/**
	 * toString method :is used to return detail of vehicle
	 * @return : attribute string of vehicle 
	 */
	@Override
	public String toString() {
		return super.toString() + " AC=" + AC + ", powerSteering="
				+ powerSteering + ", accessoryKit=" + accessoryKit;
	}

}
