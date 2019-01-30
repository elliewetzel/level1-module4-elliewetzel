import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	static Random r = new Random();

	public static void main(String[] args) {
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {

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
