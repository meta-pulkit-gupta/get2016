package session1;

/**JUnit test case for LongestIncreasingSequence.
 * 
 * @author Pulkit Gupta
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLongestIncreasingSequence {

	LongestIncreasingSequence longestIncreasingSequence = new LongestIncreasingSequence();

	@Test
	public void test() {

		int[] input = new int[] { 1, 2, 3, 2, 3, 4, 5, 3, 4, 2, 2, 3, 4, 5, 6,
				7, 8, 1, 2, 4, 5, 6, 7, 8, 9 };
		int expectedOutput[] = { 1, 2, 4, 5, 6, 7, 8, 9 };
		assertArrayEquals(expectedOutput,
				longestIncreasingSequence.longestSequence(input));
	}

}
