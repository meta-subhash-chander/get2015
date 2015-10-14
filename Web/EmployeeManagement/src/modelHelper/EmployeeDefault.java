package modelHelper;

import model.Employee;

public class EmployeeDefault {
	
	 private static EmployeeDefault Instance = new EmployeeDefault();
	 
	 private EmployeeDefault() {
		 Employee e= new Employee();
		 System.out.println("jigtyyaa");
		 e.setEmployeeId(Employee.getEmpId());
		EmployeeCache.add(EmployeeHelper.createEmployee( e.getEmployeeId(),"Jignesh", 21,
				"10/10/2015", "jmistry94@gmail.com"));
		e.setEmployeeId(Employee.getEmpId());
		EmployeeCache.add(EmployeeHelper.createEmployee(e.getEmployeeId(),"Manish", 21,
				"14/10/2015", "mainsh@gmail.com"));
		e.setEmployeeId(Employee.getEmpId());
		EmployeeCache.add(EmployeeHelper.createEmployee(e.getEmployeeId(),"Nikhil", 22,
				"10/9/2015", "nikhil@gmail.com"));
		e.setEmployeeId(Employee.getEmpId());
		EmployeeCache.add(EmployeeHelper.createEmployee(e.getEmployeeId(),"Subhash", 29,
				"13/10/2015", "subhash@gmail.com"));
		e.setEmployeeId(Employee.getEmpId());
		EmployeeCache.add(EmployeeHelper.createEmployee(e.getEmployeeId(),"Udit", 19,
				"10/11/2015", "udit@gmail.com"));

	}
	
	 public static EmployeeDefault getInstance( ) {
	      return Instance;
	   }
}
