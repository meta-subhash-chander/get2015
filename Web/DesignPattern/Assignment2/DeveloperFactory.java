/****************************************************************************************
Name            : DeveloperFactory
Revision Log    : 2015-10-21: Subhash Chander : created.
                : 
                : 
Use             :create the developer object
 ****************************************************************************************/

package Assignment2;


public class DeveloperFactory extends Developer{
	
	static Developer developer = null;
	/**
	 * getDeveloper method : get the developer object
	 * @return : developer object
	 */
	public static Developer getDeveloper(){
		developer = new Developer();
		return developer;
	 }
}
