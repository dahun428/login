import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				JFrame frame = new JFrame("Welcome");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setPreferredSize(new Dimension(300,300));
				JLabel label = new JLabel("Hello World", SwingConstants.CENTER);
				frame.getContentPane().add(label);
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				frame.setLocation(dim.width/2-200/2, dim.height/2-200/2);
				
				frame.pack();
				frame.setVisible(true);
						
			}
			
		});

		
		
	}

}
