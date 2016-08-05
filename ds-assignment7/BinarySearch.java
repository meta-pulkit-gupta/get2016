package session7;

import java.util.Scanner;

/**
 * To find the left most occurence of a target element in a sorted array.
 * 
 * @author Pulkit Gupta
 *
 */

public class BinarySearch {

	int array[];

	public BinarySearch() {
	}

	BinarySearch(int array[]) {
		this.array = array;
	}

	/**
	 * Algorithm to find the left most occurence of a target element in a sorted
	 * array.
	 * 
	 * @param array
	 *            array of elements.
	 * @param start
	 *            starting index of search
	 * @param end
	 *            end index of search
	 * @param target
	 *            element to be searched in the array.
	 * @return index of the target in the array else -1 if target not present in
	 *         the array.
	 */
	public int binarySearch(int start, int end, int target) {
		int middle;
		if (end < start) {
			return -1;
		}
		middle = (start + end) / 2;
		if (target == array[middle]) {
			int temp = binarySearch(start, middle - 1, target);
			if (temp == -1) {
				return middle;
			}
			return temp;
		} else if (target < array[middle]) {
			return binarySearch(start, middle - 1, target);
		} else {
			return binarySearch(middle + 1, end, target);
		}
	}

	/**
	 * Add element in the array according to the user in a sorted order.
	 */
	public void addElement() {
		int target;
		System.out.println("Enter the number of elements want to add: ");
		array = new int[checkNumberInput()];
		System.out.println("Enter " + array.length
				+ " numbers in sorted order.");
		for (int i = 0; i < array.length; i++) {
			array[i] = checkNumberInput();
		}
		System.out.println("Enter number to find in the array?");
		target = checkNumberInput();
		int result = binarySearch(0, array.length, target) + 1;
		if (!(result <= 0)) {
			System.out.println("The left most occurence of " + target + " is "
					+ result);
		}
		System.out.println("Element not found!");
	}

	/**
	 * Check if the input is a number or not.
	 *
	 * @return a int value number.
	 */
	public int checkNumberInput() {
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		try {
			System.out.println("Enter the number");
			userInput = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException ime) {
			System.out.println("Invalid input[Only Integer value]");
			userInput = checkNumberInput();
		}
		return userInput;
	}

	/**
	 * launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new BinarySearch().addElement();
	}

}
