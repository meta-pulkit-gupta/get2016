package session3;

/**JUnit test case for GCDRecursion.
 * 
 * @author Pulkit Gupta
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGCDRecusion {

	GCDRecursion gcd = new GCDRecursion();

	@Test
	public void test() {
		assertEquals(1, gcd.gcd(100, 3));
		assertEquals(6, gcd.gcd(12, 18));
		assertEquals(1, gcd.gcd(2, 1));
	}

}
