package session1;

/* This program is for converting a binary number to Octal number.
 * 
 * @author Pulkit Gupta
 * @date   13/07/2016
 * 
 */

public class Assignment1 {

	public int getOctalFromBinary(int binary) {
		int decimal = 0;
		int power = 0;
		String output = "";
		char digits[] = { '0', '1', '2', '3', '4', '5', '6', '7' };
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int temp = binary % 10;
				decimal += temp * Math.pow(2, power);
				binary = binary / 10;
				power++;
			}
		}
		// gets decimal number in decimal
		while (decimal > 0) {
			power = decimal % 8;
			output = digits[power] + output;
			decimal = decimal / 8;
		}
		return Integer.parseInt(output);
	}
}
