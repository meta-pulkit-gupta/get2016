package session8;

/**
 * Counting sort algorithm of linear sorting to sort elements.
 * 
 * @author Pulkit Gupta
 *
 */
public class CountingSort {

	int array[]; // array of input.
	int max; // maximum element in the array.

	/**
	 * Initialize with the given input array.
	 * 
	 * @param array
	 *            input array
	 */
	public CountingSort(int array[]) {
		this.array = array;
	}

	/**
	 * Initialize with the given input array and max element.
	 * 
	 * @param array
	 *            input array
	 * @param max
	 *            maximum element of the given input array.
	 */
	public CountingSort(int array[], int max) {
		this.array = array;
		this.max = max;
	}

	/**
	 * Algorithm for counting sort.
	 */

	public void countingSort() {
		if (max == 0) {
			maxElement();
		}
		int[] key = new int[max + 1];
		int index = 0;
		System.out.println(key.length);
		for (int i = 0; i < array.length; i++) {
			key[array[i]]++;
		}

		for (int i = 0; i < key.length; i++) {
			for (int j = key[i]; j > 0; j--) {
				array[index++] = i;
			}
		}
	}

	/**
	 * Evaluating max element in the given array.
	 */
	public void maxElement() {
		int max = 0;
		for (int temp : array) {
			if (temp >= max) {
				max = temp;
			}
		}
		this.max = max + 1;
	}

	/**
	 * Get array of output.
	 * 
	 * @return
	 */
	public int[] getArray() {
		return array;
	}

}
