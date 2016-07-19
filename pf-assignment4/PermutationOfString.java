package session4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * This use recursion method to solve String permutation
 * 
 * @author Pulkit Gupta
 * @Date 18/07/2016
 */
public class PermutationOfString {

	/**
	 * 
	 * @param input
	 *            input string
	 * @param outputList
	 *            different permutation of string
	 * @return return output list This use recursion to solve all permutation of
	 *         string
	 */

	public ArrayList<String> getPermutations(String input,
			ArrayList<String> outputList) {
		// if string already exist return null
		if (outputList.contains(input)) {
			return null;
		} else {
			outputList.add(input); // if new string get then add in the list
		}
		// operations on sub string
		String combination = "";
		int inputLength = input.length();
		String lastCharacter = "" + (input.charAt(inputLength - 1)); // last
																		// character
																		// of
																		// string
		// get possible combinations
		for (int index = inputLength - 2; index >= 0; index--) {
			String firstPart = input.substring(0, index);
			String lastPart = input.substring(index, inputLength - 1);
			combination = firstPart + lastCharacter + lastPart;
			new PermutationOfString().getPermutations(combination, outputList);
		}

		// return list of all possible combinations
		return outputList;
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * This method give integer value if input is give wrong then again it run
	 * till a correct input is not given
	 * 
	 * @return user input value
	 */
	public int inputInt() {
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = inputInt();
		}
		return inputNumber;
	}

	public String inputString() {
		String inputString = "";
		try {
			inputString = br.readLine();
		} catch (Exception e) {
			System.out.println("Please Enter the Valid String");
			inputString = inputString();
		}
		return inputString;
	}

	public static void main(String[] args) {
		int loopVariable = 1;
		while (loopVariable == 1) {
			PermutationOfString permutationOfString = new PermutationOfString();
			ArrayList<String> outputList;
			outputList = new ArrayList<String>();
			String inputString = "";
			// get the string from user
			System.out.println("Enter the String");
			inputString = permutationOfString.inputString();
			// call the
			outputList = permutationOfString.getPermutations(inputString,
					outputList);
			for (int index = 0; index < outputList.size(); index++) {
				System.out.println("from list    " + outputList.get(index));
			}

			System.out.println("Enter 1 for run again");
			System.out
					.println("For terminate the program give any other number");
			loopVariable = permutationOfString.inputInt();
		}
	}

}