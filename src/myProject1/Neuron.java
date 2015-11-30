package myProject1;

public class Neuron {
	double weight = 1;
	double input;
	double value;
	double error = 0;

	public Neuron() {
		initWeidht();
		System.out.println(weight);
	}

	public void initInput(double d) {
		input = 0;
		value = d;
	}

	public void initWeidht() {
		weight = Math.random() + 0.01;
		weight = 0.1;
	}

	public void calcValue(Neuron n[]) { //WRONG!!!
		input = 0;
		for (Neuron n1 : n)
			input += n1.value;
		value = input * weight;
		if (value > 0.5)
			value = 1;
		else
			value = 0;
	}

	public void calcWeight(Neuron n[]) {
		error = 0;
		for (Neuron n1 : n)
			error+= n1.error;
		value = input * weight;
		if (value > 0.5)
			value = 1;
		else
			value = 0;
	}

	public void coutValue() {
		System.out.println(value);
	}

}
