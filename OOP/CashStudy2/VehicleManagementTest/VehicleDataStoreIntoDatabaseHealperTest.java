/****************************************************************************************
Name            : VehicleDataStoreIntoDatabaseHealperTest
Revision Log    : 2015-09-14: Subhash Chander : created.
                : 
                : 
Use             : This class is used to test to store data into database.
****************************************************************************************/
package vehiclemanagement;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import vehiclemanagement.StaXParser;
import vehiclemanagement.VehicleDataStoreIntoDatabaseHealper;
import vehiclemanagement.model.Vehicle;

public class VehicleDataStoreIntoDatabaseHealperTest {

	@Test
	public void testVehicalDetailStoreForCarsGivenVehicleTypeCarsThenStoreAttributeOfCarsintoDatabase() {
		VehicleDataStoreIntoDatabaseHealper vehicleDaoHealper = new VehicleDataStoreIntoDatabaseHealper();
		StaXParser st = new StaXParser();
		List<Vehicle> cars = st
				.readConfig("../casestudy2/xmlFiles/carinput.xml");
		for (Vehicle vehicle : cars) {
			assertTrue(vehicleDaoHealper.insertIntoVehicle(vehicle)) ;
		}
	}
	
	@Test
	public void testVehicalDetailStoreForBikeGivenVehicleTypeBikeThenStoreAttributeOfBikeintoDatabase() {
		VehicleDataStoreIntoDatabaseHealper vehicleDaoHealper = new VehicleDataStoreIntoDatabaseHealper();
		StaXParser st = new StaXParser();
		List<Vehicle> bikes = st
				.readConfig("../casestudy2/xmlFiles/bikeinput.xml");
		for (Vehicle vehicle : bikes) {
			assertTrue(vehicleDaoHealper.insertIntoVehicle(vehicle)) ;
		}
	}
}