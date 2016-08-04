package session5;

import java.util.Iterator;
import java.util.Scanner;

/**
 * To insert the elements in the SortedLinkList.
 * 
 * @author Pulkit Gupta
 *
 */
public class SortedLinkListInsert {
	Scanner sc;

	public SortedLinkListInsert() {
		sc = new Scanner(System.in);
	}

	/**
	 * Insert elements in the sortedlinklist.
	 */
	public void insertElement() {
		boolean flag = false;
		SortedLinkList<Integer> list = new SortedLinkList<Integer>();
		System.out.println("Enter the Elements in SortedLinklist.\n");
		do {
			list.insert(checkNumberInput());
			Iterator<Integer> itr = list.getList().iterator();
			while (itr.hasNext()) {
				System.out.print(itr.next() + "  ");
			}
			System.out.println("\nDo you want to add more element?[yes/no]");
			flag = stringInput();
		} while (flag);
	}

	/**
	 * Take the String type input.
	 * 
	 * @return the input
	 */

	public boolean stringInput() {
		String stringInput = sc.nextLine();
		if (stringInput.equalsIgnoreCase("yes")
				|| stringInput.equalsIgnoreCase("y")) {
			return true;
			// recursion for making sub-menu of menu
		} else if (stringInput.equalsIgnoreCase("no")
				|| stringInput.equalsIgnoreCase("n")) {
			return false;
		} else {
			System.out.println("Invalid Input[yes/no] ");
			return stringInput();
		}
	}

	/**
	 * Take a String as input from user and check whether a number or not
	 * 
	 * @return input value
	 */

	public int checkNumberInput() {
		int userInput = 0;
		try {
			System.out.println("Enter the number[only integer] ");
			userInput = Integer.parseInt(sc.nextLine());

		} catch (NumberFormatException ime) {
			System.out.println("Invalid input[Only Integer value]");
			userInput = checkNumberInput();
		}
		return userInput;
	}

	public static void main(String[] args) {
		SortedLinkListInsert insert = new SortedLinkListInsert();
		insert.insertElement();
	}

}
