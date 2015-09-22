/****************************************************************************************
Name            : VehicleDetailPrinter
Revision Log    : 2015-09-21: Subhash Chander : created.
                : 
                : 
Use             : This class is used print the detail of vehicle
                :
 ****************************************************************************************/
package vehiclemanagement;

import vehiclemanagement.model.Vehicle;
/**
 * VehicleDetailPrinter method: used to print the detail of vehicle
 * 
 * @param : Vehicle object
 */
public class VehicleDetailPrinter {

	public static String printVehicleSpecification(Vehicle vehicle){
		
		return vehicle.toString();		
	}
}
