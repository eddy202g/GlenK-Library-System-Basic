package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Loans implements Serializable{
	
	///// These are the variables that will be stored in the
	///// constructor, to make up the blueprint for an object
	private static int loanID = 3000;
	private int mediaID;
	private int userID;
	private int id;
	private String returnDate;
	protected int fine;
	protected String returned;
	
	
	///// this is an overloaded constructor. it has been loaded 
	///// with parameters to be used in the object.
	public Loans(int mediaID, int userID, String returnDate, String returned, int fine)
	{
		this.mediaID = mediaID;
		this.userID = userID;
		this.fine = fine;
		this.returnDate = returnDate;
		this.returned = returned;
		
		loanID = loanID + 1;
		id = loanID;
	}
	
	///// This is a method that will be called to display loan details.
	///// each object that belongs to this class will have access to this
	///// method, and it will display each loans personal information
	public String loanDetails()
	{
		return "\nLoan ID: " + id
				+ "\nMedia ID: " + mediaID
				+ "\nUser ID: " + userID
				+ "\nReturn Date: " + returnDate
				+ "\nItem Returned: " + returned
				+ "\nFine: " + "£" + fine;
	}
	
	public String toString()
	{
		return  "Loan ID: " + id
				+ "        " + "Media ID: " + mediaID
				+ "        " + "User ID: " + userID
				+ "        " + "Return Date: " + returnDate;
				
	}
	
	public int getUserID()
	{
		return userID;
	}
	
	public int getMediaID()
	{
		return mediaID;
	}
	
	public int getLoanID()
	{
		return id;
	}
	
	public int getFine()
	{
		return fine;
	}
	
	public String getReturnDate()
	{
		return returnDate;
	}
	
	public String getReturned()
	{
		return returned;
	}
	
	public void setReturned(String returned)
	{
		this.returned = returned;
	}
	
	public void setFine(int fine)
	{
		this.fine = fine;
	}
}
