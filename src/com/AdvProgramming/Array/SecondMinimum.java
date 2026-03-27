package com.AdvProgramming.Array;

public class SecondMinimum {
    public static void main(String[] args) {

        int[] a = {3, 9, 3, 1, 9, 8, 5, 2};

        if (a.length < 2) {
            System.out.println("Second minimum not possible");
            return;
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : a) {

            if (num < min1) {
                min2 = min1;
                min1 = num;
            }
            else if (num > min1 && num < min2) {
                min2 = num;
            }
        }

        if (min2 == Integer.MAX_VALUE) {
            System.out.println("No second minimum found");
        } else {
            System.out.println("Minimum: " + min1);
            System.out.println("Second Minimum: " + min2);
        }
    }
}