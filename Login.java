package bank_management_system;

import java.awt.*;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

	JButton  loginfield,signupfield,clearfield;
	JTextField  useridfield;
	JPasswordField pinfield;
	JLabel background;
	
	Login(){
		
		
		setLayout(null);
		
		setTitle("AUTOMATED TELLER MACHINE USING USER");
				
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		
		label.setBounds(100, 50, 100, 100);
		
		add(label);
		
		JLabel text = new JLabel("Welcome To UNITY BANK....");
		text.setFont(new Font("ALGERIAN",Font.BOLD,25));
		text.setBounds(200, 63, 450, 100);
		add(text);
		
		JLabel userid = new JLabel("User Id :");
		userid.setFont(new Font("Times New Roman",Font.BOLD,20));
		userid.setBounds(217, 200, 450, 30);
		add(userid);
		
		useridfield = new JTextField();
		useridfield.setBounds(330, 200, 300, 30);
		useridfield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(useridfield);
		
		JLabel pin = new JLabel("Password :");
		pin.setFont(new Font("Times New roman",Font.BOLD,20));
		pin.setBounds(200, 250, 450, 30);
		add(pin);
		
		pinfield = new JPasswordField();
		pinfield.setBounds(330, 250, 300, 30);
		//pinfield.setFont(new Font("Times New roman",Font.BOLD,12));
		add(pinfield);
		
		loginfield = new JButton("Log in");
		loginfield.setFont(new Font("Times New roman",Font.BOLD,12));
		loginfield.setBounds(330, 300, 70, 30);
		loginfield.setBackground(Color.BLACK);
		loginfield.setForeground(Color.white);
		loginfield.addActionListener(this);
		add(loginfield);
		
		signupfield = new JButton("Sign up");
		signupfield.setFont(new Font("Times New roman",Font.BOLD,12));
		signupfield.setBounds(440, 300, 75, 30);
		signupfield.setBackground(Color.BLACK);
		signupfield.setForeground(Color.white);
		signupfield.addActionListener(this);
		add(signupfield);
		
		clearfield = new JButton("Clear");
		clearfield.setFont(new Font("Times New roman",Font.BOLD,12));
		clearfield.setBounds(550, 300, 70, 30);
		clearfield.setBackground(Color.BLACK);
		clearfield.setForeground(Color.white);
		clearfield.addActionListener(this);
		add(clearfield);
		
		
		getContentPane().setBackground(Color.white);
		
		setSize(900, 500);
		setVisible(true);
		setLocation(400,200);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clearfield) {
			useridfield.setText("");
			pinfield.setText("");
			
		}else if(e.getSource() == loginfield) {
			Conn conn = new Conn();
			String cardnumber = useridfield.getText();
			String pinumber =  pinfield.getText();
			String query = "select * from login where cardnumber = '"+cardnumber+"' and pin ='"+pinumber+"'";
			try {
				ResultSet rs = conn.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Transactions(pinumber).setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "Please use valid credentials");
				}
			}catch(Exception ae) {
				System.out.println(ae);
			}
		}else if(e.getSource() == signupfield) {
			setVisible(true);
			new SignupOne().setVisible(true);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		new Login();
		
		 
	}

	

}


