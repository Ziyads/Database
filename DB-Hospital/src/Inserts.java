import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/*
	Stander board:
	Label x =20
	Text field x = 138;
*/
public class Inserts {
	public JFrame f1;
	private JFrame f2;
	private JFrame f3;
	private JFrame f4;
	private JFrame f5;
	
	private JPanel branchP;
	private JPanel departmentP;
	private JPanel doctorP;
	private JPanel paitientP;
	private JPanel appoinP;
	
	private int hid=3;
	//private JComboBox comboBox;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inserts window = new Inserts();
					window.f1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Inserts() {
		
		magic();
		
	
		
	}

	
	private void hideAll(){
		f1.hide();
		f2.hide();
		f3.hide();
		f4.hide();
		f5.hide();
	}
	private void magic(){
		DBConnect DBC=new DBConnect();
		
		
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Branch			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */		
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Branch			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */		
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Branch			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */		
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Branch			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */	
		f1 = new JFrame();
		f1.setBounds(600, 100, 450, 300);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		branchP = new JPanel();
		branchP.setBorder(new EmptyBorder(5, 5, 5, 5));
		f1.setContentPane(branchP);
		branchP.setLayout(null); 
		
		JComboBox comboBox1= new JComboBox();
		comboBox1.setBounds(111, 6, 231, 42);
		
		String[] petStrings = { "Branch", "Department", "Doctor", "Paitient", "Appointment" };
		comboBox1.addItem(petStrings[0]);
		comboBox1.addItem(petStrings[1]);
		comboBox1.addItem(petStrings[2]);
		comboBox1.addItem(petStrings[3]);
		comboBox1.addItem(petStrings[4]);
		comboBox1.setSelectedIndex(0);
		branchP.add(comboBox1);
			
		JTextField tf_bn= new JTextField();
		tf_bn.setBounds(30, 117, 130, 26);
		branchP.add(tf_bn);
		tf_bn.setColumns(10);
		
		JTextField tf_bc= new JTextField();
		tf_bc.setBounds(271, 117, 130, 26);
		branchP.add(tf_bc);
		tf_bc.setColumns(10);
		
		JLabel jl_bn = new JLabel("Branch Number");
		jl_bn.setBounds(286, 78, 103, 16);
		branchP.add(jl_bn);
		
		JLabel jl_bc = new JLabel("City");
		jl_bc.setToolTipText("City");
		jl_bc.setBounds(74, 78, 101, 16);
		branchP.add(jl_bc);
		
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(165, 243, 117, 29);
		branchP.add(btnInsert);
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bn=tf_bc.getText();
				int bnum=Integer.parseInt(bn);
				
				String loc=tf_bn.getText();
				
				Branch brO=new Branch(bnum,hid,loc);
				
				boolean flag=DBC.insert("Branch",brO);
				if(flag){
				  JOptionPane pane = new JOptionPane();
				  pane.setMessage("Sucssefuly insertd");
			      JDialog dialog = pane.createDialog( "Notfication");
				  dialog.show();
				  f1.hide();
				}
				
			}
		});
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Department			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */		
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Department			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */		
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Department			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */		
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Department			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
		f2 = new JFrame();
		f2.setBounds(600, 100, 450, 300);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		departmentP = new JPanel();
		departmentP.setBorder(new EmptyBorder(5, 5, 5, 5));
		f2.setContentPane(departmentP);
		departmentP.setLayout(null); 
		
		JComboBox comboBox2= new JComboBox();
		comboBox2.setBounds(111, 6, 231, 42);
		
		comboBox2.addItem(petStrings[0]);
		comboBox2.addItem(petStrings[1]);
		comboBox2.addItem(petStrings[2]);
		comboBox2.addItem(petStrings[3]);
		comboBox2.addItem(petStrings[4]);
		comboBox2.setSelectedIndex(1);
		departmentP.add(comboBox2);
		
		
		JLabel jl_dnum = new JLabel("Department number");
		jl_dnum.setBounds(20, 125, 141, 16);
		departmentP.add(jl_dnum);
		
		
		JTextField jt_dn = new JTextField();
		jt_dn.setBounds(170, 67, 130, 26);
		departmentP.add(jt_dn);
		jt_dn.setColumns(10);
		
		
		JLabel jl_dnm = new JLabel("Department name");
		jl_dnm.setBounds(20, 72, 141, 16);
		departmentP.add(jl_dnm);
		
		
		JTextField jt_dnm = new JTextField();
		jt_dnm.setBounds(170, 120, 130, 26);
		departmentP.add(jt_dnm);
		jt_dnm.setColumns(10);
		
		JLabel jl_bnumb = new JLabel("Branch number");
		jl_bnumb.setBounds(20, 176, 141, 16);
		departmentP.add(jl_bnumb);
		
		JComboBox bnums= new JComboBox();
		bnums.setBounds(170, 176, 130, 26);
		departmentP.add(bnums);
		
		int arrBn[]=DBC.getBNums();
		for(int i=0;i<arrBn.length;i++)
			bnums.addItem(arrBn[i]);
		
		
		JButton jb_dep = new JButton("Insert");
		jb_dep.setBounds(165, 243, 90, 29);
		
		
		departmentP.add(jb_dep);
		
		jb_dep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dn=jt_dnm.getText();
				int dnum=Integer.parseInt(dn);
				
				String depN=jt_dn.getText();
				
				int bnum=arrBn[bnums.getSelectedIndex()];
				Department depO=new Department(dnum,depN,bnum,hid);
				
				boolean flag=DBC.insert("Department", depO);
				if(flag){
					  JOptionPane pane = new JOptionPane();
					  pane.setMessage("Sucssefuly insertd");
				      JDialog dialog = pane.createDialog( "Notfication");
					  dialog.show();
					  f2.hide();
					}
				
			}
		});
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Doctor			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Doctor			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Doctor			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Doctor			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
		f3 = new JFrame();
		f3.setBounds(600, 100, 450, 300);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		doctorP = new JPanel();
		doctorP.setBorder(new EmptyBorder(5, 5, 5, 5));
		f3.setContentPane(doctorP);
		doctorP.setLayout(null);
		
		JComboBox comboBox3= new JComboBox();
		comboBox3.setBounds(111, 6, 231, 42);
		
		comboBox3.addItem(petStrings[0]);
		comboBox3.addItem(petStrings[1]);
		comboBox3.addItem(petStrings[2]);
		comboBox3.addItem(petStrings[3]);
		comboBox3.addItem(petStrings[4]);
		comboBox3.setSelectedIndex(2);
		doctorP.add(comboBox3);
		
		JLabel jl_fn = new JLabel("First Name");
		jl_fn.setToolTipText("");
		jl_fn.setBounds(20, 65, 74, 16);
		doctorP.add(jl_fn);
		
		JTextField jt_fn = new JTextField();
		jt_fn.setBounds(138, 60, 149, 26);
		doctorP.add(jt_fn);
		jt_fn.setColumns(10);
		
		JLabel jl_ln = new JLabel("Last Name");
		jl_ln.setToolTipText("");
		jl_ln.setBounds(20, 101, 74, 16);
		doctorP.add(jl_ln);
		
		JTextField jt_ln = new JTextField();
		jt_ln.setColumns(10);
		jt_ln.setBounds(138, 98, 149, 26);
		doctorP.add(jt_ln);
		
		JLabel jl_s = new JLabel("Sex");
		jl_s.setBounds(20, 163, 30, 16);
		doctorP.add(jl_s);
		
		JRadioButton jr_m = new JRadioButton("Male");
		jr_m.setBounds(138, 159, 61, 23);
		doctorP.add(jr_m);
		
		JRadioButton jr_f = new JRadioButton("Female");
		jr_f.setBounds(211, 159, 76, 23);
		doctorP.add(jr_f);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(jr_m);
		btnGroup.add(jr_f);
		
		JLabel jl_ssn = new JLabel("SSN");
		jl_ssn.setToolTipText("");
		jl_ssn.setBounds(20, 134, 74, 16);
		doctorP.add(jl_ssn);
		
		JTextField jt_ssn = new JTextField();
		jt_ssn.setColumns(10);
		jt_ssn.setBounds(138, 129, 149, 26);
		doctorP.add(jt_ssn);
		
		JLabel jl_dno = new JLabel("Branch number");
		jl_dno.setToolTipText("");
		jl_dno.setBounds(20, 194, 100, 16);
		doctorP.add(jl_dno);
		
		JComboBox jc_brnn = new JComboBox();
		jc_brnn.setBounds(138, 189, 70, 27);
		doctorP.add(jc_brnn);
		int d_arrBn[]=DBC.getBNums();
		jc_brnn.addItem("--");
		for (int i = 0; i < d_arrBn.length; i++) 
			jc_brnn.addItem(d_arrBn[i]);
		
	
		
		JLabel jl_dnoo = new JLabel("Dep num");
		jl_dnoo.setToolTipText("");
		jl_dnoo.setBounds(221, 189, 60, 16);
		doctorP.add(jl_dnoo);
		
		JComboBox jc_dnn = new JComboBox();
		jc_dnn.setBounds(288, 189, 100, 27);
		doctorP.add(jc_dnn);
		
		
		
		jc_brnn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jc_dnn.removeAllItems();
				String ddd=jc_brnn.getSelectedItem().toString();
				int x=0;
				if(!ddd.equals("---")){
					int branchNum=Integer.parseInt(ddd);
					int d_arrDep[]=DBC.getDnum(branchNum);
					for (int i = 0; i < d_arrDep.length; i++){
						jc_dnn.addItem(d_arrDep[i]);
						x++;
					}
				}
				
					if(x==0)
						jc_dnn.addItem("Empty");
			}
		});
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setBounds(159, 228, 117, 29);
		doctorP.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dssn=Integer.parseInt(jt_ssn.getText());
				String d_Fname=jt_fn.getText();
				String d_Lname=jt_ln.getText();
				String d_sex="";
				if(jr_m.isSelected())
					d_sex="M";
				if(jr_f.isSelected())
					d_sex="F";
				int d_Bn=Integer.parseInt(jc_dnn.getSelectedItem().toString());
				
				Doctor doc=new Doctor(dssn,d_Fname,d_Lname,d_sex,d_Bn);
				
				boolean flag=DBC.insert("Doctor", doc);
				if(flag){
					  JOptionPane pane = new JOptionPane();
					  pane.setMessage("Sucssefuly insertd");
				      JDialog dialog = pane.createDialog( "Notfication");
					  dialog.show();
					  f3.hide();
				}
				
			}
		});
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Patient			 	 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Patient			 	 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Patient			 	 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Patient			 	 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
		f4 = new JFrame();
		f4.setBounds(600, 100, 450, 300);
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		paitientP = new JPanel();
		paitientP.setBorder(new EmptyBorder(5, 5, 5, 5));
		f4.setContentPane(paitientP);
		paitientP.setLayout(null);
		
		JComboBox comboBox4= new JComboBox();
		comboBox4.setBounds(111, 6, 231, 42);
		
		comboBox4.addItem(petStrings[0]);
		comboBox4.addItem(petStrings[1]);
		comboBox4.addItem(petStrings[2]);
		comboBox4.addItem(petStrings[3]);
		comboBox4.addItem(petStrings[4]);
		comboBox4.setSelectedIndex(3);
		paitientP.add(comboBox4);
		
		JTextField textField_5 = new JTextField();
		textField_5.setBounds(138, 60, 130, 26);
		paitientP.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel jl_ffn = new JLabel("First name");
		jl_ffn.setBounds(20, 65, 86, 16);
		paitientP.add(jl_ffn);
		
		JTextField textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(138, 98, 130, 26);
		paitientP.add(textField_6);
		
		JLabel lblLastName_1 = new JLabel("Last name");
		lblLastName_1.setBounds(20, 103, 86, 16);
		paitientP.add(lblLastName_1);
		
		JTextField textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(138, 136, 130, 26);
		paitientP.add(textField_7);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(20, 141, 86, 16);
		paitientP.add(lblId);
		
		JTextField textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(138, 169, 130, 26);
		paitientP.add(textField_8);
		
		JLabel lblSsn_1 = new JLabel("SSN");
		lblSsn_1.setBounds(20, 174, 86, 16);
		paitientP.add(lblSsn_1);
		
		JLabel lblSex_1 = new JLabel("Sex");
		lblSex_1.setBounds(20, 202, 86, 16);
		paitientP.add(lblSex_1);
		
		JRadioButton rdbtnM = new JRadioButton("M");
		rdbtnM.setBounds(148, 207, 43, 23);
		paitientP.add(rdbtnM);
		
		JRadioButton rdbtnF = new JRadioButton("F");
		rdbtnF.setBounds(215, 207, 43, 23);
		paitientP.add(rdbtnF);
		
		ButtonGroup btnGroup1 = new ButtonGroup();
		btnGroup1.add(rdbtnM);
		btnGroup1.add(rdbtnF);
		JButton btnInsert_1 = new JButton("Insert");
		btnInsert_1.setBounds(151, 243, 100, 29);
		paitientP.add(btnInsert_1);
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Appointment			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Appointment			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Appointment			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$			Appointment			 $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ */
		f5 = new JFrame();
		f5.setBounds(600, 100, 450, 300);
		f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		appoinP = new JPanel();
		appoinP.setBorder(new EmptyBorder(5, 5, 5, 5));
		f5.setContentPane(appoinP);
		appoinP.setLayout(null); 
		
		JComboBox comboBox5= new JComboBox();
		comboBox5.setBounds(111, 6, 231, 42);
		
		comboBox5.addItem(petStrings[0]);
		comboBox5.addItem(petStrings[1]);
		comboBox5.addItem(petStrings[2]);
		comboBox5.addItem(petStrings[3]);
		comboBox5.addItem(petStrings[4]);
		comboBox5.setSelectedIndex(4);
		appoinP.add(comboBox5);
			
		JLabel lblNewLabel_3 = new JLabel("Paitient_ID");
		lblNewLabel_3.setBounds(20, 52, 80, 16);
		appoinP.add(lblNewLabel_3);
		
		JLabel lblDoctorssn = new JLabel("Doctor_SSN");
		lblDoctorssn.setBounds(20, 85, 80, 16);
		appoinP.add(lblDoctorssn);
		
		JComboBox comboBox_ID = new JComboBox();
		comboBox_ID.setBounds(138, 48, 119, 27);
		appoinP.add(comboBox_ID);
		
		JComboBox comboBox_SSN = new JComboBox();
		comboBox_SSN.setBounds(138, 81, 119, 27);
		appoinP.add(comboBox_SSN);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(20, 120, 80, 16);
		appoinP.add(lblDate);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(159, 120, 45, 16);
		appoinP.add(lblYear);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(262, 120, 80, 16);
		appoinP.add(lblMonth);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(364, 120, 80, 16);
		appoinP.add(lblDay);
		
		JComboBox comboBox_Y = new JComboBox();
		comboBox_Y.setBounds(138, 142, 99, 27);
		appoinP.add(comboBox_Y);
		
		int year[] = { 2016, 2017, 2018, 2019, 2020 };
		comboBox_Y.addItem(year[0]);
		comboBox_Y.addItem(year[1]);
		comboBox_Y.addItem(year[2]);
		comboBox_Y.addItem(year[3]);
		comboBox_Y.addItem(year[4]);
		JComboBox comboBox_M = new JComboBox();
		comboBox_M.setBounds(243, 142, 95, 27);
		appoinP.add(comboBox_M);
		
		int month[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		for (int i = 0; i < month.length; i++)
			comboBox_M.addItem(month[i]);
		JComboBox comboBox_D = new JComboBox();
		comboBox_D.setBounds(347, 142, 80, 27);
		appoinP.add(comboBox_D);
		
		int day[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
				25, 26, 27, 28, 29, 30, 31 };
		for (int i = 0; i < day.length; i++)
			comboBox_D.addItem(day[i]);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(20, 186, 80, 16);
		appoinP.add(lblTime);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setBounds(159, 186, 45, 16);
		appoinP.add(lblHours);
		
		JLabel lblHours_1 = new JLabel("Minutes");
		lblHours_1.setBounds(262, 186, 80, 16);
		appoinP.add(lblHours_1);
		
		JComboBox comboBox_H = new JComboBox();
		comboBox_H.setBounds(142, 207, 95, 27);
		appoinP.add(comboBox_H);
		
		int hour[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,00 };
		for (int i = 0; i < hour.length; i++)
			comboBox_H.addItem(hour[i]);
		JComboBox comboBox_Min = new JComboBox();
		comboBox_Min.setBounds(243, 207, 91, 27);
		appoinP.add(comboBox_Min);
		int min[] = { 0, 10, 20, 30, 40, 50 };
		for (int i = 0; i < min.length; i++)
			comboBox_Min.addItem(min[i]);
		
		JButton btnInsert_2 = new JButton("Insert");
		btnInsert_2.setBounds(163, 246, 117, 29);
		appoinP.add(btnInsert_2);
		
		comboBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=e.getSource().toString().substring(277);
				String z=s.substring(0, s.length()-1);
				
			

				hideAll();
				switch(z){
					case "Branch":
						f1.show();
		
						break;
					case "Department":
					
						f2.show();
						break;
					case "Doctor":
						f3.show();
						
						break;
					case "Paitient":
						f4.show();
						
						break;
					case "Appointment":
						f5.show();
						
						
						break;
					default:
						System.out.println("*");
				}
				
			}
		});
		comboBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=e.getSource().toString().substring(277);
				String z=s.substring(0, s.length()-1);
				
			

				hideAll();
				switch(z){
					case "Branch":
						f1.show();
		
						break;
					case "Department":
						f2.show();
						
						break;
					case "Doctor":
						f3.show();
						
						break;
					case "Paitient":
						f4.show();
						
						break;
					case "Appointment":
						f5.show();
						
						
						break;
					default:
						System.out.println("*");
				}
				
			}
		});
		comboBox3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=e.getSource().toString().substring(277);
				String z=s.substring(0, s.length()-1);
				
			

				hideAll();
				switch(z){
					case "Branch":
						f1.show();
		
						break;
					case "Department":					
						f2.show();
						
						break;
					case "Doctor":
						f3.show();
						
						break;
					case "Paitient":
						f4.show();
						
						break;
					case "Appointment":
						f5.show();
						
						
						break;
					default:
						System.out.println("*");
				}
				
			}
		});
		comboBox4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=e.getSource().toString().substring(277);
				String z=s.substring(0, s.length()-1);
				
			

				hideAll();
				switch(z){
					case "Branch":
						f1.show();
		
						break;
					case "Department":
					
						f2.show();
					
						break;
					case "Doctor":
						f3.show();
						
						break;
					case "Paitient":
						f4.show();
						
						break;
					case "Appointment":
						f5.show();
						
						
						break;
					default:
						System.out.println("*");
				}
				
			}
		});
		comboBox5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=e.getSource().toString().substring(277);
				String z=s.substring(0, s.length()-1);
				
			

				hideAll();
				switch(z){
					case "Branch":
						f1.show();
		
						break;
					case "Department":
						f2.show();
						
						break;
					case "Doctor":
						f3.show();
						
						break;
					case "Paitient":
						f4.show();
						
						break;
					case "Appointment":
						f5.show();
						
						break;
					default:
						System.out.println("*");
				}
				
			}
		});
		
	}
}
