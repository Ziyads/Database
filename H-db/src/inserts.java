import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public abstract class inserts {
	protected DBConnect DBC;
	protected JFrame frame;
	protected JPanel panel;
	protected JComboBox<String> comboBox1;
	protected JButton jb_insert;
	
	public inserts(){
		frame=new JFrame();
		frame.setBounds(600, 100, 450, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(panel);
		panel.setLayout(null); 
		
		
		String[] petStrings = { "Branch", "Department", "Doctor", "Paitient", "Appointment" };
		comboBox1= new JComboBox<String>(petStrings);
		comboBox1.setBounds(111, 6, 231, 42);
		comboBox1.setSelectedIndex(0);
		panel.add(comboBox1);
		
		jb_insert = new JButton("Insert");
		jb_insert.setBounds(165, 243, 117, 29);
		panel.add(jb_insert);
		insertButton();
		
	}
	
	//Customizing the insert button to collect all data from the user 
	abstract void insertButton();
	
	// JOptionPane Massage 
	public void popMassage(String kind){
		JOptionPane pane = new JOptionPane();
		JDialog dialog;
		switch(kind){
			case "empty":
				pane.setMessage("One or more elements are empty or it's already in database");
				dialog = pane.createDialog( "Notfication");
				dialog.show();
				break;
			case "insertd":
				pane.setMessage("Sucssefuly insertd");
				dialog = pane.createDialog( "Notfication");
			    dialog.show();
				break;
			default:
				System.out.println("add_popMassage() Unkown kind");
		}
	}
	
	//Making limits to the JTextFields input
	public void limit(String kind,JTextField t){
		switch(kind){
			case "numbers"://MAKING THE FIELD ONLY TAKES NUMBERS
				t.addKeyListener(new KeyAdapter() {	
				public void keyTyped(KeyEvent e) {
						char c = e.getKeyChar();
						if(! ( Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || ( c == KeyEvent.VK_DELETE) )){
															
							JOptionPane.showMessageDialog(null,"Only digits allowed");
							e.consume();
						}
					}
				});	
				
				break;
			case "letters"://MAKING THE FIELD ONLY TAKES LETTERS
				t.addKeyListener(new KeyAdapter() {
					public void keyTyped(KeyEvent e) {
						char c = e.getKeyChar();
						if(! ( Character.isLetter(c) || (c == KeyEvent.VK_BACK_SPACE) || ( c == KeyEvent.VK_DELETE) )){
												
							JOptionPane.showMessageDialog(null,"Only letters allowed");
							e.consume();
						}
					}
				});	
				break;
				
			default:
				System.out.println("add_Limit()-Unkown kind");		
		}
		
	}
	
	

	
}
