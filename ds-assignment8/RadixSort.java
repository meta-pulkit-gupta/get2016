package session8;

import session5.MyQueue;

/**
 * Radix sort to sort the given array of elements. assumption: No negative
 * element.
 * 
 * @author Pulkit Gupta
 *
 */
public class RadixSort {

	int array[]; // given input array.

	public RadixSort(int array[]) {
		this.array = array;
	}

	public int[] getArray() {
		return array;
	}

	/**
	 * place elements in data into order
	 *
	 * @param array
	 *            array of positive integer values
	 */
	public void radixSort() {
		boolean flag = true;
		int divisor = 1;
		@SuppressWarnings("unchecked")
		MyQueue<Integer>[] buckets = new MyQueue[10];
		for (int i = 0; i < 10; i++)
			buckets[i] = new MyQueue<Integer>();
		while (flag) {
			flag = false;
			// first copy the values into buckets
			for (int i = 0; i < array.length; i++) {
				int hashIndex = (array[i] / divisor) % 10;
				if (hashIndex > 0)
					flag = true;
				buckets[hashIndex].enqueue(new Integer(array[i]));
			}
			// then copy the values back into vector
			divisor *= 10;
			int i = 0;
			for (int j = 0; j < 10; j++) {
				while (!buckets[j].isEmpty()) {
					Integer ival = (Integer) buckets[j].dequeue();
					array[i++] = ival.intValue();
				}
			}
		}
	}
}
