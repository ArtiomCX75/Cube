package MLP;

public class Neuron {
	double value = 0;
	public double nErr = 0;

	public double getValue() {
		// System.out.println("get "+value);
		return value;
	}

	public void setValue(double value) {
		// System.out.println("set "+value);
		this.value = value;
	}

	public void makeRound() {
		if (value > 0.5)
			value = 1;
		else
			value = 0;
	}

	public void makeRoundPro() {
		if (value > 1)
			value = 1;
		if (value < 0)
			value = 0;
	}
}
