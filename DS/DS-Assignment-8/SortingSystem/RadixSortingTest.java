/****************************************************************************************
Name            : RadixSortingTest
Revision Log    : 2015-09-04: Subhash chander : created.
                : 
                : 
Use             : This class is used to implement RadixSorting Test   case method
                :
****************************************************************************************/
package SortingSystem;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RadixSortingTest {
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
	public void RadixSortingWithPositiveNumberUnsortedArrayWhenRadixSortingPerformItGivePositiveNumberSortedArray() {
  int[] array = {13,12,456,15,8,654,54,1};
  int[] expecteds = {1,8,12,13,15,54,456,654};
  int maxElement = SortingSystemObject.MaxElementInArray(array);
  RadixSorting RadixSortingObject = new RadixSorting();
  int[]  actuals = RadixSortingObject.radixSortingMethod(array,maxElement);
  assertArrayEquals(expecteds, actuals);
  
	}
	@Test
	public void RadixSortingWithPositiveRepeatedNumberUnsortedArrayWhenRadixSortingPerformItGivePositiveRepeatedNumberSortedArray() {
		  int[] array = {12,122,952,651,156,354,354,};
		  int[] expecteds = {12,122,156,354,354,651,952};
		  int maxElement = SortingSystemObject.MaxElementInArray(array);
		  RadixSorting RadixSortingObject = new RadixSorting();
		  int[]  actuals = RadixSortingObject.radixSortingMethod(array,maxElement);
		  assertArrayEquals(expecteds, actuals);
		  
			}
	@Test
	public void RadixSortingWithAllZeroIntoArrayWhenRadixSortingPerformItGiveAllZeroArray() {
		  int[] array = {0,0,0,0};
		  int[] expecteds = {0,0,0,0};
		  int maxElement = SortingSystemObject.MaxElementInArray(array);
		  RadixSorting RadixSortingObject = new RadixSorting();
		  int[]  actuals = RadixSortingObject.radixSortingMethod(array,maxElement);
		  assertArrayEquals(expecteds, actuals);
		  
			}

}
