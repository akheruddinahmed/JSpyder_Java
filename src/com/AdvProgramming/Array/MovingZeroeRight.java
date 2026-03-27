package com.AdvProgramming.Array;

import java.util.Arrays;

public class MovingZeroeRight {
    public static void main(String[] args) {
        int[] a={9,0,3,0,5,0};
       // int[]b=new int[a.length];

//        int count=0;
//        // count is responsible for b array index and i is responsible for a array index.
//
//        for (int i=0;i<=a.length-1;i++){
//            if (a[i]!=0){
//                b[count++]=a[i];
//            }
//        }
//        System.out.println(Arrays.toString(b));

//without creating array b
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[count++] = a[i];
            }
        }

        while (count < a.length) {
            a[count++] = 0;
        }

        System.out.println(Arrays.toString(a));
    }
}


