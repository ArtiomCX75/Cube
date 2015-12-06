package MLP;

public class Network {
	Layer input;
	Layer output;
	Layer hidden1;
	//Layer hidden2;
//	Layer hidden3;
	// Weight wIO;
	Weight wih1;
//	Weight wh1h2;
//	Weight wh2h3;
	Weight wh3o;

	@Deprecated
	public Network(int i1, int i2) {
		System.out.println("Create net " + i1 + " x " + i2);
		input = new Layer(i1);
		output = new Layer(i2);
		// wIO = new Weight(input, output);
	}

	public Network(int i1, int i2, int i3, int i4, int i5) {
		System.out.println("Create net " + i1 + " x " + i2 + " x " + i3 + " x " + i4 + " x " + i5);
		input = new Layer(i1);
		hidden1 = new Layer(i2);
		wih1 = new Weight(input, hidden1);
	//	hidden2 = new Layer(i3);
	//	wh1h2 = new Weight(hidden1, hidden2);
	//	hidden3 = new Layer(i4);
	//	wh2h3 = new Weight(hidden2, hidden3);
		output = new Layer(i5);
	//old	wh3o = new Weight(hidden3, output);
		wh3o = new Weight(hidden1, output); //new
	}

	public void printNet() {
		System.out.println("===================");
		input.printLayer();
		wih1.printWeight();
		hidden1.printLayer();
		//wh1h2.printWeight();
		//hidden2.printLayer();
		//wh2h3.printWeight();
	//	hidden3.printLayer();
		wh3o.printWeight();
		output.printLayer();
		System.out.println("===================");
	}

	public void calcValue(Layer l1, Weight w, Layer l2) {
		l2.setLayerNull();
		for (int i = 0; i < w.weight.length; i++) {
			for (int j = 0; j < w.weight[0].length; j++) {
				l2.neutron[j].setValue(l2.neutron[j].getValue() + w.weight[i][j].getValue() * l1.neutron[i].getValue());
			}
		}
		l2.roundLayer();
	}

	public void study() {
		double gErr = 0;
		int iter = 0;
		do {
			gErr = 0;
			for (int i = 0; i < Pattern.pat1.length; i++) {
				input.setLayer(Pattern.pat1[i]);
				calcValue(input, wih1, hidden1);
			//	calcValue(hidden1, wh1h2, hidden2);
			//	calcValue(hidden2, wh2h3, hidden3);
			//old	calcValue(hidden3, wh3o, output);
				calcValue(hidden1, wh3o, output); //new
				//System.out.println(output.neutron[0].getValue()+"    not round");
				output.roundLayer();
				// System.out.println("now " + output.neutron[0].getValue() + "
				// wait for " + Pattern.solve1[i]);
				output.calcError(Pattern.solve1[i]);

				for (int k = 0; k < output.neutron.length; k++) {
					gErr += Math.abs(output.neutron[k].nErr);
					// System.out.println("nErr "+output.neutron[k].nErr);
				}
				wh3o.calcWeight(output);
			//old	hidden3.calcError(wh3o);
				hidden1.calcError(wh3o); //new
			//   wh2h3.calcWeight(hidden3);
			//	wh1h2.calcWeight(hidden2);
				wih1.calcWeight(hidden1);
			}
			try {
			//	Thread.sleep(10);
			} catch (Exception e) {
			}
			//printNet();
			//System.out.println("gErr=" + gErr);

			iter++;
			if (iter>10000){
				System.out.println("Overload");
				break;
			}
		} while ((gErr > 0.51) || (gErr < -0.51));
		System.out.println("iter=" + iter);
	}

	public void printAnswer() {
		System.out.println("");
		for (Neuron i : input.neutron)
			System.out.print(i.getValue() + " ");
		System.out.print("   ");
		for (Neuron o : output.neutron)
			System.out.print(o.getValue() + " ");

	}

	public void getAnswer(double ques[]) {
		input.setLayer(ques);
		calcValue(input, wih1, hidden1);
	//	calcValue(hidden1, wh1h2, hidden2);
	//	calcValue(hidden2, wh2h3, hidden3);
	//old	calcValue(hidden3, wh3o, output);
		calcValue(hidden1, wh3o, output); //new
		output.roundLayer();
		printAnswer();
	}

}
