package cube2;

public class Edge {
	public Cell c1 = new Cell();
	public Cell c2 = new Cell();

	/*
	 * public Edge(){ System.out.println("new edge"); }
	 */
public void move(Move side) {
		
		if (c1.adr.equals(side.name)) {
			c2.adr = side.getAdr(c2.adr);
			return;
		}
		if (c2.adr.equals(side.name)) {
			c1.adr = side.getAdr(c1.adr);
			return;
		}
		
		}

	public void init(String s1, String s2, String s3, String s4) {
		c1.setAdr(s1).setCol(s2);
		c2.setAdr(s3).setCol(s4);}
}
