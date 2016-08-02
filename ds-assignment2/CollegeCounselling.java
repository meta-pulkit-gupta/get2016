package session2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * class for learning practical application of queue in college counseling
 * @author Pulkit Gupta
 *
 */
public class CollegeCounselling {

	MyQueue<String> studentQueueBasedOnRank;
	List<String> collegeList;
	List<String> resultList;
	List<String> selectedClgList;
	
	/**
	 * unparameterized constructor
	 */
	public CollegeCounselling() {
		
		studentQueueBasedOnRank = new MyQueue<String>();
		collegeList = new LinkedList<String>();
		resultList = new ArrayList<String>();
		selectedClgList = new LinkedList<String>();
	}
	
	/**
	 * main method for counseling process
	 * @param ar : string[]
	 */
	public static void main(String ar[]) {
		
		CollegeCounselling counsel = new CollegeCounselling();
		Scanner scaner =  new Scanner(System.in);
		counsel.createStudentLIst();
		counsel.createClgList();
		counsel.councelling(scaner);
		counsel.displayResult();
		scaner.close();
	}
	
	/**
	 * method to create queue of students based on their ranks
	 */
	public void createStudentLIst() {
		
		studentQueueBasedOnRank.enqueue("stu rank 1");
		studentQueueBasedOnRank.enqueue("stu rank 2");
		studentQueueBasedOnRank.enqueue("stu rank 3");
		studentQueueBasedOnRank.enqueue("stu rank 4");
	}
	
	/**
	 * method to create list of colleges based on their ranks
	 */
	public void createClgList() {
		
		collegeList.add("college 1");
		collegeList.add("college 2");
		collegeList.add("college 3");
	}
	
	/**
	 * method to display list of colleges based on their ranks
	 */
	public void displayClgList() {
		
		for( String clgName : collegeList) {
			
			System.out.println(clgName);
		}
	}
	
	/**
	 * method to perform counseling
	 */
	public void councelling(Scanner scaner) {
		
		String choosenClg="";
		
		while(!(studentQueueBasedOnRank.isEmpty())) {
			
			System.out.println("\n!!Welcome to counseling process :"+studentQueueBasedOnRank.getFront());
			
			if(selectedClgList.size() == collegeList.size()) {
				
				System.out.println("\navailable college list was : ");
				displayClgList();
				System.out.println("\nno seats available please try again in next round of counseling process");
				choosenClg = "not applicable";
			} else {
				
			System.out.println("\nplease choose one from the list of colleges");
			displayClgList();
			choosenClg = takeInput(scaner);
			}
			
			choosenClg += "\t"+studentQueueBasedOnRank.dequeue();
			resultList.add(choosenClg);
		}
	}
	
	/*
	 * method to take user input
	 * @param scaner : scanner object
	 */
	private String takeInput(Scanner scaner) {
		
		System.out.println("\nplease enter your choice");
		String input = "" ;
		
		while(input.isEmpty()) {
			
			input = scaner.nextLine().trim();
		}
		
		if(collegeList.contains(input) && !(selectedClgList.contains(input))) {
			
			
			selectedClgList.add(input);
			return (input);
		} else {
			
			if(selectedClgList.contains(input)) {
				
				System.out.println(input+" has no seats left\nplease choose another cloege from above options");
			} else {
				
				System.out.println("you have not entered the colege name correctly\nplease spell check your input before submision");
			}
			return takeInput(scaner);
		}
	}
	
	/**
	 * method to display allotment of colleges and students
	 */
	public void displayResult() {
		
		System.out.println("\nlist of allotments\n\ncollege name\tstudent name" );
		for(String temp : resultList) {
			
			System.out.println(temp);
		}
	}
}
