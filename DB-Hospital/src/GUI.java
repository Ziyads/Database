import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DBConnect DBC=new DBConnect();
		
		
		DefaultTableModel model = new DefaultTableModel();
	    model.addColumn("Code");
	    model.addColumn("Name");
	    model.addColumn("Quantity");
	    model.addColumn("Unit Price");
	    model.addColumn("Price");
		table = new JTable(model);
		table.setBounds(21, 6, 403, 190);
		contentPane.add(table);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(31, 208, 142, 27);
		contentPane.add(comboBox);
		String[] petStrings = { "Branch", "Department", "Doctor", "Paitient", "Appointment" };
		comboBox.addItem(petStrings[0]);
		comboBox.addItem(petStrings[1]);
		comboBox.addItem(petStrings[2]);
		comboBox.addItem(petStrings[3]);
		comboBox.addItem(petStrings[4]);
		comboBox.setSelectedIndex(0);
	
		
		JButton btnView = new JButton("View");
		btnView.setBounds(307, 207, 117, 29);
		contentPane.add(btnView);
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String z=comboBox.getSelectedItem().toString();
				
			
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.setRowCount(0);
				
				switch(z){
					case "Branch":
						
						
						DefaultTableModel bM = (DefaultTableModel) table.getModel();
				        bM.addRow(new Object[]{"Bnumber", "Hid", "Location","",""});
						
						String arrB[][]=DBC.getData("Branch");
				        DefaultTableModel m_b = (DefaultTableModel) table.getModel();
				        for(int i=0;i<arrB.length;i++)
				        	m_b.addRow(new Object[]{""+arrB[i][0]+"", ""+arrB[i][1]+"", ""+arrB[i][2]+""});
						
						  
						break;
					case "Department":
						
						
						DefaultTableModel depM = (DefaultTableModel) table.getModel();
						depM.addRow(new Object[]{"Dnumber","Dname","Bnumber","Hid"});
						
						String arrDp[][]=DBC.getData("Department");
				        DefaultTableModel m_dep = (DefaultTableModel) table.getModel();
				        for(int i=0;i<arrDp.length;i++)
				        	m_dep.addRow(new Object[]{""+arrDp[i][0]+"", ""+arrDp[i][1]+"", ""+arrDp[i][2]+"",""+arrDp[i][3]+""});
				        
						break;
					case "Doctor":
						
						
						DefaultTableModel docM = (DefaultTableModel) table.getModel();
						docM.addRow(new Object[]{"SSN","Fname","Lname","Sex","Dnumber"});
						
						String arrD[][]=DBC.getData("Doctor");
				        DefaultTableModel m_doc = (DefaultTableModel) table.getModel();
				        for(int i=0;i<arrD.length;i++)
				        	m_doc.addRow(new Object[]{""+arrD[i][0]+"", ""+arrD[i][1]+"", ""+arrD[i][2]+"",""+arrD[i][3]+"",""+arrD[i][4]+""});
				        
						break;
					case "Paitient":
						
						
						DefaultTableModel paM = (DefaultTableModel) table.getModel();
						paM.addRow(new Object[]{"Pid","Fname","Lname","Sex","SSN"});
						
						String arrP[][]=DBC.getData("Paitient");
				        DefaultTableModel m_p = (DefaultTableModel) table.getModel();
				        for(int i=0;i<arrP.length;i++)
				        	m_p.addRow(new Object[]{""+arrP[i][0]+"", ""+arrP[i][1]+"", ""+arrP[i][2]+"",""+arrP[i][3]+"",""+arrP[i][4]+""});
				        
						break;
					case "Appointment":
						
						
						DefaultTableModel aponM = (DefaultTableModel) table.getModel();
						aponM.addRow(new Object[]{"DSSN","Pid","Appno.","time","date","price"});
						
						String arrAp[][]=DBC.getData("Appointment");
				        DefaultTableModel m_ap = (DefaultTableModel) table.getModel();
				        for(int i=0;i<arrAp.length;i++)
				        	m_ap.addRow(new Object[]{""+arrAp[i][0]+"", ""+arrAp[i][1]+"", ""+arrAp[i][2]+"",""+arrAp[i][3]+"",""+arrAp[i][4]+"", ""+arrAp[i][5]+""});
				        
						break;
					default:
						System.out.println("*");
				}
			}
		});
		
		
		JButton jb_search = new JButton("Search");
		jb_search.setBounds(31, 243, 117, 29);
		contentPane.add(jb_search);
		jb_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				
			}
		});
		
		JButton jb_insert = new JButton("Insert");
		jb_insert.setBounds(176, 243, 117, 29);
		contentPane.add(jb_insert);
		jb_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		
		JButton jb_delete = new JButton("Delete");
		jb_delete.setBounds(307, 243, 117, 29);
		contentPane.add(jb_delete);
		jb_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				int si=table.getSelectedRow();
				if(si == -1){
					
				}
				String z=comboBox.getSelectedItem().toString();
				
				switch(z){
					case "Branch":
						String Bnumber=table.getValueAt(si, 0).toString();
						int bnum=Integer.parseInt(Bnumber);
						String Hid=table.getValueAt(si, 1).toString();
						int id=Integer.parseInt(Hid);
						String Location=table.getValueAt(si, 2).toString();
						
						Branch b=new Branch(bnum,id,Location);
						DBC.delete("Branch",b);
						
						
						break;
					case "Department":
						
						String Dnumber=table.getValueAt(si, 0).toString();
						int dnum=Integer.parseInt(Dnumber);
						
						String Dname=table.getValueAt(si, 1).toString();
						
						String Bnum=table.getValueAt(si, 2).toString();
						int bn=Integer.parseInt(Bnum);
						
						String Shid2=table.getValueAt(si, 3).toString();
						int hid2=Integer.parseInt(Shid2);
						
						Department dep=new Department(dnum,Dname,bn,hid2);
						DBC.delete("Department",dep);
						
						
						break;
					case "Doctor":
						
						
						
						break;
					case "Paitient":
						
						
						break;
					case "Appointment":
						
						
						
						break;
					default:
						System.out.println("*");
				}
				
			}
		});
		
		
		
	}
	
}
