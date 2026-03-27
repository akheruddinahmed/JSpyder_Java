package com.AdvProgramming.String;

public class Demo5 {
    public static void main(String[] args) {
        String s1="javadeveloper";
        System.out.println(s1.replace('a','@'));
        System.out.println(s1.replace("java","Python"));
        System.out.println(s1.replace('x','y'));
        System.out.println(s1.replace("java",""));


        String s2="     java developer    ";
        System.out.println(s2.trim());
    }
}
