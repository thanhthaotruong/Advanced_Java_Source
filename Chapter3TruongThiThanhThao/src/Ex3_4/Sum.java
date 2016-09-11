package Ex3_4;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 09 Sept 2016
 * Version 1.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter firstNumber: ");
		int operand1 = Integer.parseInt(input.readLine());
		System.out.println("Enter secondNumber: ");
		int operand2 = Integer.parseInt(input.readLine());
		Operator op1 = (Integer firstNumber, Integer secondNumber) -> firstNumber + secondNumber;
		System.out.println("Sum = "+op1.operate(operand1, operand2));
		Operator op2 = (Integer firstNumber, Integer secondNumber) -> firstNumber - secondNumber;
		System.out.println("Subtraction: "+op2.operate(operand1, operand2));
		Operator op3 = (Integer firstNumber, Integer secondNumber) -> firstNumber * secondNumber;
		System.out.println("Multiplication: "+op3.operate(operand1, operand2));
		Operator op4 = (Integer firstNumber, Integer secondNumber) -> firstNumber / secondNumber;
		System.out.println("Divide: "+op4.operate(operand1, operand2));
	}
	interface Operator {
		public Integer operate(Integer operand1,Integer operand2);
	}
}
