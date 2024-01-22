package com.grimiti.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SumOfEvenOddLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate the sum of squares of odd numbers
        int sumOfSquaresOdd = calculateSumOfSquares(numbers, number -> number % 2 != 0);
        System.out.println("Sum of squares of odd numbers: " + sumOfSquaresOdd);

        // Calculate the sum of squares of even numbers
        int sumOfSquaresEven = calculateSumOfSquares(numbers, number -> number % 2 == 0);
        System.out.println("Sum of squares of even numbers: " + sumOfSquaresEven);
    }

    private static int calculateSumOfSquares(List<Integer> numbers, Predicate<Integer> predicate) {
        int sum = 0;
        for (int number : numbers) {
            if (predicate.test(number)) {
                sum += number * number;
            }
        }
        return sum;

    }
}
