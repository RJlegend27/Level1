import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {
	Menu view;
	MenuData data;

	MenuController(Menu view, MenuData data) {
		this.view = view;
		this.data = data;
		setup();
		view.addListener(this);
	}

	void setup() {
		view.setItem1(data.getItem1());
		view.setItem2(data.getItem2());
		view.setItem3(data.getItem3());
		view.setItem4(data.getItem4());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
