package session3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * To add elements in a BST tree and traversing the same.
 * 
 * @author Pulkit Gupta
 *
 */
public class BinarySearchTree {
	Scanner sc;
	private static Tree<Integer> tree;

	public BinarySearchTree() {
		sc = new Scanner(System.in);
	}

	/**
	 * To add element in the tree.
	 * 
	 */
	public void addElement() {
		List<Integer> userInput = new ArrayList<Integer>();
		tree = new Tree<Integer>();
		boolean flag = false; // check if user want to enter more elements.
		System.out.println("Enter the Elements in tree.\n");
		do {
			userInput.add(checkNumberInput());
			System.out.println("Do you want to add more element?[yes/no]");
			flag = stringInput();
		} while (flag);
		if (tree.add(userInput)) {
			traverseTree();
		} else {
			System.out
					.println("Something went wrong!\nDo you want to try again?[yes/no]");
			if (stringInput()) {
				addElement();
			}
		}
	}

	/**
	 * To traverse a tree on the basis of Order of traversal like preorder,
	 * inorder and postorder.
	 * 
	 */

	public void traverseTree() {
		boolean flag = false;
		do {
			System.out
					.println("Enter the order of traversal of tree?[1/2/3]\n1. Inorder\n2. Preorder\n3. Postorder");
			try {
				tree.traverse(checkNumberInput());
			} catch (IllegalArgumentException iae) {
				flag = true;
				System.out.println(iae.getMessage());
				continue;
			}
			System.out.println("Do you want to Continue?[yes/no]");
			flag = stringInput();
		} while (flag);
		System.out.println("End");
	}

	/**
	 * Check whether string contains yes or no
	 * @return true or false according to yes or no
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
	 * Check whether the input is a number or not
	 * @return return the input
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

	/**
	 * launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.addElement();

	}

}
