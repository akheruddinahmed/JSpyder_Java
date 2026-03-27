package com.AdvProgramming.String;

public class Demo7 {
    public static void main(String[] args) {
        String s1="java is an oop lang";
        String[] arr=s1.split(" ");

        int len=arr.length;
        String s2=arr[len-1];
        for (int i=len-2;i>=0;i--){
            s2=s2+" "+ arr[i];
        }
        System.out.println(s2);
    }
}
