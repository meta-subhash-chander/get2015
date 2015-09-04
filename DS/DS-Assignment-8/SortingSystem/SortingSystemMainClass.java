/****************************************************************************************
Name            : SortingSystemMainClass
Revision Log    : 2015-09-04: Subhash chander : created.
                : 
                : 
Use             : This class is used to implement hole sorting system
                :
 ****************************************************************************************/
package SortingSystem;
import java.util.Scanner;


public class SortingSystemMainClass {

	public static void main(String[] args) {
		SortingSystem SortingSystemObject = new SortingSystem();
		int numbersOfElementIntoArray;
		int array[];
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the number of element into array");
			while (!scan.hasNextInt()) {
				System.out.println("Enter the integer number");
				scan.next();
			}
			numbersOfElementIntoArray = scan.nextInt();
			array = new int[numbersOfElementIntoArray];
			System.out.println("Enter the element into array");
			for (int i = 0; i < numbersOfElementIntoArray; i++) {
				while (!scan.hasNextInt()) {
					System.out.println("Enter the integer element ");
					scan.next();
				}
				array[i] = scan.nextInt();

			}
			System.out.println("1:Enter 1 for Comparison Sort ");
			System.out.println("2:Enter 2 for Counting Sort");
			System.out.println("3:Exit");
			int choice;
			while (!scan.hasNextInt()) {
				System.out.println("Enter the integer number");
				scan.next();
			}
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				boolean sortingTypeForComparisonSort = SortingSystemObject
						.findSortingTypeForComparisonSort(numbersOfElementIntoArray);
				if (sortingTypeForComparisonSort) {
					// Bubble Sort
					System.out.println("Bubble Sort");
					BubbleSorting BubbleSortingObject = new BubbleSorting();
					array = BubbleSortingObject.bubbleSortingMethod(array);
					SortingSystemObject.printArray(array);
				} else {
					// Quick sort
					System.out.println("Quick Sort");
					QuickSorting QuickSortingObject = new QuickSorting();
					int start = 0, end = array.length - 1;
					array = QuickSortingObject.quickSortingMethod(array, start,
							end);
					SortingSystemObject.printArray(array);
				}
				break;
			case 2:
				int maxElement = SortingSystemObject.MaxElementInArray(array);
				boolean sortingTypeCountingSort = SortingSystemObject
						.findSortingTypeForCountingSort(maxElement);
				if (sortingTypeCountingSort) {
					// Counting Sort
					System.out.println("CountingSorting Sort");
					CountingSorting CountingSortingObject = new CountingSorting();
					array = CountingSortingObject.countingSortingMethod(array,
							maxElement);
					SortingSystemObject.printArray(array);
				} else {
					// Radix Sort
					System.out.println("Radix Sort");
					int NumberOfDigitInMaxElement = SortingSystemObject
							.NumberOfDigitINNumber(maxElement);
					RadixSorting RadixSortingObject = new RadixSorting();
					array = RadixSortingObject.radixSortingMethod(array,
							NumberOfDigitInMaxElement);
					SortingSystemObject.printArray(array);

				}
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Provide valid input");
				break;
			}
		}

	}

}
