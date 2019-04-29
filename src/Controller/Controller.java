package Controller;

import java.io.FileInputStream;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;



//import javax.print.attribute.standard.Media;


import Model.AdminUser;
import Model.Media;
import Model.Model;
import Model.Books;
import Model.CasualUser;
import Model.CompactDisc;
import Model.FullUser;
import Model.Journals;
import Model.Loans;
import Model.StaffUser;
import Model.Users;
import Model.Video;
import View.AdminScreen;
import View.LoginScreen;
import View.UserScreen;

public class Controller
{
	
	private static Model theModel = new Model();
	
	//ArrayList<Users> newUser = theModel.getUsers();
	ArrayList<Media> newMedia = theModel.getMedia();
	ArrayList<Loans> newLoan = theModel.getLoans();
	
	
	
	
	public static Model getModel(){
		return theModel;
	}
	
	public static int currentUserID;
	
	public Controller()
	{			
		//buildLists();
		
		deserialiseUsers();		
		//deserialiseMedia();
		//deserialiseLoans();
		
		loginScreen();	
	}
	
	private void buildLists()
	{
			///// Build Book objects
			Books bk1 = new Books("Harry Potter", "J.K. Rowling", 12.99, "Children's Fantasy", "Bloomsbury", 250, "978-5-18-132465-9"); 
			theModel.addMedia(bk1);
			
			Books bk2 = new Books("Fellowship of the Ring", "J.R.R Tolkien", 10.99, "Children's Fantasy","Ladybird Publishing", 345, "978-5-19-198273-7"); 
			theModel.addMedia(bk2); //Add book object into ArrayList
			
			Books bk3 = new Books("The Two Towers", "J.R.R Tolkien", 10.99, "Children's Fantasy", "Ladybird Publishing", 300, "978-5-35-184636-2");
			theModel.addMedia(bk3); //Add book object into ArrayList
			
			Books bk4 = new Books("The Return of the King", "J.R.R Tolkien", 10.99, "Children's Fantasy", "Ladybird Publishing", 450, "978-5-12-184123-5");
			theModel.addMedia(bk4); 
			
			///// Build Video Objects
			Video v1 = new Video(92, "Action", "DVD", "Die Hard", 1.00, "Warner Bros.", "Slipcase"); 
			theModel.addMedia(v1); 
			
			Video v2 = new Video(103, "Action", "Blu-Ray", "Robocop", 1.50, "Orion", "Slipcase"); 
			theModel.addMedia(v2); 
			
			Video v3 = new Video(121, "Fantasy/Sci-Fi", "Blu-Ray", "The Empire Strikes Back", 1.50, "LucasFilm", "Slipcase"); 
			theModel.addMedia(v3); 
			
			///// Build Journal Objects
			Journals j1 = new Journals("Food Quality and Safety", 0.00, "Food Safety/Hygiene", "Oxford University", 170, 23991399, 3, "13/10/17" ); 
			theModel.addMedia(j1); 
			
			Journals j2 = new Journals("The British Journal of Criminology", 0.00, "Law/Criminology", "Oxford University", 1276, 14643529, 6, "01/11/17" ); 
			theModel.addMedia(j2); 
			
			Journals j3 = new Journals("Human Rights Law", 0.00, "British Law/Human Rights", "Oxford University", 603, 14617781, 4, "01/12/17" ); 
			theModel.addMedia(j3); 
			
			///// Build CompactDisc Objects
			CompactDisc cd1 = new CompactDisc("Master of Puppets", "Metallica", 8.99, 103, "Jewel Case", "Century Media", 8); 
			theModel.addMedia(cd1); 
			
			CompactDisc cd2 = new CompactDisc("Still Got the Blues", "Gary Moore", 7.99, 91, "Jewel Case", "EMI", 12); 
			theModel.addMedia(cd2); 
			
			CompactDisc cd3 = new CompactDisc("The New Order", "Testament", 7.99, 90, "Jewel Case", "Megaforce", 9); 
			theModel.addMedia(cd3);
			
			//////  Build Admin Objects
			AdminUser am1 = new AdminUser("Eddy", "Morris", "admin", "1234"); 
			theModel.addUsers(am1); 
			
			///// Build Staff Objects
			StaffUser su1 = new StaffUser("Alan", "Fox", "afox@staffemail.co.uk", 023, "aaa", "aaa" ); 
			theModel.addUsers(su1); 
			
			StaffUser su2 = new StaffUser("Jaime", "Herd", "jherd@staffemail.co.uk", 022, "bbb", "bbb"); 
			theModel.addUsers(su2); 
			
			StaffUser su3 = new StaffUser("Candice", "Green", "cgreen@staffemail.co.uk", 021, "ccc", "ccc" ); 
			theModel.addUsers(su3); 
			
			///// Build Full User Objects
			FullUser fu1 = new FullUser("David", "Green", "59 Grennsfield Terrace", " ", "Glencaldy", "KY7 9JA", "01592346758", "13/06/1978", "ddd", "ddd"); 
			theModel.addUsers(fu1); 
			
			FullUser fu2 = new FullUser("Stuart", "Brown", "8 Denfield Avenue", " ", "Cardenrothes", "KY5 3YU", "01592109876", "21/08/1998", "eee", "eee"); 
			theModel.addUsers(fu2); 
			
			FullUser fu3 = new FullUser("Hannah", "McDermott", "10 Lammas Street", " ", "Grassington", "KY5 2JK ", "01592902462", "27/01/1980", "fff", "fff"); 
			theModel.addUsers(fu3); 
			
			///// Build Casual User Objects
			CasualUser cu1 = new CasualUser("Sarah", "Stewart", "91 Arthur Avenue", " ", "Glencaldy", "KY5 7KA", "01592811908", "21/08/1982", "ggg", "ggg");
			theModel.addUsers(cu1);		
			
			CasualUser cu2 = new CasualUser("Vicky", "Stuart", "13 Fore St", " ", "Trotton", "GU31 7RS", "01592176845", "23/08/2000", "hhh", "hhh");
			theModel.addUsers(cu2);
			
			CasualUser cu3 = new CasualUser("Elizabeth", "Robertson", "63 Marlborough Crescent", " ", "Southburgh", "IP25 0RU", "01592156489", "03/09/1987", "iii", "iii");
			theModel.addUsers(cu3);
			
			///// Build Loan Objects
			Loans loan1 = new Loans(2001, 1003, "11/01/2018", "no", 3);
			theModel.addLoans(loan1);
			
			Loans loan2 = new Loans(2003, 1001, "03/01/2018", "no", 0);
			theModel.addLoans(loan2);
			
			Loans loan3 = new Loans(2006, 1005, "10/01/2018",  "no", 1);
			theModel.addLoans(loan3);
	}

