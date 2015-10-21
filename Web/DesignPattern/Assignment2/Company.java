/****************************************************************************************
Name            : Company
Revision Log    : 2015-10-21: Subhash Chander : created.
                : 
                : 
Use             :  have all detail of developer
 ****************************************************************************************/
package Assignment2;

import java.util.ArrayList;
import java.util.List;


public class Company {

	private static List<Developer> devloperList;
	/**
	 * addDevloper method : add developer object into developer list
	 * @return : developer object
	 */
	public static void addDevloper(Developer developer) {
		if (devloperList == null) {
			devloperList = new ArrayList<Developer>();
		}
		devloperList.add(developer);
	} 
	/**
	 * setDeveloper method : set developer detail
	 * @param : developer name and developer role
	 * @return :developer object
	 */ 
	public static Developer setDeveloper(String name, String role) {
		Developer developer = DeveloperFactory.getDeveloper();
		developer.setName(name);
		developer.setRole(role);
		return developer;
	}
	/**
	 * getDeveloperList method : get Developer List
	 * @return :Developer List
	 */ 
	public static List<Developer> getDeveloperList() {
		return devloperList;
	}

}