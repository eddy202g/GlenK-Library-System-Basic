package View;

import java.awt.BorderLayout;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import Controller.Controller;

import Model.Loans;
import Model.Media;
import Model.Model;
import Model.TotalWeeklyFines;
import Model.Users;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class AdminScreen extends JFrame implements TotalWeeklyFines
{
	Model model = Controller.getModel();
	private Controller theController;
	private JPanel contentPane;
	
	private JPanel panelUsers;
	private JPanel panelLoans;
	private JButton btnExit;
	private JLabel lblFines;
	private JTextPane txtPDisplayLoans;
	private JComboBox comboBoxLoans;
	private JComboBox comboBoxUsers;
	
	ArrayList<Users> newUser = model.getUsers();
	ArrayList<Media> newMedia = model.getMedia();
	ArrayList<Loans> newLoan = model.getLoans();

	public void setController(Controller c)
	{
		theController = c;
	}
	
	public AdminScreen(Controller c) 
	{
		
		theController = c;
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				theController.handleScreenEvent("UserScreenClosed");
			}
		});
		
		setResizable(false);
		setTitle("Admin Screen");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		createAdminScreen();
		
	}
	
	public void createAdminScreen()
	{

		panelUsers = new JPanel();
		panelUsers.setBorder(new TitledBorder(null, "Display User", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelUsers.setToolTipText("Display User");
		panelUsers.setBounds(42, 16, 554, 142);
		contentPane.add(panelUsers);
		panelUsers.setLayout(null);
		
		comboBoxUsers = new JComboBox(model.getUsers().toArray());
		comboBoxUsers.setBounds(15, 33, 524, 26);
		panelUsers.add(comboBoxUsers);
		
		panelLoans = new JPanel();
		panelLoans.setBorder(new TitledBorder(null, "Display Loans", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelLoans.setLayout(null);
		panelLoans.setToolTipText("Display User");
		panelLoans.setBounds(42, 169, 554, 142);
		contentPane.add(panelLoans);
		
		comboBoxLoans = new JComboBox(model.getLoans().toArray());
		comboBoxLoans.setBounds(15, 32, 524, 26);
		panelLoans.add(comboBoxLoans);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				theController.serialiseLoans();
				theController.serialiseMedia();
				theController.serialiseUsers();
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(237, 388, 179, 45);
		contentPane.add(btnExit);
		

		lblFines = new JLabel();
		lblFines.setBounds(75, 327, 251, 20);
		contentPane.add(lblFines);
		
		getFines();
	}
	
	
	
	public void getFines() 
	{

		String total = "";
		int totalFines = 0;
		
		newLoan = model.getLoans();
		
		Iterator<Loans> iterate = newLoan.iterator();
		while(iterate.hasNext())
		{
			
			Loans l = iterate.next();
			totalFines = totalFines + l.getFine();
			System.out.println(totalFines);
			
			total = Integer.toString(totalFines);
			//comboBoxLoans.addItem(l.toString());	
		}
		
		lblFines.setText("Total Fine Amount: £" + total);
		
	}	
	
	public void showMessage(String message)
	{
		JOptionPane.showMessageDialog(this,message);		
	}
}
