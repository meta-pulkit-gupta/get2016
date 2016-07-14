package session1;

/* This program is to remove duplicate elements from an unsorted Array.
 * 
 * @author Pulkit Gupta
 * @date   13/07/2016
 * 
 */

import java.util.ArrayList;

public class Assignment2 {

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
