import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	boolean isAlive = true;
	Rectangle hitBox;

	GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		hitBox = new Rectangle(x, y, width, height);

	}

	void update() {
		hitBox.setBounds(x, y, width, height);

	}

	void draw(Graphics g) {
		g.fillRect(x, y, 100, 100);
	}
}
