package session3;

/**
 * This program is to sort a given array in ascending order.
 * @author Pulkit Gupta
 *
 */

public class QuickSortRecursion {
	
	/**This method is to partition the array of elements.
	 * 
	 * @param array this is an array of elements.
	 * @param start holds the index of the starting of array.
	 * @param end holds the index of the end of the array.
	 * @return a ascending ordered array.
	 */
	public int[] quickSort(int[] array, int start, int end) {
		if (start < end) {
			int partition = partition(array, start, end);
			quickSort(array, start, partition - 1);
			quickSort(array, partition, end);
		}
		return array;
	}

	/**This method is to sort the array according to ascending order. 
	 * 
	 * @param array this is an array of elements.
	 * @param left  holds the index of the starting of partition of array.
	 * @param right holds the index of the end of the array.
	 * @return the index of the partition.
	 */
	public static int partition(int[] array, int left, int right) {
		int pivot = array[left];
		while (left <= right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}
			if (left <= right) {
				/* swap code */
				int temporary = array[left];
				array[left] = array[right];
				array[right] = temporary;

				left++;
				right--;
			}
		}
		return left;
	}

}
