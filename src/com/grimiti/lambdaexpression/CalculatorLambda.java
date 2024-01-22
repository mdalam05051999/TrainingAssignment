package com.grimiti.lambdaexpression;

import java.util.Scanner;
import java.util.function.BiFunction;

public class CalculatorLambda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, %):");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        BiFunction<Double, Double, Double> operation;

        switch(operator)
        {
            case '+':
                operation = (a, b) -> a + b;
                break;

            case '-':
                operation = (a, b) -> a - b;
                break;

            case '*':
                operation = (a, b) -> a * b;
                break;

            case '/':
                if (num2 != 0) {
                    operation = (a, b) -> a / b;
                } else {
                    System.out.println("Error! Dividing by zero is not allowed.");
                    return;
                }
                break;

            case '%':
                operation = (a, b) -> a % b;
                break;

            default:
                System.out.println("You have entered wrong operator");
                return;
        }

        output = operation.apply(num1, num2);
        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}
