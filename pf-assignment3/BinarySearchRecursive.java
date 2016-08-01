package session3;

/**
 * This program is to search a element in an array.
 * 
 * @author Pulkit Gupta
 * @date 15/07/2016
 *
 */
public class BinarySearchRecursive {

	/**
	 * This method is to search a element in an array by using the binary search
	 * recursively.
	 * 
	 * @param numberArray
	 *            integer type array of element out of which the element is to
	 *            be search.
	 * @param beg
	 *            integer type which store the beginning index.
	 * @param end
	 *            integer type which store the ending index of array.
	 * @param element
	 *            integer type which store the element that is to be searched in
	 *            the array.
	 * @return integer type value which indicates the index of the element in
	 *         the given array. returns -0 if element is not found in the given
	 *         array.
	 */

	public int binarySearch(int[] numberArray, int beg, int end, int element) {
		int mid = (beg + end) / 2;
		if (beg > end) {
			return -1;
		}
		if (numberArray[mid] == element) {
			return mid;
		} else if (numberArray[mid] < element) {
			return binarySearch(numberArray, mid + 1, end, element);
		} else {
			return binarySearch(numberArray, beg, end - 1, element);
		}

	}

	public static void main(String[] args) {
		BinarySearchRecursive binarySearchRecursive = new BinarySearchRecursive();
		int[] inputArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(binarySearchRecursive.binarySearch(inputArray, 0,
				inputArray.length, 8) + 1);

	}
}
