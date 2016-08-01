package session5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This is to take input from the user for menu items.
 * 
 * @author Pulkit Gupta
 *
 */
public class Lists {

	/**
	 * Launches the application.
	 */
	public static void main(String[] args) {
		Lists list = new Lists();
		Item item = new Item();
		item.setName("main");
		item.setItems(list.menu("main"));
		DisplayMenu displayMenu = new DisplayMenu();
		displayMenu.displayMenu(item);
	}

	/**
	 * This method is to create a menu from the input given by the user
	 * 
	 * @param name
	 *            name of the parent menu.
	 * @return a list of items of the immediate parent menu.
	 */
	public List<Item> menu(String name) {
		Scanner sc = new Scanner(System.in);
		List<Item> items = new ArrayList<Item>();
		Item item;
		String s;
		System.out.println("Enter the number of item in " + name);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			item = new Item();
			System.out.println("Name of the item in " + name);
			item.setName(sc.nextLine());
			items.add(item);
			System.out.println("want to add composite items in "
					+ item.getName() + " ?");
			s = sc.nextLine();
			if (s.equalsIgnoreCase("y")) {
				item.setItems(menu(item.getName())); // recursion for making
														// sub-menu of menu
			}
		}
		// add a back button to every menu
		item = new Item();
		item.setName("Back");
		items.add(item);
		return items;
	}
}
