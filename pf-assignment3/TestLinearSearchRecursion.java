package session3;

/**JUnit test case for LinearSearchRecursion.
 * 
 * @author Pulkit Gupta
 */

import org.junit.Test;

public class TestLinearSearchRecursion {

	LinearSearchRecursion linearSearch = new LinearSearchRecursion();

	@Test
	public void test() {
				linearSearch.linearSearch(new int[]  {2,5,8,9,10, 77, 55}, 0, 88);
				linearSearch.linearSearch(new int[]  {2,5,8,9,10, 77, 55}, 0, 77);
				
	}

}
