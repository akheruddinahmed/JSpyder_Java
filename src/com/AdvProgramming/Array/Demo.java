package com.AdvProgramming.Array;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[]a={1,0,2,3,40,5,0,60,9,0};
        int i = 0;
        int j = a.length-1;
        while(i<j)
        {
            while(a[i]==0){i++;}
            while (a[j]!=0){j--;}
            if (i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;

            }
        }
        System.out.println(Arrays.toString(a));
    }
}
