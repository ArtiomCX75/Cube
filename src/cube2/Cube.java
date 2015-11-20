package cube2;

public class Cube {
public Side sideG;
public Side sideR;
public Side sideW;
public Side sideO;
public Side sideY;
public Side sideB;
	public Cube(){}
	public Cube(String s1, String s2, String s3, String s4, String s5, String s6) {
	sideG = new Side(s1);
	sideR = new Side(s2);
	sideW = new Side(s3);
	sideO = new Side(s4);
	sideY = new Side(s5);
	sideB = new Side(s6);
	}
	
	public Cube cloneCube(){
		Cube cube2 = new Cube();
		cube2.sideG=this.sideG;
		cube2.sideR=this.sideR;
		cube2.sideW=this.sideW;
		cube2.sideO=this.sideO;
		cube2.sideY=this.sideY;
		cube2.sideB=this.sideB;
		return cube2;
	}
	
	public Cube moveRed(){
		Cube cubeClone = this.cloneCube();
		//cubeClone.sideR.el1
		return cubeClone;
	}
	/*Corner c111 = new Corner();
	Corner c113 = new Corner();
	Corner c131 = new Corner();
	Corner c133 = new Corner();
	Corner c311 = new Corner();
	Corner c331 = new Corner();
	Corner c313 = new Corner();
	Corner c333 = new Corner();
	
	Edge e121 = new Edge();
	Edge e112 = new Edge();
	Edge e123 = new Edge();
	Edge e132 = new Edge();
	Edge e211 = new Edge();
	Edge e213 = new Edge();
	Edge e233 = new Edge();
	Edge e231 = new Edge();
	Edge e321 = new Edge();
	Edge e312 = new Edge();
	Edge e323 = new Edge();
	Edge e332 = new Edge();*/
	
}
