 /**
   * Java program to find element in array 
   * using linear search recursive method.
   * At first this programe take  integers array , fIndex,lIndex ,search number.
   * and give The position of the search item is at array index; 
   * @author Subhash Chander
   */
 
import java.util.Scanner;
/**
 * This method is used to find position of the search item is at array index.  
 * @param arr This is the first parameter to LinearSearch_function.
 * @param fIndex This is the second parameter to LinearSearch_function.
 * @param lIndex This is the thred parameter to LinearSearch_function.
 * @param searchNumbe This is the fourth parameter to LinearSearch_function.
 * @return Return the position of the search item is at array index.
 */
public class LinearSearch {
	public int LinearSearch_function(int[] arr, int fIndex, int lIndex,
			int searchNumber) {
		if (fIndex == lIndex) {
			return -1;
		} else {
			if (arr[fIndex] == searchNumber) {
				return fIndex;
			} else {
				return LinearSearch_function(arr, fIndex + 1, lIndex,
						searchNumber);
			}
		}
	}
	/**
	 * This is the main method which makes use of LinearSearch_function.
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
		LinearSearch access = new LinearSearch();
		System.out.print("The position of the search item is at array index ");
		System.out.print(access.LinearSearch_function(arr, 0, arr.length,
				searchNumber));
	}
}
