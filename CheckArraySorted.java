package session1;

/*
 * This program is to check given array is in sorted order or not. 
 * Function should return 1 if array is in ascending order,
 * 2 if array is in descending order, 0 if array is not in sorted
 *
 * 
 * @author Pulkit Gupta
 * 
 * @date 13/07/2016
 */

public class CheckArraySorted {

	/**
	 * This method is to check the order of the given array. It check the ith
	 * value with its consecutive value. If the ith value is less ,then variable
	 * ascending order increment by 1 else the variable ascending order
	 * increment by 1.
	 * 
	 * @param input
	 *            which takes integer array.
	 * @return integer according to the sorting style.
	 */
	public int checkOrder(int[] input) {
		int ascendingOrder = 0;
		int descendingOrder = 0;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] < input[i + 1]) {
				ascendingOrder++;
			} else {
				descendingOrder++;
			}
		}
		if (ascendingOrder == input.length - 1) {
			// if the ascending order is equal to input.length - 1,this means
			// array is ascending order.
			System.out.println("This is an ascending ordered array.");
			return 1;
		} else if (descendingOrder == input.length - 1) {
			// if the descending order is equal to input.length - 1,this means
			// array is descending order.
			System.out.println("This is an descending ordered array.");
			return 2;
		}
		// else the array is unordered.
		System.out.println("This is an unordered array.");
		return 0;
	}

}
