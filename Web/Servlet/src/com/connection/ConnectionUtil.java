/****************************************************************************************
Name            : ConnectionUtil
Revision Log    : 2015-10-13: Subhash Chander : created.
                : 
                : 
Use             : This class is used to create connection between web page and database
                :
 ****************************************************************************************/
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/user";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";

	private Connection con = null;
	/**
	 * getConnection method :create connection
	 * 
	 * @return : connection object
	 */
	public Connection getConnection() {

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
