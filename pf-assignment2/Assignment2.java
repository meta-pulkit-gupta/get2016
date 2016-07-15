package session2;

/* This program is display a upper triangle of n number.
 * @param - n for number of rows upper triangle have.
 * assuming n can't have a negative value
 * 
 * 
 * @author Pulkit Gupta
 * @date   14/07/2016
 * 
 */

public class Assignment2 {

	// This method is to print the spaces.
	public String spaces(int row, int n) {
		String spaces = "";
		for (int i = 0; i < row; i++) {
			spaces = spaces + " ";
		}
		return spaces;
	}

	// This method is to create a String of numbers that are required to
	// display.
	public String numbers(int row, int n) {
		String numbers = "";
		for (int i = 1; i < n - row + 1; i++) {
			numbers = numbers + i;
		}
		return numbers;
	}

	// This method create a String of the whole upper triangle constructed with
	// the functions above.

	public String[] upperTriangle(int n) {
		Assignment2 assignment2 = new Assignment2();
		String output[] = new String[n];
		for (int i = 0; i < n; i++) {
			output[i] = assignment2.spaces(i, n);
			output[i] = output[i] + assignment2.numbers(i, n);
		}
		return output;
	}
}
