/****************************************************************************************
Name            : VehicleHelper
Revision Log    : 2015-09-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used set vehicle attributes according to vehicle type
                :
****************************************************************************************/
package helper;

import model.Bike;
import model.Car;
import model.Vehicle;

public class VehicleHelper {
	/**
	 * This method createVehicle is used to set vehicle attributes according to vehicle type
	 * @return : return the instance of vehicle type
	 */
	public static Vehicle createVehicle(String vehicleType, String model,
			String make) {

		if (vehicleType.equals("car")) {
			return createCar(model, make);

		} else {
			return createBike(model, make);

		}

	}
	/**
	 * This method createCar is used to set vehicle attributes according to vehicle car
	 * @return : return the instance of car
	 */
	private static Vehicle createCar(String model, String make) {
		Vehicle vehicle = new Car();
		vehicle.setEnginInCC(500);
		vehicle.setFuelCapacity(50);
		vehicle.setMake(make);
		vehicle.setMilage(17);
		vehicle.setModel(model);
		vehicle.setPrice(800000.00);
		vehicle.setRoadTax(10000);
		((Car) vehicle).setAC(true);
		((Car) vehicle).setAccessoryKit(true);
		((Car) vehicle).setPowerSteering(true);

		return vehicle;

	}
	/**
	 * This method createCar is used to set vehicle attributes according to vehicle Bike
	 * @return : return the instance of Bike
	 */
	private static Vehicle createBike(String model, String make) {
		Vehicle vehicle = new Bike();
		vehicle.setEnginInCC(500);
		vehicle.setFuelCapacity(50);
		vehicle.setMake(make);
		vehicle.setMilage(17);
		vehicle.setModel(model); 
		vehicle.setPrice(800000.00);
		vehicle.setRoadTax(10000);
		((Bike) vehicle).setHelmetPrize(100);
		((Bike) vehicle).setSelfStart(true);

		return vehicle;

	}
}
