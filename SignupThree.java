package bank_management_system;


import java.awt.*;

import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class SignupThree extends JFrame implements ActionListener{
	
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submitfield,cancelfield;
	String formno;
	
	SignupThree(String formno){
		
		this.formno=formno;
		setLayout(null);
		
		JLabel l1 =  new JLabel("Page 3 : Account Details");
		l1.setFont(new Font("Times New Roman",Font.BOLD,20));
		l1.setBounds(650, 100, 500, 50);
		add(l1);
		
		JLabel type =  new JLabel(" Account Type :");
		type.setFont(new Font("Times New Roman",Font.BOLD,20));
		type.setBounds(400, 200, 500, 50);
		add(type);
		
		 r1 = new JRadioButton("Savings Account");
			r1.setBounds(400, 250, 200, 30);
			r1.setFont(new Font("Times New Roman",Font.BOLD,15));
			r1.setBackground(Color.LIGHT_GRAY);
			add(r1);
			
		 r2 = new JRadioButton("Fixed Account");
			r2.setBounds(600, 250, 200, 30);
			r2.setFont(new Font("Times New Roman",Font.BOLD,15));
			r2.setBackground(Color.LIGHT_GRAY);
			add(r2);
			
		 r3 = new JRadioButton("Current Account");
			r3.setBounds(400, 280, 200, 30);
			r3.setFont(new Font("Times New Roman",Font.BOLD,15));
			r3.setBackground(Color.LIGHT_GRAY);
			add(r3);
			
		 r4 = new JRadioButton("Recuring Deposit Account");
			r4.setBounds(600, 280, 200, 30);
			r4.setFont(new Font("Times New Roman",Font.BOLD,15));
			r4.setBackground(Color.LIGHT_GRAY);
			add(r4);
			
			ButtonGroup accountgroup = new ButtonGroup();
			accountgroup.add(r1);
			accountgroup.add(r2);
			accountgroup.add(r3);
			accountgroup.add(r4);

		
			JLabel card =  new JLabel(" Card Number :");
			card.setFont(new Font("Times New Roman",Font.BOLD,20));
			card.setBounds(400, 330, 500, 50);
			add(card);
			
			JLabel cardtxt =  new JLabel("It is your 16-digit Card Number");
			cardtxt.setFont(new Font("Times New Roman",Font.BOLD,10));
			cardtxt.setBounds(400, 350, 500, 50);
			add(cardtxt);
			
			JLabel cardNum =  new JLabel(" XXXX - XXXX - XX01 - 3003");
			cardNum.setFont(new Font("Times New Roman",Font.BOLD,20));
			cardNum.setBounds(600, 335, 600, 50);
			add(cardNum);
			
			JLabel pin =  new JLabel(" Pin Number :");
			pin.setFont(new Font("Times New Roman",Font.BOLD,20));
			pin.setBounds(400, 400, 500, 50);
			add(pin);
			
			JLabel pintxt =  new JLabel("pin number generated");
			pintxt.setFont(new Font("Times New Roman",Font.BOLD,10));
			pintxt.setBounds(410, 420, 500, 50);
			add(pintxt);
			
			JLabel pinNum =  new JLabel(" XXXX");
			pinNum.setFont(new Font("Times New Roman",Font.BOLD,20));
			pinNum.setBounds(600, 400, 600, 50);
			add(pinNum);
			
			JLabel service =  new JLabel(" Services Required :");
			service.setFont(new Font("Times New Roman",Font.BOLD,20));
			service.setBounds(400, 470, 500, 50);
			add(service);
			
			 c1 = new JCheckBox("ATM Card");
				c1.setBounds(400, 520, 200, 30);
				c1.setFont(new Font("Times New Roman",Font.BOLD,15));
				c1.setBackground(Color.LIGHT_GRAY);
				add(c1);
				
			 c2 = new JCheckBox("Mobile Banking");
				c2.setBounds(600, 520, 200, 30);
				c2.setFont(new Font("Times New Roman",Font.BOLD,15));
				c2.setBackground(Color.LIGHT_GRAY);
				add(c2);
				
			 c3 = new JCheckBox("Cheque Book");
				c3.setBounds(400, 550, 200, 30);
				c3.setFont(new Font("Times New Roman",Font.BOLD,15));
				c3.setBackground(Color.LIGHT_GRAY);
				add(c3);
				
			 c4 = new JCheckBox("Instant Banking");
				c4.setBounds(600, 550, 200, 30);
				c4.setFont(new Font("Times New Roman",Font.BOLD,15));
				c4.setBackground(Color.LIGHT_GRAY);
				add(c4);
				
			 c5 = new JCheckBox("E-mail & SMS Alerts");
				c5.setBounds(400, 580, 200, 30);
				c5.setFont(new Font("Times New Roman",Font.BOLD,15));
				c5.setBackground(Color.LIGHT_GRAY);
				add(c5);
				
			 c6 = new JCheckBox("E-Statement");
				c6.setBounds(600, 580, 200, 30);
				c6.setFont(new Font("Times New Roman",Font.BOLD,15));
				c6.setBackground(Color.LIGHT_GRAY);
				add(c6);
			
			 c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge.");
				c7.setBounds(400, 680, 700, 30);
				c7.setFont(new Font("Times New Roman",Font.BOLD,15));
				c7.setBackground(Color.LIGHT_GRAY);
				add(c7);
				
				 submitfield = new JButton("submit");
				 submitfield.setFont(new Font("Times New roman",Font.BOLD,12));
				 submitfield.setBounds(850,720, 70, 30);
				 submitfield.setBackground(Color.BLACK);
				 submitfield.setForeground(Color.white);
				 submitfield.addActionListener(this);
				 add(submitfield);
				 
				 cancelfield = new JButton("cancel");
				 cancelfield.setFont(new Font("Times New roman",Font.BOLD,12));
				 cancelfield.setBounds(750,720, 70, 30);
				 cancelfield.setBackground(Color.BLACK);
				 cancelfield.setForeground(Color.white);
				 cancelfield.addActionListener(this);
				 add(cancelfield);
					
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setSize(1000,1000);
		setLocation(350,10);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== submitfield) {
			String accountType = null;
			if(r1.isSelected()) {
				accountType = " Saving Account";
			}else if(r2.isSelected()) {
				accountType = " Fixed Deposit Account";
			}else if(r3.isSelected()) {
				accountType = " Current Account";
			}else if(r4.isSelected()) {
				accountType = " Recuring Deposit Account";
			}
			
			Random random = new Random();
			
			String cardnumber =""+ Math.abs((random.nextLong()%90000000L)+5040936000000000L);
			
			String pinnum = ""+Math.abs((random.nextLong()%9000L)+1000L);
			
			String facility = "" ;
			if(c1.isSelected()) {
				facility = facility+"ATM Card";
			}else if(c2.isSelected()) {
				facility = facility+" Mobile Banking";
			}else if(c3.isSelected()) {
				facility = facility+" Cheque Book";
			}else if(c4.isSelected()) {
				facility = facility+" Instant Banking";
			}else if(c5.isSelected()) {
				facility = facility+" E-mail & SMS Alerts";
			}else if(c6.isSelected()) {
				facility = facility+" E-Statement";
			}
			
			try {
				if(accountType.equals("")) {
					JOptionPane.showMessageDialog(null,"Please select any type");
				}else {
					Conn c = new Conn();
					String query = "insert into signup2 values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnum+"', '"+facility+"')";
					String query1 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnum+"')";

					c.s.executeUpdate(query);
					c.s.executeUpdate(query1);
					JOptionPane.showMessageDialog(null,"Card Number : "+cardnumber+"\n pin :"+pinnum);

					setVisible(false);
					new Deposit(pinnum).setVisible(true);
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}else if(ae.getSource() == cancelfield) {
			
			setVisible(false);
			new Login().setVisible(true);
			
		}
			
		
	}
	
	public static void main(String[] args) {

		new SignupThree("");
		
	}

}
