/****************************************************************************************
Name            : CountingSortingTest
Revision Log    : 2015-09-04: Subhash chander : created.
                : 
                : 
Use             : This class is used to implement CountingSorting Test case method
                :
****************************************************************************************/
package SortingSystem;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CountingSortingTest {
	SortingSystem SortingSystemObject = new SortingSystem();

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
	public void CountingSortingWithPositiveNumberUnsortedArrayWhenCountingSortingPerformItGivePositiveNumberSortedArray() {
  int[] array = {1,33,22,55,99,66,44};
  int[] expecteds = {1,22,33,44,55,66,99};
  int maxElement = SortingSystemObject.MaxElementInArray(array);
  CountingSorting CountingSortingObject = new CountingSorting();
  int[]  actuals = CountingSortingObject.countingSortingMethod(array,maxElement);
  assertArrayEquals(expecteds, actuals);
  
	}
	@Test
	public void CountingSortingWithPositiveRepeatedNumberUnsortedArrayWhenCountingSortingPerformItGivePositiveRepeatedNumberSortedArray() {
		  int[] array = {11,22,33,1,2,3,11,22,33};
		  int[] expecteds = {1,2,3,11,11,22,22,33,33};
		  int maxElement = SortingSystemObject.MaxElementInArray(array);
		  CountingSorting CountingSortingObject = new CountingSorting();
		  int[]  actuals = CountingSortingObject.countingSortingMethod(array,maxElement);
		  assertArrayEquals(expecteds, actuals);
		  
			}
	@Test
	public void CountingSortingWithAllZeroIntoArrayWhenCountingSortingPerformItGiveAllZeroArray() {
		  int[] array = {0,0,0,0};
		  int[] expecteds = {0,0,0,0};
		  int maxElement = SortingSystemObject.MaxElementInArray(array);
		  CountingSorting CountingSortingObject = new CountingSorting();
		  int[]  actuals = CountingSortingObject.countingSortingMethod(array,maxElement);
		  assertArrayEquals(expecteds, actuals);
		  
			}

}
