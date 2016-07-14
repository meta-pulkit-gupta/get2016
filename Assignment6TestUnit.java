package session1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment6TestUnit {

	Assignment6 assignment6 = new Assignment6();

	public static boolean isArrayEquals(int[][] expected, int[][] actual) {
		int flag = -1;
		if (expected.length == actual.length) {
			for (int i = 0; i < actual.length; i++) {
				for (int j = 0; j < actual[i].length; j++) {
					if (expected[i][j] == actual[i][j]) {
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
		int FCFSOutput[][] = assignment6.FCFS(arrival_time, job_size);
		assertTrue(isArrayEquals(expected, FCFSOutput));

	}
}
