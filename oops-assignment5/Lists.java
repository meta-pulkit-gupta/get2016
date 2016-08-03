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

	Scanner sc;

	public Lists() {
		sc = new Scanner(System.in);
	}

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

		List<Item> items = new ArrayList<Item>();
		Item item;
		String stringInput;
		int userInput;
		userInput = checkNumberInput(name);
		for (int i = 0; i < userInput; i++) {
			item = new Item();
			System.out.println("Provide the name of the  " + (i + 1)
					+ " item in " + name);
			item.setName(checkStringInput());
			items.add(item);
			System.out.println("Do want to add composite items in "
					+ item.getName() + " ?[yes/no]");
			stringInput = checkStringInput();
			if (stringInput.equalsIgnoreCase("yes")
					|| stringInput.equalsIgnoreCase("y")) {
				item.setItems(menu(item.getName()));
				// recursion for making sub-menu of menu
			} else if (stringInput.equalsIgnoreCase("no")
					|| stringInput.equalsIgnoreCase("n")) {
			} else {
				System.out.println("Invalid Input[yes/no] ");
				stringInput = checkStringInput();
			}
		}
		// add a back button to every menu
		item = new Item();
		item.setName("Back");
		items.add(item);
		return items;
	}

	/*
	 * String userInput = ""; userInput = sc.nextLine().trim(); if
	 * (!Character.isLetter(userInput.charAt(0))) {
	 * System.out.println("Invalid Input[1st characters should be alphabetic]");
	 * checkStringInput(); } return userInput;
	 */

	public String checkStringInput() {
		String regex = "^([a-zA-Z])";
		String userInput = "";
		userInput = sc.nextLine().trim();
		if (userInput.matches(regex)) {
			System.out.println("Invalid Input[Only characters and digits]");
			checkStringInput();
		}
		return userInput;
	}

	public int checkNumberInput(String name) {
		int userInput = 0;
		try {
			System.out.println("Enter the number of items in " + name);
			userInput = Integer.parseInt(sc.nextLine());
			if (userInput <= 0) {
				System.out.println("Invalid Input[Only number > 0]");
				userInput = checkNumberInput(name);
			}
		} catch (NumberFormatException ime) {
			System.out.println("Invalid input[Only Integer value]");
			userInput = checkNumberInput(name);
		}

		return userInput;
	}
}
