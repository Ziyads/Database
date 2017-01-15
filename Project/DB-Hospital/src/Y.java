import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

public class Y extends JFrame {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Y frame = new Y();
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
	public Y() {
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
				switch (e.getActionCommand()) {
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

				case "Doctor":
					JLabel lblNewLabel_2 = new JLabel("First Name");
					lblNewLabel_2.setToolTipText("");
					lblNewLabel_2.setBounds(20, 65, 74, 16);
					contentPane.add(lblNewLabel_2);
					JButton btnNewButton = new JButton("Insert");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						}
					});
					btnNewButton.setBounds(159, 228, 117, 29);
					contentPane.add(btnNewButton);
					// label x =20
					// textfield x = 138;
					textField_2 = new JTextField();
					textField_2.setBounds(138, 60, 149, 26);
					contentPane.add(textField_2);
					textField_2.setColumns(10);
					JLabel lblLastName = new JLabel("Last Name");
					lblLastName.setToolTipText("");
					lblLastName.setBounds(20, 101, 74, 16);
					contentPane.add(lblLastName);
					textField_3 = new JTextField();
					textField_3.setColumns(10);
					textField_3.setBounds(138, 98, 149, 26);
					contentPane.add(textField_3);
					JLabel lblSex = new JLabel("Sex");
					lblSex.setBounds(20, 163, 30, 16);
					contentPane.add(lblSex);
					JRadioButton rdbtnMale = new JRadioButton("Male");
					rdbtnMale.setBounds(138, 159, 61, 23);
					contentPane.add(rdbtnMale);
					JRadioButton rdbtnFemale = new JRadioButton("Female");
					rdbtnFemale.setBounds(211, 159, 76, 23);
					contentPane.add(rdbtnFemale);
					ButtonGroup btnGroup = new ButtonGroup();
					btnGroup.add(rdbtnMale);
					btnGroup.add(rdbtnFemale);
					JLabel lblSsn = new JLabel("SSN");
					lblSsn.setToolTipText("");
					lblSsn.setBounds(20, 134, 74, 16);
					contentPane.add(lblSsn);
					textField_4 = new JTextField();
					textField_4.setColumns(10);
					textField_4.setBounds(138, 129, 149, 26);
					contentPane.add(textField_4);
					JLabel lblDepartmentNumber = new JLabel("Department No.");
					lblDepartmentNumber.setToolTipText("");
					lblDepartmentNumber.setBounds(20, 194, 100, 16);
					contentPane.add(lblDepartmentNumber);
					JComboBox comboBox_1 = new JComboBox();
					comboBox_1.setBounds(160, 189, 116, 27);
					contentPane.add(comboBox_1);
					break;
				case "Paitient":
					textField_5 = new JTextField();
					textField_5.setBounds(138, 60, 130, 26);
					contentPane.add(textField_5);
					textField_5.setColumns(10);
					JLabel lblFirstName = new JLabel("First name");
					lblFirstName.setBounds(20, 65, 86, 16);
					contentPane.add(lblFirstName);
					textField_6 = new JTextField();
					textField_6.setColumns(10);
					textField_6.setBounds(138, 98, 130, 26);
					contentPane.add(textField_6);
					JLabel lblLastName_1 = new JLabel("Last name");
					lblLastName_1.setBounds(20, 103, 86, 16);
					contentPane.add(lblLastName_1);
					textField_7 = new JTextField();
					textField_7.setColumns(10);
					textField_7.setBounds(138, 136, 130, 26);
					contentPane.add(textField_7);
					JLabel lblId = new JLabel("ID");
					lblId.setBounds(20, 141, 86, 16);
					contentPane.add(lblId);
					textField_8 = new JTextField();
					textField_8.setColumns(10);
					textField_8.setBounds(138, 169, 130, 26);
					contentPane.add(textField_8);
					JLabel lblSsn_1 = new JLabel("SSN");
					lblSsn_1.setBounds(20, 174, 86, 16);
					contentPane.add(lblSsn_1);
					JLabel lblSex_1 = new JLabel("Sex");
					lblSex_1.setBounds(20, 202, 86, 16);
					contentPane.add(lblSex_1);
					JRadioButton rdbtnM = new JRadioButton("M");
					rdbtnM.setBounds(148, 207, 43, 23);
					contentPane.add(rdbtnM);
					JRadioButton rdbtnF = new JRadioButton("F");
					rdbtnF.setBounds(215, 207, 43, 23);
					contentPane.add(rdbtnF);
					ButtonGroup btnGroup1 = new ButtonGroup();
					btnGroup1.add(rdbtnM);
					btnGroup1.add(rdbtnF);
					JButton btnInsert_1 = new JButton("Insert");
					btnInsert_1.setBounds(151, 243, 100, 29);
					contentPane.add(btnInsert_1);
					break;
				case "Appointment":

					JLabel lblNewLabel_3 = new JLabel("Paitient_ID");
					lblNewLabel_3.setBounds(20, 52, 80, 16);
					contentPane.add(lblNewLabel_3);
					JLabel lblDoctorssn = new JLabel("Doctor_SSN");
					lblDoctorssn.setBounds(20, 85, 80, 16);
					contentPane.add(lblDoctorssn);
					JComboBox comboBox_ID = new JComboBox();
					comboBox_ID.setBounds(138, 48, 119, 27);
					contentPane.add(comboBox_ID);
					JComboBox comboBox_SSN = new JComboBox();
					comboBox_SSN.setBounds(138, 81, 119, 27);
					contentPane.add(comboBox_SSN);
					JLabel lblDate = new JLabel("Date");
					lblDate.setBounds(20, 120, 80, 16);
					contentPane.add(lblDate);
					JLabel lblYear = new JLabel("Year");
					lblYear.setBounds(159, 120, 45, 16);
					contentPane.add(lblYear);
					JLabel lblMonth = new JLabel("Month");
					lblMonth.setBounds(262, 120, 80, 16);
					contentPane.add(lblMonth);
					JLabel lblDay = new JLabel("Day");
					lblDay.setBounds(364, 120, 80, 16);
					contentPane.add(lblDay);
					JComboBox comboBox_Y = new JComboBox();
					comboBox_Y.setBounds(138, 142, 99, 27);
					contentPane.add(comboBox_Y);
					int year[] = { 2016, 2017, 2018, 2019, 2020 };
					comboBox_Y.addItem(year[0]);
					comboBox_Y.addItem(year[1]);
					comboBox_Y.addItem(year[2]);
					comboBox_Y.addItem(year[3]);
					comboBox_Y.addItem(year[4]);
					JComboBox comboBox_M = new JComboBox();
					comboBox_M.setBounds(243, 142, 95, 27);
					contentPane.add(comboBox_M);
					int month[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
					for (int i = 0; i < month.length; i++)
						comboBox_M.addItem(month[i]);
					JComboBox comboBox_D = new JComboBox();
					comboBox_D.setBounds(347, 142, 80, 27);
					contentPane.add(comboBox_D);
					int day[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
							25, 26, 27, 28, 29, 30, 31 };
					for (int i = 0; i < day.length; i++)
						comboBox_D.addItem(day[i]);
					JLabel lblTime = new JLabel("Time");
					lblTime.setBounds(20, 186, 80, 16);
					contentPane.add(lblTime);
					JLabel lblHours = new JLabel("Hours");
					lblHours.setBounds(159, 186, 45, 16);
					contentPane.add(lblHours);
					JLabel lblHours_1 = new JLabel("Minutes");
					lblHours_1.setBounds(262, 186, 80, 16);
					contentPane.add(lblHours_1);
					JComboBox comboBox_H = new JComboBox();
					comboBox_H.setBounds(142, 207, 95, 27);
					contentPane.add(comboBox_H);
					int hour[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
							00 };
					for (int i = 0; i < hour.length; i++)
						comboBox_H.addItem(hour[i]);
					JComboBox comboBox_Min = new JComboBox();
					comboBox_Min.setBounds(243, 207, 91, 27);
					contentPane.add(comboBox_Min);
					int min[] = { 0, 10, 20, 30, 40, 50 };
					for (int i = 0; i < min.length; i++)
						comboBox_Min.addItem(min[i]);
					JButton btnInsert_2 = new JButton("Insert");
					btnInsert_2.setBounds(163, 246, 117, 29);
					contentPane.add(btnInsert_2);
					break;
				}
			}
		});
	}
}
