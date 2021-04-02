import java.util.Scanner;

public class Calculator  {	
    public static void main(String[] args) {
        double num1;
        double num2;
        char typeOfOperation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = scanner.nextDouble();
        System.out.println("Enter the type of operation");
        typeOfOperation = scanner.next().charAt(0);
        System.out.println("Enter the second number");
        num2 = scanner.nextDouble();
        if (typeOfOperation == '*') System.out.println(num1 + " * " + num2 + " = "+ num1*num2);
        else if (typeOfOperation == '/') System.out.println(num1 + " / " + num2 + " = " + num1/num2);
        else if (typeOfOperation == '^') System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1,num2));
        else if (typeOfOperation == '+') System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
        else if (typeOfOperation == '-') System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        else if (typeOfOperation == '%') System.out.println(num1 + " % " + num2 + " = " + num1 % num2);
        else System.out.println("You entered incorrect data");
    }
}