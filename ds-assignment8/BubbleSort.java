package session8;

/**
 * Bubble sorting algorithm
 * 
 * @author Pulkit Gupta
 *
 */
public class BubbleSort {

	int array[]; // array to store elements.

	/**
	 * Initialize array with the given input array.
	 * 
	 * @param array
	 *            input taken from user.
	 */
	public BubbleSort(int array[]) {
		this.array = array;
	}
	
	public int[] getArray() {
		return array;
	}

	/**
	 * Method to bubblesort the array of elements given.
	 */
	public void bubbleSort() {
		int length = array.length;
		int temp = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 1; j < (length - i); j++) {
				if (array[j - 1] > array[j]) {
					// swaping of elements.
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
