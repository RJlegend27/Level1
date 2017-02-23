import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel Item1 = new JLabel();
	JLabel Item2 = new JLabel();
	JLabel Item3 = new JLabel();
	JLabel Item4 = new JLabel();
	JButton button = new JButton();
	JTextField text = new JTextField();

	public Menu() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(panel);
		panel.add(button);
		panel.add(Item1);
		panel.add(Item2);
		panel.add(Item3);
		panel.add(Item4);

	}

	void addListener(ActionListener controller) {
		button.addActionListener(controller);
	}

	void setItem1(String Burger) {
		Item1.setText("Burger");
	}

	void setItem2(String Pasta) {
		Item2.setText("Pasta");

	}

	void setItem3(String Pizza) {
		Item3.setText("Pizza");
	}

	void setItem4(String IceCream) {
		Item4.setText("IceCream");
	}

}
