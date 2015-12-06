package MLP2;

public class Weight {
	public double d[][];

	public Weight(Layer l1, Layer l2) {
		d = new double[l1.n.length][l2.n.length];
		for (int i = 0; i < l1.n.length; i++)
			for (int j = 0; j < l2.n.length; j++) {
				d[i][j] = 5;
				//d[i][j] = Math.random() - 0.5;
			}
	}

	/*
	 * public void calcErr(Layer l) { for (int i = 0; i < d.length; i++) for
	 * (int j = 0; j < d[0].length; j++) { d[i][j] = d[i][j] * l.n[j].inErr; } }
	 */
	public void calcNewWeight(Layer l1, Layer l2) {
		for (int i = 0; i < d.length; i++)
			for (int j = 0; j < d[0].length; j++) {
				d[i][j] = d[i][j]+l1.n[i].outVal * l2.n[j].outErr * 1;
			}
	}
}
