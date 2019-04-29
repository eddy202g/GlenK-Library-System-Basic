package Model;

import java.io.Serializable;

///// This class is a superclass that will hold attributes
///// that can be shared across associated subclasses.
///// It is abstract, meaning it will not be used as a blueprint for 
///// an object
abstract public class Users implements Serializable{

///// These are the variables that will be stored in the
///// constructor, to make up the blueprint for an object.
///// These have a protected access modifier, which means
///// the information they store will be encapsulated within this 
///// superclass and its subclasses, meaning the information
///// is only visible to this class heirarchy
protected static int userID = 1000;
protected int ID;
protected String firstName;
protected String surName;
protected String username;
protected String password;
protected String usertype;
protected String staffEmail;

protected String addressOne;
protected String addressTwo;
protected String town;
protected String postcode;
protected String telephoneNo;
protected String dob;



///// The following methods are a series of getters, 
///// which store certain information within a variable, and then they 
///// can be accessed as parameters of an object from the controller.

public boolean validateUser(String uname, String pwd)
{
	if(username.equals(uname) && password.equals(pwd))
	{
		return true;
	}
	else
	{
		return false;
	}
}

public String getUsername()
{
	return username;	
}

public String getPassword()
{
	return password;
	
}

public String getUserType(){
	return usertype;
}

public int getID()
{
	return ID;
}

///// The following are methods created to be overritten in the 
public String details()
{
	return "";
}

}
