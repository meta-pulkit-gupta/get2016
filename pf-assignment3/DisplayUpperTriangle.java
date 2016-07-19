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

public class DisplayUpperTriangle {

	/**
	 * This method is to print a String of spaces.
	 * 
	 * @param row
	 *            input the row number.
	 * @param n
	 *            is the size of the Upper triangle.
	 * @return String which give the String of spaces.
	 */
	public String spaces(int row, int n) {
		String spaces = "";
		for (int i = 0; i < row; i++) {
			spaces = spaces + " ";
		}
		return spaces;
	}

	/**
	 * This method is to print numbers.
	 * 
	 * @param row
	 *            input the row number.
	 * @param n
	 *            is the size of the Upper triangle.
	 * @return String which give the String of number.
	 */
	public String numbers(int row, int n) {
		String numbers = "";
		for (int i = 1; i < n - row + 1; i++) {
			numbers = numbers + i;
		}
		return numbers;
	}

	/**
	 * This method create a String of the whole Upper triangle constructed with
	 * the functions above.
	 * 
	 * @param n
	 *            is the size of the Upper triangle.
	 * @return String which give the String of whole pattern.
	 */

	public String[] upperTriangle(int n) {
		DisplayUpperTriangle displayUpperTriangle = new DisplayUpperTriangle();
		String output[] = new String[n];
		for (int i = 0; i < n; i++) {
			output[i] = displayUpperTriangle.spaces(i, n);
			output[i] = output[i] + displayUpperTriangle.numbers(i, n);
		}
		return output;
	}
}
