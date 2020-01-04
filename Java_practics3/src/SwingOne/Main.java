package SwingOne;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main extends Component implements ActionListener{

	private static Font font;
	private static JTextField tname;
	
	public static void main(String[] args) {

		JFrame frame = new JFrame("성 적 표");
		//전체적인 프레임
		JPanel panel = new JPanel();
		//성적표 나타낼 프레임
		JButton label1button = new JButton(" 확 인 ");
		//확인버튼
		JPanel buttonpanel = new JPanel();
		
		
		JLabel label1 = new JLabel();
		label1.setText(" 이름은 무엇입니까 ?  :  ");
		
		
		font = new Font("굴림",Font.PLAIN,19);
		label1.setFont(font);
		//이름은 무엇입니까? 부분 폰트 변경
		
		JLabel labelexit = new JLabel();
		labelexit.setText(" ");
		
		
		tname = new JTextField(15);	
		JTextField tkor = new JTextField(15);	
		JTextField tmath = new JTextField(15);		
		JTextField teng = new JTextField(15);

		
	
		panel.add(tname);
		panel.add(tkor);
		panel.add(tmath);
		panel.add(teng);
		
		
		//
		panel.add(label1);
		panel.add(buttonpanel);
		panel.add(labelexit);
		
		buttonpanel.add(label1button);
		
		
		frame.add(panel);

		
		label1button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				labelexit.setText(tname.getText());


			}
			
		});
		
	
		
		
		
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		new Main();
		
		
	}

}
