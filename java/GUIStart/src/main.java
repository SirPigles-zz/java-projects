import javax.swing.*;
import java.awt.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				JOptionPane.showMessageDialog(null,  "Hello World!");
				JFrame frame = new JFrame("Hello World!");
				JTextArea text = new JTextArea("Hello World!");
				JButton button = new JButton("Hello World!");
				
				frame.setLayout(new FlowLayout());
				frame.add(button);
				frame.add(text);
				frame.pack();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
		
	}

}
