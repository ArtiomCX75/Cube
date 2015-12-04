package MLP;

public class Network {
	Layer input;
	Layer output;
	Layer hidden1;
	Layer hidden2;
	Layer hidden3;
	Weight wIO;

	public Network(int i1, int i2) {
		System.out.println("Create net " + i1 + " x " + i2);
		input = new Layer(i1);
		output = new Layer(i2);
		wIO = new Weight(input, output);
	}

	public void printNet() {
		input.printLayer();
		wIO.printWeight();
		output.printLayer();
	}

	public void calcValue(Layer l1, Weight w, Layer l2) {
		l2.setLayerNull();
		for (int i = 0; i < w.weight.length; i++) {
			for (int j = 0; j < w.weight[0].length; j++) {
				l2.neutron[j].setValue(l2.neutron[j].getValue() + w.weight[i][j].getValue() * l1.neutron[i].getValue());
			}
		}
	}

	public void study() {
		double gErr = 0;
		int iter = 0;
		do {
			gErr = 0;
			for (int i = 0; i < Pattern.pat1.length; i++) {
				input.setLayer(Pattern.pat1[i]);
				calcValue(input, wIO, output);
				output.roundLayer();
				//System.out.println("now " + output.neutron[0].getValue() + " wait for " + Pattern.solve1[i]);
				output.calcError(Pattern.solve1[i]);
				for (int k = 0; k < output.neutron.length; k++){
					gErr += Math.abs(output.neutron[k].nErr);
				//	System.out.println("nErr "+output.neutron[k].nErr);
				}
				wIO.calcWeight(input, output);
			}
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		//	System.out.println("gErr=" + gErr);
			iter++;
		} while ((gErr > 0.01) || (gErr < -0.01));
		System.out.println("iter=" + iter);
	}

	public void getAnswer(double ques[]) {
		input.setLayer(ques);
		calcValue(input, wIO, output);
		output.roundLayer();
		output.printLayer();
	}

}
