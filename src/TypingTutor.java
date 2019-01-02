import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	
	public TypingTutor() {
		
	}
	public static void main(String[] args) {
		TypingTutor TT = new TypingTutor();
		TT.frameBuilder();
		
	}

	public void frameBuilder(){ 
		JFrame frame = new JFrame();
		frame.setTitle("Type or Die");
		frame.setVisible(true);
		currentLetter = generateRandomLetter();
		JLabel label = new JLabel();
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
