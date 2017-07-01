import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame screen;
	static final int HEIGHT = 800;
	static final int WIDTH = 500;
	GamePanel gamePanel;
	
public static void main(String[] args) {
	new LeagueInvaders();
	
}
LeagueInvaders(){
	gamePanel = new GamePanel();
	screen = new JFrame();
	setup();
}

void setup(){
	screen.add(gamePanel);
	screen.addKeyListener(gamePanel);
	screen.setSize(WIDTH, HEIGHT);
	screen.setVisible(true);
	screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gamePanel.startGame();
}

}
