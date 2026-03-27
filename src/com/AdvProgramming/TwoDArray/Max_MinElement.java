package com.AdvProgramming.TwoDArray;

public class Max_MinElement {
    public static void main(String[] args) {
        int[][] a = {
                {1, 3},
                {4, 2}};
        int max=0;
        int min=a[0][0];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                if(a[i][j]>max)max=a[i][j];
                if (a[i][j]<min)min=a[i][j];
            }
        }
        System.out.println("Maximum Element of the 2D Array is: " + max);
        System.out.println("Minimum Element of the 2D Array is: " + min);
    }
}
