package cube;

public class Move {

	public static Cube r(Cube cube){
		Cube buffer = new Cube();
		buffer.newcube();
		buffer.sideGreen.i1=cube.sideGreen.i1;
		buffer.sideGreen.i2=cube.sideGreen.i2;
		buffer.sideGreen.i3=cube.sideGreen.i3;
		buffer.sideGreen.i4=cube.sideGreen.i4;
		buffer.sideGreen.i5=cube.sideGreen.i5;
		buffer.sideGreen.i6=cube.sideGreen.i6;
		buffer.sideGreen.i7=cube.sideRed.i9;
		buffer.sideGreen.i8=cube.sideRed.i6;
		buffer.sideGreen.i9=cube.sideRed.i3;
		
		buffer.sideRed.i1=cube.sideRed.i1;
		buffer.sideRed.i2=cube.sideRed.i2;
		buffer.sideRed.i3=cube.sideBlue.i3;
		buffer.sideRed.i4=cube.sideRed.i4;
		buffer.sideRed.i5=cube.sideRed.i5;
		buffer.sideRed.i6=cube.sideBlue.i6;
		buffer.sideRed.i7=cube.sideRed.i7;
		buffer.sideRed.i8=cube.sideRed.i8;
		buffer.sideRed.i9=cube.sideBlue.i9;
		
		buffer.sideWhite.i1=cube.sideWhite.i7;
		buffer.sideWhite.i2=cube.sideWhite.i4;
		buffer.sideWhite.i3=cube.sideWhite.i1;
		buffer.sideWhite.i4=cube.sideWhite.i8;
		buffer.sideWhite.i5=cube.sideWhite.i5;
		buffer.sideWhite.i6=cube.sideWhite.i2;
		buffer.sideWhite.i7=cube.sideWhite.i9;
		buffer.sideWhite.i8=cube.sideWhite.i6;
		buffer.sideWhite.i9=cube.sideWhite.i3;
		
		buffer.sideOrange.i1=cube.sideGreen.i7;
		buffer.sideOrange.i2=cube.sideOrange.i2;
		buffer.sideOrange.i3=cube.sideOrange.i3;
		buffer.sideOrange.i4=cube.sideGreen.i8;
		buffer.sideOrange.i5=cube.sideOrange.i5;
		buffer.sideOrange.i6=cube.sideOrange.i6;
		buffer.sideOrange.i7=cube.sideGreen.i9;
		buffer.sideOrange.i8=cube.sideOrange.i8;
		buffer.sideOrange.i9=cube.sideOrange.i9;
		
		buffer.sideYellow.i1=cube.sideYellow.i1;
		buffer.sideYellow.i2=cube.sideYellow.i2;
		buffer.sideYellow.i3=cube.sideYellow.i3;
		buffer.sideYellow.i4=cube.sideYellow.i4;
		buffer.sideYellow.i5=cube.sideYellow.i5;
		buffer.sideYellow.i6=cube.sideYellow.i6;
		buffer.sideYellow.i7=cube.sideYellow.i7;
		buffer.sideYellow.i8=cube.sideYellow.i8;
		buffer.sideYellow.i9=cube.sideYellow.i9;
		
		buffer.sideBlue.i1=cube.sideBlue.i1;
		buffer.sideBlue.i2=cube.sideBlue.i2;
		buffer.sideBlue.i3=cube.sideOrange.i7;
		buffer.sideBlue.i4=cube.sideBlue.i4;
		buffer.sideBlue.i5=cube.sideBlue.i5;
		buffer.sideBlue.i6=cube.sideOrange.i4;
		buffer.sideBlue.i7=cube.sideBlue.i7;
		buffer.sideBlue.i8=cube.sideBlue.i8;
		buffer.sideBlue.i9=cube.sideOrange.i1;
		
		
		return(buffer);
	}
	
