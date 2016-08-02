package session2;


public class MainTestClass {

	public static void main(String[] args) {
		MyDoublyLinkedList<String> list = new MyDoublyLinkedList<String>();
		
		//test isEmpty
		System.out.println("test is empty : "+ list.isEmpty());
				
		//test add method 
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		
		//test returnLastElement
		System.out.println("test return last : "+list.returnLastElement());
		
		//test removeLastElement
		System.out.println("test removelast : "+list.removeLastElement());

		//test backward traverse method
		System.out.println("\nyour list is :");
		list.backwardTraverse();
		
		//test returnLastElement
		System.out.println("test return last : "+list.returnLastElement());
				
		//test removeLastElement
		System.out.println("test removelast : "+list.removeLastElement());

		//test backward traverse method
		System.out.println("\nyour list is :");
		list.backwardTraverse();
		
		//test isEmpty
		System.out.println("test is empty : "+ list.isEmpty());
		
		//test returnLastElement
		System.out.println("test return last : "+list.returnLastElement());
				
		//test removeLastElement
		System.out.println("test removelast : "+list.removeLastElement());
				
		//test isEmpty
		System.out.println("test is empty : "+ list.isEmpty());
		
		
	}

}
