package session2;


/**
 * class to implement doubly linked list
 * @author Pulkit Gupta
 *
 * @param <E> : object type
 */
public class MyDoublyLinkedList<E> {

	DoubleNode<E> start = null;
	DoubleNode<E> current = null;
	
	/**
	 * Method to add data to link list
	 * @param : data to be added to list
	 */
	public void add(E data) {

		DoubleNode<E> nodeNew = new DoubleNode<E>();
		nodeNew.nodevalue = data;

		if (start == null) {
			
			start = nodeNew;
		} else {
			
			current = start;
			while (current.next != null) {
				
				current = current.next;
			}
			nodeNew.previous = current;
			current.next = nodeNew;
		}
	}
	
	/**
	 * method to traverse the whole list starting from last node and display list items
	 */
	void backwardTraverse() {
		
		if(isEmpty()) { 
			
			throw new IndexOutOfBoundsException("list is empty");
		}
		current = start;
		while (current.next != null) {

			current = current.next;
		}
		while (current != null) {
			
			System.out.println(current.nodevalue);
			current = current.previous;
		}
	}
	
	/**
	 * method to remove the last element of the list
	 * @return : node value of the removed element
	 */
	public E removeLastElement() {
		
		DoubleNode<E> previousNode = new DoubleNode<E>();
		
		if(isEmpty()) { 
			
			throw new IndexOutOfBoundsException("list is empty");
		}
		current = start;
		
			while (current != null) {
					
					previousNode = current;
					current = current.next;
			}
			if(previousNode.previous != null) {
				
				previousNode.previous.next = null;
			} else {
				
				start = null;
			}
			return previousNode.nodevalue;
	}
	
	/**
	 * method to return the last element of the list
	 * @return : node value of the last element of the list
	 */
	public E returnLastElement() {
		
		DoubleNode<E> previousNode = new DoubleNode<E>();
		
		if(isEmpty()) { 
			
			throw new IndexOutOfBoundsException("list is empty");
		}
		current = start;
		
			while (current != null) {
					
					previousNode = current;
					current = current.next;
			}
			return previousNode.nodevalue;
	}
	
	/**
	 * method to find if the list is empty or not
	 * @return true if list is empty 
	 * 		   false if list has element
	 */
	public boolean isEmpty() {
		
		if(start == null) {
			return true;
		} else {
			
			return false;
		}
	}
	

}
