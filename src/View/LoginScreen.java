package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.Controller;

import javax.swing.JLabel;

import java.awt.Window.Type;
import java.awt.Font;

public class LoginScreen extends JFrame 
{

	private Controller theController;
	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;
	
	public LoginScreen()
	{
		
		
		setResizable(false);
		setTitle("Login Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,650,500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				validateForm();			
			}
		});
		
		btnLogin.setBounds(242,331,179,45);
		contentPane.add(btnLogin);
		
		JLabel lblLogin = new JLabel("Enter Username:");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLogin.setBounds(69, 112, 150, 14);
		contentPane.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Enter Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(69, 206, 150, 14);
		contentPane.add(lblPassword);
		
		
		
		txtUsername = new JTextField();
		txtUsername.setBounds(300, 101, 301, 38);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtPassword = new JTextField();
		txtPassword.setBounds(300, 194, 301, 38);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}
	public void setController(Controller c)
	{
		theController = c;
	}
		
	public void showMessage(String message)
	{
		JOptionPane.showMessageDialog(this,message);
	}
	
	private void validateForm()
	{
		String uname = txtUsername.getText();
		String pwd = txtPassword.getText();	
		String message = "";

		if(uname.equals(null) || uname.equals(""))
		{
			message = message + "Username must be entered!\n";
		}
		if(pwd.equals(null) || pwd.equals(""))
		{
			message = message + "Password must be entered!";
		}	
			
		if(message == "")
		{
			//process login
			boolean success;
			success = theController.validateLogin(uname,pwd);
			if(success)
			{
				//login was successful
				//the Controller will now go to another window
				//dispose of the login screen
				//showMessage("Note: login was successful - the Controller will now go to another window");
				//close down the login screen
				dispose();
			}
			else
			{
				txtUsername.setText("");
				txtPassword.setText("");
				showMessage("Incorrect login - try again!");
			}
		}	
		else
		{
			showMessage(message);			
		}
	}
}
