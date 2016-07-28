package session5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
/**
 * connect all the user if they are friends 
 * @author Pulkit Gupta
 * @Date 27 july 2016 
 */

public class Connection {
	public final int INDIVIDUAL_USER = 1;
	public final int ORGANIZATION_USER = 2;
	// store all user's list 
	List<User> allUsers = new ArrayList<User>();
	// store all users name and there id's
	String[] allFriends = new String[100];
	int totalUsers = 0;
	/**
	 * read the file and make nodes
	 * @throws Exception
	 */
	public void getDataFromFile() throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("allData.txt"));
		String s="" ;
		
		while((s = br.readLine()) != null){
			String[] tempString = s.split(",");
			if(tempString[1].equals("Individual")){
				// if user is Individual type then make a Individual type object and assign there property
				IndividualUser individualUser = new IndividualUser();
				individualUser.userId = Integer.parseInt(tempString[0]);
				individualUser.name = tempString[2];
				individualUser.age = Integer.parseInt(tempString[3]);
				individualUser.userType = INDIVIDUAL_USER;
				String[] friendsIds = tempString[4].split(" ");
				for( String ids: friendsIds){
					individualUser.friendsIds.add(Integer.parseInt(ids));
				}
				allFriends[Integer.parseInt(tempString[0])]=tempString[2];
				// add to user's list
				allUsers.add(individualUser);
				totalUsers++;
			}
			else{
				// if user is organization type then make a organization type object and assign there property 
				OrganizationUser organizationUser = new OrganizationUser();
				organizationUser.userId = Integer.parseInt(tempString[0]);
				organizationUser.name = tempString[2];
				organizationUser.organisationId = Integer.parseInt(tempString[3]);
				organizationUser.userType = ORGANIZATION_USER;
				allFriends[Integer.parseInt(tempString[0])]=tempString[2];
				// add to user's list
				allUsers.add(organizationUser);
				totalUsers++;
			}
		}
		br.close();
	}
	
	/**
	 * display the network 
	 */
	public void displayList(){
		System.out.println(allUsers);
	}
	
	/**
	 * make connection between nodes
	 */
	public void assignFriendsName(){
		// make connection for all users 
		for(User user : allUsers){
			if(user.userType == INDIVIDUAL_USER){
				IndividualUser individualUser ;
				individualUser = (IndividualUser) user;
				for(int ids : individualUser.friendsIds){
					individualUser.friendsName.add(allFriends[ids]);
				}
			}
		}
	}
	/**
	 *check user is present or not
	 * @param name // search the user's name
	 */
	public void findUser(String name){
		for(int i=1;i<=totalUsers || allFriends[i]!=null;i++){
			if(allFriends[i].equals(name)){
				System.out.println( name+"  is present");
				return;
			}
		}
		System.out.println(name+" user does not exist");
	}
	/**
	 * show user;s profile
	 * @param name String  
	 */
	public void getProfile(String name){
		
		// check if user is present or not
		for(User user : allUsers){
			if((user.name).equals(name)){
				System.out.println(user);
				return ;
			}
		}
		System.out.println("sorry, "+ name +" not present");
	}
}
