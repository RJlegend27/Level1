import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	Font titleFont;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Rocketship rocket = new Rocketship(250, 700, 50, 50);
	ObjectManager manager = new ObjectManager();

		
	void updateMenuState() {

	}

	void updateGameState() {
		// rocket.update();
		manager.update();
		manager.manageEnemies();
		manager.checkCollision();
		
		if(rocket.isAlive == false){
			currentState = END_STATE;
		}
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(titleFont);
		g.drawString("Press ENTER for Liftoff", 0, 400);
		g.drawString("LEAGUE INVADERS", 20, 100);

	}

	void drawGameState(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		manager.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.RED);
		g.setFont(titleFont);
		g.drawString("GAMEOVER", 110, 400);
		g.drawString("" +manager.getScore(), 110, 500);
	}

	// GameObject gameObject;
	public void paintComponent(Graphics g) {
		// gameObject.draw(g);
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

		// gameObject.update();
	}

	GamePanel() {
		timer = new Timer(1000 / 60, this);
		// gameObject = new GameObject();
		titleFont = new Font("Arial", Font.PLAIN, 48);
		manager.addObject(rocket);
	}

	void startGame() {
		timer.start();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("a");

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == 10) {
			++currentState;
			if (currentState > END_STATE) {
				currentState = MENU_STATE;
			}

		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocket.right = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rocket.left = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rocket.up = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rocket.down = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			manager.addObject(new Projectile(rocket.x + (rocket.width/2), rocket.y, 10, 10));
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rocket.up = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocket.right = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rocket.left = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rocket.down = false;
		}
	}

}
