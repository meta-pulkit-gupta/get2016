package session1;

/* This program is to merge two sorted arrays.
 * 
 * @author Pulkit Gupta
 * @date   13/07/2016
 * 
 */

public class Assignment5 {

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
		//When one of them has no value remaining.
		while (i < a.length) {
			c[k++] = a[i++];
		}

		while (j < b.length) {
			c[k++] = b[j++];
		}

		return c;
	}
}
