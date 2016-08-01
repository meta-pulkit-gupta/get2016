package session3;

/**
 * This program is to find the remainder. number is 1234 then the largest digit
 * is 4.
 * 
 * @author Pulkit Gupta
 * @date 15/07/2016
 *
 */
public class FindingRemainderRecursion {

	/**
	 * This method is to find the remainder when x
	 * 
	 * @param x
	 *            dividend.
	 * @param y
	 *            divisor
	 * @return remainder.
	 */
	public int rem(int x, int y) {
		if (y == 0) {
			return -1;
		}
		if (x <= y) {
			return y - x;
		}
		return rem(x - y, y);
	}

	public static void main(String[] args) {
		FindingRemainderRecursion findingRemDigit = new FindingRemainderRecursion();
		System.out.println(findingRemDigit.rem(10, 5));
	}

}
