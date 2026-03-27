package com.AdvProgramming.Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        // original array
        int[] a = {9,7,0,4,8,9,0,1};

        // call merge sort
        sort(a);

        // print sorted array
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a){

        // base condition
        // if array size is 1, it is already sorted
        if (a.length <= 1)
            return;

        // divide array into two halves
        int[] left = new int[a.length / 2];
        int[] right = new int[a.length - left.length];

        // copy elements into left array
        for (int i = 0; i < left.length; i++)
            left[i] = a[i];

        // copy remaining elements into right array
        for (int j = 0; j < right.length; j++)
            right[j] = a[left.length + j];

        // recursively sort left half
        sort(left);

        // recursively sort right half
        sort(right);

        // merge two sorted halves into original array
        merge(left, right, a);
    }

    public static void merge(int[] a, int[] b, int[] c){

        // i -> index for left array
        // j -> index for right array
        // k -> index for merged array
        int i = 0, j = 0, k = 0;

        // compare elements of left and right arrays
        // and store the smaller element into result array
        while (i < a.length && j < b.length){

            if (a[i] < b[j])
                c[k++] = a[i++];   // copy from left array

            else
                c[k++] = b[j++];   // copy from right array
        }

        // copy remaining elements of left array (if any)
        while (i < a.length)
            c[k++] = a[i++];

        // copy remaining elements of right array (if any)
        while (j < b.length)
            c[k++] = b[j++];
    }
}

/*
Easy Way to Remember Merge Sort Logic

3 Steps

1️⃣ Divide
Split array into two halves.

2️⃣ Sort
Recursively sort left and right halves.

3️⃣ Merge
Combine two sorted arrays into one sorted array.

Time Complexity
	•	Best: O(n log n)
	•	Average: O(n log n)
	•	Worst: O(n log n)

Space Complexity
	•	O(n) (extra arrays used)


 */