package SwingOne;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class toooooo extends JFrame {

    public toooooo() {
        initUI();
    }

    public final void initUI() {
        JPanel panel = new JPanel();
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("회원가입"));
        panel.setLayout(new GridLayout(7, 2, 5, 5));

        JComponent[] components = {
                new JLabel("ID"), new JTextField(), new JButton("중복확인"),
                new JLabel("PWD"), new JPasswordField(), new JLabel(),
                new JLabel("PWD확인"), new JPasswordField(), new JLabel(),
                new JLabel("이름"), new JTextField(), new JLabel(),
                new JLabel("전화번호"), new JTextField(), new JLabel(),
                new JLabel(), new JButton("확인"), new JLabel()
        };

        for (JComponent c : components) {
            panel.add(c);
        }

        add(BorderLayout.NORTH, titlePanel);
        add(BorderLayout.CENTER, panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        toooooo ex = new toooooo();
        ex.setVisible(true);
        ex.setLocationRelativeTo(null);
    }
}
    