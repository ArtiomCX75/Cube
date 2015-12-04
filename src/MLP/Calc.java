package MLP;

public class Calc {
	public static Network net;

	public static void main(String args[]) {
		net = new Network(Pattern.pat1[0].length, 1);
		net.printNet();
		// net.input.setLayer(Pattern.pat1[3]);
		// net.printNet();
		net.study();
		System.out.println("===================");
		for(double d[]:Pattern.pat1){
			net.getAnswer(d);
		}

		System.out.println("END");
	}

}
