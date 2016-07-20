package session3;

/**
 * This program is to search a given element out of an array of elements through
 * linear search.
 * 
 * @author Pulkit Gupta
 * @Date 15/07/2016
 */
public class LinearSearchRecursion {

	/**
	 * This method is to search a given element out of an array recursively.
	 * 
	 * @param numberArray
	 *            array of integer type elements out of which the given element
	 *            is to be search.
	 * @param index
	 *            the starting point of the search.
	 * @param element
	 *            the integer type argument which is to be search in the given
	 *            numberArray.
	 * @return the index of the element in the numberArray.
	 */
	public int linearSearch(int numberArray[], int index, int element) {
		if (numberArray[index] == element) {
			return index;
		} else if (index == numberArray.length - 1) {
			return -1;
		} else {
			return linearSearch(numberArray, index + 1, element);
		}
	}

	public static void main(String[] args) {
		LinearSearchRecursion linearSearch = new LinearSearchRecursion();
		int inputArray[] = new int[] { 1, 3, 4, 2, 6, 7, 7, 5 };
		System.out.println(linearSearch.linearSearch(inputArray, 0, 5) + 1);
	}
}
