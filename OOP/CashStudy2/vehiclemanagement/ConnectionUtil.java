/****************************************************************************************
Name            : ConnectionUtil
Revision Log    : 2015-09-21: Subhash Chander : created.
                : 
                : 
Use             : This class is used connect the database to programme
                :
 ****************************************************************************************/
package vehiclemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/vehicleManagement";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";

	private Connection con = null;

	/**
	 * getConnection method create connection between programe and mysql
	 * database
	 * 
	 * @return : return the connection object
	 */
	public Connection getConnection() {
		/* register driver */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		/* open connection */
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}