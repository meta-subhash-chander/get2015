/****************************************************************************************
Name            : UserHelper
Revision Log    : 2015-10-13: Subhash Chander : created.
                : 
                : 
Use             : This class is used transfer data between web page and database
                :
 ****************************************************************************************/
package com.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.ConnectionUtil;
import com.model.User;

public class UserHelper {
	/**
	 * addUser method : used to user data into database 
	 * 
	 * @param object : object of class user
	 * @return :return that user added or not
	 */
	public static boolean addUser(User user) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		ConnectionUtil util = new ConnectionUtil();
		con = util.getConnection();

		String query = "INSERT INTO tbl_user(username,password,email) VALUES(?,?,?)";
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			result = ps.executeUpdate();

			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (result > 0)
			return true;
		else
			return false;

	}
	/**
	 * isValidUser method : used to check that user is valid or not
	 * @return boolean:return that user  valid or not response
	 */
	public static boolean isValidUser(User user) {
		boolean result = false;
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		ConnectionUtil util = new ConnectionUtil();
		con = util.getConnection();

		String query = "SELECT email,password FROM tbl_user WHERE email=? and password=?";
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getPassword());
			rs = ps.executeQuery();

			if (rs.next()) {
				result = true;
			}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;

	}

}
