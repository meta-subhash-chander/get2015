/**
* The DRAW_DYMOND program implements an application that
* simply displays DIMOND shap string  to the standard output
* @author  subhash chander
*/
 
public class DRAW_DYMOND {
	/**
	   * This method is used to print spaces string. This is
	   * a the simplest form of a class method, just to
	   * show the usage of various javadoc Tags.
	   * @param row This is the first parameter to spaces method.
	   * @param n This is the second parameter to spaces method.
	   * @return String This returns spaces string.
	   */
	
	public String spaces(int row, int n)  
	{
		if (row > n) {
			row = 2 * n - row;
		}
		
		String outputforspaces = "";
		for (int i = 0; i < n - row; i++)
		outputforspaces += ' ';
        return outputforspaces;
	}
	/**
	   * This method is used to print numbers string. This is
	   * a the simplest form of a class method, just to
	   * show the usage of various javadoc Tags.
	   * @param row This is the first paramter to numbers method.
	   * @param n This is the second parameter to numbers method.
	   * @return String This returns spaces numbers.
	   */
	public String numbers(int row, int n) { // Function to print numbers string

		if (row > n) {
			row = 2 * n - row;
		}
		
		String outputfornumber = "";
		for (char i = 0; i < (2 * row) - 1; i++) {
		int j = i + 1;
		if (i >= row)
		j = 2 * row - j;
        outputfornumber += j;
		}
        return outputfornumber;
	}
	 /**
	   * This method is used to draw DIMOND shap string. This is
	   * a the simplest form of a class method, just to
	   * show the usage of various javadoc Tags.
	   * The DRAW_DYMOND_FUNCTION method call the spaces,and numbers method.
	   * @param n This is the first paramter to DRAW_DYMOND_FUNCTION method.
	   * @return String This returns DIMOND shap string.
	   */

	    public String[] DRAW_DYMOND_FUNCTION(int n) { // Function to print pyramid
		String outputpyramid[] = new String[2 * n - 1];
		DRAW_DYMOND AS1 = new DRAW_DYMOND();
		for (int i = 0; i < 2 * n - 1; i++) {
		String spaces = AS1.spaces(i + 1, n); // Call the spaces print
													// function
		String numbers = AS1.numbers(i + 1, n); // Call the numbers print
													// function
			outputpyramid[i] = spaces + numbers;
		}
		return outputpyramid;
	}
	 /**
	   * This method is used to print DIMOND shap string. This is
	   * a the simplest form of a class method, just to
	   * show the usage of various javadoc Tags.
	   * The drawPyramid method call the DRAW_DYMOND_FUNCTION.
	   * @param n This is the first paramter to drawPyramid method.
	   */
	public void drawPyramid(int n) {
		String outputpyramid[] = new String[2 * n - 1];
		outputpyramid = DRAW_DYMOND_FUNCTION(n);
		for (int i = 0; i < (2 * n - 1); i++)
			System.out.println(outputpyramid[i]);
	}
	  /**
	   * This is the main method which makes use of drawPyramid method.
	   * @param args Unused.
	   * @return Nothing.
	   */
	public static void main(String arg[]) {
		DRAW_DYMOND AS1 = new DRAW_DYMOND();
		AS1.drawPyramid(5);
		
	}
}
