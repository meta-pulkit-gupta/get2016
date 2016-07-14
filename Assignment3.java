package session1;

public class Assignment3 {

	/*
	 * This program is to find longest increasing sequence from an array of n
	 * integer values.
	 * 
	 * @author Pulkit Gupta
	 * 
	 * @date 13/07/2016
	 */

	public static int[] longestSequence(int input[]) {
		int longestSequenceLength = 0;
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			int tempSequenceLength = 0;
			int tempIndex = i;
			for (int j = i; j < input.length - 1; j++) {
				if (input[j] < input[j + 1]) {
					tempSequenceLength++;
				} else {
					i = i + tempSequenceLength;
					break;
				}
			}
			if (tempSequenceLength > longestSequenceLength) {
				longestSequenceLength = tempSequenceLength;
				index = tempIndex;
			}
		}
		int[] longestSequence = new int[longestSequenceLength + 1];
		for (int i = index, j = 0; i <= (index + longestSequenceLength);) {
			longestSequence[j++] = input[i++];
		}
		return longestSequence;
	}
}