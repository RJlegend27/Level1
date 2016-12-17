import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGui implements ActionListener{
	JFrame window;
	JPanel panel;
	JButton button;
	JButton butt;
	public static void main(String[] args) {
		MyGui nerd = new MyGui();
		nerd.run();
	}
	

	public void run() {
		window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		button = new JButton("left");
		butt = new JButton("right");
		button.addActionListener(this);
		butt.addActionListener(this);
		window.setVisible(true);
		window.add(panel);
		panel.add(button);
		panel.add(butt);
		window.setSize(500, 500);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button){
			System.out.println("MaKe It BlUe");
		}else if (e.getSource()==butt)
			System.out.println("mAkE iT bLuE");
		{
			
			}
		
		
	}
}
