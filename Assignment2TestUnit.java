package session1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment2TestUnit {

	Assignment2 assignment2 = new Assignment2();

	@Test
	public void test() {
		int input[] = { 2, 5, 4, 6, 3, 8, 5, 9, 3, 3, 6, 3, 9, 0 };
		int expected[] = { 2, 5, 4, 6, 3, 8, 9, 0 };
		assertArrayEquals(expected, assignment2.removeDuplicate(input));
	}

}
