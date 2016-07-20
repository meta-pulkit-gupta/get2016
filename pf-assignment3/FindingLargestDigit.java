package session3;

/**
 * This program is to find the largest digit in the given number. for example
 * number is 1234 then the largest digit is 4.
 * 
 * @author Pulkit Gupta
 * @date 15/07/2016
 *
 */

public class FindingLargestDigit {

	/**
	 * This method is to find the largest digit in the given number.
	 * 
	 * @param x
	 *            integer type that is input to the method.
	 * @return integer type which return the largest digit.
	 */
	public int largestDigit(int x) {
		int y = 0;
		if (x == 0) {
			return 0;
		} else if (x % 10 > (largestDigit(x / 10))) {
			return x % 10;
		} else {
			return y;
		}
	}
	
	public static void main(String[] args) {
		FindingLargestDigit largestDigit = new FindingLargestDigit();
		System.out.println(largestDigit.largestDigit(12345));
	}

}
