package session8;

import java.util.Scanner;

/**
 * Allows users to choose which type of sorting to use and take array of
 * elements in input.
 * 
 * @author Pulkit Gupta
 *
 */

public class SortingSystem {

	/**
	 * Add elements given from the user.
	 * 
	 * @return array of elements.
	 */
	public int[] addElement() {
		int array[];
		System.out.println("Enter number of elements to sort :");
		array = new int[numberInput()];
		System.out.println("Enter elements :");
		for (int i = 0; i < array.length; i++) {
			array[i] = numberInput();
		}
		return array;
	}

	/**
	 * Provide user the options of sorting.
	 * 
	 * @param array
	 *            take user input array
	 * @return output array
	 */
	public int[] sortingOptions(int array[]) {
		System.out
				.println("Enter the choice of sorting\n1. Comparison Sort\n2. Linear Sort");
		int input = numberInput();
		int[] output;
		switch (input) {
		case 1:
			output = comparisonOption(array);
			break;
		case 2:
			output = linearOption(array);
			break;
		default:
			System.out.println("Invalid Input!");
			output = sortingOptions(array);
			break;
		}
		return output;
	}

	/**
	 * If user opts 1 then comparison sorting is used. Intelligently pick the
	 * best fitted algorithm according to question.
	 * 
	 * @param array
	 *            input array
	 * @return output array
	 */
	public int[] comparisonOption(int array[]) {
		if (array.length <= 10) {
			BubbleSort sort = new BubbleSort(array);
			sort.bubbleSort();
			return sort.array;
		} else {
			QuickSort sort = new QuickSort(array);
			sort.quickSort(0, array.length);
			return sort.array;
		}
	}

	/**
	 * If user opts 2 then linear sorting is used. Intelligently pick the best
	 * fitted algorithm according to question.
	 * 
	 * @param array
	 *            input array
	 * @return output array
	 */

	public int[] linearOption(int array[]) {
		int max = 0;
		for (int temp : array) {
			if (temp >= max) {
				max = temp;
			}
		}
		if (max > 99) {
			RadixSort sort = new RadixSort(array);
			sort.radixSort();
			return sort.getArray();
		} else {
			CountingSort sort = new CountingSort(array, max);
			sort.countingSort();
			return sort.getArray();
		}
	}

	/**
	 * Take an integer as input and check conditions on the input.
	 * @return input from user.
	 */
	public int numberInput() {
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		try {
			userInput = Integer.parseInt(sc.nextLine());
			if (userInput <= 0) {
				System.out.println("Enter number greater than 0");
				userInput = numberInput();
			}
		} catch (NumberFormatException ime) {
			System.out.println("Invalid input[Only Integer value]");
			userInput = numberInput();
		}
		return userInput;
	}

	/**
	 * Launch the application
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int array[];
		SortingSystem sort = new SortingSystem();
		array = sort.sortingOptions(sort.addElement());
		for (int temp : array) {
			System.out.print(temp + "	");
		}
	}
}
