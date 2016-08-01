package session3;

/**
 * This program is to find the Greatest common divisor of two numbers.
 * 
 * @author Pulkit Gupta
 * @date 15/07/2016
 *
 */

public class GCDRecursion {

	/**
	 * This program is to find the gcd of two numbers.
	 * 
	 * @param x
	 *            first number.
	 * @param y
	 *            second number.
	 * @return The Gcd of two numbers.
	 */
	public int gcd(int x, int y) {
		int z = x % y;
		if (x % y == 0) {
			return y;
		}
		return gcd(x = y, z);
	}

	public static void main(String[] args) {
		GCDRecursion gcdRecursion = new GCDRecursion();
		System.out.println(gcdRecursion.gcd(72, 108));
		System.out.println(gcdRecursion.gcd(1071, 462));
	}

}
