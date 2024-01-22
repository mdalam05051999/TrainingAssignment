package com.grimiti.lambdaexpression;

import java.util.function.Predicate;

public class PalindromeLambda {
    public static void main(String[] args) {
        String str = "madam";
        Predicate<String> isPalindrome = s -> {
            int i = 0, j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        };
        System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome.test(str));

    }
}
