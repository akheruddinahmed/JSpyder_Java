package com.AdvProgramming.String;

public class Demo6 {
    public static void main(String[] args) {
        String s="developer";
        for (int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
        }

        System.out.println("----------------");


//to use for each loop ,we need to convert string to an array,because for each loop can be used only in an array
        char[] a=s.toCharArray();
        //using for each loop
        for (char c :a)
        {
            System.out.println(c);
        }
    }
}
