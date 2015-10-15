package com.helper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.model.Employee;

public class EmployeeHelper {

	private static Map<Integer, Employee> listOfEmployee = new ConcurrentHashMap<Integer, Employee>();

	public static void loadEmployee() {

		listOfEmployee.put(1, new Employee(1, "subhash", "subhash@b", 10, "1/1/15"));
		listOfEmployee.put(2, new Employee(2, "subhash", "subhash@b", 11, "1/1/15"));
		listOfEmployee.put(3, new Employee(3, "subhash", "subhash@b", 15, "1/1/15"));
		listOfEmployee.put(4, new Employee(4, "subhash", "subhash@b", 17, "1/1/15"));
		listOfEmployee.put(5, new Employee(5, "subhash", "subhash@b", 18, "1/1/15"));
        
	}

	public static Map<Integer, Employee> getListOfEmployee() {
		return listOfEmployee;

	}

	public static Employee getEmployee(int id) {
		Employee employee = listOfEmployee.get(id);
		return employee;
	}
	public static void edit(Employee employee,int id)
	{
		
		listOfEmployee.put(id, employee);
		
	}
	
	public static void addInList(Employee employee)
	{
		
		listOfEmployee.put(listOfEmployee.size()+1, employee);
		
	}

}
 