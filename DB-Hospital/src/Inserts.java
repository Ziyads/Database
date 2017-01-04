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
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getSource());
				switch(e.getActionCommand()){
					case "Branch":
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
						break;
					case "Department":
						
						break;
						
				}
				
			}
		});
		
	}

}
