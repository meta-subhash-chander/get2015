package SortingSystem;
/****************************************************************************************
Name            : CountingSorting
Revision Log    : 2015-09-04: Subhash chander : created.
                : 
                : 
Use             : This class is used to implement BubbleSorting method
                :
****************************************************************************************/
public class CountingSorting {
	/**
	 * quickSortingMethod method :method to implement quickSortingMethod method
	 * 
	 * @param: array : Array that sorted by method
	 * @param: maxElement : Max size element of array
	 * @return: array: sorted array
	 * */
	public int[] countingSortingMethod(int[] array , int maxElement) {
		int [] counting = new int[maxElement+1];
		for(int i = 0; i<array.length;i++) {
			counting[array[i]]++;
		}
		int k = 0;
		for(int i = 0;i<=maxElement;i++){
			while(counting[i]!=0){
				array[k]=i;
				counting[i]--;
				k++;
			}
		}
		return array;
		
	}
}
