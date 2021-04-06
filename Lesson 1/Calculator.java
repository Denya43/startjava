import java.util.Scanner;

public class Calculator {	
    public static void main(String[] args) {
        double num1;
        double num2;
        char sign;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = scanner.nextDouble();
        System.out.println("Enter the type of operation");
        sign = scanner.next().charAt(0);
        System.out.println("Enter the second number");
        num2 = scanner.nextDouble();

        if (sign == '*') System.out.println(num1 + " * " + num2 + " = "+ num1 * num2);
        else if (sign == '/') {
            System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
        } else if (sign == '^') {
            double raisedNumber = num1;
            double powCounter = num2;
            while (powCounter > 1) {
                raisedNumber *= raisedNumber;
                powCounter--;
            }
            System.out.println(num1 + " ^ " + num2 + " = " + raisedNumber);
        } else if (sign == '+') {
            System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
        } else if (sign == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (sign == '%') {
            System.out.println(num1 + " % " + num2 + " = " + num1 % num2);
        } else {
            System.out.println("You entered incorrect data");
        }
    }
}