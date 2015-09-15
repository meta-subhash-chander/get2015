/****************************************************************************************
Name            : VehicleDetailPrinter
Revision Log    : 2015-09-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used to print vehicle detail
                :
****************************************************************************************/
package printer;

import model.Vehicle;
/**
 * This method VehicleDetailPrinter is used return attribute of vehicle 
 * @param : object of vehicle type
 * @param : return attribute of vehicle as string
 */
public class VehicleDetailPrinter {

	public static String printVehicleSpecification(Vehicle vehicle)
	{
		return vehicle.toString();
		
	}
	
	
}
