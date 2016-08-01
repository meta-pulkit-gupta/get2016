package session5;

import java.util.Iterator;
import java.util.Scanner;

/**
 * This class is to display the menu show the result of the input.
 * 
 * @author Pulkit Gupta
 *
 */

public class DisplayMenu {

	/**
	 * This class is to display the menu.
	 * 
	 * @param item
	 *            the object of Item.
	 */
	public void displayMenu(Item item) {
		Scanner sc = new Scanner(System.in);
		int choice; // for taking the input from user that which menu he/she
					// choose.
		Iterator<Item> itr = item.getItems().iterator(); // iterator of List of
															// Item type to
															// iterate elements
		// of List.
		int i; // to numbering the items.
		do {
			i = 1;
			while (itr.hasNext()) { // to show the menu.
				System.out.println(i + ". " + itr.next().getName());
				i++;
			}
			System.out.println("Enter your choice ");
			choice = sc.nextInt(); // take input from the user.
			if (choice == item.getItems().size()
					&& !item.getName().equals("main")) {
				System.out.println("Back to " + item.getName());
				// if user opts back button.
				return;
			} else if (item.getItems().get(choice - 1).getItems().isEmpty()) {
				// if the List in the Item object is empty.then return
				System.out.println(item.getName() + " --> "
						+ item.getItems().get(choice - 1).getName());
				return;
			}
			sc.nextLine();
			// display menu for the Item object.
			displayMenu(item.getItems().get(choice - 1));
		} while (true);
	}
}
