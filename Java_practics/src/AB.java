import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AB extends JFrame {

	public AB(){
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("이름 : ");
		JLabel label1 = new JLabel("국어 점수 :  ");
		JLabel label2 = new JLabel("수학 점수 :  ");
		JLabel label3 = new JLabel("영어 점수 :  ");
		JButton okbtn = new JButton(" 확인 ");
				
		
		JTextField name = new JTextField(6);
		JTextField kr = new JTextField(6);
		JTextField ma = new JTextField(6);
		JTextField eg = new JTextField(6);
		
		
		panel.add(label);
		panel.add(name);
		panel.add(label1);
		panel.add(kr);
		panel.add(label2);
		panel.add(ma);
		panel.add(label3);
		panel.add(eg);
		panel.add(okbtn);
		
	
		add(panel);
		
		
		
		
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	

	public static void main(String[] args) {
		

		
		
		new AB();
	}

}
