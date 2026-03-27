package com.AdvProgramming.Array;

public class SecondMaximum {
    public static void main(String[] args) {

        int[] a = {3, 9, 3, 1, 9, 8, 5, 2};

        if (a.length < 2) {
            System.out.println("Second maximum not possible");
            return;
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : a) {

            if (num > max1) {
                max2 = max1;
                max1 = num;
            }
            else if (num < max1 && num > max2) {
                max2 = num;
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            System.out.println("No second maximum found");
        } else {
            System.out.println("Maximum: " + max1);
            System.out.println("Second Maximum: " + max2);
        }
    }
}