package MLP;

public class Weight {
	public Neutron weight[][];

	public Weight(Layer from, Layer to) {
		System.out.println("Create weights with size: " + from.lenght + " x " + to.lenght);
		weight = new Neutron[from.lenght][to.lenght];
		for (int i = 0; i < weight.length; i++) {
			for (int j = 0; j < weight[0].length; j++) {
				weight[i][j] = new Neutron();
				weight[i][j].setValue(0.01);
				// weight[i][j].setValue(Math.random()*0.1+0.01);
			}
		}
	}

	public void printWeight() {
		for (int i = 0; i < weight.length; i++) {
			System.out.println("");
			for (int j = 0; j < weight[0].length; j++) {
				System.out.print(weight[i][j].getValue() + "  ");
			}
		}
		System.out.println("");
	}
	
	
	/*public void setWeight(Layer from, Layer to) {
		for (int i = 0; i < weight.length; i++) {
			for (int j = 0; j < weight[0].length; j++) {
				weight[i][j].setValue(0.01);
				// weight[i][j].setValue(Math.random()*0.1+0.01);
			}
		}
	}*/
	public void calcWeight(Layer from, Layer to) {
		for (int i = 0; i < weight.length; i++) {
			for (int j = 0; j < weight[0].length; j++) {
				weight[i][j].setValue(weight[i][j].getValue()+to.neutron[j].nErr*0.01);
				// weight[i][j].setValue(Math.random()*0.1+0.01);
			}
		}
	}
	
}
