package com.AdvProgramming.TwoDArray;

public class SumDia {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int sum=0;

        //or using double for loop ,TC=0(n^2)
//        for(int i=0;i<a.length;i++)
//        {
//            for (int j=0;j<a[i].length;j++)
//            {
//                if(i==j||i+j==a.length-1) sum+=a[i][j];
//            }
//        }
//        System.out.println(sum);


        //or using single for loop ,TC=0(n)

        for (int i=0;i<a.length;i++)
        {
            sum+=a[i][i];
            if (i!=a.length-1-i)
                sum+=a[i][a.length-1-i];
        }
        System.out.println(sum);
    }
}
