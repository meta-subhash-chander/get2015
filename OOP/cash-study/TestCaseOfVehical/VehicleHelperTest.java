/****************************************************************************************
Name            : VehicleHelperTest
Revision Log    : 2015-09-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used to test that VehicleHelper test return the instance 
                : of vehicle type 
****************************************************************************************/
package TestCaseOfVehical;

import helper.VehicleHelper;

import model.Bike;
import model.Car;
import model.Vehicle;

import org.junit.Test;

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
