import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LargestDigitTest {

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
	/**Test for int LargestDigit_found_function(int x) 
	 * @param x=2  
	 * @return 2 largest digit in intereg x .
	 */
	public void LargestDigitTest1() {
		LargestDigit ld =new LargestDigit(); 
		assertEquals(2,ld.LargestDigit_found_function(2));
		 
	}
	@Test
	/**Test for int LargestDigit_found_function(int x) 
	 * @param x=1257369  
	 * @return 9 largest digit in intereg x .
	 */
	public void LargestDigitTest2() {
		LargestDigit ld =new LargestDigit(); 
		assertEquals(9,ld.LargestDigit_found_function(1257369));
		 
	}
	@Test
	/**Test for int LargestDigit_found_function(int x) 
	 * @param x=444  
	 * @return 4 largest digit in intereg x .
	 */
	public void LargestDigitTest3() {
		LargestDigit ld =new LargestDigit(); 
		assertEquals(4,ld.LargestDigit_found_function(444));
		 
	}
	@Test
	/**Test for int LargestDigit_found_function(int x) 
	 * @param x=0  
	 * @return 0 largest digit in intereg x .
	 */
	public void LargestDigitTest4() {
		LargestDigit ld =new LargestDigit(); 
		assertEquals(0,ld.LargestDigit_found_function(0));
		 
	}
	@Test
	/**Test for int LargestDigit_found_function(int x) 
	 * @param x=111000  
	 * @return 1 largest digit in intereg x .
	 */
	public void LargestDigitTest5() {
		LargestDigit ld =new LargestDigit(); 
		assertEquals(1,ld.LargestDigit_found_function(111000));
		 
	}
}
