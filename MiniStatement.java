package bank_management_system;

import java.awt.Color;

import javax.swing.JFrame;

public class MiniStatement extends JFrame{
	
	MiniStatement(){
		setTitle("Mini Statement");
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setSize(11000,11000);
		setLocation(350,10);
		//setUndecorated(true);
		setVisible(true);
	}
	

	public static void main(String[] args) {
	new MiniStatement();

	}

}
