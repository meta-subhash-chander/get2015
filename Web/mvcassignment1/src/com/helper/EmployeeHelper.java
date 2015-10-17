/****************************************************************************************
Name            : EmployeeHelper
Revision Log    : 2015-10-13: Subhash Chander : created.
                : 
                : 
Use             : This class use halp class of employee
                :
 ****************************************************************************************/
package com.helper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.model.Employee;

public class EmployeeHelper { 

	private static Map<Integer, Employee> listOfEmployee = new ConcurrentHashMap<Integer, Employee>();
	/**
	 * loadEmployee method :method is use to set attribute of employee
	 * 
	 * @param : employeeId,name,email,age,dateOfRegistration
	 */
	public static void loadEmployee() {

		listOfEmployee.put(1, new Employee(1, "subhash", "subhash@b", 10, "1/1/15"));
		listOfEmployee.put(2, new Employee(2, "subhash", "subhash@b", 11, "1/1/15"));
		listOfEmployee.put(3, new Employee(3, "subhash", "subhash@b", 15, "1/1/15"));
		listOfEmployee.put(4, new Employee(4, "subhash", "subhash@b", 17, "1/1/15"));
		listOfEmployee.put(5, new Employee(5, "subhash", "subhash@b", 19, "1/1/15"));
		listOfEmployee.put(5, new Employee(5, "subhash", "subhash@b", 20, "11/11/15"));
        
	}

	public static Map<Integer, Employee> getListOfEmployee() {
		return listOfEmployee;

	}
	/**
	 * getEmployee method :method is use to get employee object by id
	 * 
	 * @return: employee object
	 */
	public static Employee getEmployee(int id) {
		Employee employee = listOfEmployee.get(id);
		return employee;
	}
	/**
	 * edit method :method is use to edit  listOfEmployee by id
	 * 
	 * @param: employee object
	 */
	public static void edit(Employee employee,int id)
	{
		
		listOfEmployee.put(id, employee);
		
	}
	/**
	 * addInList method :method is use to add employe in listOfEmployee  
	 * @param: employee object
	 */
	public static void addInList(Employee employee,int id)
	{
		
		listOfEmployee.put(id , employee);
		
	}

}
 
