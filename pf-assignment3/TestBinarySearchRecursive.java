package session3;

/**JUnit test case for BinarySearchRecursion.
 * 
 * @author Pulkit Gupta
 */

import org.junit.Test;

public class TestBinarySearchRecursive {

	BinarySearchRecursive binarySearch = new BinarySearchRecursive();

	@Test
	public void test() {
		binarySearch.binarySearch(new int[] { 2, 5, 8, 9, 10, 55, 77 }, 0, 6,
				88);
		binarySearch.binarySearch(new int[] { 2, 5, 8, 9, 10, 55, 77 }, 0, 6,
				77);
	}

}
