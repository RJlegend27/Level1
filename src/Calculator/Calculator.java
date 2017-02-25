package Calculator;

public class Calculator {
public static void main(String[] args) {
	Model calmodel = new Model();
	View calview = new View();
	Controller calcon = new Controller(calview,calmodel);
}
}
