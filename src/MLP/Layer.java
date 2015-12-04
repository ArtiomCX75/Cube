package MLP;

public class Layer {
	public Neutron neutron[];
	int lenght;


	public Layer(int len) {
		System.out.println("Create layer with " + len + " neutrons");
		lenght = len;
		neutron = new Neutron[len];
		for (int i = 0; i < neutron.length; i++) {
			neutron[i] = new Neutron();
			neutron[i].setValue(0);
		}
	}

	public void makeRound() {
		for (Neutron n : neutron)
			n.makeRound();
	}

	public void printLayer() {
		System.out.println("");
		for (int i = 0; i < neutron.length; i++) {
			System.out.print(neutron[i].getValue() + "  ");
		}
		System.out.println("");
	}

	public void setLayer(double d[]) {
		for (int i = 0; i < neutron.length; i++) {
			neutron[i].setValue(d[i]);
		}
	}

	public void setLayerNull() {
		for (int i = 0; i < neutron.length; i++) {
			neutron[i].setValue(0);
		}
	}

	public void setLayerErrNull() {
		for (int i = 0; i < neutron.length; i++) {
			neutron[i].nErr=0;
		}
	}

	public void roundLayer() {
		for (int i = 0; i < neutron.length; i++) {
			neutron[i].makeRound();
		}
	}

	public void calcError(double solution) {
		setLayerErrNull();
		for (int i = 0; i < neutron.length; i++) {
			neutron[i].nErr = solution - neutron[i].getValue();
		}
	}
}
