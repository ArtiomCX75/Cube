package MLP2;

public class Neuron {
	public double inVal = 0;
	public double outVal = 0;
	public double inErr = 0;
	public double outErr = 0;

	public double f(double x) {
		// =1/(1+($A$1^(C1*(-0,5))))
		double y = 1 / (1 + Math.exp(x * (-0.5)));
		return y;
	}

	public void calcOutVal() {
		outVal = f(inVal);
	}

	public void round() {
		if (outVal > 0.5)
			outVal = 1;
		else
			outVal = 0;

	}
}
