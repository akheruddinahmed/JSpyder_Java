package com.AdvProgramming.Array;

public class PrintEvenElement {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        for (int n:a){
            if(n%2==0){
                System.out.println(n);
            }
        }
    }
}
