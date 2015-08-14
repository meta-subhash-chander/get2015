/****************************************************************************************
Name            : MatrixTest
Revision Log    : 2015-08-13: Subhash Chander : created.
Use             : This class is used to test the function like take data into matrix,
                : transpose matrix and show matrix
                :
 ****************************************************************************************/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MatrixTest {

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

	@Test
	public void matrixAddFunctionTest() {
		 MatrixTest mt=new  MatrixTest();
		 int  l= mt.addFunctionTest();
	 
		assertEquals(1,l);
	  ;
}
	 
	 
	private int addFunctionTest( ) 
	{ 
	 Matrix Matrix = new Matrix(2,2);
	 Matrix.addElements(0,0,1);
	 Matrix.addElements(0,1,1);
	 Matrix.addElements(1,0,2);
	 Matrix.addElements(1,1,2);
	int l=1;
	int Expected[][]={{1,1},{2,2}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(Expected[i][j]!=Matrix.data[i][j])
				{
					l=0;
					 return l;
				}
				
			}
		}
		return l;
	}
	 
	
		 
		
	}
