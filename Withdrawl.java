package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdrawl extends JFrame implements ActionListener{
	
	JButton Withdrawl,back;
	JTextField amount;
	String pinnumber;
	public Withdrawl(String pinnumber) {
		this.pinnumber = pinnumber;
		//setLayout(null);
		
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
		
		JLabel text1 = new JLabel ("Enter the amount you want to Withdrawl");
		text1.setBounds(460, 300, 700, 35);
		text1.setForeground(Color.yellow);
		text1.setFont(new Font("System",Font.BOLD,18));
		image.add(text1);
		
		amount = new JTextField();
		amount.setBounds(495, 350, 300, 30);
		amount.setFont(new Font("Times New roman",Font.BOLD,17));
		image.add(amount);
		
		Withdrawl = new JButton("Withdraw");
		Withdrawl.setFont(new Font("Times New roman",Font.BOLD,12));
		Withdrawl.setBounds(700,465, 140, 30);
		Withdrawl.setForeground(Color.black);
		Withdrawl.setBackground(Color.cyan);
		Withdrawl.addActionListener(this);
		image.add(Withdrawl);
		 
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
	
public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == Withdrawl) {
			String number = amount.getText();
			Date date = new Date();
			if(number.equals("")) {
				JOptionPane.showMessageDialog(null, "please enter the amount to withdrawl");
			}else {
				try {
				Conn conn = new Conn();
				String query = "insert into bank values ('"+pinnumber+"' ,'"+date+"','Withdrawl','"+number+"')";
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs :"+number+" Withdrawled Successfully");
				setVisible(false);
				new Transactions(pinnumber).setVisible(true);
				}catch(Exception ae) {
					System.out.println(ae);
				}
			}
			
		}else if(e.getSource() == back) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
			
		}
		
	}

	public static void main(String[] args) {
		
		new Withdrawl("");
		
	}

}
