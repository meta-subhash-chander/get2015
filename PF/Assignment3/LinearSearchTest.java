import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LinearSearchTest {

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
	/**Test for int LinearSearch_function(int[] arr, int fIndex,
	* int lIndex,int searchNumber) 
	* @param arr, Array that have element. 
    * @param 0 ,Start index
    * @param arry_length, End index
    * @param 88 ,Number for serch.
    * @return it return -1 because 88 not in arr.
	 */
	public void LinearSearchTest1() {
		int arr[]={2,5,8,9,10, 77, 55};
		LinearSearch access = new LinearSearch();
		assertEquals(-1,access.LinearSearch_function(arr, 0, arr.length, 88));
	}
	@Test
	/**Test for int LinearSearch_function(int[] arr, int fIndex,
	* int lIndex,int searchNumber) 
	* @param arr, Array that have element.
    * @param 0 ,Start index
    * @param arry_length, End index
    * @param 77 ,Number for serch.
    * @return it return 5.
	 */
	public void LinearSearchTest2() {
		int arr[]={2,5,8,9,10, 77, 55, 11};
		LinearSearch access = new LinearSearch();
		assertEquals(5,access.LinearSearch_function(arr, 0, arr.length, 77));
	}
	@Test
	/**Test for int LinearSearch_function(int[] arr, int fIndex,
	* int lIndex,int searchNumber) 
	* @param arr, Array that have element.
    * @param 0 ,Start index
    * @param arry_length, End index
    * @param 55 ,Number for serch.
    * @return it returnit -1 because 88 not in arr.
	 */
	public void LinearSearchTest3() {
		int arr[]={2,5,8,9,10, 77, 55};
		LinearSearch access = new LinearSearch();
		assertEquals(-1,access.LinearSearch_function(arr, 0, arr.length,-1));
	}
	@Test
	/**Test for int LinearSearch_function(int[] arr, int fIndex,
	* int lIndex,int searchNumber) 
	* @param arr, Array that have element.
    * @param 0 ,Start index
    * @param arry_length, End index
    * @param 0 ,Number for serch.
    * @return it return 0.
	 */
	public void LinearSearchTest4() {
		int arr[]={5,5,5,5,5,5,5};
		LinearSearch access = new LinearSearch();
		assertEquals(0,access.LinearSearch_function(arr, 0, arr.length, 5));

		}
	@Test
	/**Test for int LinearSearch_function(int[] arr, int fIndex,
	* int lIndex,int searchNumber) 
	* @param arr, Array that have element.
    * @param 0 ,Start index.
    * @param arry_length ,End index.
    * @param 0 ,Number for serch.
    * @return it return 0.
	 */
	public void LinearSearchTest5() {
		int arr[]={0};
		LinearSearch access = new LinearSearch();
		assertEquals(0,access.LinearSearch_function(arr, 0, arr.length, 0));

		}
	 

}
