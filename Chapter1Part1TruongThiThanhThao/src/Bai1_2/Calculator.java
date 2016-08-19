package Bai1_2;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 19 August 2016
 * Version : 1.0
 */
public class Calculator {
	double firstNumber;
	double secondNumber;

	public Calculator() {
	}

	public Calculator(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	// Method sum between 2 number
	public double sum() {
		double value = this.firstNumber + this.secondNumber;
		return value;
	}

	// Method minus between 2 number
	public double minus() {
		double value = this.firstNumber - this.secondNumber;
		return value;
	}

	// Method divide between 2 number
	public double divide() {
		if (this.secondNumber == 0)
			throw new ArithmeticException("By / zero");
		double value = this.firstNumber / this.secondNumber;
		return value;
	}

	// Method multy between 2 number
	public double multy() {
		double value = this.firstNumber * this.secondNumber;
		return value;
	}
}
