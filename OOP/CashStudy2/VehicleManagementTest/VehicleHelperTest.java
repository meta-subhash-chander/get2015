/****************************************************************************************
Name            : VehicleHelperTest
Revision Log    : 2015-09-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used to test that VehicleHelper test return the instance 
                : of vehicle type 
****************************************************************************************/
package vehiclemanagement;

import vehiclemanagement.model.Bike;

import org.junit.Test;

import vehiclemanagement.VehicleHelper;
import vehiclemanagement.model.Car;
import vehiclemanagement.model.Vehicle;

public class VehicleHelperTest {

	@Test
	public void testVehicleHelperForBikeGivenVehicleTypeBikeThenItReturnInstanceOfBikeClass() {

		Vehicle vehicle = VehicleHelper.createVehicle("bike", "ApacheRTR",
				"TVS");
		assert (vehicle instanceof Bike);

	}

	@Test
	public void testVehicleHelperForCarGivenVehicleTypeCarThenItReturnInstanceOfCarClass() {

		Vehicle vehicle = VehicleHelper.createVehicle("car", "EchoSports",
				"Ford");
		assert (vehicle instanceof Car);

	}

}
