import java.awt.Color;
import java.awt.Graphics;

public class Aliens extends GameObject{
//	int x;
//	int y;
//	int width;
//	int height;
	int speed;
	int xspeed;

	Aliens(int x, int y, int width, int height) {
		super(x,y,width,height);
		speed = 5;
		xspeed = 15;
	}

	void update() {
		super.update();
		y += speed;
		x -=xspeed;
		if(x > 500 || x < 1){
			xspeed = -xspeed;
		}
		
		if (y > LeagueInvaders.HEIGHT) {
			isAlive = false;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(x, y, width, height);

	}
}
