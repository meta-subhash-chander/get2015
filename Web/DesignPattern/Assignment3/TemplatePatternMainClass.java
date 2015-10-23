/****************************************************************************************
Name            : TemplatePatternMainClass
Revision Log    : 2015-10-22: Subhash Chander : created.
                : 
                : 
Use             : Template Pattern main class
 ****************************************************************************************/
package Assignment3;

public class TemplatePatternMainClass {
	public static void main(String[] args) {

		Cricket t20 = new T20();
		t20.play();
		Cricket oneDay = new T20();
		oneDay.play();
		Cricket test = new T20();
		test.play();
	}
}