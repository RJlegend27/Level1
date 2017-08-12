import java.awt.Color;
import java.awt.Graphics;

public class Alien4 extends Aliens {
	Alien4(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 1;
		xspeed = 1;
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		hitBox.setBounds(x, y, width, height);
		y += speed;
		if (x > Rocketship.rocketx) {
			x--;
		} else if (x < Rocketship.rocketx) {
			x++;
		}

		if (y > LeagueInvaders.HEIGHT) {
			isAlive = false;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);

	}
}
