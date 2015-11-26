package cube2;

import java.math.BigInteger;

public class Chain {
	public Chain parent;
	public int genNumber;
	public String moveNum;
	public static int maxGen;
	public Chain ch[] = new Chain[13];
	public static String mo[] = { "U", "F", "R", "B", "L", "D", "u", "f", "r", "b", "l", "d" };
	public static BigInteger total = new BigInteger("0");
	public static BigInteger odin = new BigInteger("1");
	public static int tot=0;
	public static int count = 0;
	public String resultChain;
	
	public Chain(int i) {
		// System.out.println("zero generation");
		genNumber = 0;
		maxGen = i;
		moveNum = "0";
		create();
	}

	public Chain(Chain chain, String move) {
		parent = chain;
		moveNum = move;
		genNumber = chain.genNumber + 1;
		// System.out.println(genNumber + " generation "+moveNum+" move");
		if (genNumber == maxGen) {
			resultChain = getChainsOfMoves();
		//	System.out.println(resultChain);
			check();
			if (tot>1000000){
			System.out.println("mln");
			tot=0;
			}	
		//	System.out.println(resultChain);
		//	check();
		//	System.out.println(resultChain);
			total = total.add(odin);
			tot++;
			return;
		} else {
			create();
		}
	}

	public void create() {
		for (int i = 0; i < 12; i++) {

			String m = mo[i];
			ch[i] = new Chain(this, m);
		}

	}

	public String getChainsOfMoves() {
		String s = "";
		if (genNumber != 1) {
			s = parent.getChainsOfMoves();
		}
		// s = s + " gen " + genNumber + " move " + moveNum;
		s = s + moveNum;
		return s;
	}

	public String moInvers(String str) {
		for (int i = 0; i < 6; i++) {
			if (str.equals(mo[i]))
				return mo[i + 6];
		}
		for (int i = 6; i < 12; i++) {
			if (str.equals(mo[i]))
				return mo[i - 6];
		}
		return null;

	}

	public void check() {

	//	System.out.println(resultChain);
		b4: for (int ñ = 0; ñ < 5; ñ++) {
			if (resultChain.length() > 3) {
				for (int i = 0; i < resultChain.length() - 3; i++) {
					if ((resultChain.charAt(i) == resultChain.charAt(i + 1)) & (resultChain.charAt(i) == resultChain.charAt(i + 2))
							& (resultChain.charAt(i) == resultChain.charAt(i + 3))) {
					//	System.out.println("bf " + resultChain);
						resultChain = resultChain.substring(0, i) + resultChain.substring(i + 4);
					//	System.out.println("af " + resultChain);
						count++;
					} else
						break b4;
				}
			}
		}
		b4: for (int ñ = 0; ñ < 17; ñ++) {
			if (resultChain.length() > 2) {
				for (int i = 0; i < resultChain.length() - 2; i++) {
					if ((resultChain.charAt(i) == resultChain.charAt(i + 1)) & (resultChain.charAt(i) == resultChain.charAt(i + 2))) {

						String buf = "";
						for (int j = 0; j < 6; j++) {
							if (mo[j].equals(resultChain.substring(i, i + 1))) {
								buf = mo[j + 6];
								count++;
								break;
							}
						}
						for (int j = 6; j < 12; j++) {
							if (mo[j].equals(resultChain.substring(i, i + 1))) {
								buf = mo[j - 6];
								count++;
								break;
							}
						}
					//	 System.out.println("bf " + resultChain);
						resultChain = resultChain.substring(0, i) + buf + resultChain.substring(i + 3);
					//	 System.out.println("af " + resultChain);
					} else
						break b4;
				}
			}
		}

		b4: for (int ñ = 0; ñ < 19; ñ++) {
			if (resultChain.length() > 1) {
				for (int i = 0; (i < resultChain.length() - 1); i++) {
					if (moInvers(resultChain.substring(i + 1, i + 2)).equals(resultChain.substring(i, i + 1))) {
						//System.out.println("bf " + resultChain);
						resultChain = resultChain.substring(0, i + 1) + resultChain.substring(i + 2);
						//System.out.println("af " + resultChain);
						count++;

					} else
						break b4;
				}
			}
		}

		// System.out.println(s);
	}

}
