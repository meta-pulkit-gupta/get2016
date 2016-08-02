package session2;

/**
 * class to define an node for double link list
 * @author Pulkit Gupta
 *
 * @param <E> : object type
 */
public class DoubleNode<E> {
	
	public E nodevalue;
	DoubleNode<E> next;
	DoubleNode<E> previous;
	
	/**
	 * unparameterized constructor
	 */
	public DoubleNode() {
	
		nodevalue=null;
		next=null;
		previous=null;
	}
	
	/**
	 * parameterized constructor
	 * @param dataValue :  input node value 
	 */
	public DoubleNode(E item){
		
		nodevalue=item;
		next=null;
		previous=null;
	}
	
}