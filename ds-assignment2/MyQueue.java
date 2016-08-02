package session2;

public class MyQueue<E> {

	private E[] myObjectArray;
    private int front = 0 , rear = 0 , actualSize = 0;
    private int size;
    
    /**
     * non parameterized constructor
     */
    @SuppressWarnings("unchecked")
	public MyQueue() {
        
        size = 10;
        myObjectArray =  (E [])new Object[size];
    }
    
    /**
     * parameterized constructor
     * @param size : size of object array
     */
    @SuppressWarnings("unchecked")
	public MyQueue(int size) {
        
        this.size = size;
        myObjectArray = (E [])new Object[size];
    }
    
    /*
     * method to increase the size of the list to support the feature of dynamic memory allocation
     */
    @SuppressWarnings("unchecked")
	private void increaseListSize() {
        
        E[] temporaryArray = (E [] )new Object[size + size / 2];
        
        for( int incrementor = 0 ; incrementor < size ; incrementor ++) {
            
            temporaryArray[incrementor] = myObjectArray[incrementor];
        }
        size = size + size / 2;
        myObjectArray = temporaryArray;
    }
    
    /**
     * method to add object at a element to queue
     * @param object : object to be added to queue
     * @param index : position at which object is to be added in list
     */
    public void enqueue(E object) {
        
        if (size < actualSize+1){
            
            increaseListSize();
        }
        rear++;
        myObjectArray[rear] = object;
        
        if( front == 0) {
        	
        	front = 1;
        }
        actualSize++;    
    }
    
    /**
     * method to delete object from queue
     * @return object : object deleted from queue
     */
    public E dequeue() {
        
        if( front == 0) {
        	
        	throw new IndexOutOfBoundsException("queue is empty");
        } else {
        	
        	E objectToDelete = myObjectArray[front];
            front++;
            if(front > rear) {
            	
            	front = 0 ;
            	rear = 0;
            }
             actualSize--;   
             return objectToDelete;
        }
    }
    
    /**
     * method to traverse and display the list
     */
    public void traverse() {
    	
    	for(int incrementor = front ; incrementor <=  rear ; incrementor++) {
    		
    		System.out.println(myObjectArray[incrementor]);
    	}
    }
    
    /**
     * method to get the element at front in queue
     */
    public E getFront() {
    	
    	if(front == 0) {
    		
    		return null;
    	} else {
    		
    		return myObjectArray[front];
    	}
    }
    
    /**
     * method to check if queue is empty or not
     * @return boolean
     */
    public boolean isEmpty() {
    	
    	if(front == 0 && rear == 0) {
    		
    		return true;
    	} else {
    		
    		return false;
    	}
    }
    
    /**
     * main method
     */
    public static void main(String ar[]) {
    	
    	MyQueue<String> queue = new MyQueue<String>();
    	
    	//test enqueue
    	queue.enqueue("one");
    	queue.enqueue("two");
    	queue.enqueue("three");
    	queue.enqueue("four");
    	
    	//test traverse
    	System.out.println("test enqueue and traverse");
    	queue.traverse();
    	
    	//test dequeue
    	queue.dequeue();
    	queue.dequeue();
    	queue.dequeue();
    	
    	//test traverse
    	System.out.println("test dequeue and traverse");
    	queue.traverse();
    }
}
