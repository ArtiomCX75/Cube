package cube2;

public class Corner {
	public Cell c1= new Cell();
	public Cell c2= new Cell();
	public Cell c3= new Cell();
	public String name="corner name";
	/*public Corner(){
		System.out.println("new corner");
	}*/
	public void move(Move side) {
		
		if (c1.adr.equals(side.name)) {
			c2.adr = side.getAdr(c2.adr);
			c3.adr = side.getAdr(c3.adr);
			return;
		}
		if (c2.adr.equals(side.name)) {
			c1.adr = side.getAdr(c1.adr);
			c3.adr = side.getAdr(c3.adr);
			return;
		}
		if (c3.adr.equals(side.name)) {
			c1.adr = side.getAdr(c1.adr);
			c2.adr = side.getAdr(c2.adr);
			return;
		}
		
	}
	public void init(String s1,String s2,String s3,String s4,String s5,String s6){
		c1.setAdr(s1).setCol(s2);
		c2.setAdr(s3).setCol(s4);
		c3.setAdr(s5).setCol(s6);
	}

}