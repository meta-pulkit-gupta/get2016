package session5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Social Network
 * @author Pulkit Gupta
 * @Date 27 july 2016 
 */
public class SocialNetwork {

	// get user input number
	public static int getInputNumber() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Please Enter the Valid Number");
			inputNumber = getInputNumber();
		}
		return inputNumber;
	}
	// get user's input string
	public static String getInputString() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString;
		try {
			inputString = br.readLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Enter again");
			inputString = getInputString();
		}
		return inputString;
	}

	
	public static void main(String[] args) throws Exception {
		// make connection object to define all the connection between users
		Connection con = new Connection();
		// read data from file
		con.getDataFromFile();
		//  assign each user's friend
		con.assignFriendsName();
		int loopVariable =1 ;
		while(loopVariable == 1){
			System.out.println("Enter 1 for display social network");
			System.out.println("Enter 2 for search user ");
			System.out.println("Enter 3 to get user profile");
			System.out.println("Enter 4 to Exit");
			String inputString;
			// get user's choice
			int choice = getInputNumber();
			switch(choice){
			case 1 :
				// display social network
				con.displayList();
				break;
			case 2 :
				// search a user 
				 inputString = getInputString();
				con.findUser(inputString);
				break;
			case 3 :
				// get profile of user
				inputString=getInputString();
				con.getProfile(inputString);
				break;
			case 4 :
				// Exit
				loopVariable = 0;
				break ;
			default :
				System.out.println("Please enter the correct choice");
			}
		}
		
		// use override equals methods
		User testUser1 = new User();
		testUser1.userId = 10;
		User testUser2 = new User();
		testUser2.userId = 20;
		User testUser3 = new User();
		testUser3.userId = 10;
		boolean equalOrNot = testUser1.equals(testUser2);
		if(equalOrNot){
			System.out.println("These users are equal");
		}
		else{
			System.out.println("These users are not equal");
		}
		equalOrNot = testUser1.equals(testUser3);
		if(equalOrNot){
			System.out.println("These users are equal");
		}
		else{
			System.out.println("These users are not equal");
		}
	}

}
