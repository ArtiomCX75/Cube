package cube;

public class Cube {
	
public Side sideGreen=new Side();
public Side sideRed=new Side();
public Side sideWhite=new Side();
public Side sideOrange=new Side();
public Side sideYellow=new Side();
public Side sideBlue=new Side();

public void newcube(){
	
	setSide(sideGreen, Color.GREEN,0,0,0,0,0,0,0,0);
	setSide(sideRed, Color.RED,0,0,0,0,0,0,0,0);
	setSide(sideWhite, Color.WHITE,0,0,0,0,0,0,0,0);
	setSide(sideOrange, Color.ORANGE,0,0,0,0,0,0,0,0);
	setSide(sideYellow, Color.YELLOW,0,0,0,0,0,0,0,0);
	setSide(sideBlue, Color.BLUE,0,0,0,0,0,0,0,0);
}
public void setSide(Side side, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
side.i1=i;
side.i2=i;
side.i3=i;
side.i4=i;
side.i5=i;
side.i6=i;
side.i7=i;
side.i8=i;
side.i9=i;

}
}
