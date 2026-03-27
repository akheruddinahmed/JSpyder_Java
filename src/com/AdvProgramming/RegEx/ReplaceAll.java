package com.AdvProgramming.RegEx;

public class ReplaceAll {
    public static void main(String[] args) {
        String s="java is 12 very easy 34";
        String replace=s.replaceAll("[0-9]","");
        System.out.println(replace);
    }
}
