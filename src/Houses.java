import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class Houses {
	int small = 60;
	int medium = 120;
	int large = 250;

	static void easybuliding() {
		Tortoise.setPenColor(Color.red);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(20);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(-90);
	}

	static void tallbuliding() {
		Tortoise.setPenColor(Color.blue);
		Tortoise.turn(-90);
		Tortoise.move(130);
		Tortoise.turn(20);
		Tortoise.move(20);
		Tortoise.turn(140);
		Tortoise.move(20);
		Tortoise.turn(20);
		Tortoise.move(130);
		Tortoise.turn(-90);
	}

	static void smallbuliding() {
		Tortoise.setPenColor(Color.magenta);
		Tortoise.turn(-90);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(10);
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(-90);

	}
	static void invertbuilding(){
		Tortoise.setPenColor(Color.ORANGE);
		Tortoise.turn(-90);
		Tortoise.move(90);
		Tortoise.turn(-20);
		Tortoise.move(20);
		Tortoise.turn(-140);
		Tortoise.move(20);
		Tortoise.turn(-20);
		Tortoise.move(90);
		Tortoise.turn(-90);
	}

	static void grass() {
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(15);

	}

	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.setX(0);
		Tortoise.setY(450);
		Tortoise.move(1);
		for (int i = 0; i < 171; i++) {
			easybuliding();
			grass();
			tallbuliding();
			grass();
			smallbuliding();
			grass();
			invertbuilding();
			Tortoise.turn(-90);
		}
	}
}
