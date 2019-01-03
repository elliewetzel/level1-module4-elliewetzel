import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javafx.scene.input.KeyCode;

public class TypingTutor implements KeyListener {
	char currentLetter;
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	public TypingTutor() {
		
	}
	public static void main(String[] args) {
		TypingTutor TT = new TypingTutor();
		TT.frameBuilder();
		
	}

	public void frameBuilder(){ 
		frame.setTitle("Type or Die");
		frame.setVisible(true);
		currentLetter = generateRandomLetter();
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(String.valueOf(currentLetter));
		frame.add(label);
		frame.setSize(200, 100);
		frame.addKeyListener(this);
		frame.setVisible(true);
	}
	
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Yout typed: " + e.getKeyChar());
		if(e.getKeyChar() == currentLetter) {
			System.out.println("correct");
			frame.getContentPane().setBackground(Color.green);
		}
		else {
			System.out.println("wrong");
			frame.getContentPane().setBackground(Color.red);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(String.valueOf(currentLetter));
	}
}
