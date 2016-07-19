package session4;

/**This program is to solve the tower of hanoi through recursion.
 * 
 * @author Pulkit Gupta
 * @Date   18/07/2016
 */

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
	public ArrayList<String> list = new ArrayList<String>();

	/**
	 * This method is to find the steps to solve tower of hanoi problem with
	 * given number of disks.
	 * 
	 * @param source
	 *            is the peg from which the disk has to be transfered.
	 * @param destination
	 *            is the peg from which the disk has to be transfered.
	 * @param temp
	 *            is the peg that is used as temporary rod to hold the disks.
	 * @param numOfDisk
	 *            the number of disk for which the moves has to be found.
	 * @return a list of the move by which the disk can be transfered from
	 *         source to destination.
	 */
	public List<String> towerOfHanoi(String source, String destination,
			String temp, int numOfDisk) {
		if (numOfDisk == 1) {
			System.out.println("Move Disk " + numOfDisk + " From " + source
					+ " to " + destination);
			list.add("Move Disk " + numOfDisk + " From " + source + " to "
					+ destination);
			return list;
		} else {
			towerOfHanoi(source, temp, destination, numOfDisk - 1);
			System.out.println("Move Disk " + numOfDisk + " From " + source
					+ " to " + destination);
			list.add("Move Disk " + numOfDisk + " From " + source + " to "
					+ destination);
			towerOfHanoi(temp, destination, source, numOfDisk - 1);
			return list;
		}
	}

	public static void main(String[] args) {
		TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
		towerOfHanoi.towerOfHanoi("A", "B", "C", 3);
	}

}