	public static Cube l(Cube cube){
		Cube buffer = new Cube();
		buffer.newcube();
		buffer.sideGreen.i1=cube.sideOrange.i3;
		buffer.sideGreen.i2=cube.sideOrange.i6;
		buffer.sideGreen.i3=cube.sideOrange.i9;
		buffer.sideGreen.i4=cube.sideGreen.i4;
		buffer.sideGreen.i5=cube.sideGreen.i5;
		buffer.sideGreen.i6=cube.sideGreen.i6;
		buffer.sideGreen.i7=cube.sideGreen.i7;
		buffer.sideGreen.i8=cube.sideGreen.i8;
		buffer.sideGreen.i9=cube.sideGreen.i9;
		
		buffer.sideRed.i1=cube.sideGreen.i1;
		buffer.sideRed.i2=cube.sideRed.i2;
		buffer.sideRed.i3=cube.sideRed.i3;
		buffer.sideRed.i4=cube.sideGreen.i2;
		buffer.sideRed.i5=cube.sideRed.i5;
		buffer.sideRed.i6=cube.sideRed.i6;
		buffer.sideRed.i7=cube.sideGreen.i3;
		buffer.sideRed.i8=cube.sideRed.i8;
		buffer.sideRed.i9=cube.sideRed.i9;
		
		buffer.sideWhite.i1=cube.sideWhite.i1;
		buffer.sideWhite.i2=cube.sideWhite.i2;
		buffer.sideWhite.i3=cube.sideWhite.i3;
		buffer.sideWhite.i4=cube.sideWhite.i4;
		buffer.sideWhite.i5=cube.sideWhite.i5;
		buffer.sideWhite.i6=cube.sideWhite.i6;
		buffer.sideWhite.i7=cube.sideWhite.i7;
		buffer.sideWhite.i8=cube.sideWhite.i8;
		buffer.sideWhite.i9=cube.sideWhite.i9;
		
		buffer.sideOrange.i1=cube.sideOrange.i1;
		buffer.sideOrange.i2=cube.sideOrange.i2;
		buffer.sideOrange.i3=cube.sideBlue.i7;
		buffer.sideOrange.i4=cube.sideOrange.i4;
		buffer.sideOrange.i5=cube.sideOrange.i5;
		buffer.sideOrange.i6=cube.sideBlue.i4;
		buffer.sideOrange.i7=cube.sideOrange.i7;
		buffer.sideOrange.i8=cube.sideOrange.i8;
		buffer.sideOrange.i9=cube.sideBlue.i1;
		
		buffer.sideYellow.i1=cube.sideYellow.i7;
		buffer.sideYellow.i2=cube.sideYellow.i4;
		buffer.sideYellow.i3=cube.sideYellow.i1;
		buffer.sideYellow.i4=cube.sideYellow.i8;
		buffer.sideYellow.i5=cube.sideYellow.i5;
		buffer.sideYellow.i6=cube.sideYellow.i2;
		buffer.sideYellow.i7=cube.sideYellow.i9;
		buffer.sideYellow.i8=cube.sideYellow.i6;
		buffer.sideYellow.i9=cube.sideYellow.i3;
		
		buffer.sideBlue.i1=cube.sideRed.i1;
		buffer.sideBlue.i2=cube.sideBlue.i2;
		buffer.sideBlue.i3=cube.sideBlue.i3;
		buffer.sideBlue.i4=cube.sideRed.i4;
		buffer.sideBlue.i5=cube.sideBlue.i5;
		buffer.sideBlue.i6=cube.sideBlue.i6;
		buffer.sideBlue.i7=cube.sideRed.i7;
		buffer.sideBlue.i8=cube.sideBlue.i8;
		buffer.sideBlue.i9=cube.sideBlue.i9;
				
		return(buffer);
	}
	
