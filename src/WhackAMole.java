import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	static Random r = new Random();
	static int whacked = 0;
	static int clicked = 0;
	static Date timeAtStart;
	public static void main(String[] args) {
		timeAtStart = new Date();
		WhackAMole whack = new WhackAMole();
		whack.drawButtons(r.nextInt(24));
		
	}

	public void drawButtons(int r) {
		frame.setSize(300, 350);
		frame.setTitle("Whack-a-Mole");
		frame.add(panel);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			if (i == r) {
				button.setText("mole!");
			}
			panel.add(button);
			button.addMouseListener(this);
		}

		frame.setVisible(true);
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	    private void endGame(Date timeAtStart, int molesWhacked) {
	         Date timeAtEnd = new Date();
	         JOptionPane.showMessageDialog(null, "Your whack rate is "
	        		 + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	              + " moles per second.");
	    }
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton k = (JButton) e.getSource();
		System.out.println("click");
		if (k.getText().equals("mole!")) {
			playSound("slap.wav");
			whacked++;
			frame.dispose();
			WhackAMole whacks = new WhackAMole();
			whacks.drawButtons(r.nextInt(24));
			if(whacked == 10) {
				endGame(timeAtStart, whacked);
			}
		} 
		else {
			playSound("slap.wav");
			clicked++;
			speak("incorrect");
			if(clicked > 5) {
				JOptionPane.showMessageDialog(null, "You lost");
				endGame(timeAtStart, clicked);
			}
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
