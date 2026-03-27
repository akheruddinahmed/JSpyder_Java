package com.AdvProgramming.Array;

//create a array  and count event element

public class CountEvenElement {
    public static void main(String[] args) {
        int count=0;
        int[] a={1,2,3,4,5,6,7,8,9};
        for (int n:a){
            if (n%2==0){
                count++;
            }
        }
        System.out.println(count);

    }
}


