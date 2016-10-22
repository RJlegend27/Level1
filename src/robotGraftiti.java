import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class robotGraftiti {
public static void main(String[] args) {
	
	Robot r = new Robot();
	r.hide();
	r.setSpeed(10);
	r.setPenColor(Color.red);
	r.penDown();
	r.setX(10);
	r.setY(500);
	r.move(200);
	r.turn(90);
	r.move(100);
	r.turn(90);
	r.move(100);
	r.turn(90);
	r.move(100);
	r.turn(90);
	r.turn(135);
	r.move(170);
	Robot j = new Robot();
	j.hide();
	j.setSpeed(10);
	j.setPenColor(Color.white);
	j.penDown();
	j.setX(200);
	j.setY(450);
	j.turn(180);
	for(int i = 0; i<180; i++){
		j.turn(-1);
		j.move(1);
	}
	j.move(150);
	j.turn(90);
	j.move(75);
	j.turn(-180);
	j.move(150);
	Robot p = new Robot();
	p.hide();
	p.setSpeed(10);
	p.setPenColor(Color.blue);
	p.penDown();
	p.setX(500);
	p.move(200);
	p.turn(90);
	for(int i = 0; i<180; i++){
		p.turn(1);
		p.move(1);
	}
	
	
}
}
