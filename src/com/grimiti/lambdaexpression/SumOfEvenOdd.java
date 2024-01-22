package com.grimiti.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate the sum of squares of odd numbers
        int sumOfSquaresOdd = calculateSumOfSquaresOdd(numbers);
        System.out.println("Sum of squares of odd numbers: " + sumOfSquaresOdd);

        // Calculate the sum of squares of even numbers
        int sumOfSquaresEven = calculateSumOfSquaresEven(numbers);
        System.out.println("Sum of squares of even numbers: " + sumOfSquaresEven);
    }

    private static int calculateSumOfSquaresOdd(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                sum += number * number;
            }
        }
        return sum;
    }

    private static int calculateSumOfSquaresEven(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number * number;
            }
        }
        return sum;
    }
}
