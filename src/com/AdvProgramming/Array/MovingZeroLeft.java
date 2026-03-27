package com.AdvProgramming.Array;

import java.util.Arrays;

public class MovingZeroLeft {
    public static void main(String[] args) {
        int[] a={9,0,3,0,5,0};
//        int[]b=new int[a.length];
//
//        int count=a.length-1;
//        // count is responsible for b array index and i is responsible for a array index.
//
//        for (int i=a.length-1;i>=0;i--){
//            if (a[i]!=0){
//                b[count--]=a[i];
//            }
//        }
//        System.out.println(Arrays.toString(b));

        //without creating array b

        int count=a.length-1;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]!=0){
                a[count--]=a[i];
            }
        }
        while (count>=0){
            a[count--]=0;
        }
        System.out.println(Arrays.toString(a));

    }
}


