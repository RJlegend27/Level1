
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyParts {

	// Get 3 celebrity photos from the internet, save them to your computer, and
	// fill
	// in their paths here. To get the path, right click on the image, and copy
	// its Location.
	String firstImage = "/Users/league/Desktop/imgres-1.jpg";
	String secondImage = "/Users/league/Desktop/imgres.jpg";
	String thirdImage = "/Users/league/Desktop/9k=.jpg";

	Frame window = new Frame();

	private void startQuiz() {
		// Set the size of the window so that you can only see part of the
		// image.
		window.setSize(50, 50);
		// Make an int variable to hold the score.
		int score = 0;

		// Ask the user who this person is and store their answer
		String userInput = JOptionPane.showInputDialog("Who is this?");
		if (userInput.equalsIgnoreCase("snoop dogg")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score++;

		} else {
			window.setSize(500,500);
			JOptionPane.showMessageDialog(null, "WRONG");
			
		}
		showNextImage();
		window.setSize(100,100);
		String userInput2 = JOptionPane.showInputDialog("Who is this?");
		if (userInput2.equalsIgnoreCase("Joe Biden")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score++;

		} else {
			window.setSize(500,500);
			JOptionPane.showMessageDialog(null, "WRONG");
		}
		showNextImage();
		window.setSize(150,150);
		String userInput3 = JOptionPane.showInputDialog("Who is this?");
		if(userInput3.equalsIgnoreCase("sportacus")){
			JOptionPane.showMessageDialog(null, "CORRECT");
			score++;

		} else {
			window.setSize(500,500);
			JOptionPane.showMessageDialog(null, "WRONG");
		}
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyParts quiz = new BodyParts();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
