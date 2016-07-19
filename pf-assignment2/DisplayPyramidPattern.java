package session2;

/* This program is display a pyramid of n number.
 * @param - n for number of rows pyramid have.
 * assumption n will always be an odd value
 * 
 * 
 * @author Pulkit Gupta
 * @date   14/07/2016
 * 
 */

public class DisplayPyramidPattern {

	/**
	 * This method is to print a String of spaces.
	 * 
	 * @param row
	 *            input the row number.
	 * @param n
	 *            is the size of the pyramid.
	 * @return String which give the String of spaces.
	 */
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

	/**
	 * This method is to print numbers.
	 * 
	 * @param row
	 *            input the row number.
	 * @param n
	 *            is the size of the pyramid.
	 * @return String which give the String of number.
	 */
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

	/**
	 * This method create a String of the whole pyramid constructed with the
	 * functions above.
	 * 
	 * @param n
	 *            is the size of the pyramid.
	 * @return String which give the String of whole pattern.
	 */
	public String[] pyramid(int n) {

		DisplayPyramidPattern displayPyramidPattern = new DisplayPyramidPattern();
		String output[] = new String[n];
		for (int i = 1; i <= n; i++) {
			output[i - 1] = displayPyramidPattern.spaces(i, n);
			output[i - 1] = output[i - 1] + displayPyramidPattern.numbers(i, n);
			System.out.println(output[i - 1]);
		}
		return output;
	}
}
