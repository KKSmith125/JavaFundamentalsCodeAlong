package calculator_app;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Kaylee & DataCamp's Calculator!");

        double num1 = 0.0;
        double num2 = 0.0;
        String operation = "+";

        System.out.println("Please enter your first number:");
        num1 = input.nextDouble();

        System.out.println("Please enter your second number:");
        num2 = input.nextDouble();

        System.out.println("Please enter your desired operation:");
        try {
            operation = input.next();
        } catch (Exception e) {
            System.out.println("Only the +, -, *, /, or % operations are accepted.");
            System.exit(0);
        }

        switch (operation) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
        }
    }
}