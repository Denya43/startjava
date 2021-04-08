package src.com.startjava.lesson_2_3.calculator

public class Calculator {	
	public Double calculateTheResult (double num1, char sign, double num2) {
		switch (sign) {
			case '*' : return (num1 * num2);
			case '/' : return (num1 / num2);
			case '^' : return Math.pow(num1, num2);
			case '+' : return (num1 + num2);
			case '-' : return (num1 - num2);
			case '%' : return (num1 % num2);
		}
		return null;
	}
}