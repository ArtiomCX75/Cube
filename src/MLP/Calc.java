package MLP;

public class Calc {
	public static Network net;

	public static void main(String args[]) {
		net = new Network(Pattern.pat1[0].length, 3, 3, 3, 1);
		//net.printAnswer();
		// net.input.setLayer(Pattern.pat1[3]);
		// net.printNet();
		net.study();
		System.out.println("===================");
		for(double d[]:Pattern.pat1){
			net.getAnswer(d);
		}
		System.out.println("");
		System.out.println("END");
	}

}
