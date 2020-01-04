import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame {

	public Login() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel password = new JLabel("PASSWORD : ");
		
		
		JTextField textID = new JTextField(10);
		JPasswordField textPass = new JPasswordField(10);
		JButton logbtn = new JButton("Log In");
		
		
		
		
		panel.add(label);
		panel.add(textID);
		panel.add(password);
		panel.add(textPass);
		panel.add(logbtn);
		
		logbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String id = "dahun428";
			String pass = "1234";
			
			if(id.equals(textID.getText())&&pass.equals(textPass.getText())) {
			JOptionPane.showMessageDialog(null, "로그인되었습니다.");	
			}
			else {
				JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 틀렸습니다");
			}
				
			}
			
		});
		
		
		
		add(panel);
		
		
		
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
	}
	public static void main(String[] args) {
		new Login();
		
	}
	

}