	private void loginScreen()
	{
		LoginScreen login = new LoginScreen();
		login.setController(this);
		login.setVisible(true);	
	}

	public boolean validateLogin(String uname, String pwd)
	{
		
		//Iterator<Users> iterate = newUser.iterator();
		
		Iterator<Users> iterate = theModel.getUsers().iterator();
		while(iterate.hasNext())
		{
			Users u = iterate.next();
			if(u.validateUser(uname,pwd))
			{
				String usertype = u.getUserType();
				currentUserID = u.getID();
				openMenuWindow(usertype,currentUserID);
				return true;
			}
		}		
		return false;
	}
	
	private void openMenuWindow(String usertype, int currentUserID)
	{
		if(usertype.equals("admin"))
		{
			AdminScreen admin = new AdminScreen(this);
			//System.out.println(currentUserID);
			admin.setController(this);
			admin.setVisible(true);
		}
		if(usertype.equals("full") || usertype.equals("staff") || usertype.equals("casual"))
		{
			UserScreen user = new UserScreen(this);
			//System.out.println(currentUserID);
			user.setController(this);
			user.setVisible(true);
		}
	}
	
	public void handleScreenEvent(String event)
	{
		if(event.equals("AdminScreenClosed"))
		{
			loginScreen();
		}
		else if(event.equals("AdminScreenClosed"))
		{
			loginScreen();
		}
	}
	
	////////////////////////////////////////////
	//////// Serialise Users ///////////////////
	////////////////////////////////////////////
	public void serialiseUsers()
	{
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream("Users.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(theModel.getUsers());
			out.close();
			fileOut.close();
		}
		catch (IOException i)
		{
			i.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void deserialiseUsers()
	{
		
		//theModel.getUsers();	
		
		try 
		{
			FileInputStream fileIn = new FileInputStream("Users.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			//newUser = (ArrayList<Users>) in.readObject();
			
			ArrayList temp = theModel.getUsers();
			temp = (ArrayList<Users>) in.readObject();
			
			theModel.setUsersList(temp);
			
			System.out.println(theModel.getUsersArraySize());
			
			in.close();
			fileIn.close();
		}
		catch (IOException i)
		{
			i.printStackTrace();
			return;
		}
		catch (ClassNotFoundException c) 
		{
			c.printStackTrace();
			return;
		}
		
		/*
		System.out.println("De-serialised arraylist...");
		Iterator<Users> iterate = newUser.iterator();
		while(iterate.hasNext())
		{
			Users u = iterate.next();
			System.out.println(u.details());
		}	
		*/
	}
	
	////////////////////////////////////////////
	//////// Serialise Media ///////////////////
	////////////////////////////////////////////
	public void serialiseMedia()
	{
		try
		{
			
			FileOutputStream fileOut = new FileOutputStream("Media.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(newMedia);
			out.close();
			fileOut.close();
		}
		catch (IOException i)
		{
			i.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void deserialiseMedia()
	{
		
		
		theModel.getMedia();
		
		try 
		{
			FileInputStream fileIn = new FileInputStream("Media.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			newMedia = (ArrayList<Media>) in.readObject();
			in.close();
			fileIn.close();
		}
		catch (IOException i)
		{
			i.printStackTrace();
			return;
		}
		catch (ClassNotFoundException c) 
		{
			c.printStackTrace();
			return;
		}
			
		System.out.println("De-serialised arraylist...");
		Iterator<Media> iterate = newMedia.iterator();
		while(iterate.hasNext())
		{
			Media m = iterate.next();
			System.out.println(m.details());
		}	
	}
	
	////////////////////////////////////////////
	//////// Serialise Loans ///////////////////
	////////////////////////////////////////////
	public void serialiseLoans()
	{	
		try
		{
			FileOutputStream fileOut = new FileOutputStream("Loans.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(newLoan);
			out.close();
			fileOut.close();
			
			System.out.println("Saved");
		}
		catch (IOException i)
		{
			i.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void deserialiseLoans()
	{
		
		
		theModel.getLoans();
		
		try 
		{
			FileInputStream fileIn = new FileInputStream("Loans.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			newLoan = (ArrayList<Loans>) in.readObject();
			in.close();
			fileIn.close();
		}
		catch (IOException i)
		{
			i.printStackTrace();
			return;
		}
		catch (ClassNotFoundException c) 
		{
			c.printStackTrace();
			return;
		}
				
		System.out.println("De-serialised arraylist...");
		Iterator<Loans> iterate = newLoan.iterator();
		while(iterate.hasNext())
		{
			Loans l = iterate.next();
			System.out.println(l.loanDetails());
		}	
	}

	
}
	