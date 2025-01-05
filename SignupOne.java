package bank_management_system;

import java.sql.*;


import java.awt.*;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;

import java.util.*;

import java.awt.event.*;



public class SignupOne extends JFrame implements ActionListener{
	
	int fno;
	JTextField namefield,fanamefield,mailfield,phfield,addfield,cityfield,statefield,pinfield;
	JDateChooser dobfield;
	
	JRadioButton male,female,LGBTQ,single,married,divoced;
	JButton nextfield;
	
	 SignupOne() {
		 

		
		Random ram = new Random();
		fno = Math.abs(ram.nextInt())%200;
		setLayout(null);
		
		JLabel formNo = new JLabel("Application Form Number : "+fno);
		formNo.setFont(new Font("Times New Roman",Font.BOLD,25));
		formNo.setBounds(600, 50, 500, 50);
		add(formNo);
		
		JLabel  personalInfo = new JLabel("page:1 - Personal Information Details");
		personalInfo.setFont(new Font("Times New Roman",Font.BOLD,20));
		personalInfo.setBounds(610, 100, 500, 50);
		add(personalInfo);
		
		JLabel  name = new JLabel("FullName :");
		name.setFont(new Font("Times New Roman",Font.BOLD,20));
		name.setBounds(400, 200, 200, 50);
		add(name);
		
		namefield = new JTextField();
		namefield.setBounds(600, 210, 270, 30);
		namefield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(namefield);
		
		JLabel  fatherName = new JLabel("Father's FullName :");
		fatherName.setFont(new Font("Times New Roman",Font.BOLD,20));
		fatherName.setBounds(400, 250, 200, 50);
		add(fatherName);
		
		fanamefield = new JTextField();
		fanamefield.setBounds(600, 260, 270, 30);
		fanamefield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(fanamefield);
		
		JLabel  dob = new JLabel("Date if Birth :");
		dob.setFont(new Font("Times New Roman",Font.BOLD,20));
		dob.setBounds(400, 300, 200, 50);
		add(dob);
		
		dobfield = new JDateChooser();
		dobfield.setBounds(600, 310, 270, 30);
		dobfield.setForeground(new Color(105,105,105));
		add(dobfield);
		
		JLabel  gender = new JLabel("Gender :");
		gender.setFont(new Font("Times New Roman",Font.BOLD,20));
		gender.setBounds(900, 300, 500, 50);
		add(gender);
		
		male = new JRadioButton("male");
		male.setBounds(1050, 310, 60, 30);
		male.setFont(new Font("Times New Roman",Font.BOLD,15));
		male.setBackground(Color.LIGHT_GRAY);
		add(male);
		
		female = new JRadioButton("female");
		female.setBounds(1140, 310, 70, 30);
		female.setFont(new Font("Times New Roman",Font.BOLD,15));
		female.setBackground(Color.LIGHT_GRAY);
		add(female);
		
		LGBTQ = new JRadioButton("LGBTQ");
		LGBTQ.setBounds(1240, 310, 70, 30);
		LGBTQ.setFont(new Font("Times New Roman",Font.BOLD,15));
		LGBTQ.setBackground(Color.LIGHT_GRAY);
		add(LGBTQ);
		
		ButtonGroup gengroup = new ButtonGroup();
		gengroup.add(LGBTQ);
		gengroup.add(female);
		gengroup.add(male);
		
				
		JLabel  mail = new JLabel("Email Address :");
		mail.setFont(new Font("Times New Roman",Font.BOLD,20));
		mail.setBounds(400, 350, 500, 50);
		add(mail);
		
		mailfield = new JTextField();
		mailfield.setBounds(600, 360, 270, 30);
		mailfield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(mailfield);
		
		JLabel  phno = new JLabel("Phone Number :");
		phno.setFont(new Font("Times New Roman",Font.BOLD,20));
		phno.setBounds(400, 400, 500, 50);
		add(phno);
		
		phfield = new JTextField();
		phfield.setBounds(600, 410, 270, 30);
		phfield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(phfield);
		
		JLabel  marital = new JLabel("Marital Status :");
		marital.setFont(new Font("Times New Roman",Font.BOLD,20));
		marital.setBounds(400, 450, 500, 50);
		add(marital);
		
		single = new JRadioButton("single");
		single.setBounds(600, 460, 70, 30);
		single.setFont(new Font("Times New Roman",Font.BOLD,15));
		single.setBackground(Color.LIGHT_GRAY);
		add(single);
		
		married = new JRadioButton("married");
		married.setBounds(700, 460, 80, 30);
		married.setFont(new Font("Times New Roman",Font.BOLD,15));
		married.setBackground(Color.LIGHT_GRAY);
		add(married);
		
		divoced = new JRadioButton("divoced");
		divoced.setBounds(800, 460, 80, 30);
		divoced.setFont(new Font("Times New Roman",Font.BOLD,15));
		divoced.setBackground(Color.LIGHT_GRAY);
		add(divoced);
		
		ButtonGroup margroup = new ButtonGroup();
		margroup.add(single);
		margroup.add(married);
		margroup.add(divoced);
		
		JLabel  address = new JLabel("Address :");
		address.setFont(new Font("Times New Roman",Font.BOLD,20));
		address.setBounds(400, 500, 500, 50);
		add(address);
		
		addfield = new JTextField();
		addfield.setBounds(600, 510, 270, 30);
		addfield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(addfield);
		
		JLabel  city = new JLabel("City :");
		city.setFont(new Font("Times New Roman",Font.BOLD,20));
		city.setBounds(900, 500, 500, 50);
		add(city);
		
		cityfield = new JTextField();
		cityfield.setBounds(1050, 510, 270, 30);
		cityfield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(cityfield);
		
		JLabel  state = new JLabel("State :");
		state.setFont(new Font("Times New Roman",Font.BOLD,20));
		state.setBounds(400, 550, 500, 50);
		add(state);
		
		statefield = new JTextField();
		statefield.setBounds(600, 560, 270, 30);
		statefield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(statefield);
		
		JLabel  pin = new JLabel("Pin Code :");
		pin.setFont(new Font("Times New Roman",Font.BOLD,20));
		pin.setBounds(900, 550, 500, 50);
		add(pin);
		
		pinfield = new JTextField();
		pinfield.setBounds(1050, 560, 270, 30);
		pinfield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(pinfield);
		
		
		
	
		
		nextfield = new JButton("Next");
		nextfield.setFont(new Font("Times New roman",Font.BOLD,12));
		nextfield.setBounds(1250,680, 70, 30);
		nextfield.setBackground(Color.BLACK);
		nextfield.setForeground(Color.white);
		nextfield.addActionListener(this);
		add(nextfield);
		 
				 
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setSize(1000,1000);
		setLocation(350,10);
		setVisible(true);
		
	}
	 public void actionPerformed(ActionEvent e) {
		 String formno = ""+ fno; // long

		 String name = namefield.getText(); // setText

		 String fname  = fanamefield.getText();

		 String dob  = ((JTextField) dobfield.getDateEditor().getUiComponent()).getText();

		 String gender = null;

		 if (male.isSelected()) {

		 gender = "Male";

		 } else if (female.isSelected()) {

		 gender = "Female";
		 
		 }else if (LGBTQ.isSelected()) {

			 gender = "LGBTQ";
		 }

		 String email =  mailfield.getText();
		 String phone =  phfield.getText();
		 String marital = null;

		 if (married.isSelected()) { marital = "Married";

		 } else if (single.isSelected()) { marital = "single";

		 } else if (divoced.isSelected()) { marital =  "divoced";
		 
		 }

		 String address = addfield.getText();

		 String city = cityfield.getText();

		 String state = statefield.getText();

		 String pin = pinfield.getText();
		 
	
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null,"Please fill the name");
			}else {
				Conn c = new Conn();
				String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+phone+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignupTwo(formno).setVisible(true); 
			}
		}catch(Exception ae) {
			System.out.println(ae);
		}
		 
	 }

	public static void main(String[] args) {

			new SignupOne();
			 
	
	}

}
