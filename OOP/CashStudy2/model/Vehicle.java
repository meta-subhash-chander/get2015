/****************************************************************************************
Name            : Vehicle
Revision Log    : 2015-09-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used store description of vehicle
                :
****************************************************************************************/
package vehiclemanagement.model;

public abstract class Vehicle {

	private String make;
	private String model;
	private int enginInCC;
	private int fuelCapacity;
	private int milage;
	private double price;
	private double roadTax;
    private double Vehicalid  ;
    /**
	 * getMake method :This method is get detail of vehicle
	 * @return: string of company name
	 */
	public String getMake() {
		return make;
	}
	/**
	 * setMake method :This method is make detail of vehicle
	 * @param : take string of company name
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * getModel method :This method is get model detail of vehicle
	 * @return: string of model detail of vehicle
	 */
	public String getModel() {
		return model;
	}
	/**
	 * setModel method :This method is set model detail of vehicle 
	 * @param : take string of model name of vehicle
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * getEnginInCC method :This method is get Engin detail In CC of vehicle
	 * @return:Engin detail In CC of vehicle
	 */
	public int getEnginInCC() {
		return enginInCC;
	}
	/**
	 * setEnginInCC method :This method is set Engin detail In CC of vehicle
	 * @param: take integer of Engin detail In CC of vehicle
	 */
	public void setEnginInCC(int enginInCC) {
		this.enginInCC = enginInCC;
	}
	/**
	 * getFuelCapacity method :This method is get Fuel Capacity  of vehicle
	 * @return:Fuel Capacity  of vehicle
	 */
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	/**
	 * setFuelCapacity method :This method is set Fuel Capacity  of vehicle
	 * @param :Fuel Capacity  of vehicle
	 */
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	/**
	 * getMilage method :This method is get milage  of vehicle
	 * @return :milage  of vehicle in integer
	 */
	public int getMilage() {
		return milage;
	}
	/**
	 * setMilage method :This method is set milage  of vehicle
	 * @param :milage  of vehiclein integer
	 */
	public void setMilage(int milage) {
		this.milage = milage;
	}
	/**
	 * getPrice method :This method is get price  of vehicle
	 * @return :price of vehicle in double 
	 */
	public double getPrice() {
		return price; 
	}
	/**
	 * setPrice method :This method is set price  of vehicle
	 * @param :price of vehicle in double 
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * getRoadTax method :This method is get RoadTax  of vehicle
	 * @return : RoadTax of vehicle in double 
	 */
	public double getRoadTax() {
		return roadTax;
	}
	/**
	 * setRoadTax method :This method is setRoadTax  of vehicle
	 * @param : RoadTax of vehicle in double 
	 */
	public void setRoadTax(double roadTax) {
		this.roadTax = roadTax;
	}
	/**
	 * This method calculateOnRoadPrice is used to calculate on road price of Vehicle 
	 * @return : total price of Vehicle include all acclessory.
	 */
	public double calculateOnRoadPrice() {
		return price + roadTax;
	}
	/**
	 * toString method :is used to return detail of vehicle
	 * @return : attribute string of vehicle 
	 */
	@Override
	public String toString() {
		return "make=" + make + ", model=" + model + ", enginInCC=" + enginInCC
				+ ", fuelCapacity=" + fuelCapacity + ", milage=" + milage
				+ ", price=" + price + ", roadTax=" + roadTax;
	}

	/**
	 * getVehicalid method :This method is get  Vehicalid  of vehicle
	 * @return :  Vehicalid  of vehicle in double 
	 */
	public double getVehicalid() {
		return Vehicalid;
	}
	/**
	 * setVehicalid method :This method is set  Vehicalid  of vehicle
	 * @param :  Vehicalid  of vehicle in double 
	 */
	public void setVehicalid(double vehicalid) {
		Vehicalid = vehicalid;
	}

	
}
