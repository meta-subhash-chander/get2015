/****************************************************************************************
Name            : main
Revision Log    : 2015-09-21: Subhash Chander : created.
                : 
                : 
Use             : This class is used to perform operation of vehicle class
                :
 ****************************************************************************************/
package vehiclemanagement;

import java.util.List;

import vehiclemanagement.model.Vehicle;

public class Main {

	public static void main(String[] args) {
		VehicleDataStoreIntoDatabaseHealper vehicleDaoHealper = new VehicleDataStoreIntoDatabaseHealper();
		StaXParser st = new StaXParser();
		List<Vehicle> cars = st
				.readConfig("../casestudy2/xmlFiles/carinput.xml");

		for (Vehicle vehicle : cars) {
		if(	vehicleDaoHealper.insertIntoVehicle(vehicle)){System.out.println("hello");
			
		}
			System.out.println(vehicle.toString());
		}

		List<Vehicle> bikes = st
				.readConfig("../casestudy2/xmlFiles/bikeinput.xml");

		for (Vehicle vehicle : bikes) {
			vehicleDaoHealper.insertIntoVehicle(vehicle);
		}
	}
}
