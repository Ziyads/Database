import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Inserts extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inserts frame = new Inserts();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inserts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(111, 6, 231, 42);
		contentPane.add(comboBox);
		
		String[] petStrings = { "Branch", "Department", "Doctor", "Paitient", "Appointment" };
		comboBox.addItem(petStrings[0]);
		comboBox.addItem(petStrings[1]);
		comboBox.addItem(petStrings[2]);
		comboBox.addItem(petStrings[3]);
		comboBox.addItem(petStrings[4]);
		
		/* Branch */
		textField = new JTextField();
		textField.setBounds(30, 117, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.hide();
		
		textField_1 = new JTextField();
		textField_1.setBounds(271, 117, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.hide();
		
		JLabel lblNewLabel = new JLabel("Branch Number");
		lblNewLabel.setBounds(286, 78, 103, 16);
		contentPane.add(lblNewLabel);
		lblNewLabel.hide();
		
		JLabel lblNewLabel_1 = new JLabel("City");
		lblNewLabel_1.setToolTipText("City");
		lblNewLabel_1.setBounds(74, 78, 101, 16);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.hide();
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(165, 243, 117, 29);
		contentPane.add(btnInsert);
		btnInsert.hide();
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=e.getSource().toString().substring(277);
				String z=s.substring(0, s.length()-1);
				switch(z){
					case "Branch":
						textField.show();
						textField_1.show();
						lblNewLabel.show();
						lblNewLabel_1.show();
						btnInsert.show();
						/*
						textField = new JTextField();
						textField.setBounds(30, 117, 130, 26);
						contentPane.add(textField);
						textField.setColumns(10);
						
						
						textField_1 = new JTextField();
						textField_1.setBounds(271, 117, 130, 26);
						contentPane.add(textField_1);
						textField_1.setColumns(10);
						
						JLabel lblNewLabel = new JLabel("Branch Number");
						lblNewLabel.setBounds(286, 78, 103, 16);
						contentPane.add(lblNewLabel);
						
						JLabel lblNewLabel_1 = new JLabel("City");
						lblNewLabel_1.setToolTipText("City");
						lblNewLabel_1.setBounds(74, 78, 101, 16);
						contentPane.add(lblNewLabel_1);
						
						JButton btnInsert = new JButton("Insert");
						btnInsert.setBounds(165, 243, 117, 29);
						contentPane.add(btnInsert);
						*/
						
						break;
					case "Department":
						
						JLabel lblDepartmentNumber = new JLabel("Department number");
						lblDepartmentNumber.setBounds(20, 125, 141, 16);
						contentPane.add(lblDepartmentNumber);
						
						textField_2 = new JTextField();
						textField_2.setBounds(170, 67, 130, 26);
						contentPane.add(textField_2);
						textField_2.setColumns(10);
						
						JLabel lblDepartmentName = new JLabel("Department name");
						lblDepartmentName.setBounds(20, 72, 141, 16);
						contentPane.add(lblDepartmentName);
						
						textField_3 = new JTextField();
						textField_3.setBounds(170, 120, 130, 26);
						contentPane.add(textField_3);
						textField_3.setColumns(10);
						
						break;
					case "Doctor":
						
						
						break;
					case "Paitient":
						
						
						break;
					case "Appointment":
					
						
						break;
					
						
				}
				
			}
		});
		
	}
}
