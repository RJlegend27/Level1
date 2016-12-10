

	import java.awt.Frame;
import java.util.Random;

import javax.swing.JFrame;
	import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle;


	public class LandOfTurtles {
		public static void main(String[] args) {
			
			MultiTurtlePanel panel = new MultiTurtlePanel();
			String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";


	// 1. Create a frame & make it visible
			JFrame frame = new JFrame();
			frame.setVisible(true);
			// 2. Add the panel to the frame
			frame.add(panel);
			// 3. Set the background image of the panel to the Galapagos Islands 
			panel.setBackgroundImage(galapagosIslands);

			// 4. Instantiate a Turtle 
			Turtle james = new Turtle();
			
			int grape = new Random().nextInt(100);
	// 5. Add the turtle to the panel 
			panel.addTurtle(james);
			// 6. Put 50 Turtles on the beach
			james.penUp();
			
			for(int i = 0; i<1000;i++){
				//int apple = new Random().nextInt(100);
				Turtle seamore = new Turtle();
				panel.addTurtle(seamore);
				seamore.setX(i+grape);
				seamore.setY(i+grape);
			}

		}
	}




