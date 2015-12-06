package MLP2;

public abstract class Layer {
	public Neuron n[];

	public Layer(int qt) {
		n = new Neuron[qt];
		for (int i = 0; i < qt; i++)
			n[i] = new Neuron();
	}

	public void calcOut() {
		for (int i = 0; i < n.length; i++)
			n[i].calcOutVal();
	}

	public void setInValNull() {
		for (int i = 0; i < n.length; i++)
			n[i].inVal = 0;
	}

	public void setOutValNull() {
		for (int i = 0; i < n.length; i++)
			n[i].outVal = 0;
	}

	public void setInErrNull() {
		for (int i = 0; i < n.length; i++)
			n[i].inErr = 0;
	}

	public void setOutErrNull() {
		for (int i = 0; i < n.length; i++)
			n[i].outErr = 0;
	}
	public void round() {
		for (int i = 0; i < n.length; i++)
			n[i].round();
	}
}
