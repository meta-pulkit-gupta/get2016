package session8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * To create a tree.
 * 
 * @author Pulkit Gupta
 *
 * @param <E>
 *            generic type tree.
 */

public class Tree<E> {
	Node<E> root;
	Node<E> inverseBST;
	List<E> traverse;

	public Tree() {
		root = null;
	}

	private static class Node<E> {
		E data;
		Node<E> right;
		Node<E> left;

		Node(Node<E> prev, E data, Node<E> next) {
			this.data = data;
			this.right = next;
			this.left = prev;

		}
	}

	/**
	 * Add element of type E in the tree
	 * 
	 * @param e
	 *            generic type element.
	 * @return boolean if successfully insert the element in the tree.
	 */
	public boolean add(E e) {
		Node<E> node = new Node<E>(null, e, null);
		if (root == null) {
			root = node;
			return true;
		}
		return addRecursive(root, node);
	}

	/**
	 * Add a list of elements to the tree.
	 * 
	 * @param list
	 *            list of elements of type E.
	 * @return boolean if successfully insert the elements in the tree.
	 */
	public boolean add(List<E> list) {
		Iterator<E> itr = list.iterator();
		int count = 0;
		while (itr.hasNext()) {
			if (add(itr.next())) {
				count++;
			}
		}
		if (count == list.size()) {
			return true;
		}
		return false;
	}

	/**
	 * Add elements in the tree by using recursion.
	 * 
	 * @param root
	 *            root element to the node.
	 * @param node
	 *            the node to be inserted in the tree.
	 * @return boolean if successfully insert the elements in the tree.
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private boolean addRecursive(Node<E> root, Node<E> node) {
		if (((Comparable) root.data).compareTo(node.data) >= 0) {
			if (root.left == null) {
				root.left = node;
				return true;
			}
			return addRecursive(root.left, node);
		} else {
			if (root.right == null) {
				root.right = node;
				return true;
			} else {
				return addRecursive(root.right, node);
			}
		}
	}

	/**
	 * To traverse the tree in fashion of inorder preorder or postorder
	 * traversal.
	 * 
	 * @param type
	 *            int value to get which type of traversal choose.
	 * @return list of elements traversed.
	 * @throws IllegalArgumentException
	 *             if number is other than 1,2 or 3.
	 */

	public void traverse() {
		// initializing the array list
		traverse = new ArrayList<E>();
		// Checking for the type of traversing to be used
		inOrder(root);
		printNodes();

	}

	/**
	 * print the nodes of the tree.
	 */
	public void printNodes() {
		Iterator<E> itr = traverse.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "  ");
		}
	}
	
	public List<E> getTraverse() {
		return traverse;
	}

	/**
	 * To make the tree inorder
	 * 
	 * @param root
	 *            node
	 */

	private void inOrder(Node<E> root) {

		if (root == null) {
			return;
		}
		inOrder(root.left);
		traverse.add(root.data);
		inOrder(root.right);
	}
}