	public static Cube f(Cube cube){
		Cube buffer = new Cube();
		buffer.newcube();
		buffer.sideGreen.i1=cube.sideYellow.i9;
		buffer.sideGreen.i2=cube.sideGreen.i2;
		buffer.sideGreen.i3=cube.sideGreen.i3;
		buffer.sideGreen.i4=cube.sideYellow.i6;
		buffer.sideGreen.i5=cube.sideGreen.i5;
		buffer.sideGreen.i6=cube.sideGreen.i6;
		buffer.sideGreen.i7=cube.sideYellow.i3;
		buffer.sideGreen.i8=cube.sideGreen.i8;
		buffer.sideGreen.i9=cube.sideGreen.i9;
		
		buffer.sideRed.i1=cube.sideRed.i7;
		buffer.sideRed.i2=cube.sideRed.i4;
		buffer.sideRed.i3=cube.sideRed.i1;
		buffer.sideRed.i4=cube.sideRed.i8;
		buffer.sideRed.i5=cube.sideRed.i5;
		buffer.sideRed.i6=cube.sideRed.i2;
		buffer.sideRed.i7=cube.sideRed.i9;
		buffer.sideRed.i8=cube.sideRed.i6;
		buffer.sideRed.i9=cube.sideRed.i3;
		
		buffer.sideWhite.i1=cube.sideGreen.i1;
		buffer.sideWhite.i2=cube.sideWhite.i2;
		buffer.sideWhite.i3=cube.sideWhite.i3;
		buffer.sideWhite.i4=cube.sideGreen.i4;
		buffer.sideWhite.i5=cube.sideWhite.i5;
		buffer.sideWhite.i6=cube.sideWhite.i6;
		buffer.sideWhite.i7=cube.sideGreen.i7;
		buffer.sideWhite.i8=cube.sideWhite.i8;
		buffer.sideWhite.i9=cube.sideWhite.i9;
		
		buffer.sideOrange.i1=cube.sideOrange.i1;
		buffer.sideOrange.i2=cube.sideOrange.i2;
		buffer.sideOrange.i3=cube.sideOrange.i3;
		buffer.sideOrange.i4=cube.sideOrange.i4;
		buffer.sideOrange.i5=cube.sideOrange.i5;
		buffer.sideOrange.i6=cube.sideOrange.i6;
		buffer.sideOrange.i7=cube.sideOrange.i7;
		buffer.sideOrange.i8=cube.sideOrange.i8;
		buffer.sideOrange.i9=cube.sideOrange.i9;
		
		buffer.sideYellow.i1=cube.sideYellow.i1;
		buffer.sideYellow.i2=cube.sideYellow.i2;
		buffer.sideYellow.i3=cube.sideBlue.i1;
		buffer.sideYellow.i4=cube.sideYellow.i4;
		buffer.sideYellow.i5=cube.sideYellow.i5;
		buffer.sideYellow.i6=cube.sideBlue.i2;
		buffer.sideYellow.i7=cube.sideYellow.i7;
		buffer.sideYellow.i8=cube.sideYellow.i8;
		buffer.sideYellow.i9=cube.sideBlue.i3;
		
		buffer.sideBlue.i1=cube.sideWhite.i7;
		buffer.sideBlue.i2=cube.sideWhite.i4;
		buffer.sideBlue.i3=cube.sideWhite.i1;
		buffer.sideBlue.i4=cube.sideBlue.i4;
		buffer.sideBlue.i5=cube.sideBlue.i5;
		buffer.sideBlue.i6=cube.sideBlue.i6;
		buffer.sideBlue.i7=cube.sideBlue.i7;
		buffer.sideBlue.i8=cube.sideBlue.i8;
		buffer.sideBlue.i9=cube.sideBlue.i9;
				
		return(buffer);
	}
	
