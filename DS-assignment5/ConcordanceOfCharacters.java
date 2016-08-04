package session5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * To find the concordance of characters in a String
 * 
 * @author Pulkit Gupta
 *
 */
public class ConcordanceOfCharacters {
	private HashMap<Character, List<Integer>> map; // map to store the indexes
													// of the characters.

	public ConcordanceOfCharacters() {
		map = new HashMap<Character, List<Integer>>();
	}

	/**
	 * Algorithm to find the concordance of character in a string and saving
	 * them in the map.
	 * 
	 * @param input
	 *            is an array of characters.
	 */

	public void concordance(char input[]) {
		for (int i = 0; i < input.length; i++) {
			List<Integer> index = new ArrayList<Integer>();
			if (!map.containsKey(input[i])) {
				index.add(i);
				map.put(input[i], index);
			} else {
				index = map.get(input[i]);
				index.add(i);
				map.put(input[i], index);
			}
		}
		// print concordance
		printConcordance();
	}

	/**
	 * Print the concordance of the characters in a string.
	 */

	public void printConcordance() {
		List<Integer> index = new ArrayList<Integer>();
		Object[] keys = map.keySet().toArray();
		for (int i = 0; i < keys.length; i++) {
			index = map.get(keys[i]);
			System.out.print(keys[i] + " - ");
			for (int j = 0; j < index.size(); j++) {
				System.out.print(index.get(j) + "  ");
			}
			System.out.println();
		}
	}

	/**
	 * Launch the program.
	 * 
	 * @param args
	 *            takes comandline argument.
	 */
	public static void main(String[] args) {
		ConcordanceOfCharacters conCharacters = new ConcordanceOfCharacters();
		String input = "";
		for (String temp : args) {
			input += temp;
		}
		conCharacters.concordance(input.toCharArray());
	}

}
