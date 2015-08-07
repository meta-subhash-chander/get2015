public class ASSIGNMENT2 {

	public String spaces(int row, int n)// Function to print spaces string
	{
		String outputforspaces = "";

		for (int i = 0; i < row; i++)
			outputforspaces += ' ';

		return outputforspaces;

	}

	public String numbers(int row, int n)// Function to print numbers string
	{

		String outputfornumbers = "";

		for (char i = 0; i < n - row; i++) {
			int j = i + 1;

			outputfornumbers += j;

		}

		return outputfornumbers;

	}

	public String[] drawAssignment2(int n)// Function to print pyramid
	{

		String outputforpypamid[] = new String[2 * n - 1];

		ASSIGNMENT2 AS2 = new ASSIGNMENT2();
		for (int i = 0; i < 2 * n - 1; i++) {
			String space = AS2.spaces(i, n);
			String number = AS2.numbers(i, n);

			outputforpypamid[i] = space + number;

		}
		return outputforpypamid;

	}

	public static void main(String arg[]) {
		ASSIGNMENT2 AS2 = new ASSIGNMENT2();
		String outputforpyramid[] = AS2.drawAssignment2(5);
		for (int i = 0; i < 5; i++)
			System.out.println(outputforpyramid[i]);

	}

}
