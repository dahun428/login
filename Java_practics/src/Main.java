import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main{
	

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel btpanel = new JPanel();
		
		JLabel label = new JLabel("æ»≥Á«œººø‰");
		JButton btn1 = new JButton("Click This");
		JButton btn2 = new JButton("Exit");
		
		JTextArea textArea = new JTextArea();
		
		panel.setLayout(new BorderLayout());
		
		btpanel.add(btn1);
		btpanel.add(btn2);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				label.setText(textArea.getText());


			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
				
			}
			
		});
		
		panel.add(label, BorderLayout.NORTH);
		panel.add(btpanel, BorderLayout.WEST);
		panel.add(textArea, BorderLayout.CENTER);
		
		
		frame.add(panel);
		
		
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	
}