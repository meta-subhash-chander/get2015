/****************************************************************************************
Name            : EmployeeMain
Revision Log    : 2015-10-16: Subhash Chander : created.
                : 
                : 
Use             :Jackson API to parse a Model class to JSON and vice versa
 ****************************************************************************************/
package com.assignment2;
import java.io.File; 
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

public class Main {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();

		Employee employee1 = new Employee();
		employee1.setEmployeeName("Subhash");
		employee1.setEmployeeId(100);
		employee1.setCtcPerAnnum(12345678);
		employee1.setDateOfBirth("01/01/1995");
		employee1.setEmailId("cs@gmail.com");
		employee1.setDateOfJoining("03/08/2015");
		System.out.println(employee1.toString());
	    Employee employee2;

		try {
			mapper.writeValue(new File("C:\\Users\\Subhash\\workspace1\\AnnotationAssignment1\\src\\com\\assignment2\\employee.json"),employee1);	
		    employee2 = mapper.readValue(
					new File("C:\\Users\\Subhash\\workspace1\\AnnotationAssignment1\\src\\com\\assignment2\\employeeJsonToEmployeeModel.json"),Employee.class);
	System.out.println(employee2.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
