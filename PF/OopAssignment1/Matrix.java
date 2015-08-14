/****************************************************************************************
Name            : Matrix
Revision Log    : 2015-08-13: Subhash Chander : created.
Use             : This class is used to take data into matrix,transpose matrix and show matrix
                :
 ****************************************************************************************/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrix {
	public int data[][];
	public int noRows;
	public int noCols;

	/**
	 * UserInput is a function which is use to calculate the length of an array
	 * 
	 * @return It return a length of an array
	 */
	private int UserInput() {
		int length;
		try {
			Scanner sc = new Scanner(System.in);

			length = sc.nextInt();
			if (length < 0) {
				System.out.println("length can't be negative");
				length = UserInput();
			}
			return length;
		} catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			length = UserInput();
			return length;
		}

	}

	/**
	 * UserInputInArray is a function which is use to insert the element in
	 * array
	 * 
	 * @param length
	 *            : it take length of array
	 * @return col: It return a length of an array
	 */
	public int[][] UserInputInArray(int length, int col) {

		int input[][] = new int[length][col];

		try {
			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < length; i++)
				for (int Col = 0; Col < col; Col++)

					input[i][Col] = sc.nextInt();
			return input;

		} catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			input = UserInputInArray(length, col);
			return input;
		}
	}

	public Matrix() {
	}

	public Matrix(int row, int col) {
		noRows = row;
		noCols = col;
		data = new int[row][col];
	}

	/**
	 * addElements is a function which is use to insert the element in array
	 * 
	 * @param row
	 *            : position of row
	 * @param col
	 *            : position of col
	 * @param val
	 *            : number thet inserted at row ,col position
	 */
	public void addElements(int row, int col, int val) {
		this.data[row][col] = val;

	}

	/**
	 * transposeis a function which is use to transpose the matrix
	 */
	public Matrix transpose() {
		Matrix Transpose = new Matrix(noCols, noRows);
		for (int row = 0; row < noCols; row++) {
			for (int col = 0; col < noRows; col++) {

				Transpose.addElements(row, col, data[col][row]);
			}
		}
		return Transpose;
	}

	/**
	 * show is a function which is use to show the element of array1
	 */
	public void show() {
		for (int row = 0; row < this.noRows; row++) {
			for (int col = 0; col < this.noCols; col++)
				System.out.print(this.data[row][col] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Matrix matrix = new Matrix();

		System.out.println("Enter the no of rows");
		matrix.noRows = matrix.UserInput();

		System.out.println("Enter the no of col");
		matrix.noCols = matrix.UserInput();

		System.out.println("Enter the no. in matrix");
		matrix.data = matrix.UserInputInArray(matrix.noRows, matrix.noCols);

		System.out.println("matrix is");
		matrix.show();

		System.out.println("Transpose of matrix is");
		Matrix m2 = matrix.transpose();
		m2.show();
	}

}
