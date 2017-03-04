package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

Model model;
View view;
	public Controller(View calview, Model calmodel) {
		// TODO Auto-generated constructor stub
		calview.addListeners();
	}
	Controller(){
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("GET PRANKKKKKKEKDKEDEDEDEDDDD");
	}

}
