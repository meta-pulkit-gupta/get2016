package session4;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Pulkit Gupta
 * @Date 18/07/2016
 */

public class TestPermutationOfString {

	PermutationOfString permutationOfString;
	ArrayList<String> testSolution;
	ArrayList<String> output;

	@Before
	public void setUp() throws Exception {
		permutationOfString = new PermutationOfString();
		testSolution = new ArrayList<String>();
		output = new ArrayList<String>();
		testSolution.add("ABC");
		testSolution.add("ACB");
		testSolution.add("BAC");
		testSolution.add("BCA");
		testSolution.add("CBA");
		testSolution.add("CAB");

	}

	@Test
	public void testGetPermutations() {
		output = permutationOfString.getPermutations("ABC", output);
		assertEquals("Success", testSolution, output);

	}

}