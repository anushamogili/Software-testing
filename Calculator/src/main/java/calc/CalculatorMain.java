package calc;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class CalculatorMain {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int p, int q) {
		return p * q;
	}

	public int div(int j, int k) throw Exception {
		try {
		int rem= j/k;
		return rem;
		}
		catch(Exception e){
			throw e;
		}
}


	public double sqr(double number) {
		double squareRoot = Math.sqrt(number);
		return Math.round(squareRoot);
	}

	public int mod(int num1, int num2) {
		return num1 % num2;
	}

	public int area(int r) {
		return 3.15 * this.sqaure(r);
	}
	public double sin(double val) {
		return Math.sin(val);
	}
	public double cos(double val) {
		return Math.cos(val);
	}
	public double tan(double val) {
		return Math.tan(val);
	}
	public double sec(double val) {
		return Math.sec(val);
	}
	public double log(double val) {
		return Math.log(val);
	}
	public int power(int x,int y) {
		return x^y;
	}
	public int sqaure(int val) {
		return val*val;
	}
}
