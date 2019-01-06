import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {
	public static int add(int a, int b) {
		return a+b;
	}
	public static int multiply(int a, int b) {
		return a*b;
	}
	public static int subtract(int a, int b) {
		return a-b;
	}
	public static int divide(int a, int b) {
		return a/b;
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
		Calculator calc = new Calculator();
		calc();
	}
	
	public void calc() {
		frame.add(panel);
		panel.add(add);
		add.addMouseListener(this);
		panel.add(sub);
		sub.addMouseListener(this);
		panel.add(mul);
		mul.addMouseListener(this);
		panel.add(div);
		div.addMouseListener(this);
		
		panel.add(entry1);
		panel.add(entry2);
		
		panel.add(answer);
		frame.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource().equals(add)) {
			add(int, int);
		}
		else if(e.getSource().equals(sub)) {
			subtract(int, int);
		}
		else if(e.getSource().equals(mul)) {
			multiply(int, int);
		}
		else if(e.getSource().equals(div)) {
			divide(int, int);
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
