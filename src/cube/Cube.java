package cube;

public class Cube {
	
public Side sideGreen=new Side();
public Side sideRed=new Side();
public Side sideWhite=new Side();
public Side sideOrange=new Side();
public Side sideYellow=new Side();
public Side sideBlue=new Side();

public void newcube(){
	
	setSide(sideGreen, Color.GREEN,1,1,1,1,1,1,1,1);
	setSide(sideRed, Color.RED,2,2,2,2,2,2,2,2);
	setSide(sideWhite, Color.WHITE,3,3,3,3,3,3,3,3);
	setSide(sideOrange, Color.ORANGE,4,4,4,4,4,4,4,4);
	setSide(sideYellow, Color.YELLOW,5,5,5,5,5,5,5,5);
	setSide(sideBlue, Color.BLUE,6,6,6,6,6,6,6,6);
}
public void setSide(Side side, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
side.i1=i;
side.i2=i2;
side.i3=i3;
side.i4=i4;
side.i5=i5;
side.i6=i6;
side.i7=i7;
side.i8=i8;
side.i9=i9;

}
}
