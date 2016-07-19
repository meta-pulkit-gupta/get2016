package session2;

/* This Test Unit is to test a pyramid of n number.
 * @param - n for number of rows pyramid have.
 * @spaces - spaces will have the expected spaces.
 * @numbers - numbers will have the expected numbers.
 * @pyramid - pyramid stores the whole pyramid of n value.
 * 
 * @author Pulkit Gupta
 * @date   14/07/2016
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDisplayPyramidPattern {

	DisplayPyramidPattern displayPyramidPattern = new DisplayPyramidPattern();
	int n = 9;
	String spaces[] = { "    ", "   ", "  ", " ", "", " ", "  ", "   ", "    " };
	String numbers[] = { "1", "121", "12321", "1234321", "123454321",
			"1234321", "12321", "121", "1" };
	String pyramid[] = { "    1", "   121", "  12321", " 1234321", "123454321",
			" 1234321", "  12321", "   121", "    1" };

	// To test the spaces
	@Test
	public void testSpaces() {
		for (int i = 1; i <= n; i++) {
			assertEquals(spaces[i - 1], displayPyramidPattern.spaces(i, n));
		}
	}

	// To test the numbers
	@Test
	public void testNumbers() {
		for (int i = 1; i <= n; i++) {
			assertEquals(numbers[i - 1], displayPyramidPattern.numbers(i, n));
		}
	}

	// To test the pyramid.
	@Test
	public void testPyramid() {
		assertArrayEquals(pyramid, displayPyramidPattern.pyramid(n));
	}
}
