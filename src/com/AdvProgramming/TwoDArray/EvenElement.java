package com.AdvProgramming.TwoDArray;

public class EvenElement {
    public static void main(String[] args) {
        int[][]a={{1,2,3},{4,5,6},{8,9,10}};
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (a[i][j]%2==0){
//                    System.out.print(a[i][j] + " ");
//                }
//
//            }
//            System.out.println();
//        }

        for (int[]n:a){
            for (int num:n){
                if (num%2==0){
                    System.out.println(num);
                }
            }

        }

    }
}
