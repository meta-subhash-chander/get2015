public class ASSIGNMENT1 {
	
	
	public String spaces(int row, int n) // Function to print spaces string
	{
		if (row > n) {
			row = 2 * n - row;
		}
		String outputforspaces = "";

		for (int i = 0; i < n - row; i++)
			outputforspaces += ' ';

		return outputforspaces;
	}

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
	* This is used to get the RSS data 
	* @param channel The channel
	* @return The RSS data
	*/
	public String[] drawASSIGNMENT1(int n) { // Function to print pyramid
		String outputpyramid[] = new String[2 * n - 1];
		ASSIGNMENT1 AS1 = new ASSIGNMENT1();
		for (int i = 0; i < 2 * n - 1; i++) {
			String spaces = AS1.spaces(i + 1, n); // Call the spaces print
													// function
			String numbers = AS1.numbers(i + 1, n); // Call the numbers print
													// function
			outputpyramid[i] = spaces + numbers;
		}
		return outputpyramid;
	}

	public static void main(String arg[]) {

		ASSIGNMENT1 AS1 = new ASSIGNMENT1();
		String outputaspyramid[] = AS1.drawASSIGNMENT1(5);
		for (int i = 0; i < 9; i++)
			System.out.println(outputaspyramid[i]);
	}
}
