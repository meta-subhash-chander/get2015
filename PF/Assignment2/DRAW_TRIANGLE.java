/**
* The DRAW_TRIANGLE program implements an application that
* simply displays triangle shap array  to the standard output
* @author  subhash chander
*/
public class DRAW_TRIANGLE {
	 /**
	   * This method is used to print spaces string. This is
	   * a the simplest form of a class method, just to
	   * show the usage of various javadoc Tags.
	   * @param row This is the first paramter to spaces method.
	   * @param n This is the second parameter to spaces method.
	   * @return String This returns spaces string.
	   */
   public String spaces(int row, int n)// Function to print spaces string
	{
		String outputforspaces = "";
        for (int i = 0; i < row; i++)
		outputforspaces += ' ';

		return outputforspaces;}
   /**
    * This method is used to print numbers string. This is
    * a the simplest form of a class method, just to
    * show the usage of various javadoc Tags.
    * @param row This is the first paramter to numbers method.
    * @param n This is the second parameter to numbers method.
    * @return String This returns spaces numbers.
    */
   public String numbers(int row, int n)// Function to print numbers string
	{
       String outputfornumbers = "";
        for (char i = 0; i < n - row; i++) {
			int j = i + 1;
            outputfornumbers += j;
      }
    return outputfornumbers;}
   /**
    * This method is used to draw triangle shap string. This is
    * a the simplest form of a class method, just to
    * show the usage of various javadoc Tags.
    * The DRAW_TRIANGLE_FUNCTION method call the spaces,and numbers method.
    * @param n This is the first paramter to DRAW_TRIANGLE_FUNCTION method.
    * @return String This returns TRIANGLE shap string.
    */
	public String[] DRAW_TRIANGLE_FUNCTION(int n)// Function to print pyramid
	{

		String outputforpypamid[] = new String[2 * n - 1];

		DRAW_TRIANGLE AS2 = new DRAW_TRIANGLE();
		for (int i = 0; i < 2 * n - 1; i++) {
			String space = AS2.spaces(i, n);
			String number = AS2.numbers(i, n);
			outputforpypamid[i] = space + number;
      }
		return outputforpypamid;}
	 /**
	   * This method is used to print triangle shap string. This is
	   * a the simplest form of a class method, just to
	   * show the usage of various javadoc Tags.
	   * The drawPyramid method call DRAW_TRIANGLE_FUNCTION  .
	   * @param n This is the first paramter to drawPyramid method.
	   * @return String This returns TRIANGLE shap string.
	   */
	public void drawPyramid(int n) {
		String outputpyramid[] = new String[2 * n - 1];
		outputpyramid = DRAW_TRIANGLE_FUNCTION(n);
		for (int i = 0; i < (2 * n - 1); i++)
			System.out.println(outputpyramid[i]);
	}
	 /**
	   * This is the main method which makes use of drawPyramid method.
	   * @param args Unused.
	   * @return Nothing.
	   */
	public static void main(String arg[]) {
		DRAW_TRIANGLE AS2 = new DRAW_TRIANGLE();
		 AS2.drawPyramid(5);
	}

}
