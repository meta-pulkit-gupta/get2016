package session1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment4TestUnit {

	Assignment4 assignment4 = new Assignment4();

	@Test
	public void test() {
		int input1[] = { 1, 2, 3, 4, 5, 6 };
		int input2[] = { 6, 5, 4, 3, 2, 1 };
		int input3[] = { 1, 2, 3, 5, 4, 1 };
		assertEquals( 1, assignment4.checkOrder(input1));
		assertEquals( 2, assignment4.checkOrder(input2));
		assertEquals( 3, assignment4.checkOrder(input3));
	}

}
