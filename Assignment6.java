package session1;

/* This program is to simulate FCFS(First Come First Serve).
 * 
 * @author Pulkit Gupta
 * @date   13/07/2016
 * 
 */

public class Assignment6 {

	public int[][] FCFS(int arrival_time[], int job_size[]) {

		int FCFSOutput[][] = new int[arrival_time.length][3];
		int i = 0;
		while (i < arrival_time.length) {
			if (i == 0) {		// when first process comes.
				FCFSOutput[i][0] = 0;
				FCFSOutput[i][1] = 1;
				FCFSOutput[i][2] = FCFSOutput[i][1] + job_size[i] - 1;
			} else if (arrival_time[i] > FCFSOutput[i - 1][2]) { // When machine is idle.
				FCFSOutput[i][0] = 0;
				FCFSOutput[i][1] = arrival_time[i];
				FCFSOutput[i][2] = FCFSOutput[i][1] + job_size[i] - 1;
			} else {			// When a process arrive before the completion of previous one.
				FCFSOutput[i][0] = FCFSOutput[i - 1][2] - arrival_time[i] + 1;
				FCFSOutput[i][1] = FCFSOutput[i - 1][2] + 1;
				FCFSOutput[i][2] = FCFSOutput[i][1] + job_size[i] - 1;
			}
			i++;
		}

		return FCFSOutput;
	}

	/*
	public static void main(String[] args) {
		int arrival_time[] = { 1, 5, 9, 25 };
		int job_size[] = { 12, 7, 2, 5 };
		int FCFSOutput[][] = FCFS(arrival_time, job_size);
		for (int i = 0; i < FCFSOutput.length; i++) {
			System.out.println(i + 1 + "		" + arrival_time[i] + "		"
					+ FCFSOutput[i][0] + "		" + FCFSOutput[i][1] + "		"
					+ FCFSOutput[i][2]);
		}

	}
	*/

}
