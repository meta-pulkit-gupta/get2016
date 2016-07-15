package session1;

/**JUnit test case for SimulateFCFS.
 * 
 * @author Pulkit Gupta
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSimulateFCFS {

	SimulateFCFS simulateFCFS = new SimulateFCFS();

	/**
	 * isArrayEquals check when the expected is equal to the actual array.
	 * 
	 * @param expectedArray
	 *            int[][] which is given by the developer.
	 * @param actualArray
	 *            int[][] which is the output of the simulateArray method.
	 * @return boolean whether the arrays are equal or not.
	 */

	public static boolean isArrayEquals(int[][] expectedArray, int[][] actualArray) {
		int flag = -1;
		if (expectedArray.length == actualArray.length) {
			for (int i = 0; i < actualArray.length; i++) {
				for (int j = 0; j < actualArray[i].length; j++) {
					if (expectedArray[i][j] == actualArray[i][j]) {
						flag = 0;
					}
				}
			}
			if (flag == -1) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

	@Test
	public void test() {

		int arrival_time[] = { 1, 5, 9, 25 };
		int job_size[] = { 12, 7, 2, 5 };
		int expected[][] = { { 0, 1, 12 }, { 8, 13, 19 }, { 11, 20, 21 },
				{ 0, 25, 29 } };
		int FCFSOutput[][] = simulateFCFS.FCFS(arrival_time, job_size);
		assertTrue(isArrayEquals(expected, FCFSOutput));

	}
}
