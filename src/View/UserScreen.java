package View;

import java.awt.BorderLayout;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;
import Model.Loans;
import Model.Media;
import Model.Model;
import Model.Users;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class UserScreen extends JFrame {
	
	Model model = Controller.getModel();
	private Controller theController;
	private ArrayList newLoan;
	private ArrayList newUser;
	private JPanel contentPane;
	private JComboBox comboBox;
	private JButton btnExit;
	private JButton btnHire;
	private JButton btnLoanItems;
	private JPanel panelLoananItem;
	private JComboBox comboBoxLoans;
	private JPanel panelDisplayLoans;
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate localDate = LocalDate.now();
	
	private String currentDate;
	private LocalDate futureDate;
	private String returnDate;
	int fine;
	private JButton btnNewButton;
	
	
	
	public void setController(Controller c){
		theController = c;
	}

	
	public UserScreen(Controller c) {
		theController = c;
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				theController.handleScreenEvent("UserScreenClosed");
			}
		});
		setTitle("User Screen");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String printUserID = Integer.toString(Controller.currentUserID);
		JLabel lblUserID = new JLabel(printUserID);
		lblUserID.setBounds(74, 11, 97, 14);
		contentPane.add(lblUserID);
		
		JLabel lblUserTxt = new JLabel("User ID: ");
		lblUserTxt.setBounds(10, 11, 54, 14);
		contentPane.add(lblUserTxt);
		
		comboBox = new JComboBox(model.getMedia().toArray());
		comboBox.setBounds(74, 287, 513, 26);
		comboBox.insertItemAt("--- SELECT AN ITEM ---",0);
		comboBox.setSelectedIndex(0);
		contentPane.add(comboBox);
		
		comboBoxLoans = new JComboBox();
		comboBoxLoans.setBounds(74, 122, 513, 26);
		contentPane.add(comboBoxLoans);
		
		btnLoanItems = new JButton("Display Loans");
		btnLoanItems.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLoanItems.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				newLoan = model.getLoans();
				Iterator<Loans> iterate = newLoan.iterator();
				while(iterate.hasNext())
				{
					
					Loans l = iterate.next();
					if(Controller.currentUserID == l.getUserID())
					comboBoxLoans.addItem(l.toString());	
					
					//if(Controller.currentUserID != l.getUserID())
					//System.out.println("User has not borrowed any items");
				}
				
			}
		});
		btnLoanItems.setBounds(74, 188, 179, 45);
		contentPane.add(btnLoanItems);
		
		
		panelLoananItem = new JPanel();
		panelLoananItem.setBorder(new TitledBorder(null, "Loan an Item", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panelLoananItem.setToolTipText("");
		panelLoananItem.setBounds(52, 249, 548, 115);
		contentPane.add(panelLoananItem);
		
		///// Button handles the hiring of the item. User clicks item from 
		///// combobox then hits hire button. 
		btnHire = new JButton("Hire");
		btnHire.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHire.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				///// Assigns and formats the local and future dates to
				///// variables to be added into the loans object.
				currentDate = dtf.format(localDate);
				futureDate = localDate.plus(2,ChronoUnit.WEEKS);
				returnDate = dtf.format(futureDate);
				int fine = 0;
				
				newLoan = model.getLoans();
				System.out.println(Controller.currentUserID);
				Media item =(Media) comboBox.getSelectedItem();
				int mediaID = item.getID();
				
				Loans tempLoan = new Loans(mediaID, Controller.currentUserID, currentDate, returnDate, 
						fine);
		    	newLoan.add(tempLoan);
		    	
		    	comboBoxLoans.addItem(newLoan.toString());
								
		    	System.out.println("New Loan Added");
		    	
		    	///// print arraylist to the console
				Iterator<Loans> iterate = newLoan.iterator();
				while(iterate.hasNext())
				{				
					Loans l = iterate.next();
					System.out.println(l.loanDetails());				
				}			
			}
		});
		contentPane.add(btnHire);
		btnHire.setBounds(74, 380, 179, 45);
		
		
		
		panelDisplayLoans = new JPanel();
		panelDisplayLoans.setBorder(new TitledBorder(null, "Display Loans", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDisplayLoans.setBounds(52, 41, 548, 132);
		contentPane.add(panelDisplayLoans);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				theController.serialiseLoans();
				theController.serialiseMedia();
				theController.serialiseUsers();
				dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(395, 380, 179, 45);
		contentPane.add(btnExit);
		
		
	}
}
