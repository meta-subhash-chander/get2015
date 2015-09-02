

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class EmployeeImplement {
	public static Set<Employee> employee =  new HashSet<Employee>() ; 

	public static void main(String[] args) {
	
		String name;
		String address;
		String choice;
		while(true) {
			System.out.println("Enter 1 to add employee");
			System.out.println("Enter 2 to show sorted employee list according their empId");
			System.out.println("Enter 3 to show sorted employee list according their name");
			System.out.println("Enter 4 to exit");
			Scanner scan = new Scanner(System.in);
			choice = scan.nextLine();
			switch(choice) {
			
				case "1" : System.out.println("Employee name");
							name = scan.next();
							System.out.println("Enter employee Address");
							address = scan.next();
							
							System.out.println("Enter Employee Id");
							int empId=scan.nextInt();
							
							
							Employee emp = new Employee(empId,name,address);
							employee.add(emp);
							break;
							
				case "2" : System.out.println("Sorted employee by empId\n");
						   for(Object e : employee){
							   System.out.println(e.toString());
						   }
						   break;
						   
				case "3" : LinkedList list = new LinkedList(employee);
						   Collections.sort(list,new NameComparator());
						   System.out.println(" Sorted employee by Name\n");
						   for(Object e : list){
							   System.out.println(e.toString());
						   }
						   break;
						   
				case "4" : return;
				
				default : System.out.println("please enter right choice");
			}	
		}
	}
}
