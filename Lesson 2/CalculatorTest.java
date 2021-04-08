package src.com.startjava.lesson_2_3.calculator

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        double num1;
        double num2;
        char sign;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in); 
        Scanner scannerString = new Scanner(System.in);
        String needReply;

        do {
            System.out.println("Enter the first number");
            num1 = scanner.nextDouble();
            System.out.println("Enter the type of operation");
            sign = scanner.next().charAt(0);
            System.out.println("Enter the second number");
            num2 = scanner.nextDouble();
            System.out.println("The result of the calculation is " + calculator.calculateTheResult(num1, sign, num2));
            do {
                System.out.println("Do you want to continue the calculation? [yes/no]:");
                needReply = scannerString.nextLine();
            } while (!needReply.equals("yes") && !needReply.equals("no"));
        } while (!needReply.equals("no"));
    } 
}
