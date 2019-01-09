import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField one = new JTextField(20);
	JButton button = new JButton("translate");
	JTextField two = new JTextField(20);
	
	public static void main(String[] args) {
		PigLatinTranslator pig = new PigLatinTranslator();
		pig.frameBuilder();
	}
	
	public void frameBuilder() {
		frame.setTitle("Pig Latin Translator");
		frame.add(panel);
		panel.add(one);
		panel.add(button);
		panel.add(two);
		frame.pack();
		frame.setVisible(true);
	}
}
