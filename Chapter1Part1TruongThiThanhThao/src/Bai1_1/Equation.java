package Bai1_1;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 19 August 2016
 * Version 1.0
 */
public class Equation {
	int a;
	int b;

	public Equation(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Equation() {
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	// this method is responsible for equation
	public double calculate() {
		if (a == 0) {
			if (b == 0) {
				return 0.0;
			} else {
				return 1.0;
			}
		} else {
			double x = -b / a;
			return x;
		}
	}
}
