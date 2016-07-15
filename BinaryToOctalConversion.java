package session1;

/* This program is for converting a binary number to Octal number.
 * 
 * @author Pulkit Gupta
 * @date   13/07/2016
 * 
 */

public class BinaryToOctalConversion {

	/**
	 * This method is to convert a Binary number to Octal number.
	 * 
	 * @param binaryNumber
	 *            This is the input given to the method.
	 * @return Octal Number This gives the Octal number respective of binary
	 *         number.
	 */

	public int getOctalFromBinary(int binaryNumber) {
		int decimalNumber = 0;
		int count = 0;
		int octalNumber = 0;
		while (binaryNumber != 0) {
			int temp = binaryNumber % 10;
			decimalNumber += temp * power(2, count);
			binaryNumber = binaryNumber / 10;
			count++;
		}
		// gets decimal number in decimal
		count = 0;
		while (decimalNumber != 0) {
			octalNumber += decimalNumber % 8 * power(10, count);
			count++;
			decimalNumber /= 8;
		}
		return octalNumber;
	}

	/**
	 * This method is to get the power of a number.
	 * 
	 * @param base
	 *            It is the value of which power is to be find.
	 * @param power
	 *            power is the value by which base is to be multiplied.
	 * @return output that gives the power of the base.
	 */
	public static int power(int base, int power) {
		int output = 1;
		for (int i = 1; i <= power; i++) {
			output = output * base;
		}
		return output;
	}
}
