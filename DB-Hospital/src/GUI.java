import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

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
		
		
		
		DefaultTableModel model = new DefaultTableModel();
	    model.addColumn("Code");
	    model.addColumn("Name");
	    model.addColumn("Quantity");
	    model.addColumn("Unit Price");
	    model.addColumn("Price");
		table = new JTable(model);
		table.setBounds(21, 6, 403, 190);
		contentPane.add(table);
		DefaultTableModel modelz = (DefaultTableModel) table.getModel();
        modelz.addRow(new Object[]{"Bnumber", "Hid", "Location","",""});
		
		
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
				DBConnect DBC=new DBConnect();
			
				switch(z){
					case "Branch":
						String s[][]=DBC.getData("Branch");
				        DefaultTableModel modelf = (DefaultTableModel) table.getModel();
				        for(int i=0;i<s.length;i++)
				        	modelf.addRow(new Object[]{""+s[i][0]+"", ""+s[i][1]+"", ""+s[i][2]+"","",""});
						
						  
						break;
					case "Department":
						
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
				
			}
		});
		
		
		
	}
	
}
