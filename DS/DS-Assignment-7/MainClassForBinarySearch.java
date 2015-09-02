import java.util.Scanner;


public class MainClassForBinarySearch {
	/**
	 * This is the main method which makes use of BinarySearch_function.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter the size of the array: ");
			int sizeOfArray = sc.nextInt();
			System.out.print("Enter an array of numbers: ");

			int[] sortedArray = new int[sizeOfArray];

			for (int i = 0; i <sizeOfArray; i++) {
				sortedArray[i] = sc.nextInt();
			}

			System.out.print("Enter the number you want to search: ");
			int searchNumber = sc.nextInt();

			
			BinarySearch bs = new BinarySearch();

			int index = bs.BinarySearch_function(sortedArray, 0, sortedArray.length-1,
					searchNumber);
			System.out.println("Found Number at " + index + " index");

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("invalid input");
		}
	}

}
