package bank_management_system;


import java.awt.*;


import java.awt.event.*;

import javax.swing.*;

public class Transactions extends JFrame implements ActionListener{

		JButton deposit,withdrawl,fastcash,ministate,pinchange,balance,exit;
		String pinnumber;
	
		public Transactions(String pinnumber){
			
//			setLayout(null);
			this.pinnumber=pinnumber;
			
			ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
			Image i2 = i1.getImage().getScaledInstance(1000, 1000,Image.SCALE_DEFAULT);
			ImageIcon i3 = new ImageIcon(i2);
			JLabel image  = new JLabel(i3);
			image.setBounds(0, 0, 11000, 11000);
			add(image);
			
			JLabel text = new JLabel ("UNITY BANK");
			text.setBounds(580, 270, 700, 35);
			text.setForeground(Color.yellow);
			text.setFont(new Font("Algerian",Font.BOLD,20));
			image.add(text);
			
			JLabel text1 = new JLabel ("Please Select The Transaction");
			text1.setBounds(500, 300, 700, 35);
			text1.setForeground(Color.yellow);
			text1.setFont(new Font("System",Font.BOLD,20));
			image.add(text1);
			
			 deposit = new JButton("Deposit");
			 deposit.setFont(new Font("Times New roman",Font.BOLD,12));
			 deposit.setBounds(450,387, 140, 30);
			 deposit.setForeground(Color.black);
			 deposit.setBackground(Color.cyan);
			 deposit.addActionListener(this);
			 image.add(deposit);
			 
			 withdrawl = new JButton("Cash Withdrawl");
			 withdrawl.setFont(new Font("Times New roman",Font.BOLD,12));
			 withdrawl.setBounds(700,387, 140, 30);
			 withdrawl.setForeground(Color.black);
			 withdrawl.setBackground(Color.cyan);
			 withdrawl.addActionListener(this);
			 image.add(withdrawl);
			 
			 fastcash = new JButton("Fast Cash");
			 fastcash.setFont(new Font("Times New roman",Font.BOLD,12));
			 fastcash.setBounds(450,427, 140, 30);
			 fastcash.setForeground(Color.black);
			 fastcash.setBackground(Color.cyan);
			 fastcash.addActionListener(this);
			 image.add(fastcash);
			 
			 ministate = new JButton("Mini Statement");
			 ministate.setFont(new Font("Times New roman",Font.BOLD,12));
			 ministate.setBounds(700,427, 140, 30);
			 ministate.setForeground(Color.black);
			 ministate.setBackground(Color.cyan);
			 ministate.addActionListener(this);
			 image.add(ministate);
			 
			 pinchange = new JButton("Pin Change");
			 pinchange.setFont(new Font("Times New roman",Font.BOLD,12));
			 pinchange.setBounds(450,465, 140, 30);
			 pinchange.setForeground(Color.black);
			 pinchange.setBackground(Color.cyan);
			 pinchange.addActionListener(this);
			 image.add(pinchange);
			 
			 balance = new JButton("Balance Enquiry");
			 balance.setFont(new Font("Times New roman",Font.BOLD,12));
			 balance.setBounds(700,465, 140, 30);
			 balance.setForeground(Color.black);
			 balance.setBackground(Color.cyan);
			 balance.addActionListener(this);
			 image.add(balance);
			 
			 exit = new JButton("Exit");
			 exit.setFont(new Font("Times New roman",Font.BOLD,12));
			 exit.setBounds(700,500, 140, 30);
			 exit.setForeground(Color.black);
			 exit.setBackground(Color.yellow);
			 exit.addActionListener(this);
			 image.add(exit);
			// submitfield.setBackground(Color.BLACK);
			// submitfield.setForeground(Color.white);
			// deposit.addActionListener(this);
			 //image.add(deposit);
			 
			getContentPane().setBackground(Color.LIGHT_GRAY);
			setSize(11000,11000);
			setLocation(350,10);
			//setUndecorated(true);
			setVisible(true);
		}
	


	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == exit) {
			System.exit(0);
		}else if(ae.getSource() == deposit) {
			setVisible(false);
			new Deposit(pinnumber).setVisible(true);
			
		}else if(ae.getSource() == withdrawl) {
			setVisible(false);
			new Withdrawl(pinnumber).setVisible(true);
			
		}else if(ae.getSource() == fastcash) {
			setVisible(false);
			new FastCash(pinnumber).setVisible(true);
			
		}else if(ae.getSource() == pinchange) {
			setVisible(false);
			new PinChange(pinnumber).setVisible(true);
		}else if(ae.getSource() == balance) {
			setVisible(false);
			new BalanceEnquiry(pinnumber).setVisible(true);
		}
		
	}
	public static void main(String[] args) {
		new Transactions("");
		
	}
	
}
