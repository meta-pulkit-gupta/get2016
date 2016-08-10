package session8;

/**
 * JUnit Test Case for the implementation of the Quick Sort
 * @author Pulkit Gupta
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestQuickSort {

	private static QuickSort search;
	private int expected[];

	@Before
	public void setUp() {
		expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		search = new QuickSort(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 });
		search.quickSort(0, 8);
	}

	@Test
	public void testPerformBinarySearch() {
		assertArrayEquals(expected, search.getArray());
	}
}
