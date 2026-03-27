package com.AdvProgramming.TwoDArray;

public class MaxElement {
    public static void main(String[] args) {
        int[][] a = {
                {1, 3},
                {4, 2}};
        int max=a[0][0];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                if (max<a[i][j])
                {
                    max=a[i][j];
                }
            }
        }
        System.out.println("Maximum Element of the 2D Array is: " + max);
    }
}
