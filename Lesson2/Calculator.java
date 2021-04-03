public class Calculator  {	
	public double calculateTheResult (double num1, char typeOfOperation, double num2){
		switch (typeOfOperation) {
			case '*' : return num1*num2;
			case '/' : return num1/num2;
			case '^' : return Math.pow(num1,num2);
			case '+' : return num1 + num2;
			case '-' : return (num1 - num2);
			case '%' : return num1 % num2;

		}
		return 0.0;
	}

}