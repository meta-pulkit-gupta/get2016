package session3;

/**JUnit test case for FindingLargestDigit.
 * 
 * @author Pulkit Gupta
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFindingLargestDigit {

	FindingLargestDigit FindingLargestDigit = new FindingLargestDigit();

	@Test
	public void test() {
		assertEquals(9, FindingLargestDigit.largestDigit(1257369));
		assertEquals(2, FindingLargestDigit.largestDigit(2));
		assertEquals(4, FindingLargestDigit.largestDigit(444));
	}

}
