package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public double calculate(double num1, String sign, double num2) {
        switch (sign) {
            case "*" : return (num1 * num2);
            case "/" : return (num1 / num2);
            case "^" : return Math.pow(num1, num2);
            case "+" : return (num1 + num2);
            case "-" : return (num1 - num2);
            case "%" : return (num1 % num2);
        }
        return 0;
    }
}