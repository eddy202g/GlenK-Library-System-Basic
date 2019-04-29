package Model;

///// This class is a subclass of the superclass Users.
///// Because this class extends Users, it automatically inherits
///// all of the parent classes attributes.
public class AdminUser extends Users{
		
		///// this is an overloaded constructor. it has been loaded 
		///// with parameters to be used in the object.
		public AdminUser(String firstName, String surName, String username, String password)
		{
			this.firstName = firstName;
			this.surName = surName;
			this.username = username;
			this.password = password;
			
			ID = userID;
			
			usertype = "admin";
		}
		@Override
		public String details()
		{
			
			return "User ID: " + ID
					+ "\n!!!!! INFORMATION SECURITY PROTECTED !!!!!";
		}
		
		@Override
		public String toString()
		{
			
			return "\nUser ID: " + ID
					+ " Name: " + firstName + " " + surName;
		}
}