import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements MouseListener {
	Icon Strawberry;
	Icon Grapes;
	Icon Watermelon;
	JLabel slot1 = new JLabel();
	JLabel slot2 = new JLabel();
	JLabel slot3 = new JLabel();
	int reel1, reel2, reel3;
	JFrame frame = new JFrame();
	public static void main(String[] args) {
	SlotMachine slot = new SlotMachine();
	slot.frameBuilder();
}
	
	private void frameBuilder() {
		JPanel panel = new JPanel();
		JButton button = new JButton("SPIN");
		button.addMouseListener(this);
		
		URL imageURL = getClass().getResource("Strawberry.png");
		Strawberry = new ImageIcon(imageURL);
		imageURL = getClass().getResource("Grapes.png");
		Grapes = new ImageIcon(imageURL);
		imageURL = getClass().getResource("Watermelon.png");
		Watermelon = new ImageIcon(imageURL);
		slot1.setIcon(Strawberry);
		slot2.setIcon(Grapes);
		slot3.setIcon(Watermelon);
		
		panel.add(button);
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	 private int showImage(JLabel label) {
		 int r = new Random().nextInt(2);
		 System.out.println(r);
		 if(r == 0) {
		label.setIcon(Strawberry);
		 }
		 else if(r ==  2) {
		 label.setIcon(Grapes);
		 }
		 else {
		label.setIcon(Watermelon);
		 }
		 return r;
	 }
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		reel1 = showImage(slot1);
		reel2 = showImage(slot2);
		reel3 = showImage(slot3);
		frame.pack();
		if(reel1 == reel2 && reel2 == reel3){
			JOptionPane.showMessageDialog(null, "YOU WIN!!");
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
