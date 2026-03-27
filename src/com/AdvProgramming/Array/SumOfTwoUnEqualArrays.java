package com.AdvProgramming.Array;

import java.util.Arrays;

public class SumOfTwoUnEqualArrays {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={1,2,3,4,5,6};
        int l=a.length<b.length?a.length:b.length; //this l for looping purpose
        for (int i=0;i<l;i++){
            if (a.length>b.length) a[i]+=b[i];
            else b[i]+=a[i];

        }
        b=a.length>b.length?a:b;
        System.out.println(Arrays.toString(b));
    }
}
