package cube;

import java.util.Random;

public class Solve {
public static void toSolve(Cube cube){
	int maxi=0;
	int maxj=0;
	int maxk=0;
	int maxl=0;
	int maxm=0;
	int maxn=0;
	int maxo=0;
	int maxp=0;
	int maxr=0;
	int maxs=0;
	int maxt=0;
	int maxu=0;
	int res1=0;
	int res2=0;
for (int i=0;i<13;i++) {
for (int j=0;j<13;j++) {
for (int k=0;k<13;k++) {
for (int l=0;l<13;l++) {
for (int m=0;m<13;m++) {
for (int n=0;n<13;n++) {
for (int o=0;o<13;o++) {
for (int p=0;p<13;p++) {
for (int r=0;r<13;r++) {
for (int s=0;s<13;s++) {
for (int t=0;t<13;t++) {
for (int u=0;u<13;u++) {
	
	Cube buffer = new Cube();
	buffer=Move.clone(cube);
	buffer=makeMove(buffer, i);
	buffer=makeMove(buffer, j);
	buffer=makeMove(buffer, k);
	buffer=makeMove(buffer, l);
	buffer=makeMove(buffer, m);
	buffer=makeMove(buffer, n);
	buffer=makeMove(buffer, o);
	buffer=makeMove(buffer, p);
	buffer=makeMove(buffer, r);
	buffer=makeMove(buffer, s);
	buffer=makeMove(buffer, t);
	buffer=makeMove(buffer, u);
	res1=checkCube(buffer);
		if (res1>res2){
		res2=res1;
		maxi=i;
		maxj=j;
		maxk=k;
		maxl=l;
		maxm=m;
		maxn=n;
		maxo=o;
		maxp=p;
		maxr=r;
		maxs=s;
		maxt=t;
		maxu=u;
		System.out.println("i="+maxi+" j="+maxj+" k="+maxk+" l="+maxl+" m="+maxm+" n="+maxn+" o="+maxo+" p="+maxp+" r="+maxr+" s="+maxs+" t="+maxt+" u="+maxu+" res1="+res1);	

	}
	}}}}}}}}}}}
	
}
System.out.println("i="+maxi+" j="+maxj+" k="+maxk+" l="+maxl+" m="+maxm+" n="+maxn+" o="+maxo+" p="+maxp+" r="+maxr+" s="+maxs+" t="+maxt+" u="+maxu+" res2="+res2);	
	



}
public static int rand(int i) {
	Random r = new Random();
	return r.nextInt(i)+1;
}
public static Cube makeMove(Cube cube1, int i){
	if (i==1)
	{cube1=Move.u(cube1);}
	if (i==2)
	{cube1=Move.f(cube1);}
	if (i==3)
	{cube1=Move.r(cube1);}
	if (i==4)
	{cube1=Move.b(cube1);}
	if (i==5)
	{cube1=Move.l(cube1);}
	if (i==6)
	{cube1=Move.d(cube1);}
	
	if (i==7)
	{cube1=Move.u(cube1);
	cube1=Move.u(cube1);
	cube1=Move.u(cube1);}
	if (i==8)
	{cube1=Move.f(cube1);
	cube1=Move.f(cube1);
	cube1=Move.f(cube1);}
	if (i==9)
	{cube1=Move.r(cube1);
	cube1=Move.r(cube1);
	cube1=Move.r(cube1);}
	if (i==10)
	{cube1=Move.b(cube1);
	cube1=Move.b(cube1);
	cube1=Move.b(cube1);}
	if (i==11)
	{cube1=Move.l(cube1);
	cube1=Move.l(cube1);
	cube1=Move.l(cube1);}
	if (i==12)
	{cube1=Move.d(cube1);
	cube1=Move.d(cube1);
	cube1=Move.d(cube1);}
	
	
	return cube1;
}
public static int checkCube(Cube cube){
	int res=0;
	res=res+checkSide(cube.sideGreen, Color.GREEN);
	res=res+checkSide(cube.sideRed, Color.RED);
	res=res+checkSide(cube.sideWhite, Color.WHITE);
	res=res+checkSide(cube.sideOrange, Color.ORANGE);
	res=res+checkSide(cube.sideYellow, Color.YELLOW);
	res=res+checkSide(cube.sideBlue, Color.BLUE);
	return res;
}
public static int checkSide(Side side, int c){
	//Cube cubeDone = new Cube();
	//cubeDone.newcube();
	int i=0;
	
	if (side.i1==c)
		i=i+1;
	if (side.i2==c)
		i=i+1;
	if (side.i3==c)
		i=i+1;
	if (side.i4==c)
		i=i+1;
	if (side.i5==c)
		i=i+1;
	if (side.i6==c)
		i=i+1;
	if (side.i7==c)
		i=i+1;
	if (side.i8==c)
		i=i+1;
	if (side.i9==c)
		i=i+1;
	//System.out.println(" "+i);
	return i;
}
}
