package com.AdvProgramming.TwoDArray;

public class SpiralMatrix {
    public static void main(String[] args) {
        int n=5;
        int row=0;
        int col=-1;
        char dir='r';
        int[][]a=new int[n][n];
        for (int i=1;i<=n*n;i++){
            switch (dir){
                case 'r':{
                    col++;
                    a[row][col]=i;
                    if (col==a.length-1||a[row][col+1]!=0) //if column is the last column of tht row OR column has element not empty(0)
                        dir='d';
                }
                break;
                case 'd':{
                    row++;
                    a[row][col]=i;
                    if (row==a.length-1||a[row+1][col]!=0) // if above is row++ , then in if condition also a[row+1][col]!=0
                        dir='l';
                }
                break;
                case 'l':{
                    col--;
                    a[row][col]=i;
                    if (col==0||a[row][col-1]!=0) //if above is column-- , then in if condition also a[row1][col-1]!=0
                        dir='u';
                }
                break;
                case 'u':{
                    row--;
                    a[row][col]=i;
                    if (a[row-1][col]!=0)
                        dir='r';
                }
                break;
            }
        }
        for (int[] m:a){
            for (int num:m)
                System.out.print(num+"\t");
            System.out.println();
        }
    }
}
