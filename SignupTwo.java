package bank_management_system;

import java.awt.*;


import java.util.*;

import java.awt.event.*;

import javax.swing.*;

public class SignupTwo extends JFrame implements ActionListener{
	
	//int fno;
	JComboBox religionfield,categoryfield,incomefield,eduquafield,occufield;
	JTextField panfield,adharfield;
	JRadioButton yes,no,yes1,no1;
	JButton nextfield;
	String formno;
	
	SignupTwo(String formno){
		this.formno=formno;
		setLayout(null);
		
		JLabel  additionalInfo = new JLabel("page:2 - Additional Information Details");
		additionalInfo.setFont(new Font("Times New Roman",Font.BOLD,20));
		additionalInfo.setBounds(650, 100, 500, 50);
		add(additionalInfo);
		
		JLabel  religion = new JLabel("Religion :");
		religion.setFont(new Font("Times New Roman",Font.BOLD,20));
		religion.setBounds(400, 200, 200, 50);
		add(religion);
		
		String[] relival = {"none","Hindu","Muslim","Christian","Sikkim","others"};
		 religionfield = new JComboBox(relival);
		religionfield.setBounds(600, 210, 500, 30);
		religionfield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(religionfield);
		
		JLabel  category = new JLabel("Category :");
		category.setFont(new Font("Times New Roman",Font.BOLD,20));
		category.setBounds(400, 250, 200, 50);
		add(category);
		
		String[] cateval = {"none","General","OBC","ST","SC","others"};
		 categoryfield = new JComboBox(cateval);
		categoryfield.setBounds(600, 260, 500, 30);
		categoryfield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(categoryfield);
		
		JLabel  income = new JLabel("Income :");
		income.setFont(new Font("Times New Roman",Font.BOLD,20));
		income.setBounds(400, 300, 200, 50);
		add(income);
		
		String[] incval = {"none","<5,000","<50,000","<1,00,000","<5,00,000","upto 10,00,000"};
		 incomefield = new JComboBox(incval);
		incomefield.setBounds(600, 310, 500, 30);
		incomefield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(incomefield);
		
		JLabel  edu = new JLabel("Education  ");
		edu.setFont(new Font("Times New Roman",Font.BOLD,20));
		edu.setBounds(400, 370, 200, 50);
		add(edu);
		
		JLabel  qua = new JLabel("Qualification :");
		qua.setFont(new Font("Times New Roman",Font.BOLD,20));
		qua.setBounds(400, 400, 200, 50);
		add(qua);
		
		String[] equval = {"none","10th","12th","under-graduation","post-graduation","Ph.D","others"};
		 eduquafield = new JComboBox(equval);
		eduquafield.setBounds(600, 410, 500, 30);
		eduquafield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(eduquafield);
		
		JLabel  occu = new JLabel("Occupation :");
		occu.setFont(new Font("Times New Roman",Font.BOLD,20));
		occu.setBounds(400, 450, 200, 50);
		add(occu);
		
		String[] occuval = {"none","Salaried","Self-Employee","Business","Student","Retired","others"};
		 occufield = new JComboBox(occuval);
		occufield.setBounds(600, 460, 500, 30);
		occufield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(occufield);
		
		JLabel  pan = new JLabel("PAN Number :");
		pan.setFont(new Font("Times New Roman",Font.BOLD,20));
		pan.setBounds(400, 500, 200, 50);
		add(pan);
		
		 panfield = new JTextField();
		panfield.setBounds(600, 510, 270, 30);
		panfield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(panfield);
		
		JLabel  adhar = new JLabel("Adhar Number :");
		adhar.setFont(new Font("Times New Roman",Font.BOLD,20));
		adhar.setBounds(400, 550, 200, 50);
		add(adhar);
		
		adharfield = new JTextField();
		adharfield.setBounds(600, 560, 270, 30);
		adharfield.setFont(new Font("Times New roman",Font.BOLD,17));
		add(adharfield);
		
		JLabel  seniciti = new JLabel("Senior Citizen :");
		seniciti.setFont(new Font("Times New Roman",Font.BOLD,20));
		seniciti.setBounds(400, 600, 200, 50);
		add(seniciti);
		
		 yes = new JRadioButton("yes");
		yes.setBounds(600, 610, 60, 30);
		yes.setFont(new Font("Times New Roman",Font.BOLD,15));
		yes.setBackground(Color.LIGHT_GRAY);
		add(yes);
		
		 no = new JRadioButton("no");
		no.setBounds(700, 610, 70, 30);
		no.setFont(new Font("Times New Roman",Font.BOLD,15));
		no.setBackground(Color.LIGHT_GRAY);
		add(no);
		
		ButtonGroup senicitigroup = new ButtonGroup();
		senicitigroup.add(yes);
		senicitigroup.add(no);
		
		JLabel  exiacc = new JLabel("Excisting Account :");
		exiacc.setFont(new Font("Times New Roman",Font.BOLD,20));
		exiacc.setBounds(400, 650, 200, 50);
		add(exiacc);
		
		 yes1 = new JRadioButton("yes");
		yes1.setBounds(600, 660, 60, 30);
		yes1.setFont(new Font("Times New Roman",Font.BOLD,15));
		yes1.setBackground(Color.LIGHT_GRAY);
		add(yes1);
		
		 no1 = new JRadioButton("no");
		no1.setBounds(700, 660, 70, 30);
		no1.setFont(new Font("Times New Roman",Font.BOLD,15));
		no1.setBackground(Color.LIGHT_GRAY);
		add(no1);
		
		ButtonGroup exiaccgroup = new ButtonGroup();
		exiaccgroup.add(yes1);
		exiaccgroup.add(no1);
		
		 nextfield = new JButton("Next");
		nextfield.setFont(new Font("Times New roman",Font.BOLD,12));
		nextfield.setBounds(1250,700, 70, 30);
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
		//String formno = ""+ fno;
		String sreligion = (String)religionfield.getSelectedItem();
		String scategory = (String)categoryfield.getSelectedItem();
		String sincome = (String)incomefield.getSelectedItem();
		String seducation = (String)eduquafield.getSelectedItem();
		String soccupation = (String)occufield.getSelectedItem();

		 String seniciti = null;

		 if (yes.isSelected()) {

			 seniciti = "yes";

		 } else if (no.isSelected()) {

			 seniciti = "no";
		 
		 }
		 
		 String exiacc = null;

		 if (yes1.isSelected()) {

			 exiacc = "yes";

		 } else if (no1.isSelected()) {

			 exiacc = "no";
		 
		 }
		 
		 String span = panfield.getText();
		 String sadhar = adharfield.getText();
		 
		 try {
				
					//Conn c = new Conn();
					//String query = "insert into signup1 values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+sadhar+"', '"+seniciti+"', '"+exiacc+"')";
					//c.s.executeUpdate(query);
			 		Conn c = new Conn();
			 		String query = "insert into signup1 values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+sadhar+"', '"+seniciti+"', '"+exiacc+"')";
			 		c.s.executeUpdate(query);			 
				
			 		setVisible(false);
					new SignupThree(formno).setVisible(true); 
			 		
			}catch(Exception ae) {
				System.out.println(ae);
			}
		 
		
	}
	
	
	public static void main(String[] args) {
		new SignupTwo("");
	}
}
