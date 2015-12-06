package MLP2;

public class Calc {
	public static void main(String args[]) {
		Network myNet = new Network(2, 1, 30);
		myNet.study();

		System.out.println("===============");
		for (int i = 0; i < Pattern.pat1.length; i++) {
			myNet.setInputs(Pattern.pat1[i]);
			myNet.solve();
			System.out.println("Inputs: ");
			for (int j = 0; j < Pattern.pat1[i].length; j++) {
				System.out.println(Pattern.pat1[i][j]);
			}
			myNet.printOuts();
		}

	}
}
