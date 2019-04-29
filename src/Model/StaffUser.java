package Model;

///// This class is a subclass of the superclass Users.
///// Because this class extends Users, it automatically inherits
///// all of the parent classes attributes.
public class StaffUser extends Users{

	///// These are extra variables rewuired for this subclass only.
	///// Other attributes are inherited from the superclass
	private int teleExt = 0;
	
	///// this is an overloaded constructor. it has been loaded 
	///// with parameters to be used in the object.
	public StaffUser(String firstName, String surName, String staffEmail, int teleExt, 
						String username, String password)
	{
		this.firstName = firstName;
		this.surName = surName;
		this.staffEmail = staffEmail;
		this.teleExt = teleExt;
		this.username = username;
		this.password = password;
		
		usertype = "staff";
		
		userID = userID + 1;
		ID = userID;
	}
		
	///// This is an example of method overriding.
	///// The initial method was written in the superclass, 
	///// therefore the subclass inherits the method and can be used to 
	///// store separate details from all of the other
	///// subclasses
	@Override
	public String details()
	{
		return "\nUser ID: " + ID
				+ "\nForename: " + firstName
				+ "\nSurname: " + surName
				+ "\nEmail Address: " + staffEmail
				+ "\nTelephone Extension: " + teleExt;
	}
	
	@Override
	public String toString()
	{
		
		return "\nUser ID: " + ID
				+ " Name: " + firstName + " " + surName;
	}
}


