package session3;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
/**
 * JUnit for Tree.
 * @author Pulkit Gupta
 *
 */

public class TestTree {

	private static Tree<Integer> bst;
	private int[] input;
	private int[] expected;

	@Before
	public void setUp() {
		bst = new Tree<Integer>();
		input = new int[] { 10, 30, 45, 5, 2, 25 };
		for (int i = 0; i < input.length; i++) {
			bst.add(input[i]);
		}
	}

	@Test
	public void testInsert() {
		assertTrue(bst.add(1));
	}

	@Test
	public void testTraverse() {
		expected = new int[] { 2, 5, 10, 25, 30, 45 };
		List<Integer> value = bst.traverse(1);
		input = new int[value.size()];
		for (int i = 0; i < value.size(); i++) {
			input[i] = value.get(i);
		}
		assertArrayEquals(expected, input);
	}

	@Test
	public void testCheckMirror() {
		Tree<Integer> second = new Tree<Integer>();
		List<Integer> value = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			value.add(input[i]);
		}
		second.addInverse(value);
		assertTrue(bst.checkMirror(second));
	}
}
