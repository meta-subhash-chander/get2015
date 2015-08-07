package assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FCFSTest {

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
	public int isArrayEqual(int expected[][], int output[][])
	{
		int result=1;
		int col=expected[0].length;
		int row=expected.length;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(expected[i][j]!=output[i][j])
					result=0;
			}
		}
		return result;
	}

	@Test
	public void test() {
		FCFS obj=new FCFS();
		FCFSTest obj1=new FCFSTest();
		int[] arrival={1,5,9,25};
		int[] job_size={12,7,2,5};
		int n=4;
		
		int[][] output=obj.fcfc(arrival,job_size,n);
		int[][] expected={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		
		assertEquals(1,obj1.isArrayEqual(expected,output));
	}

}
