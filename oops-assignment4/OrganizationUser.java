package session5;
/**
 * user may be a organization and have there own property
 * @author Pulkit Gupta
 * @Date 27 july 2016
 */
public class OrganizationUser extends User {

	// each organization have a unique id 
	int organisationId ;

	// over ride the toString method
	 public String toString(){
		String allDataToShow = "\n" + "Name: " + this.name +"\t" +
		"Organisation Id : " + this.organisationId ;
		return allDataToShow;
	}
	 
	
}
