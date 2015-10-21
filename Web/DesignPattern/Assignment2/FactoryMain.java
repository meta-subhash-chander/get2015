/****************************************************************************************
Name            : FactoryMain
Revision Log    : 2015-10-21: Subhash Chander : created.
                : 
                : 
Use             : execute the company application
 ****************************************************************************************/
package Assignment2;

import java.util.List;
import java.util.Scanner;

public class FactoryMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Developer> devloperList;
		Developer developer = null;
		String name;
		String role;
		System.out.println("Enter Devloper name ");
		name = scan.nextLine();
		System.out.println("Enter Devloper role");
		role = scan.nextLine();
		developer = Company.setDeveloper(name, role);
		Company.addDevloper(developer);
		System.out.println("Enter Devloper name ");
		name = scan.nextLine();
		System.out.println("Enter Devloper role");
		role = scan.nextLine();
		developer = Company.setDeveloper(name, role);
		Company.addDevloper(developer);
		devloperList = Company.getDeveloperList();
		for (Developer developer1 : devloperList) {
			System.out.println("Devloper name = " + developer1.getName());
			System.out.println("Devloper role = " + developer1.getRole());
		}
		scan.close();
	}
}