package MLP2;

public class Network {
	public LayerInput layerInput;
	public LayerHidden layerHidden;
	public LayerOutput layerOutput;
	public Weight w1;
	public Weight w2;
	double gErr = 0;

	public Network(int qtInput, int qtOutput, int hid) {
		layerInput = new LayerInput(qtInput);
		layerOutput = new LayerOutput(qtOutput);
		layerHidden = new LayerHidden(hid);
		w1 = new Weight(layerInput, layerHidden);
		w2 = new Weight(layerHidden, layerOutput);
	}

	public void setInputs(double d[]) {
		if (layerInput.n.length == d.length) {
			for (int i = 0; i < layerInput.n.length; i++)
				layerInput.n[i].inVal = d[i];
		} else {
			System.out.println("Wrong size of inputs' array");
		}
	}

	public void study() {
		int iter = 0;

		do {
			gErr = 0;
			for (int i = 0; i < Pattern.pat1.length; i++) {
				setInputs(Pattern.pat1[i]);
				solve();
				// layerOutput.round();
				layerOutput.setOutErrNull();
				for (int j = 0; j < layerOutput.n.length; j++) {
					// System.out.println("outErr "+layerOutput.n[j].outErr + "
					// solve1[i]-out
					// "+(Pattern.solve1[i]-layerOutput.n[j].outVal) + "
					// 1-outVal "+ (1-layerOutput.n[j].outVal)+" outVal
					// "+layerOutput.n[j].outVal);
					layerOutput.n[j].outErr += (Pattern.solve1[i] - layerOutput.n[j].outVal)
							* (1 - layerOutput.n[j].outVal) * layerOutput.n[j].outVal;

					// System.out.println("layerOutput.n[j].outErr
					// "+layerOutput.n[j].outErr);

					// System.out.println("outErr "+layerOutput.n[i].outErr);
					// System.out.println("now " + "");
				}
				gErr += Math.abs(layerOutput.n[0].outErr);

				calcInErr(layerHidden, w2, layerOutput);
				calcOutErr(layerHidden);
				calcInErr(layerInput, w1, layerHidden);
				calcOutErr(layerInput);
				w1.calcNewWeight(layerInput, layerHidden);
				w2.calcNewWeight(layerHidden, layerOutput);

			}
			iter++;
			System.out.println("gErr " + gErr);
		} while (gErr > 0.2);
		System.out.println("iter " + iter);
	}

	public void solve() {
		layerInput.calcOut();
		calc(layerInput, w1, layerHidden);
		layerHidden.calcOut();
		calc(layerHidden, w2, layerOutput);
		layerOutput.calcOut();
		// layerOutput.round();
	}

	public void calc(Layer l1, Weight w, Layer l2) {
		l2.setInValNull();
		for (int i = 0; i < l2.n.length; i++) {
			for (int j = 0; j < l1.n.length; j++) {
				l2.n[i].inVal += w.d[j][i] * l1.n[j].outVal;
			}
		}
	}

	public void calcInErr(Layer l1, Weight w, Layer l2) {
		l1.setInErrNull();
		for (int i = 0; i < l1.n.length; i++) {
			for (int j = 0; j < l2.n.length; j++) {
				l1.n[i].inErr += w.d[i][j] * l2.n[j].outErr;
			}
		}

	}

	public void calcOutErr(Layer l1) {
		l1.setOutErrNull();
		for (int i = 0; i < l1.n.length; i++) {
			l1.n[i].outErr = l1.n[i].outVal * (1 - l1.n[i].outVal) * l1.n[i].inErr;
			// gErr+=l1.n[i].outErr;
		}

	}

	public void printOuts() {
		System.out.println("Outs: ");
		for (int i = 0; i < layerOutput.n.length; i++) {
			System.out.println(layerOutput.n[i].outVal);
		}
	}
}
