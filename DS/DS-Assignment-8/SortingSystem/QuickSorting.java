package SortingSystem;
/****************************************************************************************
Name            : QuickSorting
Revision Log    : 2015-09-04: Subhash chander : created.
                : 
                : 
Use             : This class is used to implement QuickSorting method
                :
****************************************************************************************/
public class QuickSorting {
	/**
	 * swap method   :method use to swap element into array
	 * @param: array : Array to swap element
	 * @param: i     : position of element
	 * @param: j     : position of element
	 * */
	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	/**
	 * quickSortingMethod method :method to implement quickSortingMethod method
	 * 
	 * @param: array : Array that sorted by method
	 * @param: start : Start Index of array
	 * @param: end   : end Index of array
	 * @return: array: sorted array
	 * */
	int[] quickSortingMethod(int[] array, int start, int end) {

		if (end != -1) {
			if (start <= end)

			{
				int i = start;
				int j = end;
				int pivot = start;
				while (i < j) {
					while (array[i] <= array[pivot] && i < end) {
						i++;
					}
					while (array[j] > array[pivot] && j >= start) {
						j--;
					}
					if (i < j) {
						swap(array, i, j);
					}
				}
				swap(array, j, pivot);
				quickSortingMethod(array, start, j - 1);
				quickSortingMethod(array, j + 1, end);
			}

		}
		return array;
	}
}
