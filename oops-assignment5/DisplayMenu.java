package session5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * This class is to display the menu show the result of the input.
 * 
 * @author Pulkit Gupta
 *
 */

public class DisplayMenu {

	private static Stack<Item> items;

	public DisplayMenu() {
		items = new Stack<Item>();
	}

	/**
	 * This class is to display the menu.
	 * 
	 * @param item
	 *            the object of Item.
	 */
	public void displayMenu(Item item) {
		items.push(item);
		// items.push(item);
		Scanner sc = new Scanner(System.in);
		int choice; // for taking the input from user that which menu he/she
					// choose.
		Iterator<Item> itr; // iterator of List of
		Iterator<Item> iteratorOfStack;
		// iterate elements
		// of List.
		int index; // to numbering the items.
		do {
			index = 1;
			itr = item.getItems().iterator();
			while (itr.hasNext()) { // to show the menu.
				System.out.println(index + ". " + itr.next().getName());
				index++;
			}
			do {
				System.out.println("Enter your choice ");
				choice = sc.nextInt(); // take input from the user.
			} while (!(choice <= item.getItems().size()));

			if (choice == item.getItems().size()
					&& !item.getName().equals("main")) {
				System.out.println("Back to " + item.getName());
				items.pop();
				// if user opts back button.
				return;
			} else if (item.getItems().get(choice - 1).getItems().isEmpty()) {
				// if the List in the Item object is empty.then return
				items.push(item.getItems().get(choice - 1));
				iteratorOfStack = items.iterator();
				while (iteratorOfStack.hasNext()) {
					System.out.print(iteratorOfStack.next().getName());
					if (iteratorOfStack.hasNext())
						System.out.print("-->");
				}
				System.out.println();
				return;
			}
			sc.nextLine();
			// System.out.println(item.getName());

			// display menu for the Item object.
			displayMenu(item.getItems().get(choice - 1));
		} while (true);
	}

}
