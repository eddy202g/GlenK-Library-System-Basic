import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Iterator;

import Controller.Controller;
import Model.AdminUser;
import Model.Books;
import Model.CasualUser;
import Model.CompactDisc;
import Model.FullUser;
import Model.Journals;
import Model.Loans;
import Model.Model;
import Model.StaffUser;
import Model.Users;
import Model.Video;



class JUnitGlencaldyTests 
{
	

	@Test
	public void testLogin(Controller c) 
	{
		//private ArrayList newUser;
		
		//Controller.getUsers();
		
		
		
	
		
		
		
	}
	
	@Test
	public void testGetUsersSuccess()
	{
			
		StaffUser su1 = new StaffUser("Alan", "Fox", "afox@staffemail.co.uk", 023, "aaa", "aaa" ); 	
		AdminUser am1 = new AdminUser("Eddy", "Morris", "admin", "1234"); 
		FullUser fu1 = new FullUser("David", "Green", "59 Grennsfield Terrace", " ", "Glencaldy", "KY7 9JA", "01592346758", "13/06/1978", "ddd", "ddd"); 
		CasualUser cu1 = new CasualUser("Sarah", "Stewart", "91 Arthur Avenue", " ", "Glencaldy", "KY5 7KA", "01592811908", "21/08/1982", "ggg", "ggg");
		
		Model model = Controller.getModel();
		
		model.addUsers(su1); 
		model.addUsers(am1);
		model.addUsers(fu1);
		model.addUsers(cu1);
		
		int currentSize = model.getUsersArraySize();
		
		model.resetUsers();
		
		assertEquals(4,currentSize);

	}
	
	@Test
	public void testGetUsersFail()
	{
			
		StaffUser su1 = new StaffUser("Alan", "Fox", "afox@staffemail.co.uk", 023, "aaa", "aaa" ); 	
		AdminUser am1 = new AdminUser("Eddy", "Morris", "admin", "1234"); 
		FullUser fu1 = new FullUser("David", "Green", "59 Grennsfield Terrace", " ", "Glencaldy", "KY7 9JA", "01592346758", "13/06/1978", "ddd", "ddd"); 
		CasualUser cu1 = new CasualUser("Sarah", "Stewart", "91 Arthur Avenue", " ", "Glencaldy", "KY5 7KA", "01592811908", "21/08/1982", "ggg", "ggg");
		
		Model model = Controller.getModel();
		
		model.addUsers(su1); 
		model.addUsers(am1);
		model.addUsers(fu1);
		model.addUsers(cu1);
		
		int currentSize = model.getUsersArraySize();
		
		model.resetUsers();
		
		assertEquals(3,currentSize);
	}
	
	@Test
	public void testGetLoansSuccess()
	{
		Loans loan1 = new Loans(2001, 1003, "11/01/2018", "no", 3);		
		Loans loan2 = new Loans(2003, 1001, "03/01/2018", "no", 0);
		Loans loan3 = new Loans(2006, 1005, "10/01/2018",  "no", 1);
		
		Model model = Controller.getModel();
		
		model.addLoans(loan1);
		model.addLoans(loan2);
		model.addLoans(loan3);
		
		int currentSize = model.getLoansArraySize();
		
		model.resetLoans();
		
		assertEquals(3,currentSize);
		
	}
	
	@Test
	public void testGetLoansFail()
	{
		Loans loan1 = new Loans(2001, 1003, "11/01/2018", "no", 3);		
		Loans loan2 = new Loans(2003, 1001, "03/01/2018", "no", 0);
		Loans loan3 = new Loans(2006, 1005, "10/01/2018",  "no", 1);
		
		Model model = Controller.getModel();
		
		model.addLoans(loan1);
		model.addLoans(loan2);
		model.addLoans(loan3);
		
		int currentSize = model.getLoansArraySize();
		
		model.resetLoans();
		
		assertEquals(8,currentSize);
		
	}
	
	@Test
	public void testGetMediaSuccess()
	{
		
		Books bk1 = new Books("Harry Potter", "J.K. Rowling", 12.99, "Children's Fantasy", "Bloomsbury", 250, "978-5-18-132465-9"); 
		Video v1 = new Video(92, "Action", "DVD", "Die Hard", 1.00, "Warner Bros.", "Slipcase"); 
		Journals j1 = new Journals("Food Quality and Safety", 0.00, "Food Safety/Hygiene", "Oxford University", 170, 23991399, 3, "13/10/17" ); 
		CompactDisc cd1 = new CompactDisc("The New Order", "Testament", 7.99, 90, "Jewel Case", "Megaforce", 9); 
		
		Model model = Controller.getModel();
		
		model.addMedia(bk1);
		model.addMedia(v1);
		model.addMedia(j1);
		model.addMedia(cd1);
		
		int currentSize = model.getMediaArraySize();
		
		model.resetMedia();
		
		assertEquals(4,currentSize);

	}
	
	@Test
	public void testGetMediaFail()
	{
		
		Books bk1 = new Books("Harry Potter", "J.K. Rowling", 12.99, "Children's Fantasy", "Bloomsbury", 250, "978-5-18-132465-9"); 
		Video v1 = new Video(92, "Action", "DVD", "Die Hard", 1.00, "Warner Bros.", "Slipcase"); 
		Journals j1 = new Journals("Food Quality and Safety", 0.00, "Food Safety/Hygiene", "Oxford University", 170, 23991399, 3, "13/10/17" ); 
		CompactDisc cd1 = new CompactDisc("The New Order", "Testament", 7.99, 90, "Jewel Case", "Megaforce", 9); 
		
		Model model = Controller.getModel();
		
		model.addMedia(bk1);
		model.addMedia(v1);
		model.addMedia(j1);
		model.addMedia(cd1);
		
		int currentSize = model.getMediaArraySize();
		
		model.resetMedia();
		
		assertEquals(1,currentSize);

	}

}


