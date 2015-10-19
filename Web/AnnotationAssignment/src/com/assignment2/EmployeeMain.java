/****************************************************************************************
Name            : EmployeeMain
Revision Log    : 2015-10-16: Subhash Chander : created.
                : 
                : 
Use             :Jackson API to parse a Model class to JSON and vice versa
 ****************************************************************************************/
package com.assignment2;

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
		String json = "{\"employeeName\":\"Subhash\",\"employeeId\":101,\"emailId\":\"sc@gmail.com\",\"dateOfBirth\":\"02/02/1995\",\"dateOfJoining\":\"03/08/2015\",\"ctcPerAnnum\":1.0E8}";
		Employee employee2;

		try {
			System.out.println(mapper.writeValueAsString(employee1));

			System.out.println("Json file = " + json);
			employee2 = mapper.readValue(json, Employee.class);
			System.out.println(employee2.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
