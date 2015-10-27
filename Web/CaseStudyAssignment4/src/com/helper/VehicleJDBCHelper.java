/****************************************************************************************
Name            : VehicleJDBCHelper
Revision Log    : 2015-10-25: Subhash Chander : created.
                : 
                : 
Use             : provide Interface between the webpage and database
                :
 ****************************************************************************************/
package com.helper;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.Utills.ConnectionUtill;
import com.model.Bike;
import com.model.Car;
import com.model.Vehicle;

public class VehicleJDBCHelper {
	/**
	 * create method : insert the vehicle date into database by vehicle object
	 * 
	 * @param : vehicle object
	 * @return : boolean result
	 */
	@SuppressWarnings("resource")
	public static boolean create(Vehicle vehicle) {

		ConnectionUtill conUtil = new ConnectionUtill();
		Connection con = conUtil.getConnection();
		PreparedStatement prepareStmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		boolean isInsert = false;
		try {

			String author = vehicle.getCreated_By();
			String make = vehicle.getMake();
			String model = vehicle.getModel();
			int engineCC = vehicle.getEnginInCC();
			int fuelCapacity = vehicle.getFuelCapacity();
			int milage = vehicle.getMilage();
			double price = vehicle.getPrice();
			double roadTax = vehicle.getRoadTax();

			String query = "SELECT * FROM Vehicle WHERE make='" + make
					+ "' AND model='" + model + "'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			if (!rs.next()) {
				isInsert = true;
				query = "INSERT INTO Vehicle(created_by,created_time,make,model,engine_cc,fuel_capacity,milage,price,roadTax) VALUES(?,?,?,?,?,?,?,?,?)";
				prepareStmt = con.prepareStatement(query);

				prepareStmt.setString(1, author);
				prepareStmt.setTimestamp(2, new Timestamp(vehicle
						.getCreated_Time().getTime()));
				prepareStmt.setString(3, make);
				prepareStmt.setString(4, model);
				prepareStmt.setInt(5, engineCC);
				prepareStmt.setInt(6, fuelCapacity);
				prepareStmt.setInt(7, milage);
				prepareStmt.setDouble(8, price);
				prepareStmt.setDouble(9, roadTax);
				prepareStmt.execute();
				query = "SELECT vehicle_id FROM Vehicle ORDER BY vehicle_id DESC";
				int vehicleId;

				rs = stmt.executeQuery(query);
				rs.next();
				vehicleId = rs.getInt(1);
				if (vehicle instanceof Car) {
					String ac = "NO", powerSteering = "NO", accessoryKit = "NO";
					if (((Car) vehicle).isAC()) {
						ac = "YES";
					}
					if (((Car) vehicle).isPowerSteering()) {
						powerSteering = "YES";
					}
					if (((Car) vehicle).isAccessoryKit()) {
						accessoryKit = "YES";
					}
					query = "INSERT INTO Car(ac,powersteering,accessorykit,vehicle_id) VALUES(?,?,?,?)";
					prepareStmt = con.prepareStatement(query);
					prepareStmt.setString(1, ac);
					prepareStmt.setString(2, powerSteering);
					prepareStmt.setString(3, accessoryKit);
					prepareStmt.setInt(4, vehicleId);
					prepareStmt.execute();
				} else {
					String selfStart = "NO";
					double helmetprice = ((Bike) vehicle).getHelmetPrize();
					if (((Bike) vehicle).isSelfStart()) {
						selfStart = "YES";
					}
					query = "INSERT INTO Bike(selfstart,helmetprice,vehicle_id) VALUES(?,?,?)";
					prepareStmt = con.prepareStatement(query);
					prepareStmt.setString(1, selfStart);
					prepareStmt.setDouble(2, helmetprice);
					prepareStmt.setInt(3, vehicleId);
					prepareStmt.execute();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (prepareStmt != null) {
					prepareStmt.close();
				}
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return isInsert;
	}

	/**
	 * searchByMakeAndModel method : search the vehicle object by the vehicle
	 * company and model
	 * 
	 * @param : vehicle company and model
	 * @return : object of vehicle
	 */
	@SuppressWarnings("resource")
	public static List<Vehicle> searchByMakeAndModel(String make, String model) {
		String query = "SELECT * FROM vehicle WHERE make = '" + make
				+ "' AND model = '" + model + "'";
		Statement stmt = null, stmt2 = null;
		ResultSet rsVehicle = null;
		ResultSet rsSpecific = null;
		String selfStart = "", ac, powerSteering, accessoryKit, createdBy;
		int engineCC, fuelCapacity, mileage;
		Date createdTime;
		double price, roadTax, helmetPrice = 0;
		ConnectionUtill conUtil = new ConnectionUtill();
		Connection con = conUtil.getConnection();
		List<Vehicle> vehicles = null;
		try {
			stmt = con.createStatement();
			stmt2 = con.createStatement();
			rsVehicle = stmt.executeQuery(query);

			vehicles = new ArrayList<Vehicle>();

			Vehicle vehicle = null;
			while (rsVehicle.next()) {
				createdBy = rsVehicle.getString("created_by");
				createdTime = rsVehicle.getDate("created_time");
				model = rsVehicle.getString("model");
				engineCC = rsVehicle.getInt("engine_cc");
				fuelCapacity = rsVehicle.getInt("fuel_capacity");
				mileage = rsVehicle.getInt("milage");
				price = rsVehicle.getDouble("price");
				roadTax = rsVehicle.getDouble("roadTax");

				int vehicle_id = rsVehicle.getInt("vehicle_id");

				query = "SELECT * FROM Car WHERE vehicle_id = " + vehicle_id;

				rsSpecific = stmt2.executeQuery(query);

				if (rsSpecific.next() == false) {

					query = "SELECT * FROM Bike WHERE vehicle_id = "
							+ vehicle_id;
					rsSpecific = stmt2.executeQuery(query);
					if (rsSpecific.next()) {
						vehicle = new Bike();
						boolean b1 = false;
						selfStart = rsSpecific.getString("selfstart");
						helmetPrice = rsSpecific.getDouble("helmetprice");
						if (selfStart.equals("YES"))
							b1 = true;
						;
						((Bike) vehicle).setSelfStart(b1);
						((Bike) vehicle).setHelmetPrize(helmetPrice);
					}
				} else {

					vehicle = new Car();
					boolean b1 = false, b2 = false, b3 = false;
					ac = rsSpecific.getString("ac");
					powerSteering = rsSpecific.getString("powersteering");
					accessoryKit = rsSpecific.getString("accessorykit");
					if (ac.equals("YES"))
						b1 = true;
					if (powerSteering.equals("YES"))
						b2 = true;
					if (accessoryKit.equals("YES"))
						b3 = true;
					((Car) vehicle).setAC(b1);
					((Car) vehicle).setPowerSteering(b2);
					((Car) vehicle).setAccessoryKit(b3);
				}

				vehicle.setCreated_By(createdBy);
				vehicle.setCreated_Time(createdTime);
				vehicle.setEnginInCC(engineCC);
				vehicle.setFuelCapacity(fuelCapacity);
				vehicle.setMake(make);
				vehicle.setMilage(mileage);
				vehicle.setModel(model);
				vehicle.setPrice(price);
				vehicle.setRoadTax(roadTax);
				vehicles.add(vehicle);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (stmt2 != null)
					stmt2.close();
				if (rsSpecific != null)
					rsSpecific.close();
				if (rsVehicle != null)
					rsVehicle.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vehicles;
	}

	/**
	 * deleteByMakeAndModel method : delete the vehicle data by vehicle company
	 * name and company model
	 * 
	 * @param : vehicle company and model
	 * @return : int type ,number of row deleted
	 */
	public static int deleteByMakeModel(String make, String model) {
		String query = "DELETE FROM Vehicle WHERE make = '" + make
				+ "' AND model = '" + model + "'";
		ConnectionUtill conUtil = new ConnectionUtill();
		Connection con = conUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsDeleted;
			numberOfrecordsDeleted = stmt.executeUpdate(query);
			return numberOfrecordsDeleted;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}

	/**
	 * updateByMakeAndModel method : update the vehicle data by vehicle company
	 * name and company model
	 * 
	 * @param : vehicle company and model
	 * @return : int type ,number of row updated
	 */
	public static int updateByMakeAndModel(Vehicle vehicle) {
		String query = "UPDATE Vehicle SET engine_cc=" + vehicle.getEnginInCC()
				+ ",fuel_capacity=" + vehicle.getFuelCapacity() + ",milage="
				+ vehicle.getMilage() + ",price=" + vehicle.getPrice()
				+ ",roadTax=" + vehicle.getRoadTax() + " where make = '"
				+ vehicle.getMake() + "' AND model='" + vehicle.getModel()
				+ "'";
		ConnectionUtill conUtil = new ConnectionUtill();
		Connection con = conUtil.getConnection();
		try {
			Statement stmt = con.createStatement();
			int numberOfrecordsUpdated;
			numberOfrecordsUpdated = stmt.executeUpdate(query);
			query = "SELECT vehicle_id FROM Vehicle WHERE make='"
					+ vehicle.getMake() + "' AND model='" + vehicle.getModel()
					+ "'";
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			int id = rs.getInt("vehicle_id");
			String ac = "NO", powerSteering = "NO", accessoryKit = "NO";
			if (((Car) vehicle).isAC()) {
				ac = "YES";
			}
			if (((Car) vehicle).isPowerSteering()) {
				powerSteering = "YES";
			}
			if (((Car) vehicle).isAccessoryKit()) {
				accessoryKit = "YES";
			}
			query = "UPDATE Car SET ac='" + ac + "',powersteering='"
					+ powerSteering + "',accessorykit='" + accessoryKit
					+ "' WHERE vehicle_id=" + id;
			stmt.executeUpdate(query);
			return numberOfrecordsUpdated;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}
	}

	/**
	 * adminProfile method : resule set of admin table
	 * 
	 * @return : result set of admin table
	 */
	public static ResultSet adminProfile() {
		String query = "SELECT * FROM Admin";
		Connection con = null;
		ResultSet rs = null;
		ConnectionUtill conUtil = new ConnectionUtill();
		try {
			con = conUtil.getConnection();
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * adminProfile method : resule set of vehicle table
	 * 
	 * @return : result set of vehicle company
	 */
	public static ResultSet distictMake() {
		String query = "SELECT DISTINCT make from Vehicle";
		Connection con = null;
		ResultSet rs = null;
		ConnectionUtill conUtil = new ConnectionUtill();
		try {
			con = conUtil.getConnection();
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * searchModel method : resule set of vehicle data
	 * 
	 * @return : result set of vehicle search by company
	 */
	public static ResultSet searchModel(String make) {
		String query = "SELECT model from Vehicle WHERE make='" + make + "'";
		Connection con = null;
		ResultSet rs = null;
		ConnectionUtill conUtil = new ConnectionUtill();
		try {
			con = conUtil.getConnection();
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * updateAdminProfile method : update the admin table
	 * 
	 * @param : http servlet request
	 */
	public static int updateAdminProfile(HttpServletRequest request) {
		String query = "UPDATE Admin SET email='"
				+ request.getParameter("email") + "', name='"
				+ request.getParameter("name") + "', password='"
				+ request.getParameter("password") + "', contact='"
				+ request.getParameter("contact") + "', address='"
				+ request.getParameter("address") + "'";
		Connection con = null;
		Statement stmt = null;
		ConnectionUtill conUtil = new ConnectionUtill();
		con = conUtil.getConnection();
		int update;
		try {
			stmt = con.createStatement();
			update = stmt.executeUpdate(query);
		} catch (Exception e) {
			update = -1;
			e.printStackTrace();
		}
		return update;
	}

	/**
	 * loginCheck method : check the valid admin or not
	 * 
	 * @param : http servlet request
	 * @return : boolean respo nce the admin is valid or not
	 */
	public static boolean loginCheck(HttpServletRequest request) {
		boolean isAdmin = false;
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String query = "SELECT * FROM Admin WHERE email='" + email
				+ "' AND password='" + password + "'";
		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;
		ConnectionUtill conUtil = new ConnectionUtill();
		con = conUtil.getConnection();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				isAdmin = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isAdmin;
	}
}
