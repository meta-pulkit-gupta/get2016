package session6;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Takes a string and returns the number of unique characters in the string.
 * 
 * @author Pulkit Gupta
 *
 */
public class UniqueCharacters {
	private static HashMap<String, Integer> cache; // to cache the previous
													// result

	static {
		cache = new HashMap<String, Integer>(); // to initialize the hashmap
												// when the class load.
	}

	/**
	 * Find the number of character in the string.
	 * 
	 * @param input
	 * @return
	 */

	public int uniqueChar(String input) {
		input = input.replaceAll("\\s+", "").trim();
		if (cache.containsKey(input)) {
			System.out.println("String already in cache.");
			return cache.get(input);
		} else {
			TreeSet<Character> characters = new TreeSet<Character>();
			char[] inputArray = input.toCharArray();
			for (char temp : inputArray) {
				characters.add(temp);
			}
			cache.put(input, characters.size());
			return characters.size();
		}
	}

	/**
	 * Launch the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UniqueCharacters objecCharacters = new UniqueCharacters();
		boolean flag = false;
		do {
			System.out.println("Enter the element :");
			System.out.println(objecCharacters.uniqueChar(sc.nextLine()));
			System.out.println("Do you want to enter more?[yes/no]");
			flag = objecCharacters.stringInput(sc);
		} while (flag);
	}

	/**
	 * Check if the input string has yes or no.
	 * 
	 * @param sc
	 * @return
	 */

	public boolean stringInput(Scanner sc) {
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
			return stringInput(sc);
		}
	}
}
