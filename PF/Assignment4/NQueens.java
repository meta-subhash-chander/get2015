/*****************************************************************************
Name            : NQueens
Revision Log    : 2015-08-12: Subhash Chander : created.
Use             : This class is used to solve towerofhanoi problem.
                :
 ******************************************************************************/
import java.util.*;

public class NQueens {
	/**
	 * solve method take input row,bord and number of queen
	 * 
	 * @param: Integer source:row of array
	 * @param: Array for N queens
	 * @param: Integer temp:number of queen
	 * @return: boolean
	 */
	boolean solve(int row, int[][] board, int N) {
		if (row >= N) {
			return true;
		}
		for (int position = 0; position < N; position++) {
			if (isValid(board, row, position, N)) {
				board[row][position] = 1;
				if (!solve(row + 1, board, N)) {
					board[row][position] = 0;
				} else
					return true;
			}
		}
		return false;
	}

	/**
	 * isValid method take bord ,integet x,y and number of queen
	 * 
	 * @param: Integer source:row position of array
	 * @param: Integer source:colum position of array
	 * @param: Array for N queens
	 * @param: Integer temp:number of queen
	 * @return: boolean
	 */
	boolean isValid(int[][] board, int x, int y, int N) {
		int i, j;
		for (i = 0; i < x; i++) {
			if (board[i][y] == 1) {
				return false;
			}

		}

		i = x - 1;
		j = y - 1;
		while ((i >= 0) && (j >= 0)) {
			if (board[i--][j--] == 1) {
				return false;
			}
		}

		i = x - 1;
		j = y + 1;
		while ((i >= 0) && (j < N)) {
			if (board[i--][j++] == 1) {
				return false;
			}
		}

		return true;
	}

	/**
	 * This is the main method which makes use of solve function.
	 * 
	 * @param args
	 *            Unused.
	 * @return Nothing.
	 */

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of queens");
		NQueens object = new NQueens();
		int N = scan.nextInt();
		int[][] board = new int[N][N];
		object.solve(0, board, N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] == 1)
					System.out.print(" 1 ");
				else
					System.out.print(" 0 ");
			}
			System.out.println();
		}
		scan.close();
	}

}