import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
JButton joke = new JButton("joke");
		JButton punchline = new JButton("punchline");
		
	public ChuckleClicker() {
		
	}
public static void main(String[] args) {
	ChuckleClicker CC = new ChuckleClicker();
	CC.makeButtons();
}

public void makeButtons() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	
	joke.addActionListener(this);
	panel.add(joke);
	
	punchline.addActionListener(this);
	panel.add(punchline);
	frame.setSize(300, 100);
	frame.setVisible(true);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(joke)) {
		JOptionPane.showMessageDialog(null, "What did Peter Pan fail as a stand-up comedian?");
	}
	if(e.getSource().equals(punchline)) {
		JOptionPane.showMessageDialog(null, "Because his jokes Neverland");
	}
}
}
