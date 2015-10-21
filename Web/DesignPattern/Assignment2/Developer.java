/****************************************************************************************
Name            : Developer
Revision Log    : 2015-10-21: Subhash Chander : created.
                : 
                : 
Use             : Detail of developer 
 ****************************************************************************************/
package Assignment2;

public class Developer  {
	private String name;
	private String role;

	protected Developer() {
	}

	/**
	 * getName method : get the developer name
	 * @return : developer name
	 */
	public String getName() {
		return name;
	}

	/**
	 *  setName method : set the developer name
	 * @param :developer name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getRole method : get the developer role
	 * @return : developer role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * setRole method : set the developer role
	 * @param :developer role
	 */
	public void setRole(String role) {
		this.role = role;
	}

}
