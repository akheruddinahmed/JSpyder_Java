package com.AdvProgramming.String;

public class AddFullNum2FromString {
    public static void main(String[] args) {

        String s = "25ajhdd88";
        char[] a = s.toCharArray();

        int sum = 0;
        int num = 0;
        int i = 0;

        while (i < a.length) {
            // collect one full number
            while (i < a.length && a[i] >= '0' && a[i] <= '9') {
                num = (num * 10) + (a[i] - '0');
                i++;
            }
            sum += num;  // add the completed number
            num = 0;     // reset for next number
            i++;         // move past the non-digit
        }

        System.out.println(sum); // prints 113
    }
}
