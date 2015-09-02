import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest {

	
	BinarySearch binarySearch = new BinarySearch();	 
	
	@Test//positive test case
	public void binarySearchtest() {
		int array[] = {1,2,3,4,4,4,5,6,7};
		int expected = 3;
		int result = binarySearch.BinarySearch_function(array, 0, array.length-1, 4);  
		assertEquals(expected, result);
	}
	
	@Test//negative test case when array is empty
	public void binarySearchtestEmptyArray() {
		int array[] = {};
		int expected =-1;
		int result = binarySearch.BinarySearch_function(array, 0, array.length-1, 4); 
		assertEquals(expected, result);
	}
	
	@Test//positive test case
	public void binarySearchtestNegativeArray() {
		int array[] = {-8,-7,-6,-5,-5,-5,2,8,45};
		int expected = 3;
		int result = binarySearch.BinarySearch_function(array, 0, array.length-1, -5);  
		assertEquals(expected, result);	
	}
}
