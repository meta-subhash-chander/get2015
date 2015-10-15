/****************************************************************************************
Name            : User
Revision Log    : 2015-10-13: Subhash Chander : created.
                : 
                : 
Use             : This class have user attribute to create account
                :
 ****************************************************************************************/
package com.model;

public class User {
	private String username;
	private String email;
	private String password;
	/**
	 * getUsername method :method is use to get user name
	 * 
	 * @return : user name
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * setUsername method :method is use to set user name
	 * 
	 * @param :user name
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * getEmail method :method is use to get user Email
	 * 
	 * @return : user Email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * setEmail method :method is use to set user email
	 * 
	 * @param :email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * getPassword method :method is use to get user password
	 * 
	 * @return : user password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * setEmail method :method is use to set user password
	 * 
	 * @param :password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
