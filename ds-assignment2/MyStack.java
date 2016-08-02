package session2;

/**
 * class to implement stack
 * @author Pulkit Gupta
 *
 * @param <E> : object type which stack will hold
 */
public class MyStack<E> {

	MyDoublyLinkedList<E> myStackList;
	
	/**
	 * unparameterized constructor
	 */
	public MyStack() {
		
		myStackList = new MyDoublyLinkedList<E>();
	}
	
	/**
	 * method to push data into stack
	 * @param data : data to be pushed
	 */
	public void push(E data) {
		
		myStackList.add(data);
	}
	
	/**
	 * method to pop data from stack
	 * @return : popped node's value
	 */
	public E pop() {
		
		if(!( myStackList.isEmpty())) {
			
			return myStackList.removeLastElement();
		}
		throw new IndexOutOfBoundsException("stack is empty");
	}
	
	/**
	 * method to traverse stack from top to bottom 
	 */
	public void traverse() {
		
		myStackList.backwardTraverse();
	}
	
	/**
	 * method to get the top most element of the stack
	 * @return : stack's top most element
	 */
	public E getPeek() {
		
		if(!( myStackList.isEmpty())) {
			
			return myStackList.returnLastElement();
		}
		throw new IndexOutOfBoundsException("stack is empty");
	}
	
	/**
	 * method to find if the stack is empty or not
	 * @return true if list is empty 
	 * 		   false if list has element
	 */
	public boolean isEmpty() {
		
		return myStackList.isEmpty();
	}
	
	/**
	 * main method to check working of the stack operations
	 * @param : string[]
	 */
	public static void main(String[] args) {
		
		MyStack<String> stackObject = new MyStack<String>();
		
		//test isEmpty
		System.out.println("test is empty : "+ stackObject.isEmpty());
		
		//test add
		stackObject.push("1");
		stackObject.push("2");
		stackObject.push("3");
		
		//test traverse
		System.out.println("test add and traverse");
		stackObject.traverse();
		
		//test getPeek
		System.out.println("test getPeek : "+stackObject.getPeek());
		
		//test pop
		System.out.println("test pop : "+stackObject.pop());
		
		//test getPeek
		System.out.println("test getPeek : "+stackObject.getPeek());
				
		//test pop
		System.out.println("test pop : "+stackObject.pop());
				
		//test getPeek
		System.out.println("test getPeek : "+stackObject.getPeek());
				
		//test pop
		System.out.println("test pop : "+stackObject.pop());
				
		//test isEmpty
		System.out.println("test is empty : "+ stackObject.isEmpty());
	
	}
}
