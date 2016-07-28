package session5;

import java.util.ArrayList;
import java.util.List;
/**
 *user may be a Individual type and have there own property
 * @author Pulkit Gupta
 *
 */
public class IndividualUser extends User {

	int age ;
	List<Integer> friendsIds ;
	List<String> friendsName ;
	public IndividualUser(){
		friendsIds = new ArrayList<Integer>();
		friendsName = new ArrayList<String>();
	}
	
	 public String toString(){
		 String friends = "" ;
		 for(String s : friendsName){
			 friends += s;
			 friends += "\t";
		 }
			String allDataToShow = "\n"+"Name: " + this.name +"\t" +
			"Age is : " + this.age +"\tFriends Are: " + friends;
			return allDataToShow;
		}
	 
}
