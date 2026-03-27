package com.AdvProgramming.String;

public class Demo8 {
    public static void main(String[] args) {
        String s1 = "java is an oop lang";
        String s2 = "";
        char[] a = s1.toCharArray();

        int i = a.length - 1;
        int j = a.length - 1;

        while (i >= 0) {

            while (i >= 0 && a[i] != ' ') {
                i--;
            }

            int k = i + 1;
            String temp = "";

            while (k <= j) {
                temp += a[k];   // ← missing line
                k++;
            }

            s2 += temp;

            if (i > 0)
                s2 += " ";

            j = i - 1;
            i = j;
        }

        System.out.println(s2);
    }
}