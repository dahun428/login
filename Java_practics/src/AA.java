import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AA {
	
	public static String maintitle = " 성 적 표 ";


	
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel btpanel = new JPanel();
		
		panel.setLayout(new BorderLayout());
		
		
		JLabel toplabel = new JLabel(maintitle);
		JButton checkbtn = new JButton("확인");
		JButton exitbtn = new JButton("종료");
		
		
		
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
		
				
		
		System.out.println("성적표");
		System.out.println("이름    :  " );
		System.out.println("------------");
		System.out.println("당신의 학점은   : ");
		System.out.println("국어 성적  :  ");
		System.out.println("수학 성적  :  ");
		System.out.println("영어 성적  :  ");
		System.out.println("성적 평균  :  ");
		
		
			
	}

}
