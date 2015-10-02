package cube;
import cube.Cube;
public class Elements {
public static void main (String[] args) throws Exception{
System.out.println("Hello");
	
Cube myCube=new Cube();
//myCube.newcube();
myCube.setSide(myCube.sideGreen,  1, 0, 3, 0, 0, 0, 4, 0, 6);
myCube.setSide(myCube.sideRed,    4, 0, 6, 0, 0, 0, 6, 0, 6);
myCube.setSide(myCube.sideWhite,  5, 0, 2, 0, 0, 0, 3, 0, 5);
myCube.setSide(myCube.sideOrange, 5, 0, 1, 0, 0, 0, 1, 0, 5);
myCube.setSide(myCube.sideYellow, 2, 0, 3, 0, 0, 0, 4, 0, 3);
myCube.setSide(myCube.sideBlue,   2, 0, 4, 0, 0, 0, 1, 0, 2);
//prCube(myCube);
//myCube=Move.u(myCube);
//myCube=Move.f(myCube);
//myCube=Move.r(myCube);
//myCube=Move.b(myCube);
//myCube=Move.l(myCube);
//myCube=Move.d(myCube);

//prCube(myCube);
//Solve.checkSide(myCube.sideGreen);
//prSide(myCube.sideGreen);
Solve.toSolve(myCube);

}

public static void prCube(Cube cube){
	prSide(cube.sideGreen);
	prSide(cube.sideRed);
	prSide(cube.sideWhite);
	prSide(cube.sideOrange);
	prSide(cube.sideYellow);
	prSide(cube.sideBlue);
}
public static void prSide(Side side){
	System.out.println(Integer.toString(side.i1)+" "+Integer.toString(side.i2)+" "+Integer.toString(side.i3));
	System.out.println(Integer.toString(side.i4)+" "+Integer.toString(side.i5)+" "+Integer.toString(side.i6));
	System.out.println(Integer.toString(side.i7)+" "+Integer.toString(side.i8)+" "+Integer.toString(side.i9));
	System.out.println(" ");
}

}
