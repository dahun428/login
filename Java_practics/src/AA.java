import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AA {
	
	public static String maintitle = " �� �� ǥ ";


	
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel btpanel = new JPanel();
		
		panel.setLayout(new BorderLayout());
		
		
		JLabel toplabel = new JLabel(maintitle);
		JButton checkbtn = new JButton("Ȯ��");
		JButton exitbtn = new JButton("����");
		
		
		
		panel.add(toplabel);
		
		
		btpanel.add(checkbtn);
		btpanel.add(exitbtn);
		
		
		
		
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.add(toplabel, BorderLayout.PAGE_START);
		panel.add(btpanel, BorderLayout.PAGE_END);
		
				
		
		System.out.println("����ǥ");
		System.out.println("�̸�    :  " );
		System.out.println("------------");
		System.out.println("����� ������   : ");
		System.out.println("���� ����  :  ");
		System.out.println("���� ����  :  ");
		System.out.println("���� ����  :  ");
		System.out.println("���� ���  :  ");
		
		
			
	}

}
