package MLP;

public class Weight {
	public Neuron weight[][];

	public Weight(Layer from, Layer to) {
		System.out.println("Create weights with size: " + from.lenght + " x " + to.lenght);
		weight = new Neuron[from.lenght][to.lenght];
		for (int i = 0; i < weight.length; i++) {
			for (int j = 0; j < weight[0].length; j++) {
				weight[i][j] = new Neuron();
				weight[i][j].setValue(0.1);
				//weight[i][j].setValue(Math.random()*0.1+0.3);
			}
		}
	}

	public void printWeight() {
		//System.out.println("");
		for (int i = 0; i < weight[0].length; i++) {
			System.out.println("");
			for (int j = 0; j < weight.length; j++) {
				System.out.print(weight[j][i].getValue() + "  ");
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
	public void calcWeight(Layer lay) {
		for (int i = 0; i < weight.length; i++) {
			for (int j = 0; j < weight[0].length; j++) {
				weight[i][j].setValue(weight[i][j].getValue()+lay.neutron[j].nErr*0.1);
				       
			}
		}
	}
	
}
