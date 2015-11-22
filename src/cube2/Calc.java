package cube2;

import java.util.Random;

@SuppressWarnings("unused")
public class Calc {
	public static void main(String[] args) throws Exception {
		Cube cube = new Cube();
		cube.init_def();
		cube.move(2,2,2);
		
		cube.s();
		
		
		//cube.printSides();
		//Random r = new Random();
		//r.nextInt(13);
		System.out.println(" ");
		System.out.println("end");
	}
}
