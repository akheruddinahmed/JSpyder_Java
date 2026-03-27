package com.AdvProgramming.TwoDArray;

public class PascalTriangle {
    public static void main(String[] args) {

        int n = 5;                 // number of rows
        int sp = n - 1;           // spaces for formatting (triangle shape)

        int[][] a = new int[n][]; // jagged array (rows will have different sizes)

        isPascal(a);              // fill array with Pascal Triangle values

        // printing the triangle
        for (int i = 0; i < a.length; i++) {

            // print leading spaces
            for (int j = 0; j <= sp; j++)
                System.out.print(" ");

            // print elements of current row
            for (int k = 0; k < a[i].length; k++)
                System.out.print(a[i][k] + " ");

            System.out.println(); // move to next line
            sp--;                 // decrease spaces for next row
        }
    }

    // method to generate Pascal Triangle
    public static void isPascal(int[][] a) {

        for (int i = 0; i < a.length; i++) {

            a[i] = new int[i + 1];   // each row has (i+1) elements

            for (int j = 0; j < a[i].length; j++) {

                // first and last element of each row is always 1
                if (j == 0 || i == j)
                    a[i][j] = 1;

                else
                    // middle elements = sum of two elements above
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
    }
}

/*

	•	Jagged Array → int[][] a = new int[n][]
	•	Row size → i + 1
	•	Edge condition → j == 0 || i == j → 1
	•	Formula → a[i][j] = a[i-1][j-1] + a[i-1][j]
	•	Spaces logic → sp-- after each row
 */