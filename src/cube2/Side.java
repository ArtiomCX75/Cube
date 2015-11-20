package cube2;

public class Side {
	public String el1;
	public String el2;
	public String el3;
	public String el4;
	public String el5;
	public String el6;
	public String el7;
	public String el8;
	public String el9;

	public Side(String str) {
		el1 = str.substring(0, 1);
		el2 = str.substring(1, 2);
		el3 = str.substring(2, 3);
		el4 = str.substring(3, 4);
		el5 = str.substring(4, 5);
		el6 = str.substring(5, 6);
		el7 = str.substring(6, 7);
		el8 = str.substring(7, 8);
		el9 = str.substring(8, 9);
	}
}
