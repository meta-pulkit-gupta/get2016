package session4;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Pulkit Gupta
 * @Date 18 july 2016
 *
 */
public class TestTowerOfHanoi {

	TowerOfHanoi towerOfHanoi;
	ArrayList<String> expectedStepsList1;
	ArrayList<String> expectedStepsList2;

	@Before
	public void setUp() throws Exception {

		towerOfHanoi = new TowerOfHanoi();

		expectedStepsList1 = new ArrayList<String>() {
			{
				add("Move Disk 1 From A to B");
				add("Move Disk 2 From A to C");
				add("Move Disk 1 From B to C");
				add("Move Disk 3 From A to B");
				add("Move Disk 1 From C to A");
				add("Move Disk 2 From C to B");
				add("Move Disk 1 From A to B");
			}
		};

		expectedStepsList2 = new ArrayList<String>() {
			{
				add("Move Disk 1 From A to C");
				add("Move Disk 2 From A to B");
				add("Move Disk 1 From C to B");
			}
		};

	}

	@Test
	public void testTowerOfHanoi() {

		assertEquals(expectedStepsList1,
				towerOfHanoi.towerOfHanoi("A", "B", "C", 3));
		towerOfHanoi.list.clear();
		assertEquals(expectedStepsList2,
				towerOfHanoi.towerOfHanoi("A", "B", "C", 2));

	}
}