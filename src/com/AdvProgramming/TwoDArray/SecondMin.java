package com.AdvProgramming.TwoDArray;

public class SecondMin {
    public static void main(String[] args) {
        int[][] a = {
                {1, 3},
                {4, 2}
        };

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int val = a[i][j];

                if (val < min1) {
                    min2 = min1;
                    min1 = val;
                } else if (val < min2 && val != min1) {
                    min2 = val;
                }
            }
        }

        System.out.println("Min: " + min1);
        System.out.println("Second Min: " + min2);
    }
}