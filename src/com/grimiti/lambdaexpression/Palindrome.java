package com.grimiti.lambdaexpression;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Alam";
        System.out.println("Is "+str+" palindrome? " +isPalindrome(str));
    }

     public static boolean isPalindrome(String str) {
        int i=0; int j = str.length()-1;
        while (i<j)
        {
            if (str.charAt(i) != str.charAt(j))
                return false;
                i++;
                j--;


        }
         return true;
    }
}
