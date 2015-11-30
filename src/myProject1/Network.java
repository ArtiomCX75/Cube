package myProject1;

public class Network {
	public Neuron in[] = new Neuron[2];
	public Neuron hid[] = new Neuron[4];
	public Neuron out[] = new Neuron[2];
	double pat[][] = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
	double ans[][] = { { 0, 0 }, { 0, 0 }, { 0, 0 }, { 1, 1 } };

	public void main(String args[]) {

		for (Neuron n : in)
			n = new Neuron();
		for (Neuron n : out)
			n = new Neuron();
		for (Neuron n : hid) {
			n = new Neuron();
			n.initWeidht();
		}
		in[0].input = 0;
		in[1].input = 0;
		hid[0].value = 0;

	}

	public void initInputs(double[] d) {
		for (double d1 : d) {
			for (Neuron n : in) {
				n.initInput(d1);
			}
		}
	}

	public void study() {
		double gError = 0;
		do {
			gError=0;
			for (int i=0; i<pat.length;i++) {
				initInputs(pat[i]);

				for (Neuron n : hid) {
					n.calcValue(in);
				}
				for (Neuron n : out) {
					n.calcValue(hid);
				}
				for (Neuron n : out) {
					n.coutValue();
				}
				
				double lErr[]= new double [out.length];
				for(double err:lErr)
					err=0;
				
				for (int j=0; j<out.length;j++) {
					out[j].error=ans[i][j]-out[j].value;
				}
				
				
				/*
				 
				  
				  нужен отдельный класс для весов. инициалицация за счет двух массовов нейронов
				  ошибка меняет вес пропорционально весу
				 
				 */
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

			}
		} while (gError != 0);

	}
}
