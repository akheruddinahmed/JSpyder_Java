package com.AdvProgramming.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        // Input array
        int[] a = {5, 6, 4, 3, 8, 9, 0, 1, 1};

        // Call sorting method
        sort(a);

        // Print sorted array
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {

        // Outer loop: moves boundary of unsorted part
        for (int i = 0; i < a.length-1; i++) {

            // Assume current index has minimum value
            int minIndex = i;

            // Inner loop: find actual minimum in remaining array
            for (int j = i + 1; j < a.length; j++) {

                // If smaller element found, update minIndex
                if (a[j] < a[minIndex])
                    minIndex = j;
            }

            // Swap the found minimum element with current position (i)
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
}

/*
TC=O(n^2)
Quick Revision Notes:
	•	Selection Sort divides array into sorted + unsorted

	•	In each pass:
	•	Find minimum element
	•	Place it at correct position

	•	Time Complexity: O(n²) (always)
	•	Space Complexity: O(1) (in-place)
	•	Not stable (because of swapping)
 */