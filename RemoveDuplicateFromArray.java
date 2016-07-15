package session1;

/* This program is to remove duplicate elements from an unsorted Array.
 * 
 * @author Pulkit Gupta
 * @date   13/07/2016
 * 
 */

import java.util.ArrayList;

public class RemoveDuplicateFromArray {

	/**
	 * This method is to remove the duplicate elements from the given array.
	 * 
	 * @param input
	 *            integer array which holds the integer type values.
	 * @return outputArray integer array which doesnt holds the duplicate
	 *         elements.
	 */
	public int[] removeDuplicate(int input[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		boolean flag;
		for (int i = 0; i < input.length; i++) {
			flag = true;
			for (int j = 0; j < i; j++) {
				if (input[i] == input[j]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				output.add(input[i]);
			}
		}
		// Converting the List to array
		int[] outputArray = new int[output.size()];
		for (int i = 0; i < outputArray.length; i++) {
			outputArray[i] = output.get(i).intValue();
		}
		return outputArray;
	}
}
