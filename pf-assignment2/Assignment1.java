package session2;

/* This program is display a pyramid of n number.
 * @param - n for number of rows pyramid have.
 * assuming n will always be an odd value
 * 
 * 
 * @author Pulkit Gupta
 * @date   14/07/2016
 * 
 */

public class Assignment1 {

	// This method is to print the spaces.
	public String spaces(int row, int n) {
		String spaces = "";
		if (row <= n / 2 + 1) {
			for (int i = 0; i <= (n / 2 - row); i++) {
				spaces = " " + spaces;
			}
		} else if (row > n / 2 + 1) {
			for (int i = 0; i < (row - n / 2) - 1; i++) {
				spaces = " " + spaces;
			}
		}
		return spaces;
	}

	// This method is to create a String of numbers that are required to
	// display.
	public String numbers(int row, int n) {
		int maxCount;
		if (row <= n / 2 + 1) {
			maxCount = 2 * row - 1;
		} else {
			maxCount = 2 * (n - row + 1) - 1;
		}
		String numbers = "";
		for (int i = 1; i <= maxCount; i++) {
			if (i <= maxCount / 2 + 1) {
				numbers = numbers + i;
			} else {
				numbers = numbers + (maxCount - i + 1);
			}
		}
		return numbers;
	}

	// This method create a String of the whole pyramid constructed with the
	// functions above.
	public String[] pyramid(int n) {

		Assignment1 assignment1 = new Assignment1();
		String output[] = new String[n];
		for (int i = 1; i <= n; i++) {
			output[i - 1] = assignment1.spaces(i, n);
			output[i - 1] = output[i - 1] + assignment1.numbers(i, n);
			System.out.println(output[i - 1]);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment1 assignment1 = new Assignment1();
		assignment1.pyramid(9);
	}
}
