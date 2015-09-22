/****************************************************************************************
Name            : VehicleDetailPrinterTest
Revision Log    : 2015-09-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used to test createVehicle function of class  VehicleDetailPrinter
****************************************************************************************/
package vehiclemanagement;

import static org.junit.Assert.*;

import org.junit.Test;

import vehiclemanagement.VehicleHelper;
import vehiclemanagement.model.Vehicle;

public class VehicleDetailPrinterTest {
   @Test
	public void testVehicalDetailPrinterForBikeGivenVehicleTypeBikeThenReturnStringOfAttributeOfBike() {

		Vehicle vehicle = VehicleHelper.createVehicle("bike", "apacheRTR",
				"TVS");
		String expected = "make=TVS, model=apacheRTR, enginInCC=500, fuelCapacity=50, milage=17, "
				+ "price=800000.0, roadTax=10000.0 selfStart=true, helmetPrize=100.0";

		assertEquals(expected, vehicle.toString());

	}
   
	@Test
	public void testVehicalDetailPrinterFoCarGivenVehicleTypeCarThenReturnStringOfAttributeOfCar() {

		Vehicle vehicle = VehicleHelper.createVehicle("car", "ecosports",
				"ford");
		System.out.println(vehicle.toString());
		String expected = "make=ford, model=ecosports, enginInCC=500, "
				+ "fuelCapacity=50, milage=17, price=800000.0, roadTax=10000.0 AC=true, powerSteering=false, accessoryKit=true";

		assertEquals(expected, vehicle.toString());

	}

}
