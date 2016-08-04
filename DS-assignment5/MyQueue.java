package session5;

import java.util.LinkedList;
import java.util.List;

/**
 * class to implement queue
 * @author Pulkit Gupta 
 * @param <E>
 */
public class MyQueue<E> {

	private List<E> myObjectArray;
    private int front = -1;
    
    /**
     * non parameterized constructor
     */
    public MyQueue() {
        
        myObjectArray =  new LinkedList<E>();
    }
    
    /**
     * method to add object at a element to queue
     * @param object : object to be added to queue
     * @param index : position at which object is to be added in list
     */
    public void enqueue(E object) {
        
        myObjectArray.add(object);
        
        if( front == -1) {
        	
        	front = 0;
        }  
    }
    
    /**
     * method to delete object from queue
     * @return object : object deleted from queue
     */
    public E dequeue() {
        
        if( myObjectArray.isEmpty()) {
        	
        	throw new IndexOutOfBoundsException("queue is empty");
        } else {
        	
        	if(myObjectArray.size() == 1) {
        		
        		return myObjectArray.remove(front--);
        	} else  {
        		
        		 return myObjectArray.remove(front);
        	}
        }
    }
    
    /**
     * method to get the element at front in queue
     */
    public E getFront() {
    	
    	if(front == -1) {
    		
    		return null;
    	} else {
    		
    		return myObjectArray.get(front);
    	}
    }
    
    /**
     * method to check if queue is empty or not
     * @return boolean
     */
    public boolean isEmpty() {
    	
    	if(front == -1) {
    		
    		return true;
    	} else {
    		
    		return false;
    	}
    }
    
    /**
     * main method
     * @param ar : String[]
     */
    public static void main(String ar[]) {
    	
    	MyQueue<String> queue = new MyQueue<String>();
    	
    	//test isEmpty
    	System.out.println("\n\ntest isEmpty\n\n");
    	System.out.println(queue.isEmpty());
    	
    	//test enqueue
    	queue.enqueue("one");
    	queue.enqueue("two");
    	queue.enqueue("three");
    	queue.enqueue("four");
    	
    	//test traverse
    	System.out.println("\n\ntest enqueue\n\n");
    	System.out.println(queue.myObjectArray);
    	
    	//print
    	System.out.println("\n\ntest get front\n\n");
    	System.out.println(queue.getFront());
    	
    	//test dequeue
    	queue.dequeue();
    	
    	//print
    	System.out.println("\n\ntest dequeue\n\n");
    	System.out.println(queue.myObjectArray);
    	
    	//test get front
    	System.out.println("\n\ntest get front\n\n");
    	System.out.println(queue.getFront());
    	
    	//test isEmpty
    	System.out.println("\n\ntest isEmpty\n\n");
    	System.out.println(queue.isEmpty());
    	
    	//test dequeue
    	queue.dequeue();
    	queue.dequeue();
    	
    	//print
    	System.out.println("\n\ntest dequeue\n\n");
    	System.out.println(queue.myObjectArray);
    }
}
