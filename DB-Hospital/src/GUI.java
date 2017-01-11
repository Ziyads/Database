import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(31, 208, 142, 27);
		contentPane.add(comboBox);
		
		JButton btnView = new JButton("View");
		btnView.setBounds(307, 207, 117, 29);
		contentPane.add(btnView);
		
		table = new JTable();
		table.setBounds(21, 6, 403, 190);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(31, 243, 117, 29);
		contentPane.add(btnNewButton);
		
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
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(307, 243, 117, 29);
		contentPane.add(btnNewButton_2);
	}
}
