package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener{

static Model model;
static View view;
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
		
		
		// TODO Auto-generated constructor stub
		view.addListeners();
	}
	Controller(){
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("GET PRANKKKKKKEKDKEDEDEDEDDDD");
		JButton buttonPressed =(JButton)e.getSource();
		System.out.println(buttonPressed.getText());
		model.addNum(buttonPressed.getText());
		model.getInputOne();
		view.viewSetLabel1(model.getInputOne());
		view.viewSetLabel2(model.getInputTwo());
		view.viewSetLabel3(model.getInputThree());
		view.viewSetLabel(model.getOutput());
		//view.viewSetLabel(model.getInputoutput());
		
	}
		
		//clear
}