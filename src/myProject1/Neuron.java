package myProject1;

public class Neuron {
	double weight = 1;
	double input;
	double output=0;
	double error = 0;

	public Neuron() {
		initWeidht();
		System.out.println(weight);
	}

	public void initInput(double d) {
		System.out.println("error"); ///WRONG!!!
		input = 0;
		output = d;
	}

	public void initWeidht() {
		weight = Math.random() + 0.01;
		weight = 0.1;
	}

	public void calcValue(Neuron n[]) { //WRONG!!!
		input = 0;
		for (Neuron n1 : n)
			input += n1.output;
		output = input * weight;
		if (output > 0.5)
			output = 1;
		else
			output = 0;
	}

	public void calcWeight(Neuron n[]) {
		error = 0;
		for (Neuron n1 : n)
			error+= n1.error;
		output = input * weight;
		if (output > 0.5)
			output = 1;
		else
			output = 0;
	}

	public void coutValue() {
		System.out.println(output);
	}

}
