package com.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.Exceptions.VehicleDekhoSystemException;

public class ConnectionFactory {

	
	private static String DB_URL;
	private static String USER;
	private static String PASSWORD;
			
	private static Connection con = null;
	
	
	public static Connection getConnection() throws VehicleDekhoSystemException{
		 
		DB_URL = "jdbc:mysql://localhost:3306/Vehicle";  
		
	    USER = "root";  
		
		PASSWORD = "mysql"; 
		 
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			 
			throw new VehicleDekhoSystemException("Driver Class not found", e);
		}
		
		 
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			con.setAutoCommit(false);
		} catch (SQLException e) {
		 
			throw new VehicleDekhoSystemException("Error while make connection ", e);
		}
		return con;
	}
	 
	public static void closeConnection(Connection connection) throws VehicleDekhoSystemException {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new VehicleDekhoSystemException("Error while make connection ", e);
			}
		}
	}
	
}
