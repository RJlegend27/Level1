import javax.swing.JOptionPane;

import org.SportsAPI;

public class Sports {
public static void main(String[] args) {
	String userPlayer = JOptionPane.showInputDialog("Enter your sport player (CASE SENSITIVE)");
	String userTeam = JOptionPane.showInputDialog("What sport do they play? (LOWER CASE)");
	SportsAPI sport = new SportsAPI(userTeam);
	sport.getPhoto(userPlayer);
}
}
