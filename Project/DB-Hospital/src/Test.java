import java.awt.EventQueue;
import java.util.Scanner;

public class Test {

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
}
