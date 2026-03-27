package com.AdvProgramming.String;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isPallindrome("madam"));
        System.out.println(isPallindrome("Malayalam"));
        System.out.println(isPallindrome("abcd"));
    }

    static boolean isPallindrome(String s)
    {

        char[]a=s.toLowerCase().toCharArray();
        int i=0, j=a.length-1;
        while (i<j){
            if (a[i]!=a[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}


