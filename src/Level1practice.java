import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Level1practice {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setSize(500, 500);
	frame.setVisible(true);
	JLabel label = new JLabel();
	frame.add(label);
	label.setVisible(true);
	JButton button = new JButton();
	JButton button2 = new JButton();
	button.setVisible(true);
	button2.setVisible(true);
	frame.add(button);
	frame.add(button2);
}
}
