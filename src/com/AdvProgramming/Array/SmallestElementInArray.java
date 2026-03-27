package com.AdvProgramming.Array;

public class SmallestElementInArray {
    //wap to print min element.

    public static void main(String[] args) {
        int[] a={5,3,8,2,1,4};
        int min=a[0];
        for (int n:a){
            if (n<min){
                min=n;
            }
        }
        System.out.println(min);

    }
}

//
