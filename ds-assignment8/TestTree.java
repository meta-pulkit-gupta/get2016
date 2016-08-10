package session8;

/**
 * JUnit Test Case for the implementation of the Tree Sort
 * @author Pulkit Gupta
 */
import static org.junit.Assert.*;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit for Tree.
 * 
 * @author Pulkit Gupta
 *
 */

public class TestTree {

	private static Tree<Integer> tree;
	private int[] input;
	private int[] expected;

	@Before
	public void setUp() {
		tree = new Tree<Integer>();
		input = new int[] { 10, 30, 45, 5, 2, 25 };
		for (int i = 0; i < input.length; i++) {
			tree.add(input[i]);
		}
	}

	@Test
	public void testTraverse() {
		expected = new int[] { 2, 5, 10, 25, 30, 45 };
		tree.traverse();
		List<Integer> value = tree.getTraverse();
		input = new int[value.size()];
		for (int i = 0; i < value.size(); i++) {
			input[i] = value.get(i);
		}
		assertArrayEquals(expected, input);
	}
}