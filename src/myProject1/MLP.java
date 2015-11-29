package myProject1;

public class MLP {
	double[] enters;
	double[] hidden;
	double[] outer;
	double[][] wEH;
	double[][] wHO;
	double[][] patterns = { { 1, 1, 0, 0 }, { 0, 0, 1, 1 }, { 0, 1, 0, 0 }, { 0, 1, 1, 0 }, { 1, 1, 1, 1 } };
	double[][] answers = { { 0, 0, 1, 1 }, { 1, 1, 0, 0 }, { 1, 0, 1, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 0 } };

	MLP() {
		enters = new double[patterns[0].length];
		hidden = new double[200];
		outer = new double[enters.length];
		wEH = new double[enters.length][hidden.length];
		wHO = new double[hidden.length][outer.length];
		answers = new double[patterns.length][outer.length];

		init();
		study();

	}

	public void init() {
		for (int i = 0; i < enters.length; i++) {
			for (int j = 0; j < wEH[i].length; j++) {
				wEH[i][j] = Math.random() * 0.3 + 0.1;
			}
		}
		for (int i = 0; i < wHO.length; i++) {
			for (int j = 0; j < wHO[i].length; j++) {
				wHO[i][j] = Math.random() * 0.3 + 0.1;
			}
		}

	}

	public void countOuter() {
		for (int i = 0; i < hidden.length; i++) {
			hidden[i] = 0;
			for (int j = 0; j < enters.length; j++) {
				hidden[i] += enters[j] * wEH[j][i];
			}

			if (hidden[i] > 0.5)
				hidden[i] = 1;
			else
				hidden[i] = 0;

		}

		for (int i = 0; i < outer.length; i++)
			outer[i] = 0;

		for (int i = 0; i < hidden.length; i++) {
			for (int j = 0; j < outer.length; j++) {
				outer[j] += hidden[i] * wHO[i][j];
			}
		}
		for (int j = 0; j < outer.length; j++) {
			if (outer[j] > 0.5)
				outer[j] = 1;
			else
				outer[j] = 0;
		}
	}

	public void study() {
		double[] err = new double[hidden.length];
		double gError = 0;
		int iteration = 0;
		do {
			iteration++;
			gError = 0;
			for (int p = 0; p < patterns.length; p++) {
				for (int i = 0; i < enters.length; i++) {
					enters[i] = patterns[p][i];
				}
				countOuter();
				double lErr = 0;
				for (int i = 0; i < outer.length; i++) {
					for (int j = 0; j < outer.length; j++) {
						lErr = answers[p][j] - outer[j];
						gError += Math.abs(lErr);
					}
				}
				for (int i = 0; i < hidden.length; i++) {
					for (int j = 0; j < outer.length; j++) {
						err[i] = lErr * wHO[i][j];
					}
				}
				for (int i = 0; i < enters.length; i++) {
					for (int j = 0; j < hidden.length; j++) {
						wEH[i][j] += 0.1 * err[j] * enters[i];
						// System.out.println("wEH["+i+"]["+j+"]"+wEH[i][j]);
					}
				}
				for (int i = 0; i < hidden.length; i++) {
					for (int j = 0; j < outer.length; j++) {
						wHO[i][j] += 0.1 * lErr * hidden[i];
					}
				}
			}
		} while (gError != 0);
		System.out.println(iteration);
	}

	public void test() {
		double[] t = { 0, 0, 1, 1 };
		enters = t;
		countOuter();
		for (int i = 0; i < outer.length; i++)
			System.out.println(outer[i]);
		System.out.println("");

	}

	public static void main(String[] args) {
		System.out.println("START");
		MLP mlp = new MLP();
		mlp.test();
		System.out.println("END");

	}
}
