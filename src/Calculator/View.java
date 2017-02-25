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
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JPanel displayPanel = new JPanel();

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

JLabel label = new JLabel("display");

public View(){
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.add(displayPanel);
	frame.add(panel);
	displayPanel.add(label);
	label.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
	frame.setLayout(new GridLayout(2,1));
	panel.setLayout(new GridLayout(4,5)); 
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
