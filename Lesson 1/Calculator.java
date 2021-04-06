import java.util.Scanner;

public class Calculator {	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the type of operation");
        char sign = scanner.next().charAt(0);
        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();

        if (sign == '*') System.out.println("The result is " + (num1 * num2));
        else if (sign == '/') {
            System.out.println("The result is " + num1 / num2);
        } else if (sign == '^') {
            while (num2 > 1) {
                num1 *= num1;
                num2--;
            }
            System.out.println("The result is " + num1);
        } else if (sign == '+') {
            System.out.println("The result is " + (num1 + num2));
        } else if (sign == '-') {
            System.out.println("The result is " + (num1 - num2));
        } else if (sign == '%') {
            System.out.println("The result is " + (num1 % num2));
        } else {
            System.out.println("You entered incorrect data");
        }
    }
}