package Model;

import java.io.Serializable;

///// This class is a superclass that will hold attributes
///// that can be shared across associated subclasses.
///// It is abstract, meaning it will not be used as a blueprint for 
///// an object
abstract public class Media implements Serializable {
	protected static int mediaID = 2000;
	protected int ID;
	protected String title;
	protected double costPrice;
	protected String publisher;
	protected String mediaType;
	
	///// The following are methods created to be overritten in the 
	///// subclasses associated with this superclass.
	
	
	public String details() {
		
		return "";
		
	}
	
	public String bookDetails() {
		
		return "";
	}
	

	
	public String videoDetails() {
		
		return "";
	}

	public String journalDetails() {

		return "";
	}
	
	public String cdDetails() {

		return "";
	}

	///// The following methods are a series of getters, 
	///// which store certain information within a variable, and then they 
	///// can be accessed as parameters of an object from the controller.
	public String getMediaType()
	{
		return mediaType;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getTitle()
	{
		return title;
	}
}
