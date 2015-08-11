import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GcdTest {

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
	/**Test for int GcdFunction(int x,int y) 
	 * @param x=2  
	 * @param y=1 
	 * @return 1 Gcd of x and y.
	 */
	public void GcdTest1() {
		Gcd Gcd1 =new Gcd();
		assertEquals(1,Gcd1.GcdFunction(2,1));
		 
	}
	@Test
	/**Test for int GcdFunction(int x,int y) 
	 * @param x=12  
	 * @param y=81  
	 * @return 6 Gcd of x and y.
	 */
	public void GcdTest2() {
		Gcd Gcd1 =new Gcd();
		assertEquals(6,Gcd1.GcdFunction(12,18));
		 
	}
	@Test
	/**Test for int GcdFunction(int x,int y) 
	 * @param x=100  
	 * @param y=3  
	 * @return 1 Gcd of x and y.
	 */
	public void GcdTest3() {
		Gcd Gcd1 =new Gcd();
		assertEquals(1,Gcd1.GcdFunction(100,3));
		 
	}
	@Test
	/**Test for int GcdFunction(int x,int y) 
	 * @param x=0  
	 * @param y=0  
	 * @return 0 Gcd of x and y.
	 */
	public void GcdTest4() {
		Gcd Gcd1 =new Gcd();
		assertEquals(0,Gcd1.GcdFunction(0,0));

	}
	@Test
	/**Test for int GcdFunction(int x,int y) 
	 * @param x=4  
	 * @param y=4  
	 * @return 4 Gcd of x and y.
	 */
	public void GcdTest5() {
		Gcd Gcd1 =new Gcd();
		assertEquals(4,Gcd1.GcdFunction(4,4));

	}
}
