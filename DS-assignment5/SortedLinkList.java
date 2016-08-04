package session5;

import java.util.LinkedList;

/**
 * To create a SortedLinkedList.
 * 
 * @author Pulkit Gupta
 *
 * @param <E>
 *            generic type LinkedList.
 */

public class SortedLinkList<E> {
	LinkedList<E> list;

	public SortedLinkList() {
		list = new LinkedList<E>();
	}

	/**
	 * Called by the insert method recursively for inserting elements to their
	 * rightful place.
	 * 
	 * @param e
	 *            Generic type object
	 * @param index
	 *            index of the elements.
	 * @return true or false if the element gets add or not.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private boolean inserRec(E e, int index) {
		while (index < list.size()) {
			if (((Comparable) e).compareTo(list.get(index)) <= 0) {
				list.add(index, e);
				return true;
			} else {
				index++;
				return inserRec(e, index);
			}
		}
		return false;
	}

	/**
	 * Insert the element in the list.
	 * 
	 * @param e
	 *            generic type elements.
	 * @return true or false according to if the element is added or not.
	 */

	public boolean insert(E e) {
		if (list.size() == 0) {
			return list.add(e);
		} else {
			return inserRec(e, 0);
		}
	}

	public LinkedList<E> getList() {
		return list;
	}
}
