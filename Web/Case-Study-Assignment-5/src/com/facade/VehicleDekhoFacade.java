package com.facade;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.Exceptions.VehicleDekhoSystemException;
import com.helper.VehicleJDBCHelper;
import com.model.Vehicle;

 
public class VehicleDekhoFacade {
	
	 
	public boolean isAdmin(Connection connection, String email, String password) throws VehicleDekhoSystemException {
		boolean resultDB = false;
		try {
			resultDB = VehicleJDBCHelper.loginCheck(connection, email, password);
		} catch (VehicleDekhoSystemException e) {
			try{
				connection.rollback();
			} catch(SQLException e1) {
				throw new VehicleDekhoSystemException("Could not roll back : "+e1.getMessage());
			}
			System.out.print("\n Could not validate admin due to : "+e.getMessage());
		}
		return resultDB;
	}
	
	 
	public Map<String, String> getProfile(Connection connection) throws VehicleDekhoSystemException {
		Map<String, String> resultDB = null;
		try {
			resultDB = VehicleJDBCHelper.adminProfile(connection);
		} catch (VehicleDekhoSystemException e) {
			try{
				connection.rollback();
			} catch(SQLException e1) {
				throw new VehicleDekhoSystemException("Could not roll back : "+e1.getMessage());
			}
			System.out.print("\n Could not get Admin Profile due to : "+e.getMessage());
		}
		return resultDB;
	}
	 
	public int updateProfile(Connection connection, List<String> profileData) throws VehicleDekhoSystemException {
		int resultDB = 0;
		try {
			resultDB = VehicleJDBCHelper.updateAdminProfile(connection, profileData);
		} catch (VehicleDekhoSystemException e) {
			try{
				connection.rollback();
			} catch(SQLException e1) {
				throw new VehicleDekhoSystemException("Could not roll back : "+e1.getMessage());
			}
			System.out.print("\n Could not Update Admin Profile due to : "+e.getMessage());
		}
		return resultDB;
	}
	
	  
	public boolean createVehicle(Connection connection, Vehicle vehicle) throws VehicleDekhoSystemException {
		boolean resultDB = false;
		
		try {
			resultDB = VehicleJDBCHelper.create(connection, vehicle);
		} catch (VehicleDekhoSystemException e) {
			try{
				connection.rollback();
			} catch(SQLException e1) {
				throw new VehicleDekhoSystemException("Could not roll back : "+e1.getMessage());
			}
			System.out.print("\n Could not create vehicle due to : "+e.getMessage());
		}
		
		return resultDB;
	}
	 
	public List<String> getMake(Connection connection) throws VehicleDekhoSystemException {
		List<String> resultDB = null;
		try {
			resultDB = VehicleJDBCHelper.distictMake(connection);
		} catch (VehicleDekhoSystemException e) {
			try{
				connection.rollback();
			} catch(SQLException e1) {
				throw new VehicleDekhoSystemException("Could not roll back : "+e1.getMessage());
			}
			System.out.print("\n Could not retrive list of make due to : "+e.getMessage());
		}
		return resultDB;
	}
	 
	public List<String> getModel(Connection connection, String make) throws VehicleDekhoSystemException {
		List<String> resultDB = null;
		try {
			resultDB = VehicleJDBCHelper.searchModel(connection, make);
		} catch (VehicleDekhoSystemException e) {
			try{
				connection.rollback();
			} catch(SQLException e1) {
				throw new VehicleDekhoSystemException("Could not roll back : "+e1.getMessage());
			}
			System.out.print("\n Could not retrive list of model due to : "+e.getMessage());
		}
		return resultDB;
	}

	 
	public List<Vehicle> getVehicle(Connection connection, String make, String model) throws VehicleDekhoSystemException {
		List<Vehicle> resultDB = null;
		try {
			resultDB = VehicleJDBCHelper.searchByMakeAndModel(connection, make, model);
		} catch (VehicleDekhoSystemException e) {
			try{
				connection.rollback();
			} catch(SQLException e1) {
				throw new VehicleDekhoSystemException("Could not roll back : "+e1.getMessage());
			}
			System.out.print("\n Could not retrive Vehicle due to : "+e.getMessage());
		}
		return resultDB;
	}
	 
	public int updateVehicle(Connection connection, Vehicle vehicle) throws VehicleDekhoSystemException {
		int resultDB = 0;
		try {
			resultDB = VehicleJDBCHelper.updateByMakeAndModel(connection,vehicle);
		} catch (VehicleDekhoSystemException e) {
			try{
				connection.rollback();
			} catch(SQLException e1) {
				throw new VehicleDekhoSystemException("Could not roll back : "+e1.getMessage());
			}
			System.out.print("\n Could not Update vehicle due to : "+e.getMessage());
		}
		return resultDB;
	}
		
	 
	public int deleteVehicle(Connection connection, String make, String model) throws VehicleDekhoSystemException {
		int resultDB = 0;
		try {
			resultDB = VehicleJDBCHelper.deleteByMakeModel(connection, make, model);
		} catch (VehicleDekhoSystemException e) {
			try{
				connection.rollback();
			} catch(SQLException e1) {
				throw new VehicleDekhoSystemException("Could not roll back : "+e1.getMessage());
			}
			System.out.print("\n Could not delete Vehicle due to : "+e.getMessage());
		}
		return resultDB;
	}
	

}
