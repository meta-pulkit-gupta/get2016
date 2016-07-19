package session2;

/* This Test Unit is to test a upper triangle of n number.
 * @param - n for number of rows upper triangle have.
 * @spaces - spaces will have the expected spaces.
 * @numbers - numbers will have the expected numbers.
 * @upperTriangle - pyramid stores the whole upper triangle of n value.
 * 
 * @author Pulkit Gupta
 * @date   14/07/2016
 * 
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class TestDisplayUpperTriangle {

	DisplayUpperTriangle displayUpperTriangle = new DisplayUpperTriangle();
	int n = 5;
	String spaces[] = { "", " ", "  ", "   ", "    " };
	String numbers[] = { "12345", "1234", "123", "12", "1" };
	String upperTriangle[] = { "12345", " 1234", "  123", "   12", "    1" };

	// To test the spaces
	@Test
	public void testSpaces() {
		for (int i = 0; i < n; i++) {
			assertEquals(spaces[i], displayUpperTriangle.spaces(i, n));
		}
	}

	// To test the numbers
	@Test
	public void testNumbers() {
		for (int i = 0; i < n; i++) {
			assertEquals(numbers[i], displayUpperTriangle.numbers(i, n));
		}
	}

	// To test the pyramid.
	@Test
	public void testPyramid() {
		assertArrayEquals(upperTriangle, displayUpperTriangle.upperTriangle(n));
	}

}
