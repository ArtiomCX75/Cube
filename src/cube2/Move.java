package cube2;

public class Move {
	public Move(String s) {
		name = s.substring(0, 1);
		u = s.substring(1, 2);
		f = s.substring(2, 3);
		r = s.substring(3, 4);
		b = s.substring(4, 5);
		l = s.substring(5, 6);
		d = s.substring(6, 7);
	}

	public String u;
	public String f;
	public String r;
	public String b;
	public String l;
	public String d;
	public String name;

	public String getAdr(String adr) {
		if (adr.equals("u"))
			return u;
		if (adr.equals("f"))
			return f;
		if (adr.equals("r"))
			return r;
		if (adr.equals("b"))
			return b;
		if (adr.equals("l"))
			return l;
		if (adr.equals("d"))
			return d;
		System.out.println("error");
		return null;

	}
}
