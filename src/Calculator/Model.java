package Calculator;

public class Model {
	String input1 = "";
	String input2;
	String input3;
	String output;

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
		input1=this.input1 + num;
		System.out.println(input1);
	}
}
