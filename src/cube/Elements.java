package cube;
import cube.Cube;
public class Elements {
public static void main (String[] args) throws Exception{
System.out.println("Hello");
	
Cube myCube=new Cube();
//myCube.newcube();
myCube.setSide(myCube.sideGreen, 5, 3, 4, 6, 1, 4, 2, 3, 2);
myCube.setSide(myCube.sideRed, 6, 2, 3, 1, 2, 5, 3, 2, 1);
myCube.setSide(myCube.sideWhite, 1, 1, 5, 6, 3, 1, 5, 2, 5);
myCube.setSide(myCube.sideOrange, 6, 6, 1, 5, 4, 5, 1, 4, 2);
myCube.setSide(myCube.sideYellow, 3, 4, 4, 2, 5, 4, 3, 3, 6);
myCube.setSide(myCube.sideBlue, 4, 3, 4, 6, 6, 1, 6, 5, 1);
//prCube(myCube);
//myCube=Move.u(myCube);
myCube=Move.f(myCube);
myCube=Move.r(myCube);
myCube=Move.b(myCube);
myCube=Move.l(myCube);
//myCube=Move.d(myCube);

//prCube(myCube);
//Solve.checkSide(myCube.sideGreen);
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
