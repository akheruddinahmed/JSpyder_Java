package com.AdvProgramming.Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {9,3,4,1,2,9,0};

        // call quick sort
        sort(a, 0, a.length - 1);

        // print sorted array
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int st, int end) {

        // base condition: if array has 0 or 1 element
        if (st >= end)
            return;

        // left pointer
        int i = st;

        // right pointer
        int j = end;

        // choose middle element as pivot
        int pivot = a[(st + end) / 2];

        // partition process
        while (i <= j) {

            // move i until element >= pivot
            while (a[i] < pivot) {
                i++;
            }

            // move j until element <= pivot
            while (a[j] > pivot) {
                j--;
            }

            // swap elements if i <= j
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                // move pointers after swap
                i++;
                j--;
            }
        }

        // recursively sort left part
        sort(a, st, j); // recursively sort left partition

        // recursively sort right part
        sort(a, i, end);// recursively sort right partition
        /*
        [   left part   |   right part   ]
         st            j   i            end

	•	j is the last index of left partition
	•	i is the first index of right partition

         */
    }
}

//Simple Logic
//	1.	Pick a pivot element (middle element here).
//  2.	Move left pointer (i) until element ≥ pivot.
//	3.	Move right pointer (j) until element ≤ pivot.
//	4.	Swap elements.
//  5.	Repeat until pointers cross.
//  6.	Recursively sort left part and right part.


/*
	•	i stops at wrong element on left (too big)
	•	j stops at wrong element on right (too small)
	•	Then swap
 */
