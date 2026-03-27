package com.AdvProgramming.TwoDArray;

import java.util.Arrays;

public class IterateForEachLoop {
    public static void main(String[] args) {
        int[][]a={{1,2,3},{4,5,6},{8,9,10}};
        for (int[] n:a){
            System.out.println(Arrays.toString(n));
        }

    }
}
