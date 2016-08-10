package session8;

/**
 * JUnit Test Case for the implementation of the Radix Sort
 * @author Pulkit Gupta
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRadixSort {

	private RadixSort search;
	private int expected[];

	@Before
	public void setUp() {
		expected = new int[] { 0, 1, 15, 35, 45, 74, 98, 123, 236, 741 };
		search = new RadixSort(new int[] { 15, 98, 741, 236, 45, 1, 35, 0, 74,
				123 });
		search.radixSort();
	}

	@Test
	public void testPerformBinarySearch() {
		assertArrayEquals(expected, search.getArray());
	}

}
