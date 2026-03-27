package com.AdvProgramming.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        // original array
        int[] a = {8,9,4,3,2};

        // call insertion sort
        sort(a);

        // print sorted array
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a){

        // start from second element
        // first element is already considered sorted
        for (int i = 1; i < a.length; i++){

            // element to be inserted in correct position
            int key = a[i];

            // index of previous element
            int j = i - 1; //to track sorted part,we use j

            // shift elements greater than key to right
            while (j >= 0 && a[j] > key){
                a[j + 1] = a[j];
                j--;
            }

            // place key in correct position
            a[j + 1] = key;
        }
    }
}