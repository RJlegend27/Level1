import java.awt.Color;
import java.awt.Graphics;

public class Alien2 extends Aliens {
	Alien2(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;
		xspeed = 25;
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		hitBox.setBounds(x, y, width, height);
		y += speed;
		x -= xspeed;
		if (x > 500 || x < 1) {
			xspeed = -xspeed;
		}

		if (y > LeagueInvaders.HEIGHT) {
			isAlive = false;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);

	}
}
