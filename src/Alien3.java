import java.awt.Color;
import java.awt.Graphics;

public class Alien3 extends Aliens {
	Alien3(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 3;
		xspeed = 4;
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		hitBox.setBounds(x, y, width, height);
		y += speed;
		// x -= xspeed;
		// if (x > 500 || x < 1) {
		// xspeed = -xspeed;
		// }

		if (y > LeagueInvaders.HEIGHT) {
			isAlive = false;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);

	}
}
