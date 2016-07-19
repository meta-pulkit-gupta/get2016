package session3;
/**JUnit test case for FindingRemainderRecursion.
 * 
 * @author Pulkit Gupta
 */


import static org.junit.Assert.*;

import org.junit.Test;

public class TestFindingRemainderRecursion {

	FindingRemainderRecursion remainder = new FindingRemainderRecursion();

	@Test
	public void test() {

		assertEquals(1, remainder.rem(100, 3));
		assertEquals(-1, remainder.rem(2, 0));
		assertEquals(1, remainder.rem(2, 1));
	}

}
