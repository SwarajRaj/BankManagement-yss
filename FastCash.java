
package bank_management_system;


import java.awt.*;


import java.awt.event.*;
import java.sql.*;


import javax.swing.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{

		JButton hundred,fivedred,thousand,tothousand,fvthousand,tnthousand,back;
		String pinnumber;
	
		public FastCash(String pinnumber){
			
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
			
			JLabel text1 = new JLabel ("Please Select the Amount");
			text1.setBounds(510, 300, 700, 35);
			text1.setForeground(Color.yellow);
			text1.setFont(new Font("System",Font.BOLD,20));
			image.add(text1);
			
			 hundred = new JButton("Rs.100");
			 hundred.setFont(new Font("Times New roman",Font.BOLD,12));
			 hundred.setBounds(450,387, 140, 30);
			 hundred.setForeground(Color.black);
			 hundred.setBackground(Color.cyan);
			 hundred.addActionListener(this);
			 image.add(hundred);
			 
			 fivedred = new JButton("Rs.500");
			 fivedred.setFont(new Font("Times New roman",Font.BOLD,12));
			 fivedred.setBounds(700,387, 140, 30);
			 fivedred.setForeground(Color.black);
			 fivedred.setBackground(Color.cyan);
			 fivedred.addActionListener(this);
			 image.add(fivedred);
			 
			 thousand = new JButton("Rs.1000");
			 thousand.setFont(new Font("Times New roman",Font.BOLD,12));
			 thousand.setBounds(450,427, 140, 30);
			 thousand.setForeground(Color.black);
			 thousand.setBackground(Color.cyan);
			 thousand.addActionListener(this);
			 image.add(thousand);
			 
			 tothousand = new JButton("Rs.2000");
			 tothousand.setFont(new Font("Times New roman",Font.BOLD,12));
			 tothousand.setBounds(700,427, 140, 30);
			 tothousand.setForeground(Color.black);
			 tothousand.setBackground(Color.cyan);
			 tothousand.addActionListener(this);
			 image.add(tothousand);
			 
			 fvthousand = new JButton("Rs.5000");
			 fvthousand.setFont(new Font("Times New roman",Font.BOLD,12));
			 fvthousand.setBounds(450,465, 140, 30);
			 fvthousand.setForeground(Color.black);
			 fvthousand.setBackground(Color.cyan);
			 fvthousand.addActionListener(this);
			 image.add(fvthousand);
			 
			 tnthousand = new JButton("Rs.10000");
			 tnthousand.setFont(new Font("Times New roman",Font.BOLD,12));
			 tnthousand.setBounds(700,465, 140, 30);
			 tnthousand.setForeground(Color.black);
			 tnthousand.setBackground(Color.cyan);
			 tnthousand.addActionListener(this);
			 image.add(tnthousand);
			 
			 back = new JButton("back");
			 back.setFont(new Font("Times New roman",Font.BOLD,12));
			 back.setBounds(700,500, 140, 30);
			 back.setForeground(Color.black);
			 back.setBackground(Color.yellow);
			 back.addActionListener(this);
			 image.add(back);
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
		
		if(ae.getSource() == back) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}else {
			String amount = ((JButton)ae.getSource()).getText().substring(3);
			
			Conn c = new Conn();
			try {
				ResultSet rs = c.s.executeQuery("Select  * from bank where pin ='"+pinnumber+"'");
				int balance =0;
				while(rs.next()) {
					if(rs.getString("type").equals("Deposit")) {
						balance += Integer.parseInt(rs.getString("amount"));
						
						
					} else {
						balance -= Integer.parseInt(rs.getString("amount"));
						
					}
					
				}
				
				if(ae.getSource() != back && balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient Balance ");
					return;
										
				}
				Date date = new Date();
				//String query = "insert into bank values ('"+pinnumber+"' ,'"+date+"','Withdrawl','"+amount+"')";
				c.s.executeUpdate("insert into bank values ('"+pinnumber+"' ,'"+date+"','Withdrawl','"+amount+"')");
				JOptionPane.showMessageDialog(null, "Rs."+amount+"Debited Sucessfully");
				
				setVisible(false);
				new Transactions(pinnumber).setVisible(true);
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
		}
		
	}
	public static void main(String[] args) {
		new FastCash("");
		
	}
	
}
