package cube;

public class Corners {
public static Corner corner1 = new Corner();
public static Corner corner2 = new Corner();
public static Corner corner3 = new Corner();
public static Corner corner4 = new Corner();
public static Corner corner5 = new Corner();
public static Corner corner6 = new Corner();
public static Corner corner7 = new Corner();
public static Corner corner8 = new Corner();
public Corners() {
	
	corner1.cell1=Color.GREEN;
	corner1.cell2=Color.RED;
	corner1.cell3=Color.YELLOW;
	
	corner2.cell1=Color.GREEN;
	corner2.cell2=Color.WHITE;
	corner2.cell3=Color.RED;

	corner3.cell1=Color.GREEN;
	corner3.cell2=Color.ORANGE;
	corner3.cell3=Color.WHITE;

	corner4.cell1=Color.GREEN;
	corner4.cell2=Color.YELLOW;
	corner4.cell3=Color.ORANGE;

	corner5.cell1=Color.BLUE;
	corner5.cell2=Color.RED;
	corner5.cell3=Color.WHITE;

	corner6.cell1=Color.BLUE;
	corner6.cell2=Color.WHITE;
	corner6.cell3=Color.ORANGE;

	corner7.cell1=Color.BLUE;
	corner7.cell2=Color.ORANGE;
	corner7.cell3=Color.YELLOW;

	corner8.cell1=Color.BLUE;
	corner8.cell2=Color.YELLOW;
	corner8.cell3=Color.RED;


}
}
