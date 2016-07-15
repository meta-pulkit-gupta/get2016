package session1;

/**JUnit test case for RemoveDuplicateFromArray.
 * 
 * @author Pulkit Gupta
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRemoveDuplicateFromArray {

	RemoveDuplicateFromArray removeDuplicateFromArray = new RemoveDuplicateFromArray();

	@Test
	public void test() {
		int input[] = { 2, 5, 4, 6, 3, 8, 5, 9, 3, 3, 6, 3, 9, 0 };
		int expected[] = { 2, 5, 4, 6, 3, 8, 9, 0 };
		assertArrayEquals(expected,
				removeDuplicateFromArray.removeDuplicate(input));
	}

}
