import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class schooltable2 implements ActionListener {



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == chkbtn) {
			 
			  JFrame showj = new JFrame(); 
			  JPanel showtpnl = new JPanel(); 
			  JPanel showpnl = new JPanel();
			  
			  showtpnl.add(new JLabel(" 성적표 확인")); 
			  showpnl.setLayout(new GridLayout(6,3,5,5));
			  
			  add(BorderLayout.NORTH, showtpnl); 
			  add(BorderLayout.CENTER, showpnl);
			  
			  
			  pname = String.valueOf(bname.getText()); 
			  pkor =  String.valueOf(bkor.getText()); 
			  pmath = String.valueOf(bmath.getText()); 
			  peng  = String.valueOf(beng.getText());
			  
			  
			  JComponent[] componentsshow = {
			  
			  tname, pname, new JLabel(), 
			  tkor, bkor, new JLabel(), 
			  tmath, bmath, new JLabel(), 
			  teng, beng, new JLabel(), 
			  new JLabel(), chkbtn, new JLabel() };
			  
			  for (JComponent d : componentsshow) { showpnl.add(d); }
			  
			  
			  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			  pack();
			  
		
	}
	
	
}

	private void add(String north, JPanel showtpnl) {
		// TODO Auto-generated method stub
		
	}
