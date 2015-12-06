package MLP3;

import java.math.BigDecimal;

public class Layer {
/*	public double layin[];
	public double layh1[];
	public double layh2[];
	public double layout[];
	public double wih1[][];
	public double wh1h2[][];
	public double wh2o[][]; */
	
	public BigDecimal layin[];
	public BigDecimal layh1[];
	public BigDecimal layh2[];
	public BigDecimal layout[];
	public BigDecimal wih1[][];
	public BigDecimal wh1h2[][];
	public BigDecimal wh2o[][];
	
	public Layer() {
		
		layin = new BigDecimal[2];
		layh1 = new BigDecimal[2];
		layh2 = new BigDecimal[2];
		layout = new BigDecimal[1];
		layin[0] = BigDecimal.valueOf(0.5);
		layin[1] = BigDecimal.valueOf(0.3);
		layh1[0] = BigDecimal.valueOf(0);
		layh1[1] = BigDecimal.valueOf(0);
		layh2[0] = BigDecimal.valueOf(0);
		layh2[1] = BigDecimal.valueOf(0);
		layout[0] = BigDecimal.valueOf(0);

		wih1 = new BigDecimal[2][2];
		wh1h2 = new BigDecimal[2][2];
		wh2o = new BigDecimal[2][1];
		wih1[0][0] = BigDecimal.valueOf(2);
		wih1[0][1] = BigDecimal.valueOf(3);
		wih1[1][0] = BigDecimal.valueOf(-3);
		wih1[1][1] = BigDecimal.valueOf(2);
		wh1h2[0][0] = BigDecimal.valueOf(-1);
		wh1h2[0][1] = BigDecimal.valueOf(2);
		wh1h2[1][0] = BigDecimal.valueOf(-1);
		wh1h2[1][1] = BigDecimal.valueOf(-3);
		wh2o[0][0] = BigDecimal.valueOf(4);
		wh2o[1][0] = BigDecimal.valueOf(2);
		
	/*	layin = new double[2];
		layh1 = new double[2];
		layh2 = new double[2];
		layout = new double[1];
		layin[0] = (0.5);
		layin[1] = (0.3);
		layh1[0] = (0);
		layh1[1] = (0);
		layh2[0] = (0);
		layh2[1] = (0);
		layout[0] =(0);

		wih1 = new double[2][2];
		wh1h2 = new double[2][2];
		wh2o = new double[2][1];
		wih1[0][0] = (2);
		wih1[0][1] = (3);
		wih1[1][0] = (-3);
		wih1[1][1] = (2);
		wh1h2[0][0] = (-1);
		wh1h2[0][1] = (2);
		wh1h2[1][0] = (-1);
		wh1h2[1][1] = (-3);
		wh2o[0][0] = (4);
		wh2o[1][0] = (2);*/
		
		
		layh1[0] = layin[0].multiply(wih1[0][0]).add(layin[1].multiply(wih1[1][0]));
		System.out.println("1 "+layh1[0]);
		layh1[0]=f(layh1[0]);
		System.out.println("2 "+layh1[0]);
		
		layh1[1] = layin[0].multiply(wih1[0][1]).add(layin[1].multiply(wih1[1][1]));
		System.out.println("3 "+layh1[1]);
		layh1[1]=f(layh1[1]);
		System.out.println("4 "+layh1[1]);
		
		layh2[0] = layh1[0].multiply(wh1h2[0][0]).add(layh1[1].multiply(wh1h2[1][0]));
	//	System.out.println("a "+layh1[0]+" b "+wh1h2[0][0]+" c "+layh1[1]+" d "+wh1h2[1][0]);

		System.out.println("5 "+layh2[0]);
		layh2[0]=f(layh2[0]);
		System.out.println("6 "+layh2[0]);
		
		layh2[1] = layh1[0].multiply(wh1h2[0][1]).add(layh1[1].multiply(wh1h2[1][1]));
		System.out.println("7 "+layh2[1]);
		layh2[1]=f(layh2[1]);
		System.out.println("8 "+layh2[1]);
		
		layout[0] = layh2[0].multiply(wh2o[0][0]).add(layh2[1].multiply(wh2o[1][0]));
		System.out.println("9 "+layout[0]);
		layout[0]=f(layout[0]);
		System.out.println("10 "+layout[0]);
		
			/*
		layh1[1] = f(layin[0] * wih1[0][1] + layin[1] * wih1[1][1]);
		System.out.println(layh1[0]);
		System.out.println(layh1[1]);
		layh2[0] = f(layh1[0] * wh1h2[0][0] + layh2[1] * wh1h2[1][0]);
		layh2[1] = f(layh1[0] * wh1h2[0][1] + layh2[1] * wh1h2[1][1]);
		System.out.println(layh2[0]);
		System.out.println(layh2[1]);
		layout[0] = f(layh2[0] * wh2o[0][0] + layh2[1] * wh2o[1][0]);
		System.out.println(layout[0]);*/
	}

	public double f(double x) {
		double y = 1 / (1 + Math.exp(x * (-0.1)));
		return y;
	}
	public BigDecimal f(BigDecimal x) {
		BigDecimal y;
		BigDecimal y1;
		BigDecimal y2;
		BigDecimal y3;
	//	System.out.println("--------------");
		////BigDecimal y = 1 / (1 + Math.exp(x * (-0.1)));
		y1=BigDecimal.valueOf(Math.E);
	//	System.out.println("y1 "+y1);
		y2=x.negate();
	//	System.out.println("x "+x);
	//	System.out.println("y2 "+y2);
		double i= Math.pow(y1.doubleValue(), y2.doubleValue());
	//	System.out.println("i "+i);
		y1=BigDecimal.valueOf(i);
	//	System.out.println(y1);
		double i2 = y1.doubleValue();
		i2++;
		y1=BigDecimal.valueOf(i2);
	//	System.out.println("y1 "+y1);
		y3=BigDecimal.valueOf(1);
	//	System.out.println("y3 "+y3);
	//	System.out.println(y1);
		i=y3.doubleValue();
		i2=y1.doubleValue();
		y=BigDecimal.valueOf(i/i2);
		// System.out.println("y==== "+y);
		return y;
	}
}
