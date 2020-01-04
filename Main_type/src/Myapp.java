import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Myapp{
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Welcome");
				//JFrame
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setPreferredSize(new Dimension(300, 300));
				//Dimension
				JLabel label = new JLabel("Watch This", SwingConstants.CENTER);
				//Swing
				frame.getContentPane().add(label);
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				//Toolkit
				frame.setLocation(dim.width/2-200/2, dim.height/2-300/2);
				
				frame.pack();
				frame.setVisible(true);
				
				
			}
		});
	}
}