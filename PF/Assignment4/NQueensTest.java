/*****************************************************************************
Name            : NQueensTest
Revision Log    : 2015-08-12: Subhash Chander : created.
Use             : This class is used to solve towerofhanoi problem.
                :
 ******************************************************************************/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NQueensTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	int check() {
		int N = 4;
		int n = 0;
		int[][] board = new int[N][N];
		int[][] expected = { { 0, 1, 0, 0 }, { 0, 0, 0, 1 }, { 1, 0, 0, 0 },
				{ 0, 0, 1, 0 } };
		NQueens object = new NQueens();
		object.solve(0, board, N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] == expected[i][j]) {
					n = 1;
				}

			}

		}
		return n;
	}

	@Test
	public void NQueensmethodTest() {
		NQueensTest nqt = new NQueensTest();
		assertEquals(1, nqt.check());
	}

}
