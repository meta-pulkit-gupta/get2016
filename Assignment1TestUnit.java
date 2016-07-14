package session1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment1TestUnit {

	Assignment1 assignment1 = new Assignment1();
	
	@Test
	public void test() {
		
		assertEquals(65, assignment1.getOctalFromBinary(110101));
		assertEquals(7, assignment1.getOctalFromBinary(111));
		assertEquals(10, assignment1.getOctalFromBinary(1000));
		assertEquals(15, assignment1.getOctalFromBinary(1101));
	}

}
