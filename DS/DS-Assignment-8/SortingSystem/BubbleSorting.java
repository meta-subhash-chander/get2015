package SortingSystem;
/****************************************************************************************
Name            : BubbleSorting
Revision Log    : 2015-09-04: Subhash chander : created.
                : 
                : 
Use             : This class is used to implement BubbleSorting method
                :
****************************************************************************************/
public class BubbleSorting {
	/**
	 * bubbleSortingMethod method :method to implement BubbleSorting method
	 * 
	 * @param : array: Array that sorted by method
	 * @return: array: sorted array
	 * */
	public int[] bubbleSortingMethod(int[] array) {
		int n = array.length;
		for (int i = 0; i < (n - 1); i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}
