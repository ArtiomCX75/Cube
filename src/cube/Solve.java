package cube;

import java.util.Arrays;
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
	Cube buffer = new Cube();
for (int i=0;i<1;i++) {
for (int j=0;j<1;j++) {
for (int k=0;k<1;k++) {
for (int l=0;l<4;l++) {
	System.out.println("l="+l);
for (int m=0;m<13;m++) {
	System.out.println("m="+m);
for (int n=0;n<13;n++) {
	System.out.println("n="+n);
for (int o=0;o<13;o++) {
	//System.out.println("o");
for (int p=0;p<13;p++) {
for (int r=0;r<13;r++) {
for (int s=0;s<13;s++) {
for (int t=0;t<13;t++) {
for (int u=0;u<13;u++) {
	
	
	//buffer.newcube();
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
	//System.out.println(Integer.toString(res1));
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
		//Elements.prSide(buffer.sideGreen);
		if (res2==4)
		{break;}
		}
	}if (res2==4)
	{break;}}if (res2==4)
	{break;}}if (res2==4)
	{break;}}if (res2==4)
	{break;}}if (res2==4)
	{break;}}if (res2==4)
	{break;}}if (res2==4)
	{break;}}if (res2==4)
	{break;}}if (res2==4)
	{break;}}if (res2==4)
	{break;}}
	
}

System.out.println("i="+maxi+" j="+maxj+" k="+maxk+" l="+maxl+" m="+maxm+" n="+maxn+" o="+maxo+" p="+maxp+" r="+maxr+" s="+maxs+" t="+maxt+" u="+maxu+" res2="+res2);	
int[] re=new int[100];
re[0]=0;

re=addres(re,maxi);
re=addres(re,maxj);
re=addres(re,maxk);
re=addres(re,maxl);
re=addres(re,maxm);
re=addres(re,maxn);
re=addres(re,maxo);
re=addres(re,maxp);
re=addres(re,maxr);
re=addres(re,maxs);
re=addres(re,maxt);
re=addres(re,maxu);


