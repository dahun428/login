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
        titlePanel.add(new JLabel("ȸ������"));
        panel.setLayout(new GridLayout(7, 2, 5, 5));

        JComponent[] components = {
                new JLabel("ID"), new JTextField(), new JButton("�ߺ�Ȯ��"),
                new JLabel("PWD"), new JPasswordField(), new JLabel(),
                new JLabel("PWDȮ��"), new JPasswordField(), new JLabel(),
                new JLabel("�̸�"), new JTextField(), new JLabel(),
                new JLabel("��ȭ��ȣ"), new JTextField(), new JLabel(),
                new JLabel(), new JButton("Ȯ��"), new JLabel()
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
    