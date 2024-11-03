import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

class updateStudent extends JFrame{
	private int index;
	
	updateStudent(StudentCollection studentc){
		setTitle("update Student");
		setSize(500,500);
		setDefaultCloseOperation(2);
		setLayout(null);
		setLocationRelativeTo(null);
		
		
		JLabel mainL = new JLabel("Update Student ",SwingConstants.CENTER);
		mainL.setFont(new Font("Arial",Font.BOLD,15));
		mainL.setForeground(Color.WHITE);
		mainL.setBackground(Color.GREEN);
		mainL.setOpaque(true);
		mainL.setBounds(0,0,500,40);
		add(mainL);
		
		JLabel StudentID = new JLabel("Student ID :");
		StudentID.setFont(new Font("Arial",Font.BOLD,15));
		StudentID.setBounds(10,60,200,20);
		add(StudentID);
		
		JTextField IdField = new JTextField();
		IdField.setFont(new Font("Arial",Font.PLAIN,15));
		IdField.setBounds(160,60,150,20);
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
		
		JButton btn = new JButton("Search");
		btn.setFont(new Font("Arial",Font.PLAIN,15));
		btn.setBounds(350,53,100,30);
		add(btn);
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(IdField.getText());
				index = studentc.searchStudent(IdField.getText());
				if(index !=-1){
					nameField.setText(studentc.studentar[index].getName());
					contactText.setText(studentc.studentar[index].getContactNum());
					ageText.setText(String.valueOf(studentc.studentar[index].getage()));
				}else{
					JOptionPane.showMessageDialog(null,"Student Not Found.......");
				}
			}
			
		});
		
		JButton update = new JButton("Update");
		update.setFont(new Font("Arial",Font.BOLD,15));
		update.setBounds(10,400,150,30);
		update.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				studentc.studentar[index].setValues(IdField.getText(),nameField.getText(),contactText.getText(),Integer.parseInt(ageText.getText()));
				JOptionPane.showMessageDialog(null,"Update Finshed!");
				}
			});
			add(update);

	}
}

