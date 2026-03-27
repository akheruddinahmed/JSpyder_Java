package com.AdvProgramming.Array;

public class MaxElementFromAnArray {
    //wap to print max element.

    public static void main(String[] args) {
        int[] a={5,3,8,0,1,4};
        int max=0;
        for (int n:a){
            if (n>max){
                max=n;
            }
        }
        System.out.println(max);

    }
}
