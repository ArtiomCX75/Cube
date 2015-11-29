package myProject1;

public class Perceptron {
	double[] enters;
	double outer;
	double[] weights;

	double[][] patterns = { { 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 }, { 1, 1, 0} };

	public Perceptron() {
		enters = new double[2];
		weights = new double[enters.length];
		for (int i = 0; i < enters.length; i++) {
			 weights[i] = Math.random() * 0.2 + 0.1;
			//weights[i] = 0.6;
		}
	}

	public void countOuter() {
		outer = 0;
		for (int i = 0; i < enters.length; i++) {
			outer += enters[i] * weights[i];
		}
		if (outer > 0.5) 
			outer = 1;
		else
			outer = 0;
	}

	public void study() {
		double gError = 0;
		int iterations = 0;
		do {
			gError = 0;
			iterations++;
			System.out.println(iterations);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int p = 0; p < patterns.length; p++) {
				enters = java.util.Arrays.copyOf(patterns[p], patterns[p].length - 1);
				countOuter();
				double error = patterns[p][2] - outer;
				System.out.println("gE1 "+gError);
				gError += Math.abs(error);
				System.out.println("gE2 "+gError);
				for (int i = 0; i < enters.length; i++) {
					System.out.println("w b "+weights[i]+" error "+error+" enter["+i+"] "+enters[i]);
					weights[i] += 0.1 * error * enters[i];
					System.out.println("w a "+weights[i]);
				}
				//System.out.println("gE "+gError);
				System.out.println("w "+weights[0] + "  " + weights[1]);
				System.out.println("outer " + outer);
			}
		} while (gError != 0);
		System.out.println(iterations);
	}

	public void test() {
		study();
		for (int p = 0; p < patterns.length; p++) {
			enters = java.util.Arrays.copyOf(patterns[p], patterns[p].length - 1);
			countOuter();
			System.out.println(outer);
		}
		System.out.println(weights[0] + "  " + weights[1]);
	}

	public static void main(String args[]) {
		new Perceptron().test();

	}
}
