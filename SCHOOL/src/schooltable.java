import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class schooltable extends JFrame {

	private JLabel tname;
	private JLabel tkor;
	private JLabel tmath;
	private JLabel teng;
	private JTextField bname;
	private JTextField bkor;
	private JTextField bmath;
	private JTextField beng;
	private JButton chkbtn; 



	public schooltable() {
		iniUI();
		
	}
	
	public final void iniUI() {
		
		JPanel panel = new JPanel();
		JPanel titlepanel = new JPanel();
		titlepanel.add(new JLabel("성 적 표"));
		panel.setLayout(new GridLayout(6, 3, 5, 5));
		
		tname = new JLabel();
		tname.setText(" 이름 ");
		tkor = new JLabel();
		tkor.setText(" 국어 ");
		tmath = new JLabel();
		tmath.setText(" 수학 ");
		teng = new JLabel();
		teng.setText(" 영어 ");
		
		
		bname = new JTextField();
		bkor = new JTextField();
		bmath = new JTextField();
		beng = new JTextField();
		
		chkbtn = new JButton();
		chkbtn.setText("확인");
		
		
		
		JComponent[] components = {
				tname, bname, new JLabel(),
				tkor, bkor, new JLabel(),
				tmath, bmath, new JLabel(),
				teng, beng, new JLabel(),
				new JLabel(), chkbtn, new JLabel()
		};
			
		for (JComponent c : components) {
            panel.add(c);
        }
		
	
		add(BorderLayout.NORTH, titlepanel);
		add(BorderLayout.CENTER, panel);

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        pack();
		
	        
		
	        chkbtn.addActionListener(new open());
		 
	}
	
	class open implements ActionListener{


		  String pname;
		  String pkor;
		  String pmath;
		  String peng;
		  JFrame showj;

		public void actionPerformed(ActionEvent e) {
			
			  showj = new JFrame(); 
			  JPanel showtpnl = new JPanel(); 
			  JPanel showpnl = new JPanel();
			  
			  showtpnl.add(new JLabel(" 성적표 확인")); 
			  showpnl.setLayout(new GridLayout(6,3,5,5));
			  
			  add(BorderLayout.NORTH, showtpnl); 
			  add(BorderLayout.CENTER, showpnl);
			  
			  
			  pname = bname.getText();
			  pkor = bkor.getText();
			  pmath = bmath.getText();
			  peng = beng.getText();
			  
			  
			 // System.out.println(e.getActionCommand());
			  //String a = (tname + pname);
		//	  String b = (tkor + pkor);
			//  String c = (tmath + pmath);
	//		  String d = (teng + peng);
				
//			  JOptionPane.showMessageDialog(showj, a + b +  c  + d);

			
			
		}
		
	}
	
	

	
	
	public static void main(String[] args) {

		schooltable ex = new schooltable();
		ex.setVisible(true);
		ex.setPreferredSize(new Dimension(600, 600/12*9));
		ex.setSize(600, 600/12*9);
		ex.setLocationRelativeTo(null);
		
		
		
		
	}

}
