package session3;

/**JUnit test case for QuickSortRecursion.
 * 
 * @author Pulkit Gupta
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuickSortRecursion {
	QuickSortRecursion quickSort = new QuickSortRecursion();
	
	@Test
	public void test() {
		int array[] = new int[] {2,5,8,9,10, 77, 55, 11};
		int arrayExpected[] = new int[] {2,5,8,9,10, 11, 55, 77};
			assertArrayEquals(arrayExpected, quickSort.quickSort(array, 0, array.length - 1));
			
	}

}
