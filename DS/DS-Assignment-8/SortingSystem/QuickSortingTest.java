/****************************************************************************************
Name            : QuickSortingTest
Revision Log    : 2015-09-04: Subhash chander : created.
                : 
                : 
Use             : This class is used to implement QuickSorting Test case method
                :
****************************************************************************************/
package SortingSystem;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class QuickSortingTest {

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
	public void QuickSortingWithPositiveNumberUnsortedArrayWhenQuickSortingPerformItGivePositiveNumberSortedArray() {
  int[] array = {1,2,9,4,6,3,5,8,7,13,11};
  int[] expecteds = {1,2,3,4,5,6,7,8,9,11,13};
  int start = 0;
  int end = array.length-1;
  QuickSorting QuickSortingObject = new QuickSorting();
  int[]  actuals = QuickSortingObject.quickSortingMethod(array,start,end);
  assertArrayEquals(expecteds, actuals);
  
	}
	@Test
	public void QuickSortingWithPositiveEmptyArrayWhenQuickSortingPerformItGiveEmptyArray() {
		  int[] array = {};
		  int[] expecteds = {};
		  int start = 0;
		  int end = array.length-1;
		  QuickSorting QuickSortingObject = new QuickSorting();
		  int[]  actuals = QuickSortingObject.quickSortingMethod(array,start,end);
		  assertArrayEquals(expecteds, actuals);
		  
			}
	@Test
	public void QuickSortingWithPositiveRepeatedNumberUnsortedArrayWhenQuickSortingPerformItGivePositiveRepeatedNumberSortedArray() {
		  int[] array = {1,2,3,1,2,3,1,2,3,4,9,6,6};
		  int[] expecteds = {1,1,1,2,2,2,3,3,3,4,6,6,9};
		  int start = 0;
		  int end = array.length-1;
		  QuickSorting QuickSortingObject = new QuickSorting();
		  int[]  actuals = QuickSortingObject.quickSortingMethod(array,start,end);
		  assertArrayEquals(expecteds, actuals);
		  
			}
	@Test
	public void QuickSortingWithPositiveNumberAndNegativeNumberUnsortedArrayWhenQuickSortingPerformItGivePositiveNumberAndNegativeNumberSortedArray() {
		  int[] array = {4,9,12,15,1,2,3,-1,-2,-3,1,2,3};
		  int[] expecteds = {-3,-2,-1,1,1,2,2,3,3,4,9,12,15};
		  int start = 0;
		  int end = array.length-1;
		  QuickSorting QuickSortingObject = new QuickSorting();
		  int[]  actuals = QuickSortingObject.quickSortingMethod(array,start,end);
		  assertArrayEquals(expecteds, actuals);
		  
			}
	@Test
	public void QuickSortingWithAllZeroIntoArrayWhenQuickSortingPerformItGiveAllZeroArray() {
		  int[] array = {0,0,0,0};
		  int[] expecteds = {0,0,0,0};
		  int start = 0;
		  int end = array.length-1;
		  QuickSorting QuickSortingObject = new QuickSorting();
		  int[]  actuals = QuickSortingObject.quickSortingMethod(array,start,end);
		  assertArrayEquals(expecteds, actuals);
		  
			}
	
	@Test
	public void QuickSortingWithNegativeNumberAndRepeatedNumberUnsortedArrayWhenQuickSortingPerformItGiveNegativeNumberAndRepeatedNumberSortedArray() {
		  int[] array = {-55,-60,-5,-1,-9,-3,-7,-6,-4,-5,-11,-40};
		  int[] expecteds = {-60,-55,-40,-11,-9,-7,-6,-5,-5,-4,-3,-1};
		  int start = 0;
		  int end = array.length-1;
		  QuickSorting QuickSortingObject = new QuickSorting();
		  int[]  actuals = QuickSortingObject.quickSortingMethod(array,start,end);
		  assertArrayEquals(expecteds, actuals);
		  
			}

}
