import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class inserts_Branch extends inserts{
	private JTextField tf_bNum;
	private JTextField tf_bCity;
	private JLabel jl_bNum;
	private JLabel jl_bCity;
	
    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inserts_Branch frame = new inserts_Branch();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
        
    }
	
	public inserts_Branch(){
		super();
			
		tf_bNum= new JTextField();
		tf_bNum.setBounds(271, 117, 130, 26);
		this.panel.add(tf_bNum);
		limit("numbers", tf_bNum);			
		
		
		tf_bCity= new JTextField();
		tf_bCity.setBounds(30, 117, 130, 26);
		this.panel.add(tf_bCity);
		limit("letters", tf_bCity);		
		
		jl_bNum = new JLabel("Branch Number");
		jl_bNum.setBounds(286, 78, 103, 16);
		this.panel.add(jl_bNum);
		
		jl_bCity = new JLabel("City");
		jl_bCity.setToolTipText("City");
		jl_bCity.setBounds(74, 78, 101, 16);
		this.panel.add(jl_bCity);
		
		
	}
	public void insertButton(){
			this.jb_insert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
		
					if(tf_bNum.getText().isEmpty() || tf_bCity.getText().isEmpty() )
						popMassage("empty");
					else{
						int branch_num=Integer.parseInt(tf_bNum.getText());
						String location=tf_bCity.getText();
						
						Branch branch_obj=new Branch(branch_num,0,location);					
						if(DBC.insert("Branch",branch_obj)){
						  popMassage("inserted");
						  frame.hide();
						}
						
					}
					
				}
			});
	}
	
}
