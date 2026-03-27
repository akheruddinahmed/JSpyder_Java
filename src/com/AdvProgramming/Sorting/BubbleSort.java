package com.AdvProgramming.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={8,7,5,0,6};
        sort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void sort(int[]a)
    {
        for (int i=0;i<a.length-1;i++){ //n-1
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    //swap
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}

//Time Complexity- O(n^2)

