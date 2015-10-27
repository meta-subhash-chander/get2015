/****************************************************************************************
Name            : Vehicle
Revision Log    : 2015-09-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used store description of vehicle
                :
 ****************************************************************************************/
package com.model;

import java.util.Date;

public class Vehicle {

	private String make;
	private String created_By;
	private Date created_Time;
	private String model;
	private int enginInCC;
	private int fuelCapacity;
	private int milage;
	private double price;
	private double roadTax;

	/**
	 * getCreated_By method :This method is get Created_By vehicle
	 * 
	 * @return: string of Created_By vehicle
	 */
	public String getCreated_By() {
		return created_By;
	}

	/**
	 * setCreated_By method :This method is set Created_By of vehicle
	 * 
	 * @param: string of Created_By of vehicle
	 */
	public void setCreated_By(String created_By) {
		this.created_By = created_By;
	}

	/**
	 * getCreated_Time method :This method is get Created_Time of vehicle
	 * 
	 * @return: Created_Time of vehicle
	 */
	public Date getCreated_Time() {
		return created_Time;
	}

	/**
	 * setCreated_Time method :This method is set Created_Time of vehicle
	 * 
	 * @param:Created_Time of vehicle
	 */
	public void setCreated_Time(Date date) {
		this.created_Time = date;
	}

	/**
	 * getMake method :This method is get detail of vehicle
	 * 
	 * @return: string of company name
	 */
	public String getMake() {
		return make;
	}

	/**
	 * setMake method :This method is set Make of vehicle
	 * 
	 * @param: string of company name
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * getModel method :This method is get Model of vehicle
	 * 
	 * @return: Model of vehicle
	 */
	public String getModel() {
		return model;
	}

	/**
	 * setModel method :This method is set Model of vehicle
	 * 
	 * @param: Model of vehicle
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * getEnginInCC method :This method is get EnginInCC of vehicle
	 * 
	 * @return: EnginInCC of vehicle
	 */
	public int getEnginInCC() {
		return enginInCC;
	}

	/**
	 * setEnginInCC method :This method is set EnginInCC of vehicle
	 * 
	 * @param: EnginInCC of vehicle
	 */
	public void setEnginInCC(int enginInCC) {
		this.enginInCC = enginInCC;
	}

	/**
	 * getFuelCapacity method :This method is get FuelCapacity of vehicle
	 * 
	 * @return: FuelCapacity of vehicle
	 */
	public int getFuelCapacity() {
		return fuelCapacity;
	}

	/**
	 * setFuelCapacity method :This method is set FuelCapacity of vehicle
	 * 
	 * @param: FuelCapacity of vehicle
	 */
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	/**
	 * getMilage method :This method is get Milage of vehicle
	 * 
	 * @return: Milage of vehicle
	 */
	public int getMilage() {
		return milage;
	}

	/**
	 * setMilage method :This method is set Milage of vehicle
	 * 
	 * @param : Milage of vehicle
	 */
	public void setMilage(int milage) {
		this.milage = milage;
	}

	/**
	 * getPrice method :This method is get Price of vehicle
	 * 
	 * @return: Price of vehicle
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * setPrice method :This method is set Price of vehicle
	 * 
	 * @param: Price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * getRoadTax method :This method is get Road Tax
	 * 
	 * @return: Road Tax
	 */
	public double getRoadTax() {
		return roadTax;
	}

	/**
	 * setRoadTax method :This method is set road tax on car
	 * 
	 * @param: roadTax
	 */
	public void setRoadTax(double roadTax) {
		this.roadTax = roadTax;
	}

	/**
	 * calculateOnRoadPrice method :This method use to find on road price of car
	 * 
	 * @return: road price of car
	 */
	public double calculateOnRoadPrice() {
		return price + roadTax;
	}

	/**
	 * toString method :This method is get detail of vehicle
	 * 
	 * @return: string OF all detail of car
	 */

	@Override
	public String toString() {
		return "Created_By=" + created_By + ", Created_Time=" + created_Time
				+ ", make=" + make + ", model=" + model + ", enginInCC="
				+ enginInCC + ", fuelCapacity=" + fuelCapacity + ", milage="
				+ milage + ", price=" + price + ", roadTax=" + roadTax;
	}
}
