package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String mathExpression;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in); 
        String needReply;
        String[] array;

        do {
            System.out.println("Enter the first number, sign and the second number:");
            mathExpression = scanner.nextLine();
            array = mathExpression.split(" ");
            System.out.println("The result of the calculation is " + calculator.calculate(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2])));
            do {
                System.out.println("Do you want to continue the calculation? [yes/no]:");
                needReply = scanner.nextLine();
            } while (!needReply.equals("yes") && !needReply.equals("no"));
        } while (!needReply.equals("no"));
    } 
}
