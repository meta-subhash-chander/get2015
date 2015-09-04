/****************************************************************************************
Name            : BubbleSortingTest
Revision Log    : 2015-09-04: Subhash chander : created.
                : 
                : 
Use             : This class is used to implement BubbleSorting Test case method
                :
****************************************************************************************/
package SortingSystem;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BubbleSortingTest {

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
	public void bubbleSortingWithPositiveNumberUnsortedArrayWhenBubbleSortingPerformItGivePositiveNumberSortedArray() {
  int[] array = {1,2,9,4,6,3,5,8,7};
  int[] expecteds = {1,2,3,4,5,6,7,8,9};
  BubbleSorting BubbleSortingObject = new BubbleSorting();
  int[]  actuals = BubbleSortingObject.bubbleSortingMethod(array);
  assertArrayEquals(expecteds, actuals);
  
	}
	@Test
	public void bubbleSortingWithPositiveEmptyArrayWhenBubbleSortingPerformItGiveEmptyArray() {
		  int[] array = {};
		  int[] expecteds = {};
		  BubbleSorting BubbleSortingObject = new BubbleSorting();
		  int[]  actuals = BubbleSortingObject.bubbleSortingMethod(array);
		  assertArrayEquals(expecteds, actuals);
		  
			}
	@Test
	public void bubbleSortingWithPositiveRepeatedNumberUnsortedArrayWhenBubbleSortingPerformItGivePositiveRepeatedNumberSortedArray() {
		  int[] array = {1,2,3,1,2,3,1,2,3};
		  int[] expecteds = {1,1,1,2,2,2,3,3,3};
		  BubbleSorting BubbleSortingObject = new BubbleSorting();
		  int[]  actuals = BubbleSortingObject.bubbleSortingMethod(array);
		  assertArrayEquals(expecteds, actuals);
		  
			}
	@Test
	public void bubbleSortingWithPositiveNumberAndNegativeNumberUnsortedArrayWhenBubbleSortingPerformItGivePositiveNumberAndNegativeNumberSortedArray() {
		  int[] array = {1,2,3,-1,-2,-3,1,2,3};
		  int[] expecteds = {-3,-2,-1,1,1,2,2,3,3};
		  BubbleSorting BubbleSortingObject = new BubbleSorting();
		  int[]  actuals = BubbleSortingObject.bubbleSortingMethod(array);
		  assertArrayEquals(expecteds, actuals);
		  
			}
	@Test
	public void bubbleSortingWithAllZeroIntoArrayWhenBubbleSortingPerformItGiveAllZeroArray() {
		  int[] array = {0,0,0,0};
		  int[] expecteds = {0,0,0,0};
		  BubbleSorting BubbleSortingObject = new BubbleSorting();
		  int[]  actuals = BubbleSortingObject.bubbleSortingMethod(array);
		  assertArrayEquals(expecteds, actuals);
		  
			}
	
	@Test
	public void bubbleSortingWithNegativeNumberAndRepeatedNumberUnsortedArrayWhenBubbleSortingPerformItGiveNegativeNumberAndRepeatedNumberSortedArray() {
		  int[] array = {-5,-1,-9,-3,-7,-6,-4,-5};
		  int[] expecteds = {-9,-7,-6,-5,-5,-4,-3,-1};
		  BubbleSorting BubbleSortingObject = new BubbleSorting();
		  int[]  actuals = BubbleSortingObject.bubbleSortingMethod(array);
		  assertArrayEquals(expecteds, actuals);
		  
			}

}
