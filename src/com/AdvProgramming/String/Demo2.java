package com.AdvProgramming.String;

public class Demo2 {
    public static void main(String[] args) {
        String s1="javadeveloper";
        System.out.println(s1.length());
        System.out.println(s1.charAt(5));
        System.out.println(s1.indexOf('e'));
        System.out.println(s1.indexOf("dev"));
        System.out.println(s1.indexOf("ab"));
        System.out.println(s1.indexOf('e',8));
        System.out.println(s1.lastIndexOf('a'));

    }
}
