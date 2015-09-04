package SortingSystem;
/****************************************************************************************
Name            : SortingSystem
Revision Log    : 2015-09-04: Subhash chander : created.
                : 
                : 
Use             : This class is used to implement method  that use into soting 
                :
 ****************************************************************************************/

public class SortingSystem {
	/**
	 * findSortingTypeForfindSortingTypeForComparisonSort method   :method use to find sorting type
	 * from find Sorting Type For ComparisonSort method
	 * @param : numbersOfElementIntoArray : Number of element into array
	 * @return: True or false
	 * */
	boolean findSortingTypeForComparisonSort(int numbersOfElementIntoArray) {
		boolean temp;
		if (numbersOfElementIntoArray <= 10) {
			temp = true;
		} else {
			temp = false;
		}
		return temp;
	}
	/**
	 * findSortingTypeForCountingSort method   :method use to find sorting type
	 * from find Sorting Type For CountingSort method
	 * @param : maxElement : Maximum element into array
	 * @return: True or false
	 * */
	boolean findSortingTypeForCountingSort(int maxElement) {
		boolean temp;
		if (maxElement < 100) {
			temp = true;
		} else {
			temp = false;
		}
		return temp;
	}
	/**
	 * printArray method   :method use to print array
	 * @param : array      : array to print
	 * */
	void printArray(int[] array) {
		int n = array.length;
		System.out.print("sorted array");
		for (int i = 0; i <= n - 1; i++) {
			System.out.print("---> " + array[i]);
		}
		System.out.println();

	}
	/**
	 * MaxElementInArray method   :find max element into array
	 * @param : array             : array to find max element 
	 * @return maxElement         : maxElement FROM array
	 * */
	int MaxElementInArray(int[] array) {
		int maxElement = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxElement) {
				maxElement = array[i];
			}
		}
		return maxElement;
	}
	/**
	 * NumberOfDigitINNumber method   :find the digit into element
	 * @param : Number                : number to find digit
	 * @return numberOfDigit          :number of digit into Number
	 * */

	int NumberOfDigitINNumber(int Number) {
		int numberOfDigit = 0;
		while (Number > 0) {
			numberOfDigit++;
			Number /= 10;
		}
		return numberOfDigit;

	}

}
