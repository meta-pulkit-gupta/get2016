package session8;

/**
 * JUnit Test Case for the implementation of the Bubble Sort
 * @author Pulkit Gupta
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBubbleSort {

	private static BubbleSort search;
	private int expected[];

	@Before
	public void setUp() {
		expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		search = new BubbleSort(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 });
		search.bubbleSort();
	}

	@Test
	public void testPerformBinarySearch() {
		assertArrayEquals(expected, search.getArray());
	}
}
