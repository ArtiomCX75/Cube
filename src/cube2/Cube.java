package cube2;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Cube {
	public Corner cor[] = new Corner[8];
	public Edge[] edg = new Edge[12];
	public Move u;
	public Move f;
	public Move r;
	public Move b;
	public Move l;
	public Move d;

	public Side sideU;
	public Side sideF;
	public Side sideR;
	public Side sideB;
	public Side sideL;
	public Side sideD;

	public Cube() {
		for (int i = 0; i < 12; i++) {
			edg[i] = new Edge();
		}
		for (int i = 0; i < 8; i++) {
			cor[i] = new Corner();
		}
		sideU = new Side("ubrflG");
		sideF = new Side("furdlR");
		sideR = new Side("rubdfW");
		sideB = new Side("buldrO");
		sideL = new Side("lufdbY");
		sideD = new Side("dfrblB");

		u = new Move("uulfrbd");
		f = new Move("frfdbul");
		r = new Move("rburdlf");
		b = new Move("blfubdr");
		l = new Move("lfdrulb");
		d = new Move("durblfd");
	}

	public void move(Move move) {
		for (Corner c : cor)
			c.move(move);
		for (Edge e : edg)
			e.move(move);
	}

	public void move(int... j) {
		for (int i : j)
			switch (i) {
			case 0:
				// do nothing
				break;
			case 1:
				move(u);
				break;
			case 2:
				move(f);
				break;
			case 3:
				move(r);
				break;
			case 4:
				move(b);
				break;
			case 5:
				move(l);
				break;
			case 6:
				move(d);
				break;
			case 7:
				move(u);
				move(u);
				move(u);
				break;
			case 8:
				move(f);
				move(f);
				move(f);
				break;
			case 9:
				move(r);
				move(r);
				move(r);
				break;
			case 10:
				move(b);
				move(b);
				move(b);
				break;
			case 11:
				move(l);
				move(l);
				move(l);
				break;
			case 12:
				move(d);
				move(d);
				move(d);
				break;
			}
	}

	public void init_def() {
		cor[0].init("u", "G", "f", "R", "l", "Y");
		cor[1].init("u", "G", "r", "W", "f", "R");
		cor[2].init("u", "G", "l", "Y", "b", "O");
		cor[3].init("u", "G", "b", "O", "r", "W");
		cor[4].init("d", "B", "l", "Y", "f", "R");
		cor[5].init("d", "B", "f", "R", "r", "W");
		cor[6].init("d", "B", "b", "O", "l", "Y");
		cor[7].init("d", "B", "r", "W", "b", "O");

		edg[0].init("u", "G", "f", "R");
		edg[1].init("u", "G", "r", "W");
		edg[2].init("u", "G", "b", "O");
		edg[3].init("u", "G", "l", "Y");
		edg[4].init("f", "R", "r", "W");
		edg[5].init("r", "W", "b", "O");
		edg[6].init("b", "O", "l", "Y");
		edg[7].init("l", "Y", "f", "R");
		edg[8].init("d", "B", "f", "R");
		edg[9].init("d", "B", "r", "W");
		edg[10].init("d", "B", "b", "O");
		edg[11].init("d", "B", "l", "Y");
	}

	public void init(String u_fl_rf_lb_br[], String d_lf_fr_bl_rb[], String u_frbl[], String fr_rb_bl_lf[],
			String d_frbl) {
		cor[0].init("u", "G", "f", "R", "l", "Y");
		cor[1].init("u", "G", "r", "W", "f", "R");
		cor[2].init("u", "G", "l", "Y", "b", "O");
		cor[3].init("u", "G", "b", "O", "r", "W");
		cor[4].init("d", "B", "l", "Y", "f", "R");
		cor[5].init("d", "B", "f", "R", "r", "W");
		cor[6].init("d", "B", "b", "O", "l", "Y");
		cor[7].init("d", "B", "r", "W", "b", "O");

		edg[0].init("u", "G", "f", "R");
		edg[1].init("u", "G", "r", "W");
		edg[2].init("u", "G", "b", "O");
		edg[3].init("u", "G", "l", "Y");
		edg[4].init("f", "R", "r", "W");
		edg[5].init("r", "W", "b", "O");
		edg[6].init("b", "O", "l", "Y");
		edg[7].init("l", "Y", "f", "R");
		edg[8].init("d", "B", "f", "R");
		edg[9].init("d", "B", "r", "W");
		edg[10].init("d", "B", "b", "O");
		edg[11].init("d", "B", "l", "Y");
	}

	public void initSides() {
		sideU.find(this);
		sideF.find(this);
		sideR.find(this);
		sideB.find(this);
		sideL.find(this);
		sideD.find(this);
	}

	public void printSides() {
		initSides();
		sideU.pr();
		sideF.pr();
		sideR.pr();
		sideB.pr();
		sideL.pr();
		sideD.pr();
	}

	public void checkCube() {
		initSides();
		Boolean bool = sideU.checkSide() & sideF.checkSide() & sideR.checkSide() & sideB.checkSide() & sideL.checkSide()
				& sideD.checkSide();
		System.out.println(bool);
	}

	public void wr(String s) {

		try (FileWriter writer = new FileWriter("cube.txt", true)) {
			// запись всей строки
			String text = s;
			writer.write(text);
			// запись по символам
			writer.append('\n');
			// writer.append('E');
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
	}

	public void writeObject(Object obj, String s) throws Exception {
		FileOutputStream fos = new FileOutputStream(s);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
	}

	public void s() throws Exception {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					String a1[] = solve(0,4);
					writeObject(a1, "./1/a0000000000_0002(0-4).txt");
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					String a1[] = solve(4,8);
					writeObject(a1, "./1/a0000000000_0002(4-8).txt");
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		});
		t1.start();
		
		t1.join();
		t2.start();
		t2.join();
	}

	public String[] solve(int k1, int k2) {
		String arr[] = new String[6000000];
		int j = 0;
		int i1 = 0, i2 = 0, i3 = 0, i4 = 0, i5 = 0, i6 = 0, i7 = 0, i8 = 0, i9 = 0, i10 = 0, i11 = 0, i12 = 0, i13 = 0,
				i14 = 0, i15 = 0, i16 = 0, i17 = 0, i18 = 0, i19 = 0, i20 = 0;
		for (i1 = 0; i1 < 1; i1++) {
			for (i2 = 0; i2 < 1; i2++) {
				for (i3 = 0; i3 < 1; i3++) {
					for (i4 = 0; i4 < 1; i4++) {
						for (i5 = 0; i5 < 1; i5++) {
							for (i6 = 0; i6 < 1; i6++) {
								for (i7 = 0; i7 < 1; i7++) {
									for (i8 = 0; i8 < 1; i8++) {
										for (i9 = 0; i9 < 1; i9++) {
											for (i10 = 0; i10 < 1; i10++) {
												for (i11 = 0; i11 < 1; i11++) {
													for (i12 = 0; i12 < 1; i12++) {
														for (i13 = 0; i13 < 1; i13++) {
															for (i14 = 2; i14 < 3; i14++) {
																for (i15 = k1; i15 < k2; i15++) {         //
																	for (i16 = 0; i16 < 13; i16++) {
																		for (i17 = 0; i17 < 13; i17++) {
																			for (i18 = 0; i18 < 13; i18++) {
																				for (i19 = 0; i19 < 13; i19++) {
																					for (i20 = 0; i20 < 13; i20++) {
																						Cube clon = new Cube();
																						clon.init_def();
																						String s = (i1 + " " + i2 + " "
																								+ i3 + " " + i4 + " "
																								+ i5 + " " + i6 + " "
																								+ i7 + " " + i8 + " "
																								+ i9 + " " + i10 + " "
																								+ i11 + " " + i12 + " "
																								+ i13 + " " + i14 + " "
																								+ i15 + " " + i16 + " "
																								+ i17 + " " + i18 + " "
																								+ i19 + " " + i20);
																						//System.out.println(s);
																						arr[j] = s;
																						j++;
																						// wr(s);
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return arr;
	}

}
