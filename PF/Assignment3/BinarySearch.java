import java.util.Scanner;
/**
 * Java program to find element in array 
 * using Binary search recursive method.
 * At first this programe take  integers array , fIndex,lIndex ,search number.
 * and give The position of the search item is at array index; 
 * @author Subhash Chander
 */
public class BinarySearch {
	/**
	 * This method is used to find position of the search item is at array index.  
	 * @param arr This is the first parameter to BinarySearch_function.
	 * @param fIndex This is the second parameter to BinarySearch_function.
	 * @param lIndex This is the thred parameter to BinarySearch_function.
	 * @param searchNumbe This is the fourth parameter to BinarySearch_function.
	 * @return Return the position of the search item is at array index.
	 */

	public int BinarySearch_function(int[] sortedArray, int fIndex, int lIndex,
			int searchNumber) {

		if (fIndex < lIndex) {
			int mid = (fIndex + fIndex )/ 2;
			if (searchNumber < sortedArray[mid]) {
				return BinarySearch_function(sortedArray, fIndex, mid,
						searchNumber);

			} else if (searchNumber > sortedArray[mid]) {
				return BinarySearch_function(sortedArray, mid + 1, lIndex,
						searchNumber);

			} else {
				return mid;
			}
		}
		return -1;
	}
	/**
	 * This is the main method which makes use of BinarySearch_function.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		System.out.print("Enter an array of numbers: ");

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the number you want to search: ");
		int searchNumber = sc.nextInt();

		sc.close();
		BinarySearch bs = new BinarySearch();

		int index = bs.BinarySearch_function(arr, 0, arr.length, searchNumber);
		System.out.println("Found Number at " + index + " index");

	}
}