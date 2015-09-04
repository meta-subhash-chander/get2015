package SortingSystem;
/****************************************************************************************
Name            : RadixSort
Revision Log    : 2015-09-04: Subhash chander : created.
                : 
                : 
Use             : This class is used to implement RadixSort method
                :
 ****************************************************************************************/

import java.util.*;

public class RadixSorting {

	int position = 1;
	/**
	 * radixSortingMethod method    :method to implement radixSortingMethod method
	 * @param: array                : Array that sorted by method
	 * @param: maximumNumberOfDigit :  maximumNumberOfDigit element of array
	 * @return: array               : sorted array
	 * */
	int[] radixSortingMethod(int array[], int maximumNumberOfDigit) {
		HashMap<Integer, ArrayList<Integer>> hashmap = new HashMap<Integer, ArrayList<Integer>>();
		int count = 0;
		for (int i = 0; i < array.length; i++) {

			int digit = returnDigitAtPosition(array[i], position);

			if (!hashmap.containsKey(digit)) {
				ArrayList<Integer> arraylist = new ArrayList<Integer>();
				hashmap.put(digit, arraylist);
			}
			hashmap.get(digit).add(array[i]);
		}
		for (int key = 0; key < 10; key++) {
			if (hashmap.containsKey(key)) {
				Iterator<Integer> iterator = hashmap.get(key).iterator();
				while (iterator.hasNext()) {
					array[count++] = (int) iterator.next();
				}
			}
		}
		position++;

		if (maximumNumberOfDigit > 0) {
			radixSortingMethod(array, maximumNumberOfDigit - 1);
		}
		return array;

	}
	/**
	 * returnDigitAtPosition method   :method use toreturnDigitAtPosition
	 * @param: number                 :number
	 * @param: positionFromRight      : digit position from right
	 * @return:  digit                : digit from number
	 * */
	int returnDigitAtPosition(int number, int positionFromRight) {

		int digit = 0;
		while (positionFromRight > 0) {
			digit = number % 10;
			number = number / 10;
			positionFromRight--;
		}
		return digit;

	}
}