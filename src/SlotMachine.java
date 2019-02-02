import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	Icon Strawberry;
	Icon Grapes;
	Icon Watermelon;
	public static void main(String[] args) {
	SlotMachine slot = new SlotMachine();
	slot.frameBuilder();
	
}
	
	private void frameBuilder() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("SPIN");
		frame.add(panel);
		panel.add(button);
		
		URL imageURL = getClass().getResource("Strawberry.png");
		Strawberry = new ImageIcon(imageURL);
		imageURL = getClass().getResource("Grapes.png");
		Grapes = new ImageIcon(imageURL);
		imageURL = getClass().getResource("Watermelon.png");
		Watermelon = new ImageIcon(imageURL);
		JLabel slot1 = new JLabel();
		slot1.setIcon(Strawberry);
		JLabel slot2 = new JLabel();
		slot2.setIcon(Grapes);
		JLabel slot3 = new JLabel();
		slot3.setIcon(Watermelon);
	
		panel.add(slot1);
		panel.add(slot2);
		panel.add(slot3);
		frame.pack();
		frame.setVisible(true);
	}
	
}
