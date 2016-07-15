package session1;

/** JUnit test case for BinaryToOctalConversion class.
 * 
 * @author Pulkit Gupta
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBinaryToOctalConversion {

	BinaryToOctalConversion binaryToOctalConversion = new BinaryToOctalConversion();

	@Test
	public void test() {

		assertEquals(65, binaryToOctalConversion.getOctalFromBinary(110101));
		assertEquals(7, binaryToOctalConversion.getOctalFromBinary(111));
		assertEquals(10, binaryToOctalConversion.getOctalFromBinary(1000));
		assertEquals(15, binaryToOctalConversion.getOctalFromBinary(1101));
	}

}
