package session1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment3TestUnit {
	
	Assignment3 assignment3 = new Assignment3();

	@Test
	public void test() {
		
		int[] input = new int[] { 1, 2, 3, 2, 3, 4, 5, 3, 4, 2, 2, 3, 4, 5, 6,
				7, 8, 1, 2, 4, 5, 6, 7, 8, 9};
		int expectedOutput[] = {1, 2, 4, 5, 6, 7, 8, 9 };
		assertArrayEquals(expectedOutput, assignment3.longestSequence(input));
	}

}