Cube buffer1 = new Cube();
buffer1=Move.clone(buffer);
int[] tempre=new int[100];
tempre[0]=0;
int[] tempre1=new int[100];
tempre1[0]=0;
/*
while (true)
{	
	if(buffer1.sideRed.i2==2&&buffer1.sideWhite.i2==3&&buffer1.sideOrange.i2==4&&buffer1.sideYellow.i2==5)
		{
		break;}
	while(buffer1.sideRed.i2!=2)
	{
		buffer1=makeMove(buffer1, 1);
		tempre=addres(tempre,1);
	}	
	while(buffer1.sideWhite.i2!=3)
	{
		buffer1=makeMove(buffer1, 9);
		tempre=addres(tempre,9);
		buffer1=makeMove(buffer1, 1);
		tempre=addres(tempre,1);
		buffer1=makeMove(buffer1, 3);
		tempre=addres(tempre,3);
		buffer1=makeMove(buffer1, 1);
		tempre=addres(tempre,1);
		buffer1=makeMove(buffer1, 9);
		tempre=addres(tempre,9);
		buffer1=makeMove(buffer1, 1);
		tempre=addres(tempre,1);
		buffer1=makeMove(buffer1, 1);
		tempre=addres(tempre,1);
		buffer1=makeMove(buffer1, 3);
		tempre=addres(tempre,3);	
	}	
	if(buffer1.sideOrange.i2!=4)
	{
		buffer1=makeMove(buffer1, 4);
		System.out.println("temp0="+tempre[0]);
		tempre=addres(tempre,4);
		buffer1=makeMove(buffer1, 1);
		tempre=addres(tempre,1);
		buffer1=makeMove(buffer1, 10);
		tempre=addres(tempre,10);
		buffer1=makeMove(buffer1, 7);
		tempre=addres(tempre,7);
		buffer1=makeMove(buffer1, 4);
		tempre=addres(tempre,4);
	}	
}
tempre1=tempre;
////
buffer1=Move.clone(buffer);
tempre[0]=0;
while (true)
{	
	if(buffer1.sideRed.i2==2&&buffer1.sideWhite.i2==3&&buffer1.sideOrange.i2==4&&buffer1.sideYellow.i2==5)
		{
		break;}
	while(buffer1.sideWhite.i2!=3)
	{
		buffer1=makeMove(buffer1, 1);
		tempre=addres(tempre,1);
	}	
	while(buffer1.sideOrange.i2!=4)
	{
		buffer1=makeMove(buffer1, 10);
		tempre=addres(tempre,10);
		buffer1=makeMove(buffer1, 1);
		tempre=addres(tempre,1);
		buffer1=makeMove(buffer1, 4);
		tempre=addres(tempre,4);
		buffer1=makeMove(buffer1, 1);
		tempre=addres(tempre,1);
		buffer1=makeMove(buffer1, 10);
		tempre=addres(tempre,10);
		buffer1=makeMove(buffer1, 1);
		tempre=addres(tempre,1);
		buffer1=makeMove(buffer1, 1);
		tempre=addres(tempre,1);
		buffer1=makeMove(buffer1, 4);
		tempre=addres(tempre,4);	
	}	
	if(buffer1.sideYellow.i2!=5)
	{
		buffer1=makeMove(buffer1, 5);
		tempre=addres(tempre,5);
		buffer1=makeMove(buffer1, 1);
		tempre=addres(tempre,1);
		buffer1=makeMove(buffer1, 11);
		tempre=addres(tempre,11);
		buffer1=makeMove(buffer1, 7);
		tempre=addres(tempre,7);
		buffer1=makeMove(buffer1, 5);
		tempre=addres(tempre,5);
	}	
}
////
if (tempre[0]<tempre1[0])
{tempre1=tempre;}

for (int i=1;i<tempre1[0]+1;i++)
{
	re=addres(re,tempre1[i]);
}
*/
for (int i=1;i<re[0]+1;i++)
{
	System.out.println(i+"  "+re[i]);
}



}
public static int[] addres(int[] ar, int i){
	if (i!=0)
	{
	ar[0]=ar[0]+1;
	ar[ar[0]]=i;
	}
	return ar;
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
	int res1=0;
	res=checkSide(cube.sideGreen, Color.GREEN);
	if (res1>res)
	{res=res1;}
	if (cube.sideRed.i2!=2)
	{res=0;}
	if (cube.sideWhite.i2!=3)
	{res=0;}
	if (cube.sideOrange.i2!=4)
	{res=0;}
	/*res=checkSide(cube.sideRed, Color.RED);
	if (res1>res)
	{res=res1;}
	res=checkSide(cube.sideWhite, Color.WHITE);
	if (res1>res)
	{res=res1;}
	res=checkSide(cube.sideOrange, Color.ORANGE);
	if (res1>res)
	{res=res1;}
	res=checkSide(cube.sideYellow, Color.YELLOW);
	if (res1>res)
	{res=res1;}
	res=checkSide(cube.sideBlue, Color.BLUE);
	if (res1>res)
	{res=res1;}*/
	return res;
}
public static int checkSide(Side side, int c){
	//Cube cubeDone = new Cube();
	//cubeDone.newcube();
	int i=0;
	
//	if (side.i1==c)
//		i=i+1;
	if (side.i2==c)
		i=i+1;
//	if (side.i3==c)
//		i=i+1;
	if (side.i4==c)
		i=i+1;
//	if (side.i5==c)
//		i=i+1;
	if (side.i6==c)
		i=i+1;
//	if (side.i7==c)
//		i=i+1;
	if (side.i8==c)
		i=i+1;
//	if (side.i9==c)
//		i=i+1;
	//System.out.println(" "+i);
	return i;
}

public static int checkCubeCorners(Cube cube){
	int res=0;
	res=res+checkSideCorners(cube.sideGreen, Color.GREEN);
	res=res+checkSide(cube.sideRed, Color.RED);
	res=res+checkSide(cube.sideWhite, Color.WHITE);
	//res=res+checkSide(cube.sideOrange, Color.ORANGE);
	//res=res+checkSide(cube.sideYellow, Color.YELLOW);
	//res=res+checkSide(cube.sideBlue, Color.BLUE);
	return res;
}
public static int checkSideCorners(Side side, int c){
	//Cube cubeDone = new Cube();
	//cubeDone.newcube();
	int i=0;
	if (side.i1==c)
		{i=i+1;}
	if (side.i3==c)
		{i=i+1;}
		
	if (side.i7==c)
		{i=i+1;}
	if (side.i9==c)
		{i=i+1;}
	//System.out.println("i= "+i);
	return i;
}

}
