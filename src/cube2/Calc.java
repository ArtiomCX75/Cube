package cube2;

import java.util.Random;

@SuppressWarnings("unused")
public class Calc {
	public static void main(String[] args) throws Exception {
		//Cube cube = new Cube();
		//cube.init_def();
		//cube.move(2,2,2);
		
		//cube.s();
		
		
		//cube.printSides();
		//Random r = new Random();
		//r.nextInt(13);
		//System.out.println(" ");
		
		Thread th = Thread.currentThread();
		th.setPriority(9);
		Chain zero = new Chain(7);
		
		
		
		System.out.println("");
		//System.out.println(Chain.total);
		System.out.println(Chain.count);
	//	double i=(Chain.total.intValue()-Chain.count);
	//	i=i*100/Chain.total.intValue();
	//	System.out.println(i);
		System.out.println("end");
	}
}
