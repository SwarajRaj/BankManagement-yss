package bank_management_system;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;



public class BalanceEnquiry extends JFrame implements ActionListener{
	
	JButton back;
	String pinnumber;

	BalanceEnquiry(String pinnumber){
		
		this.pinnumber = pinnumber;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1000, 1000,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image  = new JLabel(i3);
		image.setBounds(0, 0, 11000, 11000);
		add(image);
		
		
		 back = new JButton("Back");
		 back.setFont(new Font("Times New roman",Font.BOLD,12));
		 back.setBounds(700,500, 140, 30);
		 back.setForeground(Color.black);
		 back.setBackground(Color.yellow);
		 back.addActionListener(this);
		 image.add(back);
		 
		 Conn c = new Conn();
		 int balance =0;
			try {
				ResultSet rs = c.s.executeQuery("Select  * from bank where pin ='"+pinnumber+"'");
				while(rs.next()) {
					if(rs.getString("type").equals("Deposit")) {
						balance += Integer.parseInt(rs.getString("amount"));
						
						
					} else {
						balance -= Integer.parseInt(rs.getString("amount"));
						
					}
					
				}}catch(Exception e) {
					
					System.out.println(e);
				
				}
			
			JLabel text = new JLabel ("UNITY BANK");
			text.setBounds(580, 240, 700, 35);
			text.setForeground(Color.yellow);
			text.setFont(new Font("Algerian",Font.BOLD,20));
			image.add(text);
			
			JLabel text1 = new JLabel ("Your Current Account Balance is :");
			text1.setBounds(500, 300, 700, 35);
			text1.setForeground(Color.yellow);
			text1.setFont(new Font("System",Font.BOLD,15));
			image.add(text1);
			
			JLabel text2 = new JLabel (" Rs "+balance);
			text2.setBounds(585, 350, 700, 35);
			text2.setForeground(Color.blue);
			text2.setFont(new Font("System",Font.BOLD,15));
			image.add(text2);
				
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setSize(11000,11000);
		setLocation(350,10);
		//setUndecorated(true);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BalanceEnquiry("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == back) {
		setVisible(false);
		new Transactions(pinnumber).setVisible(true);
		}
	}

}
