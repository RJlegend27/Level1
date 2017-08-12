import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	// int x;
	// int y;
	// int width;
	// int height;
	int speed;
	static int rocketx;

	boolean up = false;
	boolean right = false;
	boolean left = false;
	boolean down = false;

	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
		rocketx = x;

	}

	void update() {
		super.update();
		if (up) {
			y -= speed;
		}
		if (right)

		{
			rocketx += speed;
		}
		if (left)

		{
			rocketx -= speed;
		}
		if (down)

		{
			y += speed;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
		// g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

	}
}