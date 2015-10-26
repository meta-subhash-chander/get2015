package com.Utills;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtill {

	
	private String DB_URL;
	private String USER;
	private String PASSWORD;
			
	private Connection con = null;
	
	public Connection getConnection(){
		 
		DB_URL = "jdbc:mysql://localhost:3306/Vehicle"; 
		
	    USER = "root"; 
		
		PASSWORD = "mysql";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
