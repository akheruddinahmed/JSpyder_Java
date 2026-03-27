package com.AdvProgramming.String;

public class Palindrome {
    public static void main(String[] args) {
        String s="malayalam";
        String rev=new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev));
    }
}
