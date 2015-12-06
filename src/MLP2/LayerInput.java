package MLP2;

public class LayerInput extends Layer {

	public LayerInput(int qt) {
		super(qt);
	}

	@Override
	public void calcOut() {
		for (int i = 0; i < n.length; i++)
			n[i].outVal = n[i].inVal;
	}
}
