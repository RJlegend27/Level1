package Calculator;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;

import javax.swing.JLabel;

public class View {
void viewSetLabel1(String input1){
	label1.setText(input1 + "");
}
void viewSetLabel2(String input2){
	label2.setText(input2 + "");
}
void viewSetLabel3(String input3){
	label3.setText(input3 + "");
}
void viewSetLabel(String output){
	label4.setText(output + "");
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();

JButton button = new JButton("1");
JButton button1 = new JButton("2");
JButton button2 = new JButton("3");
JButton button3 = new JButton("X");
JButton button4 = new JButton("4");
JButton button5 = new JButton("5");
JButton button6 = new JButton("6");
JButton button7 = new JButton("/");
JButton button8 = new JButton("7");
JButton button9 = new JButton("8");
JButton button0 = new JButton("9");
JButton button10 = new JButton("-");
JButton button11 = new JButton("C");
JButton button12 = new JButton("0");
JButton button13 = new JButton("+");
JButton button14 = new JButton("=");
JLabel label1 = new JLabel("");
JLabel label2 = new JLabel("");
JLabel label3 = new JLabel("");
JLabel label4 = new JLabel("");

void addListeners (){
	button.addActionListener(new Controller());
	button1.addActionListener(new Controller());
	button2.addActionListener(new Controller());
	button3.addActionListener(new Controller());
	button4.addActionListener(new Controller());
	button5.addActionListener(new Controller());
	button6.addActionListener(new Controller());
	button8.addActionListener(new Controller());
	button9.addActionListener(new Controller());
	button0.addActionListener(new Controller());
	button10.addActionListener(new Controller());
	button11.addActionListener(new Controller());
	button12.addActionListener(new Controller());
	button13.addActionListener(new Controller());
	button14.addActionListener(new Controller());
	
}



public View(){
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.add(label);
	frame.add(panel);
	label1.setBorder(BorderFactory.createLineBorder(Color.CYAN));
	label2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	label3.setBorder(BorderFactory.createLineBorder(Color.CYAN));
	label4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	panel.add(label4);
	//frame.setLayout(new GridLayout(2,1));
	panel.setLayout(new GridLayout(5,4)); 
	panel.add(button);

	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(button5);
	panel.add(button6);
	panel.add(button7);
	panel.add(button8);
	panel.add(button9);
	panel.add(button0);
	panel.add(button10);
	panel.add(button11);
	panel.add(button12);
	panel.add(button13);
	panel.add(button14);
	
	
	
}
}
