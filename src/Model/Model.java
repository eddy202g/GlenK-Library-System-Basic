package Model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Model {
	
	private ArrayList<Media> newMedia = new ArrayList<Media>();  
	private ArrayList<Users> newUser = new ArrayList<Users>(); 
	private ArrayList<Loans> newLoan = new ArrayList<Loans>();
	
	//////////////////////////
	public void addMedia(Media media){
		newMedia.add(media);
	}
	
	public void resetMedia(){
		newMedia.clear();
	}
	
	public void addUsers(Users users){
		newUser.add(users);
	}
	
	public void resetUsers(){
		newUser.clear();
	}
	
	public void addLoans(Loans loans){
		newLoan.add(loans);
	}
	
	public void resetLoans(){
		newLoan.clear();
	}
	
	
	/////////////////////////////
	public ArrayList<Media> getMedia()
	{	
		return newMedia;
	}
	
	public int getMediaArraySize()
	{
		return newMedia.size();
	}
	
	public ArrayList<Loans> getLoans()
	{
		
		return newLoan;
	}
	
	public int getLoansArraySize()
	{
		return newLoan.size();
	}

	public ArrayList<Users> getUsers() {
		
		return newUser;
	}
	
	
	public int getUsersArraySize()
	{
		return newUser.size();
	}
	
	public void setUsersList(ArrayList<Users> users)
	{
		newUser = users;
	}
}
