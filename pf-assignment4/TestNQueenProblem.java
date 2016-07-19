package session4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Pulkit Gupta
 * @Date 18/07/2016
 */
public class TestNQueenProblem {

	int index[]; // store index of queen for each row
	int result[][][]; // result store all the case that may be possible
	NQueenProblem nQueenProblem;

	@Before
	public void setUp() throws Exception {
		// fix the size of array
		index = new int[5];
		result = new int[5][5][5];
		nQueenProblem = new NQueenProblem();
	}

	@Test
	public void testQueen() {
		result = nQueenProblem.queen(1, 4, index, result);
		// index start from 1 instead of 0 so all the first element set to zero
		int[] test1 = result[0][1];
		int[] test2 = result[0][2];
		int[] test3 = result[0][3];
		int[] test4 = result[0][4];
		// compare to the one of the possible solution
		assertArrayEquals(new int[] { 0, 0, 1, 0, 0 }, test1);
		assertArrayEquals(new int[] { 0, 0, 0, 0, 1 }, test2);
		assertArrayEquals(new int[] { 0, 1, 0, 0, 0 }, test3);
		assertArrayEquals(new int[] { 0, 0, 0, 1, 0 }, test4);
	}

}
