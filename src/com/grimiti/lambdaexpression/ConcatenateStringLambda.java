package com.grimiti.lambdaexpression;

import java.util.function.BiFunction;

public class ConcatenateStringLambda {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + " " + s2;
        String result = concatenate.apply(str1, str2);
        System.out.println(result);
    }
}
