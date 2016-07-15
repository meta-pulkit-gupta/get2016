package session1;

/**JUnit test case for MergeTwoSortedArrays.
 * 
 * @author Pulkit Gupta
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMergeTwoSortedArrays {

	MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();

	@Test
	public void test() {
		int input[] = { 1, 2, 4, 5, 7, 8 };
		int input2[] = { 3, 6, 9, 10, 11 };
		int actualOutput[] = new int[input.length + input2.length];
		int expectedOutput[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		assertArrayEquals(expectedOutput, mergeTwoSortedArrays.join(input,
				input.length, input2, input2.length, actualOutput));

	}

}
