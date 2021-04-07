import java.util.Scanner;

public class CalculatorTest {	
	public static void main(String[] args) {
		double num1;
		double num2;
		char sign;	
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in); 
		Scanner scannerString = new Scanner(System.in);
		String isNeedReply;

		do {
			System.out.println("Enter the first number");
			num1 = scanner.nextDouble();
			System.out.println("Enter the type of operation");
			sign = scanner.next().charAt(0);
			System.out.println("Enter the second number");
			num2 = scanner.nextDouble();
			System.out.println("The result of the calculation is " + 
				calculator.calculateTheResult(num1, sign, num2));
			isNeedReply = "";
			while (!isNeedReply.equals("yes") && !isNeedReply.equals("no")) {
    			System.out.println("Do you want to continue the calculation? [yes/no]:");
    			isNeedReply = scannerString.nextLine();
			}
		} while (!isNeedReply.equals("no"));
	} 
}
