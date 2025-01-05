package bank_management_system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PinChange extends JFrame implements ActionListener{
	
	//JTextField pintxtfield;
	JPasswordField pintxtfield,pintxt1field;
	JButton change,back;
	String pinnumber;
	
	
	PinChange(String pinnumber){
		this.pinnumber = pinnumber;
		
		//setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1000, 1000,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image  = new JLabel(i3);
		image.setBounds(0, 0, 11000, 11000);
		add(image);
		
		JLabel text = new JLabel ("UNITY BANK");
		text.setBounds(580, 240, 700, 35);
		text.setForeground(Color.yellow);
		text.setFont(new Font("Algerian",Font.BOLD,20));
		image.add(text);
		
		JLabel text1 = new JLabel ("CHANGE THE 4-Digit PIN");
		text1.setBounds(525, 270, 700, 35);
		text1.setForeground(Color.yellow);
		text1.setFont(new Font("System",Font.BOLD,20));
		image.add(text1);
		
		JLabel pintxt = new JLabel ("New PIN");
		pintxt.setBounds(475, 310, 700, 35);
		pintxt.setForeground(Color.yellow);
		pintxt.setFont(new Font("System",Font.BOLD,16));
		image.add(pintxt);
		
		 pintxtfield = new JPasswordField();
		pintxtfield.setBounds(630, 315, 150, 25);
		pintxtfield.setFont(new Font("Times New roman",Font.BOLD,17));
		image.add(pintxtfield);
		
		JLabel pintxt1 = new JLabel ("Re-Enter New PIN");
		pintxt1.setBounds(475, 345, 700, 35);
		pintxt1.setForeground(Color.yellow);
		pintxt1.setFont(new Font("System",Font.BOLD,16));
		image.add(pintxt1);
		
		 pintxt1field = new JPasswordField();
		pintxt1field.setBounds(630, 350, 150, 25);
		pintxt1field.setFont(new Font("Times New roman",Font.BOLD,17));
		image.add(pintxt1field);
		
		 change = new JButton("Change");
		change.setFont(new Font("Times New roman",Font.BOLD,12));
		change.setBounds(700,465, 140, 30);
		change.setForeground(Color.black);
		change.setBackground(Color.cyan);
		change.addActionListener(this);
		 image.add(change);
		 
		  back = new JButton("Back");
		 back.setFont(new Font("Times New roman",Font.BOLD,12));
		 back.setBounds(700,500, 140, 30);
		 back.setForeground(Color.black);
		 back.setBackground(Color.yellow);
		 back.addActionListener(this);
		 image.add(back);
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setSize(11000,11000);
		setLocation(350,10);
		//setUndecorated(true);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
	
		if(ae.getSource() == change) {
		
		try {
			
			String npin = pintxtfield.getText();
			String rpin = pintxt1field.getText();
			if(!npin.equals(rpin)) {
				
				JOptionPane.showMessageDialog(null,"Entered PIN is doesnt matched");
				return;
			}
			
			if(npin.equals("")) {
				
				JOptionPane.showMessageDialog(null,"Please enter new Pin");
				return;
				
			}
			
			if(rpin.equals("")) {
				
				JOptionPane.showMessageDialog(null,"Please Re-enter New Pin");
				return;
				
			}
				
			
			Conn conn = new Conn();
			String query = "update bank set pin ='"+rpin+"'where pin = '"+pinnumber+"'";
			String query1 = "update login set pin ='"+rpin+"'where pin = '"+pinnumber+"'";
			String query2 = "update signup2 set pin_number ='"+rpin+"'where pin_number = '"+pinnumber+"'";
			
			conn.s.executeUpdate(query);
			conn.s.executeUpdate(query1);
			conn.s.executeUpdate(query2);
			
			
			JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
			
			setVisible(false);
			new Transactions(rpin).setVisible(true);
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		}
		
		else {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PinChange("").setVisible(true);;

	}

}
