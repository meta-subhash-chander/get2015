/****************************************************************************************
Name            : Bike
Revision Log    : 2015-09-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used store description of Bike
                :
****************************************************************************************/
package com.model;


public class Bike extends Vehicle {

	private boolean selfStart;

	private double helmetPrize;
	/**
	 * isSelfStart method :This method is get detail that bike is self start or not
	 * 
	 * @return : return boolean value
	 */
	public boolean isSelfStart() {
		return selfStart;
	}
	/**
	 * setSelfStart method :This method is set detail that bike is self start or not
	 * 
	 * @param :   boolean value
	 */
	public void setSelfStart(boolean selfStart) {
		this.selfStart = selfStart;
	}
	/**
	 * getHelmetPrize method :This method is get helmet price
	 * 
	 * @return : return helmet price
	 */
	public double getHelmetPrize() {
		return helmetPrize;
	}
	/**
	 * setHelmetPrize method :This method is set helmet price
	 * 
	 * @param: set helmet price
	 */
	public void setHelmetPrize(double helmetPrize) {
		this.helmetPrize = helmetPrize;
	}
	/**
	 * This method calculateOnRoadPrice is used to calculate on road price of car 
	 * @return : total price of car include all acclessory.
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
	/**
	 * toString method :is used to return detail of vehicle
	 * @return : attribute string of vehicle 
	 */
	@Override
	public String toString() {
		return super.toString() + " selfStart=" + selfStart + ", helmetPrize="
				+ helmetPrize;
	}

}
