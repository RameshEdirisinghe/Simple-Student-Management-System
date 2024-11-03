import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;


class viewStudent extends JFrame{
	
	viewStudent(StudentCollection studentc){
		setTitle("View Student");
		setSize(500,500);
		setDefaultCloseOperation(2);
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel main = new JLabel("View Customers",SwingConstants.CENTER);
		main.setFont(new Font("Arial",Font.BOLD,15));
		main.setForeground(Color.WHITE);
		main.setBackground(Color.ORANGE);
		main.setOpaque(true);
		main.setBounds(0,0,500,40);
		add(main);
				
		String[] cols = {"Student ID","Name","Contact Num","Age"};
		DefaultTableModel model = new DefaultTableModel(cols,0);
		
		JButton btn = new JButton("Reload");
		btn.setBounds(20,50,80,30);
		add(btn);
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				model.setRowCount(0);
				for(int i=0;i<studentc.studentar.length;i++){
					
					Object[] row={studentc.studentar[i].getOderID(),studentc.studentar[i].getName(),studentc.studentar[i].getContactNum(),studentc.studentar[i].getage()};
					model.addRow(row);
			}
			}
			
		});

		
		JTable tbl = new JTable(model);
		JScrollPane scroll = new JScrollPane(tbl);
		scroll.setBounds(80,100,300,300);
		add(scroll);
		
		
	}
	
}