	public static Cube b(Cube cube){
		Cube buffer = new Cube();
		buffer.newcube();
		buffer.sideGreen.i1=cube.sideGreen.i1;
		buffer.sideGreen.i2=cube.sideGreen.i2;
		buffer.sideGreen.i3=cube.sideWhite.i3;
		buffer.sideGreen.i4=cube.sideGreen.i4;
		buffer.sideGreen.i5=cube.sideGreen.i5;
		buffer.sideGreen.i6=cube.sideWhite.i6;
		buffer.sideGreen.i7=cube.sideGreen.i7;
		buffer.sideGreen.i8=cube.sideGreen.i8;
		buffer.sideGreen.i9=cube.sideWhite.i9;
		
		buffer.sideRed.i1=cube.sideRed.i1;
		buffer.sideRed.i2=cube.sideRed.i2;
		buffer.sideRed.i3=cube.sideRed.i3;
		buffer.sideRed.i4=cube.sideRed.i4;
		buffer.sideRed.i5=cube.sideRed.i5;
		buffer.sideRed.i6=cube.sideRed.i6;
		buffer.sideRed.i7=cube.sideRed.i7;
		buffer.sideRed.i8=cube.sideRed.i8;
		buffer.sideRed.i9=cube.sideRed.i9;
		
		buffer.sideWhite.i1=cube.sideWhite.i1;
		buffer.sideWhite.i2=cube.sideWhite.i2;
		buffer.sideWhite.i3=cube.sideBlue.i9;
		buffer.sideWhite.i4=cube.sideWhite.i4;
		buffer.sideWhite.i5=cube.sideWhite.i5;
		buffer.sideWhite.i6=cube.sideBlue.i8;
		buffer.sideWhite.i7=cube.sideWhite.i7;
		buffer.sideWhite.i8=cube.sideWhite.i8;
		buffer.sideWhite.i9=cube.sideBlue.i7;
		
		buffer.sideOrange.i1=cube.sideOrange.i7;
		buffer.sideOrange.i2=cube.sideOrange.i4;
		buffer.sideOrange.i3=cube.sideOrange.i1;
		buffer.sideOrange.i4=cube.sideOrange.i8;
		buffer.sideOrange.i5=cube.sideOrange.i5;
		buffer.sideOrange.i6=cube.sideOrange.i2;
		buffer.sideOrange.i7=cube.sideOrange.i9;
		buffer.sideOrange.i8=cube.sideOrange.i6;
		buffer.sideOrange.i9=cube.sideOrange.i3;
		
		buffer.sideYellow.i1=cube.sideGreen.i9;
		buffer.sideYellow.i2=cube.sideYellow.i2;
		buffer.sideYellow.i3=cube.sideYellow.i3;
		buffer.sideYellow.i4=cube.sideGreen.i6;
		buffer.sideYellow.i5=cube.sideYellow.i5;
		buffer.sideYellow.i6=cube.sideYellow.i6;
		buffer.sideYellow.i7=cube.sideGreen.i3;
		buffer.sideYellow.i8=cube.sideYellow.i8;
		buffer.sideYellow.i9=cube.sideYellow.i9;
		
		buffer.sideBlue.i1=cube.sideBlue.i1;
		buffer.sideBlue.i2=cube.sideBlue.i2;
		buffer.sideBlue.i3=cube.sideBlue.i3;
		buffer.sideBlue.i4=cube.sideBlue.i4;
		buffer.sideBlue.i5=cube.sideBlue.i5;
		buffer.sideBlue.i6=cube.sideBlue.i6;
		buffer.sideBlue.i7=cube.sideYellow.i1;
		buffer.sideBlue.i8=cube.sideYellow.i4;
		buffer.sideBlue.i9=cube.sideYellow.i7;
		
		return(buffer);
	}

	public static Cube u(Cube cube){
		Cube buffer = new Cube();
		buffer.newcube();
		buffer.sideGreen.i1=cube.sideGreen.i7;
		buffer.sideGreen.i2=cube.sideGreen.i4;
		buffer.sideGreen.i3=cube.sideGreen.i1;
		buffer.sideGreen.i4=cube.sideGreen.i8;
		buffer.sideGreen.i5=cube.sideGreen.i5;
		buffer.sideGreen.i6=cube.sideGreen.i2;
		buffer.sideGreen.i7=cube.sideGreen.i9;
		buffer.sideGreen.i8=cube.sideGreen.i6;
		buffer.sideGreen.i9=cube.sideGreen.i3;
		
		buffer.sideRed.i1=cube.sideWhite.i1;
		buffer.sideRed.i2=cube.sideWhite.i2;
		buffer.sideRed.i3=cube.sideWhite.i3;
		buffer.sideRed.i4=cube.sideRed.i4;
		buffer.sideRed.i5=cube.sideRed.i5;
		buffer.sideRed.i6=cube.sideRed.i6;
		buffer.sideRed.i7=cube.sideRed.i7;
		buffer.sideRed.i8=cube.sideRed.i8;
		buffer.sideRed.i9=cube.sideRed.i9;
		
		buffer.sideWhite.i1=cube.sideOrange.i1;
		buffer.sideWhite.i2=cube.sideOrange.i2;
		buffer.sideWhite.i3=cube.sideOrange.i3;
		buffer.sideWhite.i4=cube.sideWhite.i4;
		buffer.sideWhite.i5=cube.sideWhite.i5;
		buffer.sideWhite.i6=cube.sideWhite.i6;
		buffer.sideWhite.i7=cube.sideWhite.i7;
		buffer.sideWhite.i8=cube.sideWhite.i8;
		buffer.sideWhite.i9=cube.sideWhite.i9;
		
		buffer.sideOrange.i1=cube.sideYellow.i1;
		buffer.sideOrange.i2=cube.sideYellow.i2;
		buffer.sideOrange.i3=cube.sideYellow.i3;
		buffer.sideOrange.i4=cube.sideOrange.i4;
		buffer.sideOrange.i5=cube.sideOrange.i5;
		buffer.sideOrange.i6=cube.sideOrange.i6;
		buffer.sideOrange.i7=cube.sideOrange.i7;
		buffer.sideOrange.i8=cube.sideOrange.i8;
		buffer.sideOrange.i9=cube.sideOrange.i9;
		
		buffer.sideYellow.i1=cube.sideRed.i1;
		buffer.sideYellow.i2=cube.sideRed.i2;
		buffer.sideYellow.i3=cube.sideRed.i3;
		buffer.sideYellow.i4=cube.sideYellow.i4;
		buffer.sideYellow.i5=cube.sideYellow.i5;
		buffer.sideYellow.i6=cube.sideYellow.i6;
		buffer.sideYellow.i7=cube.sideYellow.i7;
		buffer.sideYellow.i8=cube.sideYellow.i8;
		buffer.sideYellow.i9=cube.sideYellow.i9;
		
		buffer.sideBlue.i1=cube.sideBlue.i1;
		buffer.sideBlue.i2=cube.sideBlue.i2;
		buffer.sideBlue.i3=cube.sideBlue.i3;
		buffer.sideBlue.i4=cube.sideBlue.i4;
		buffer.sideBlue.i5=cube.sideBlue.i5;
		buffer.sideBlue.i6=cube.sideBlue.i6;
		buffer.sideBlue.i7=cube.sideBlue.i7;
		buffer.sideBlue.i8=cube.sideBlue.i8;
		buffer.sideBlue.i9=cube.sideBlue.i9;
				
		return(buffer);
	}

