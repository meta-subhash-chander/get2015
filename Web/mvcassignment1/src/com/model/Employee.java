/****************************************************************************************
Name            : Employee
Revision Log    : 2015-10-13: Subhash Chander : created.
                : 
                : 
Use             : This class have Employee attribute to create account
                :
 ****************************************************************************************/
package com.model;

public class Employee {
	private int employeeId;
	private String name;
	private String email;
	private int age;
	private String dateOfRegistration;

	/**
	 * Employee method :method is use to set attribute of employee
	 * 
	 * @param : employeeId,name,email,age,dateOfRegistration
	 */
	public Employee(int employeeId, String name, String email, int age,
			String dateOfRegistration) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.age = age;
		this.dateOfRegistration = dateOfRegistration;
	}
	/**
	 * employeeId method :method is use to getemployeeId
	 * 
	 * @return : employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * setEmployeeId method :method is use to set  employeeId
	 * 
	 * @param :employeeId
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * getUsername method :method is use to get employee name
	 * 
	 * @return : employee name
	 */
	public String getName() {
		return name;
	}
	/**
	 * setName method :method is use to set employee name
	 * 
	 * @param :employee name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * getEmail method :method is use to get employee Email
	 * 
	 * @return : employee Email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * setEmail method :method is use to set employee email
	 * 
	 * @param :email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * getAge method :method is use to get employee age
	 * 
	 * @return : employee age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * setAge method :method is use to set employee age
	 * 
	 * @param :age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * getDateOfRegistration method :method is use to get dateOfRegistration
	 * 
	 * @return : dateOfRegistration
	 */
	public String getDateOfRegistration() {
		return dateOfRegistration;
	}
	/**
	 * setDateOfRegistration method :method is use to set dateOfRegistration
	 * 
	 * @param :dateOfRegistration
	 */
	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

}
