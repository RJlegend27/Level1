package Calculator;

public class Model {
	String input1 = "";
	String input2 = "";
	String input3 = "";
	String output = "";
	boolean operatorPressed;
	

	String getInputOne() {
		return input1;
	}

	void setInputOne(String input) {
		this.input1 = input1;
	}

	String getInputTwo() {
		return input2;
	}

	void setInputTwo(String input2) {
		this.input2 = input2;
	}

	String getInputThree() {
		return input3;
	}

	void setInputThree(String input3) {
		this.input3 = input3;
	}

	String getOutput() {
		return output;
	}

	void setOutput(String output) {
		this.output = output;
	}
	
	void addNum(String num){

		if(num.equals("=")){
		calculate();
	}
		else if(num.equals("+")||num.equals("-")||(num.equals("X"))||(num.equals("/"))){
			operatorPressed = true;
			input2 = num;
			
		}else if(operatorPressed == true){
			input3 = input3 + num;
		}
		
		else{
			operatorPressed = false;
			input1 = input1 + num;
			
		}
	if(num.equals("C")){
		input1 = "";
		input2 = "";
		input3 = "";
		output = "";
		operatorPressed = false;
		}	
	}

	private void calculate() {
		int sandles = Integer.parseInt(input1);
		int flipflops = Integer.parseInt(input3);
		int crocs = 0;
	//	if(input2.equals("+")){
		//output = input1 + input3;
		if(input2.equals("+")){
			crocs = sandles + flipflops;
		}
		if(input2.equals("-")){
			crocs = sandles - flipflops;
		}
		if(input2.equals("X")){
			crocs = sandles * flipflops;
		}
		if(input2.equals("/")){
			crocs = sandles / flipflops;
		}
		output = crocs + "";
		System.out.println(output);
		
			
		
		}
		}
	
	

