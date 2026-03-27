package com.Java8.predefinedfunctionalinterface.predicate;

import java.util.function.Predicate;

public class Palindrome {

    public static void main(String[] args) {

        Predicate<Integer> isPalindrome = (num) -> {
            int original = num;
            int reverse = 0;

            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            return original == reverse;
        };

        int number = 121;

        if (isPalindrome.test(number)) {
            System.out.println(number + " is Palindrome");
        } else {
            System.out.println(number + " is Not Palindrome");
        }
    }
}