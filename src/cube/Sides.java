package cube;

public class Sides extends Side {
public static Side side1 = new Side();
public static Side side2 = new Side();
public static Side side3 = new Side();
public static Side side4 = new Side();
public static Side side5 = new Side();
public static Side side6 = new Side();
Sides() {
	//GREEN
	side1.el[1]=Corners.corner1.cell1;
	side1.el[2]=Edges.edge4.cell1;
	side1.el[3]=Corners.corner4.cell1;
	side1.el[4]=Edges.edge3.cell1;
	side1.el[5]=Corners.corner3.cell1;
	side1.el[6]=Edges.edge2.cell1;
	side1.el[7]=Corners.corner2.cell1;
	side1.el[8]=Edges.edge1.cell1;
	side1.el[9]=Corners.corner1.cell1;
}
}
