package session8;
/**
 * JUnit Test Case for the implementation of the Counting Sort
 * @author Pulkit Gupta
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCountingSort {

	private static CountingSort search;
	private int expected[];

	@Before
	public void setUp() {
		expected = new int[] { 3, 7, 12, 15, 23, 36, 55, 65, 89 };
		search = new CountingSort(
				new int[] { 15, 89, 36, 12, 7, 55, 3, 65, 23 });
		search.countingSort();
	}

	@Test
	public void testPerformBinarySearch() {
		assertArrayEquals(expected, search.getArray());
	}
}
