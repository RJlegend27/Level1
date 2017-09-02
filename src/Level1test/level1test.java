package Level1test;

import java.awt.event.ActionListener;
//import java.awt.event.KeyListener;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class level1test {
	  void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
public static void main(String[] args, WindowListener ActionListener, ActionListener MouseClicked) {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.setVisible(true);
	frame.addWindowListener(ActionListener);
	frame.add(panel);
	panel.setVisible(true);
	frame.setSize(500, 150);
	//panel.setName("Color Teacher");
	JButton yellowb = new JButton();
	JButton redb = new JButton();
	JButton blueb = new JButton();
	JButton greenb = new JButton();
	panel.add(yellowb);
	panel.add(redb);
	panel.add(blueb);
	panel.add(greenb);
	yellowb.addActionListener(MouseClicked);
	if(yellowb == MouseClicked) {
		//speak("Yellow");
	}
	//yellowb.getBackground(yellow);
	yellowb.setOpaque(true);
	
	
	
	
}
}
