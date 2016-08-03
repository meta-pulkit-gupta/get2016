package session3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * To create a tree.
 * @author Pulkit Gupta
 *
 * @param <E> generic type tree.
 */
public class Tree<E> {
	Node<E> root;
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
	 * @param e generic type element.
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
	 * @param list list of elements of type E.
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
	 * @param root root element to  the node.
	 * @param node the node to be inserted in the tree.
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
	 * To traverse the tree in fashion of inorder preorder or postorder traversal.
	 * @param type int value to get which type of traversal choose.
	 * @return list of elements traversed.
	 * @throws IllegalArgumentException if number is other than 1,2 or 3.
	 */

	public List<E> traverse(int type) throws IllegalArgumentException {
		// initializing the array list
		traverse = new ArrayList<E>();
		// Checking for the type of traversing to be used
		switch (type) {
		case 1:
			// starting the inorder traversal from root node
			inOrder(root);
			break;
		case 2:
			// starting the preorder traversal from root node
			preOrder(root);
			break;
		case 3:
			// starting the postorder traversal from root node
			postOrder(root);
			break;
		default:
			// Wrong type of traversal input
			throw new IllegalArgumentException("Wrong Traversing");
		}
		printNodes();
		return traverse;
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
	
	/**
	 * To make the tree preorder
	 * @param root node
	 */

	private void preOrder(Node<E> root) {

		if (root == null) {
			return;
		}
		traverse.add(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	/**
	 * To make the tree postorder
	 * @param root node
	 */

	private void postOrder(Node<E> root) {

		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		traverse.add(root.data);
	}

	/**
	 * To make the tree inorder
	 * @param root node
	 */
	private void inOrder(Node<E> root) {

		if (root == null) {
			return;
		}
		inOrder(root.left);
		traverse.add(root.data);
		inOrder(root.right);
	}
	
	/**
	 * Add a list of elements to the tree.
	 * @param list list of elements of type E.
	 * @return boolean if successfully insert the elements in the tree.
	 */
	
	public boolean addInverse(List<E> list) {
		Iterator<E> itr = list.iterator();
		int count = 0;
		while (itr.hasNext()) {
			if (addInverse(itr.next())) {
				count++;
			}
		}
		if (count == list.size()) {
			return true;
		}
		return false;
	}
	
	/**
	 * Add element of type E in the tree in reverse fashion.
	 * @param e generic type element.
	 * @return boolean if successfully insert the element in the tree.
	 */
	public boolean addInverse(E e) {
		Node<E> node = new Node<E>(null, e, null);
		if (root == null) {
			root = node;
			return true;
		}
		return addRecursiveInverse(root, node);
	}
	
	/**
	 * Add elements in the tree by using recursion.
	 * @param root root element to  the node.
	 * @param node the node to be inserted in the tree.
	 * @return boolean if successfully insert the elements in the tree.
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private boolean addRecursiveInverse(Node<E> root, Node<E> node) {
		if (((Comparable) root.data).compareTo(node.data) <= 0) {
			if (root.left == null) {
				root.left = node;
				return true;
			}
			return addRecursiveInverse(root.left, node);
		} else {
			if (root.right == null) {
				root.right = node;
				return true;
			} else {
				return addRecursiveInverse(root.right, node);
			}
		}
	}
	
	/**
	 * To check whether the two trees are mirror of each other or not.
	 * @param start first tree
	 * @param otherStart second tree
	 * @return boolean if true or false.
	 */
	private boolean checkMirror(Node<E> start, Node<E> otherStart) {
		//Checking if both the trees are empty
		if(start == null && otherStart == null) {
			return true;
		}
		//Checking if one tree is empty and other is not
		if(start == null || otherStart == null) {
			return false;
		} else {
			//Checking if the data at the node is similar in the tree
			if(start.data.equals(otherStart.data)) {
				//Recursively check the mirror similar condition for the left and right subtrees
				return (checkMirror(start.left, otherStart.right) &&
						checkMirror(start.right, otherStart.left));
			}
		}
		return false;
	}
	
	/**
	 * To check whether the two trees are mirror of each other or not.
	 * @param second second tree.
	 * @return boolean true if the tree are mirror image of each other, else false.
	 */
	
	public boolean checkMirror(Tree<E> second){
		return checkMirror(this.root,second.root);
	}
}
