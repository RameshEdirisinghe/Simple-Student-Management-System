import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

class addStudent extends JFrame{
	
	addStudent(StudentCollection studentc){
		setTitle("Add Student");
		setSize(500,500);
		setDefaultCloseOperation(2);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel mainL = new JLabel("ADD Student ",SwingConstants.CENTER);
		mainL.setFont(new Font("Arial",Font.BOLD,15));
		mainL.setForeground(Color.WHITE);
		mainL.setBackground(Color.BLACK);
		mainL.setOpaque(true);
		mainL.setBounds(0,0,500,40);
		add(mainL);
		
		JLabel StudentID = new JLabel("Student ID :");
		StudentID.setFont(new Font("Arial",Font.BOLD,15));
		StudentID.setBounds(10,60,200,20);
		add(StudentID);
		
		JLabel IdField = new JLabel(studentc.getOrderID());
		IdField.setFont(new Font("Arial",Font.PLAIN,15));
		IdField.setBounds(160,60,200,20);
		add(IdField);
		
		JLabel name = new JLabel("Name :");
		name.setFont(new Font("Arial",Font.BOLD,15));
		name.setBounds(10,120,200,20);
		add(name);
		
		JTextField nameField = new JTextField();
		nameField.setFont(new Font("Arial",Font.BOLD,15));
		nameField.setBounds(160,120,200,20);
		add(nameField);
		
		JLabel StudentContact = new JLabel("Contact Number :");
		StudentContact.setFont(new Font("Arial",Font.BOLD,15));
		StudentContact.setBounds(10,160,200,20);
		add(StudentContact);
		
		JTextField contactText = new JTextField();
		contactText.setFont(new Font("Arial",Font.BOLD,15));
		contactText.setBounds(160,160,200,20);
		add(contactText);
		
		
		JLabel age = new JLabel("Age :");
		age.setFont(new Font("Arial",Font.BOLD,15));
		age.setBounds(10,200,200,20);
		add(age);
		
		JTextField ageText = new JTextField();
		ageText.setFont(new Font("Arial",Font.BOLD,15));
		ageText.setBounds(160,200,200,20);
		add(ageText);
		
		
		JButton plc = new JButton("Add Student");
		plc.setFont(new Font("Arial",Font.BOLD,15));
		plc.setBounds(160,270,150,30);
		add(plc);
		plc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Student st = new Student();
				st.setValues(IdField.getText(),nameField.getText(),contactText.getText(),Integer.parseInt(ageText.getText()));
				studentc.addStudent(st);
				JOptionPane.showMessageDialog(null,"Oder Placed......");
				dispose();
				new addStudent(studentc).setVisible(true);
			}
		
			});
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
