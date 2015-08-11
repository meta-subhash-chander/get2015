import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest {

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
	/**Test for int BinarySearch_function(int[] arr, int fIndex,
	* int lIndex,int searchNumber) 
	* @param arr Input array.
    * @param 0 ,Start Index.
    * @param arry_length ,End index of array.
    * @param 88 T,The number you want to search
    * @return it return -1 because 88 not in arr.
	 */
	public void BinarySearchTest1() {
		int arr[]={2,5,8,9,10,55,77};
		 BinarySearch bs=new BinarySearch();
		assertEquals(-1,bs.BinarySearch_function(arr,0,arr.length,88));
	}
	@Test
	/**Test for int BinarySearch_function(int[] arr, int fIndex,
	* int lIndex,int searchNumber) 
	* @param arr Input array.
    * @param 0 ,Start Index.
    * @param arry_length ,End index of array.
    * @param 77 T,The number you want to search
    * @return it return 6.
	 */
	public void BinarySearchTest2() {
		int arr[]={2,5,8,9,10, 55, 77};
		 BinarySearch bs=new BinarySearch();
		assertEquals(6,bs.BinarySearch_function(arr, 0, arr.length, 77));
	}
	@Test
	/**Test for int BinarySearch_function(int[] arr, int fIndex,
	* int lIndex,int searchNumber) 
	* @param arr Input array.
    * @param 0 ,Start Index.
    * @param arry_length ,End index of array.
    * @param 4 T,The number you want to search
    * @return it return 0.
	 */
	public void BinarySearchTest3() {
		int arr[]={4,5,5,6,7,2,2,4};
		 BinarySearch bs=new BinarySearch();
		assertEquals(0,bs.BinarySearch_function(arr, 0, arr.length, 4));
	}
	
	@Test
	/**Test for int BinarySearch_function(int[] arr, int fIndex,
	* int lIndex,int searchNumber) 
	* @param arr Input array.
    * @param 0 ,Start Index.
    * @param arry_length ,End index of array.
    * @param 2 T,The number you want to search
    * @return it return 0.
	 */
	public void BinarySearchTest4() {
		int arr[]={2,2,2,2,2,};
		 BinarySearch bs=new BinarySearch();
		assertEquals(0,bs.BinarySearch_function(arr, 0, arr.length, 2));
	}
	
	@Test
	/**Test for int BinarySearch_function(int[] arr, int fIndex,
	* int lIndex,int searchNumber) 
	* @param arr Input array.
    * @param 0 ,Start Index.
    * @param arry_length ,End index of array.
    * @param 0 T,The number you want to search
    * @return it return 0.
	 */
	public void BinarySearchTest5() {
		int arr[]={0};
		 BinarySearch bs=new BinarySearch();
		assertEquals(0,bs.BinarySearch_function(arr, 0, arr.length, 0));
	}
 
 
}
