package session1;

/* This program is to merge two sorted arrays.
 * 
 * @author Pulkit Gupta
 * @date   13/07/2016
 * 
 */

public class MergeTwoSortedArrays {

	/**
	 * This method is to join two sorted arrays. Assumption the input arrays are
	 * sorted by default.
	 * 
	 * @param a
	 *            int array of first sorted array
	 * @param asize
	 *            int size of the a array
	 * @param b
	 *            int array of second sorted array
	 * @param bsize
	 *            int size of the b array
	 * @param c
	 *            int array which is the merged array of input arrays
	 * @return c int array gives the merged sorted array.
	 */

	public int[] join(int a[], int asize, int b[], int bsize, int c[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		// when both arrays have values remaining.
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}

		}
		// When one of them has no value remaining.
		while (i < a.length) {
			c[k++] = a[i++];
		}

		while (j < b.length) {
			c[k++] = b[j++];
		}

		return c;
	}
}
