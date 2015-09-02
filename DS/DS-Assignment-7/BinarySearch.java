import java.util.Scanner;

/**
 * Java program to find element in array using Binary search recursive method.
 * At first this programe take integers array , fIndex,lIndex ,search number.
 * and give The position of the search item is at array index;
 * 
 * @author Subhash Chander
 */
public class BinarySearch {
	
	/**
	 * This method is used to find position of the search item is at array
	 * index.
	 * 
	 * @param arr
	 *           
	 * @param fIndex
	 * 
	 * @param lIndex
	 *          
	 * @param searchNumbe
	 * @return Return the position of the search item is at array index.
	 */
	int index=-1;
	public int BinarySearch_function(int[] sortedArray, int fIndex, int lIndex,
			int searchNumber) {

		if (fIndex <= lIndex) {
			
			int mid = (fIndex + lIndex) / 2;
			
			if (sortedArray[mid]==searchNumber) {
				index = mid;
				BinarySearch_function(sortedArray, fIndex, mid-1,
						searchNumber);

			} else if (searchNumber > sortedArray[mid]) {
				return BinarySearch_function(sortedArray, mid + 1, lIndex,
						searchNumber);

			} else {
					 BinarySearch_function(sortedArray, fIndex, mid-1,
							searchNumber);
					}
		}
		
		return index;
	}

	
}