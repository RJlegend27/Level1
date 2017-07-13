import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int x;
	int y;
	int width;
	int height;
	int speed;

	boolean up = false;
	boolean right = false;
	boolean left = false;
	boolean down = false;

	Rocketship(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		speed = 5;

	}

	void update() {
		if (up) {
			y -= speed;
		}
		if (right)

		{
			x += speed;
		}
		if (left)

		{
			x -= speed;
		}
		if (down)

		{
			y += speed;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);

	}
}