import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {
	public static int add(int a, int b) {
		int c;
		c = a+b;
		return c;
	}
	public static int multiply(int a, int b) {
		int c;
		c = a*b;
		return c;
	}
	public static int subtract(int a, int b) {
		int c;
		c = a-b;
		return c;
	}
	public static int divide(int a, int b) {
		int c;
		c = a/b;
		return c;
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add");
	JButton sub = new JButton("Subtract");
	JButton mul = new JButton("Multiply");
	JButton div = new JButton("Divide");
	JTextField entry1 = new JTextField(15);
	JTextField entry2 = new JTextField(15);
	JLabel answer = new JLabel();
	
	public static void main(String[] args) {
		Calculator CC = new Calculator();
		CC.calc();
	}
	
	public void calc() {
		frame.add(panel);
		panel.add(entry1);
		panel.add(entry2);
		panel.add(answer);
		panel.add(add);
		add.addMouseListener(this);
		panel.add(sub);
		sub.addMouseListener(this);
		panel.add(mul);
		mul.addMouseListener(this);
		panel.add(div);
		div.addMouseListener(this);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		entry1.getText();
		int a = Integer.parseInt(entry1.getText());
		entry2.getText();
		int b = Integer.parseInt(entry2.getText());
		int ans;
		
		if(e.getSource().equals(add)) {
			ans = add(a, b);
			answer.setText("= " + ans);
		}
		else if(e.getSource().equals(sub)) {
			ans = subtract(a, b);
			answer.setText("= " + ans);
		}
		else if(e.getSource().equals(mul)) {
			ans = multiply(a, b);
			answer.setText("= " + ans);
		}
		else if(e.getSource().equals(div)) {
			ans = divide(a, b);
			answer.setText("= " + ans);
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