	public static Cube d(Cube cube){
		Cube buffer = new Cube();
		buffer.newcube();
		buffer.sideGreen.i1=cube.sideGreen.i1;
		buffer.sideGreen.i2=cube.sideGreen.i2;
		buffer.sideGreen.i3=cube.sideGreen.i3;
		buffer.sideGreen.i4=cube.sideGreen.i4;
		buffer.sideGreen.i5=cube.sideGreen.i5;
		buffer.sideGreen.i6=cube.sideGreen.i6;
		buffer.sideGreen.i7=cube.sideGreen.i7;
		buffer.sideGreen.i8=cube.sideGreen.i8;
		buffer.sideGreen.i9=cube.sideGreen.i9;
		
		buffer.sideRed.i1=cube.sideRed.i1;
		buffer.sideRed.i2=cube.sideRed.i2;
		buffer.sideRed.i3=cube.sideRed.i3;
		buffer.sideRed.i4=cube.sideRed.i4;
		buffer.sideRed.i5=cube.sideRed.i5;
		buffer.sideRed.i6=cube.sideRed.i6;
		buffer.sideRed.i7=cube.sideYellow.i7;
		buffer.sideRed.i8=cube.sideYellow.i8;
		buffer.sideRed.i9=cube.sideYellow.i9;
		
		buffer.sideWhite.i1=cube.sideWhite.i1;
		buffer.sideWhite.i2=cube.sideWhite.i2;
		buffer.sideWhite.i3=cube.sideWhite.i3;
		buffer.sideWhite.i4=cube.sideWhite.i4;
		buffer.sideWhite.i5=cube.sideWhite.i5;
		buffer.sideWhite.i6=cube.sideWhite.i6;
		buffer.sideWhite.i7=cube.sideRed.i7;
		buffer.sideWhite.i8=cube.sideRed.i8;
		buffer.sideWhite.i9=cube.sideRed.i9;
		
		buffer.sideOrange.i1=cube.sideOrange.i1;
		buffer.sideOrange.i2=cube.sideOrange.i2;
		buffer.sideOrange.i3=cube.sideOrange.i3;
		buffer.sideOrange.i4=cube.sideOrange.i4;
		buffer.sideOrange.i5=cube.sideOrange.i5;
		buffer.sideOrange.i6=cube.sideOrange.i6;
		buffer.sideOrange.i7=cube.sideWhite.i7;
		buffer.sideOrange.i8=cube.sideWhite.i8;
		buffer.sideOrange.i9=cube.sideWhite.i9;
		
		buffer.sideYellow.i1=cube.sideYellow.i1;
		buffer.sideYellow.i2=cube.sideYellow.i2;
		buffer.sideYellow.i3=cube.sideYellow.i3;
		buffer.sideYellow.i4=cube.sideYellow.i4;
		buffer.sideYellow.i5=cube.sideYellow.i5;
		buffer.sideYellow.i6=cube.sideYellow.i6;
		buffer.sideYellow.i7=cube.sideOrange.i7;
		buffer.sideYellow.i8=cube.sideOrange.i8;
		buffer.sideYellow.i9=cube.sideOrange.i9;
		
		buffer.sideBlue.i1=cube.sideBlue.i7;
		buffer.sideBlue.i2=cube.sideBlue.i4;
		buffer.sideBlue.i3=cube.sideBlue.i1;
		buffer.sideBlue.i4=cube.sideBlue.i8;
		buffer.sideBlue.i5=cube.sideBlue.i5;
		buffer.sideBlue.i6=cube.sideBlue.i2;
		buffer.sideBlue.i7=cube.sideBlue.i9;
		buffer.sideBlue.i8=cube.sideBlue.i6;
		buffer.sideBlue.i9=cube.sideBlue.i3;
		
		return(buffer);
	}



public static Cube clone(Cube cube){
	Cube buffer = new Cube();
	buffer.newcube();
	buffer.sideGreen.i1=cube.sideGreen.i1;
	buffer.sideGreen.i2=cube.sideGreen.i2;
	buffer.sideGreen.i3=cube.sideGreen.i3;
	buffer.sideGreen.i4=cube.sideGreen.i4;
	buffer.sideGreen.i5=cube.sideGreen.i5;
	buffer.sideGreen.i6=cube.sideGreen.i6;
	buffer.sideGreen.i7=cube.sideGreen.i7;
	buffer.sideGreen.i8=cube.sideGreen.i8;
	buffer.sideGreen.i9=cube.sideGreen.i9;
	
	buffer.sideRed.i1=cube.sideRed.i1;
	buffer.sideRed.i2=cube.sideRed.i2;
	buffer.sideRed.i3=cube.sideRed.i3;
	buffer.sideRed.i4=cube.sideRed.i4;
	buffer.sideRed.i5=cube.sideRed.i5;
	buffer.sideRed.i6=cube.sideRed.i6;
	buffer.sideRed.i7=cube.sideRed.i7;
	buffer.sideRed.i8=cube.sideRed.i8;
	buffer.sideRed.i9=cube.sideRed.i9;
	
	buffer.sideWhite.i1=cube.sideWhite.i1;
	buffer.sideWhite.i2=cube.sideWhite.i2;
	buffer.sideWhite.i3=cube.sideWhite.i3;
	buffer.sideWhite.i4=cube.sideWhite.i4;
	buffer.sideWhite.i5=cube.sideWhite.i5;
	buffer.sideWhite.i6=cube.sideWhite.i6;
	buffer.sideWhite.i7=cube.sideWhite.i7;
	buffer.sideWhite.i8=cube.sideWhite.i8;
	buffer.sideWhite.i9=cube.sideWhite.i9;
	
	buffer.sideOrange.i1=cube.sideOrange.i1;
	buffer.sideOrange.i2=cube.sideOrange.i2;
	buffer.sideOrange.i3=cube.sideOrange.i3;
	buffer.sideOrange.i4=cube.sideOrange.i4;
	buffer.sideOrange.i5=cube.sideOrange.i5;
	buffer.sideOrange.i6=cube.sideOrange.i6;
	buffer.sideOrange.i7=cube.sideOrange.i7;
	buffer.sideOrange.i8=cube.sideOrange.i8;
	buffer.sideOrange.i9=cube.sideOrange.i9;
	
	buffer.sideYellow.i1=cube.sideYellow.i1;
	buffer.sideYellow.i2=cube.sideYellow.i2;
	buffer.sideYellow.i3=cube.sideYellow.i3;
	buffer.sideYellow.i4=cube.sideYellow.i4;
	buffer.sideYellow.i5=cube.sideYellow.i5;
	buffer.sideYellow.i6=cube.sideYellow.i6;
	buffer.sideYellow.i7=cube.sideYellow.i7;
	buffer.sideYellow.i8=cube.sideYellow.i8;
	buffer.sideYellow.i9=cube.sideYellow.i9;
	
	buffer.sideBlue.i1=cube.sideBlue.i1;
	buffer.sideBlue.i2=cube.sideBlue.i2;
	buffer.sideBlue.i3=cube.sideBlue.i3;
	buffer.sideBlue.i4=cube.sideBlue.i4;
	buffer.sideBlue.i5=cube.sideBlue.i5;
	buffer.sideBlue.i6=cube.sideBlue.i6;
	buffer.sideBlue.i7=cube.sideBlue.i7;
	buffer.sideBlue.i8=cube.sideBlue.i8;
	buffer.sideBlue.i9=cube.sideBlue.i9;
	return(buffer);
}

}
/*
	buffer.sideGreen.i1=cube.sideGreen.i1;
	buffer.sideGreen.i2=cube.sideGreen.i2;
	buffer.sideGreen.i3=cube.sideGreen.i3;
	buffer.sideGreen.i4=cube.sideGreen.i4;
	buffer.sideGreen.i5=cube.sideGreen.i5;
	buffer.sideGreen.i6=cube.sideGreen.i6;
	buffer.sideGreen.i7=cube.sideGreen.i7;
	buffer.sideGreen.i8=cube.sideGreen.i8;
	buffer.sideGreen.i9=cube.sideGreen.i9;
	
	buffer.sideRed.i1=cube.sideRed.i1;
	buffer.sideRed.i2=cube.sideRed.i2;
	buffer.sideRed.i3=cube.sideRed.i3;
	buffer.sideRed.i4=cube.sideRed.i4;
	buffer.sideRed.i5=cube.sideRed.i5;
	buffer.sideRed.i6=cube.sideRed.i6;
	buffer.sideRed.i7=cube.sideRed.i7;
	buffer.sideRed.i8=cube.sideRed.i8;
	buffer.sideRed.i9=cube.sideRed.i9;
	
	buffer.sideWhite.i1=cube.sideWhite.i1;
	buffer.sideWhite.i2=cube.sideWhite.i2;
	buffer.sideWhite.i3=cube.sideWhite.i3;
	buffer.sideWhite.i4=cube.sideWhite.i4;
	buffer.sideWhite.i5=cube.sideWhite.i5;
	buffer.sideWhite.i6=cube.sideWhite.i6;
	buffer.sideWhite.i7=cube.sideWhite.i7;
	buffer.sideWhite.i8=cube.sideWhite.i8;
	buffer.sideWhite.i9=cube.sideWhite.i9;
	
	buffer.sideOrange.i1=cube.sideOrange.i1;
	buffer.sideOrange.i2=cube.sideOrange.i2;
	buffer.sideOrange.i3=cube.sideOrange.i3;
	buffer.sideOrange.i4=cube.sideOrange.i4;
	buffer.sideOrange.i5=cube.sideOrange.i5;
	buffer.sideOrange.i6=cube.sideOrange.i6;
	buffer.sideOrange.i7=cube.sideOrange.i7;
	buffer.sideOrange.i8=cube.sideOrange.i8;
	buffer.sideOrange.i9=cube.sideOrange.i9;
	
	buffer.sideYellow.i1=cube.sideYellow.i1;
	buffer.sideYellow.i2=cube.sideYellow.i2;
	buffer.sideYellow.i3=cube.sideYellow.i3;
	buffer.sideYellow.i4=cube.sideYellow.i4;
	buffer.sideYellow.i5=cube.sideYellow.i5;
	buffer.sideYellow.i6=cube.sideYellow.i6;
	buffer.sideYellow.i7=cube.sideYellow.i7;
	buffer.sideYellow.i8=cube.sideYellow.i8;
	buffer.sideYellow.i9=cube.sideYellow.i9;
	
	buffer.sideBlue.i1=cube.sideBlue.i1;
	buffer.sideBlue.i2=cube.sideBlue.i2;
	buffer.sideBlue.i3=cube.sideBlue.i3;
	buffer.sideBlue.i4=cube.sideBlue.i4;
	buffer.sideBlue.i5=cube.sideBlue.i5;
	buffer.sideBlue.i6=cube.sideBlue.i6;
	buffer.sideBlue.i7=cube.sideBlue.i7;
	buffer.sideBlue.i8=cube.sideBlue.i8;
	buffer.sideBlue.i9=cube.sideBlue.i9;
	
	
*/