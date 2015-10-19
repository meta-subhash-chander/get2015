/****************************************************************************************
Name            : Employee
Revision Log    : 2015-10-16: Subhash Chander : created.
                : 
                : 
Use             :Have employee detail having json Annotation
 ****************************************************************************************/
package com.assignment2;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class Employee {
	private String employeeName;
	private int employeeId;
	@JsonIgnore
	private String emailId;
	private String dateOfBirth;
	@JsonIgnore
	private String dateOfJoining;
	@JsonIgnore
	private double ctcPerAnnum;

	/**
	 * getEmployeeName method : used to get employee name
	 * 
	 * @return : employeeName
	 */
	@JsonProperty
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * setEmployeeName method : used to set employee name
	 * 
	 * @param : employeeName
	 * 
	 */
	@JsonProperty
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * getEmployeeId method : used to get employee id
	 * 
	 * @return: employee Id
	 */
	@JsonProperty
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * setEmployeeId method : used to set employee id
	 * 
	 * @param : employeeId
	 */
	@JsonProperty
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * getEmailId method : used to get employee email id
	 * 
	 * @return : emailId
	 */
	@JsonProperty
	public String getEmailId() {
		return emailId;
	}

	/**
	 * setEmailId method : used to set employee Email Id
	 * 
	 * @param emailId
	 */
	@JsonIgnore
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * getDateOfBirth method : used to get Date Of Birth
	 * 
	 * @return:dateOfBirth
	 */
	@JsonIgnore
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * setDateOfBirth method : used to set Date Of Birth
	 * 
	 * @param dateOfBirth
	 */
	@JsonProperty
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * getDateOfJoining method : used to get get Date Of Joining
	 * 
	 * @return : dateOfJoining
	 */
	@JsonProperty
	public String getDateOfJoining() {
		return dateOfJoining;
	}

	/**
	 * setDateOfJoining method : used to set Date Of Joining
	 * 
	 * @param: dateOfJoining
	 */
	@JsonIgnore
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	/**
	 * getCtcPerAnnum method : used to get ctcPerAnnum
	 * 
	 * @return : ctcPerAnnum
	 */
	@JsonIgnore
	public double getCtcPerAnnum() {
		return ctcPerAnnum;
	}

	/**
	 * setCtcPerAnnum method : used to set CtcPerAnnum
	 * 
	 * @param ctcPerAnnum
	 */
	@JsonIgnore
	public void setCtcPerAnnum(double ctcPerAnnum) {
		this.ctcPerAnnum = ctcPerAnnum;
	}

	/**
	 * toString method : used to create string of employee detail
	 * 
	 * @return: string of employee detail
	 */
	@Override
	public String toString() {
		return "Employee [ employeeName=" + employeeName + " , employeeId="
				+ employeeId + ", emailId=" + emailId + ", dateOfBirth="
				+ dateOfBirth + ", dateOfJoining=" + dateOfJoining
				+ ", ctcPerAnnum=" + ctcPerAnnum + "]";
	}

}
