package session8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreeSort {
	Tree<Integer> tree; // Aggregation.
	Scanner sc; // Taking input from user.

	/**
	 * Initializing the instance members.
	 */
	public TreeSort() {
		tree = new Tree<Integer>();
		sc = new Scanner(System.in);
	}

	/**
	 * Add rollNumbers to the list.
	 * 
	 * @return list of roll numbers.
	 */

	public List<Integer> addRollNumber() {
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter number of students? ");
		int max = numberInput();
		System.out.println("Enter " + max + " roll numbers :");
		for (int index = 0; index < max; index++) {
			list.add(numberInput());
		}
		return list;
	}

	/**
	 * Sort the roll numbers by using tree sort. Traverse the tree.
	 * 
	 * @param list
	 */
	public void sortRollNumber(List<Integer> list) {
		System.out.println("Sorted Roll numbers of students :");
		tree.add(list);
		tree.traverse();
	}
	

	/**
	 * Take an integer as input and check conditions on the input.
	 * 
	 * @return input from user.
	 */

	public int numberInput() {
		int userInput = 0;
		try {
			userInput = Integer.parseInt(sc.nextLine());
			if (userInput < 0) {
				System.out.println("Invalid input[number >= 0]: ");
				userInput = numberInput();
			}
		} catch (NumberFormatException ime) {
			System.out.println("Invalid input[Only Integer value]");
			userInput = numberInput();
		}
		return userInput;
	}

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		TreeSort sort = new TreeSort();
		sort.sortRollNumber(sort.addRollNumber());
	}
}
