package cube2;

public class Side {
	public String name;
	public Cell cell[] = new Cell[8];

	public String ll;
	public String rr;
	public String uu;
	public String dd;
	public String col;

	public Side(String s) {
		name = s.substring(0, 1);
		uu = s.substring(1, 2);
		rr = s.substring(2, 3);
		dd = s.substring(3, 4);
		ll = s.substring(4, 5);
		col = s.substring(5, 6);
		for (int i = 0; i < 8; i++) {
			cell[i] = new Cell();
		}
	}

	public void find(Cube cube) {
		for (Corner cor2 : cube.cor) {
			if ((cor2.c1.adr.equals(name)) & (cor2.c2.adr.equals(ll)))
				cell[0].setCol(cor2.c1.col);

			if ((cor2.c2.adr.equals(name)) & (cor2.c3.adr.equals(ll)))
				cell[0].setCol(cor2.c2.col);

			if ((cor2.c3.adr.equals(name)) & (cor2.c1.adr.equals(ll)))
				cell[0].setCol(cor2.c3.col);

			if ((cor2.c1.adr.equals(name)) & (cor2.c2.adr.equals(uu)))
				cell[2].setCol(cor2.c1.col);

			if ((cor2.c2.adr.equals(name)) & (cor2.c3.adr.equals(uu)))
				cell[2].setCol(cor2.c2.col);

			if ((cor2.c3.adr.equals(name)) & (cor2.c1.adr.equals(uu)))
				cell[2].setCol(cor2.c3.col);

			if ((cor2.c1.adr.equals(name)) & (cor2.c2.adr.equals(dd)))
				cell[5].setCol(cor2.c1.col);

			if ((cor2.c2.adr.equals(name)) & (cor2.c3.adr.equals(dd)))
				cell[5].setCol(cor2.c2.col);

			if ((cor2.c3.adr.equals(name)) & (cor2.c1.adr.equals(dd)))
				cell[5].setCol(cor2.c3.col);

			if ((cor2.c1.adr.equals(name)) & (cor2.c2.adr.equals(rr)))
				cell[7].setCol(cor2.c1.col);

			if ((cor2.c2.adr.equals(name)) & (cor2.c3.adr.equals(rr)))
				cell[7].setCol(cor2.c2.col);

			if ((cor2.c3.adr.equals(name)) & (cor2.c1.adr.equals(rr)))
				cell[7].setCol(cor2.c3.col);

		}
		for (Edge edg2 : cube.edg) {
			if ((edg2.c1.adr.equals(name)) & (edg2.c2.adr.equals(uu)))
				cell[1].setCol(edg2.c1.col);
			if ((edg2.c2.adr.equals(name)) & (edg2.c1.adr.equals(uu)))
				cell[1].setCol(edg2.c2.col);

			if ((edg2.c1.adr.equals(name)) & (edg2.c2.adr.equals(ll)))
				cell[3].setCol(edg2.c1.col);
			if ((edg2.c2.adr.equals(name)) & (edg2.c1.adr.equals(ll)))
				cell[3].setCol(edg2.c2.col);

			if ((edg2.c1.adr.equals(name)) & (edg2.c2.adr.equals(rr)))
				cell[4].setCol(edg2.c1.col);
			if ((edg2.c2.adr.equals(name)) & (edg2.c1.adr.equals(rr)))
				cell[4].setCol(edg2.c2.col);

			if ((edg2.c1.adr.equals(name)) & (edg2.c2.adr.equals(dd)))
				cell[6].setCol(edg2.c1.col);
			if ((edg2.c2.adr.equals(name)) & (edg2.c1.adr.equals(dd)))
				cell[6].setCol(edg2.c2.col);

		}
	}

	public void pr() {
		System.out.print(cell[0].col + " ");
		System.out.print(cell[1].col + " ");
		System.out.println(cell[2].col + " ");
		System.out.print(cell[3].col + " ");
		System.out.print(col + " ");
		System.out.println(cell[4].col + " ");
		System.out.print(cell[5].col + " ");
		System.out.print(cell[6].col + " ");
		System.out.println(cell[7].col + " ");
		System.out.println("");
	}
	
	public Boolean checkSide(){
		Boolean bool=true;
		for (Cell c: cell) {
			//System.out.println("cell="+c.col);
			//System.out.println("col="+col);
			bool=bool&(c.col.equals(col));
			}
		return bool;
	}
}
