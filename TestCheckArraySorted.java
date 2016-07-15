package session1;

/** JUnit test case for CheckArraySorted class.
 * 
 * @author Pulkit Gupta
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestCheckArraySorted {

	CheckArraySorted checkArraySorted = new CheckArraySorted();

	@Test
	public void test() {
		int input1[] = { 1, 2, 3, 4, 5, 6 };
		int input2[] = { 6, 5, 4, 3, 2, 1 };
		int input3[] = { 1, 2, 3, 5, 4, 1 };
		assertEquals(1, checkArraySorted.checkOrder(input1));
		assertEquals(2, checkArraySorted.checkOrder(input2));
		assertEquals(3, checkArraySorted.checkOrder(input3));
	}

}
