package session5;
/**
 * Some property are common in all the users so make it parent class
 * @author Pulkit Gupta
 * @Date 27 july 2016
 *
 */
public class User {

	// user or organization name 
	String name = "";
	// a unique id assign to every user
	int userId;
	// type of user Individual user or Organization User
	int userType;
	
	// override equals method
	// now if two user's user id is same then this method return true else false 
		 public boolean equals(User user){
			 if(this.userId == user.userId){
				 return true;
			 }
			 return false;
		 }
		 
		 // override hash code method
		 // return user's id 
		 public int hashCode(){
			 return this.userId;
		 }
}
