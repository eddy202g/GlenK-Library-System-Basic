package Model;

///// This class is a subclass of the superclass Users.
///// Because this class extends Users, it automatically inherits
///// all of the parent classes attributes.
public class FullUser extends Users {


	///// this is an overloaded constructor. it has been loaded 
	///// with parameters to be used in the object.
	public FullUser(String firstName, String surName, String addressOne, String addressTwo, String town, 
				String postcode, String telephoneNo, String dob, String username, String password)
	{
		this.firstName = firstName;
		this.surName = surName;
		this.addressOne = addressOne;
		this.addressTwo = addressTwo;
		this.town = town;
		this.postcode = postcode;
		this.telephoneNo = telephoneNo;
		this.dob = dob;
		this.username = username;
		this.password = password;
		
		userID = userID + 1;
		ID = userID;
		
		usertype = "full";
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
				+ "\nAddress 1: " + addressOne
				+ "\nAddress 2: " + addressTwo
				+ "\nTown: " + town
				+ "\nPostcode: " + postcode
				+ "\nTelephone Number: " + telephoneNo
				+ "\nDate of Birth: " + dob;
				//+ "\nPassword";
	}
	
	@Override
	public String toString()
	{
		
		return "\nUser ID: " + ID
				+ " Name: " + firstName + " " + surName;
	}
}

