package com.ExceptionHandling.trycatch;

public class Demo {
    //static Demo d=null;
    public static void m1(){
        System.out.println("m1() -demo");
    }
    //by pointion null reference , we can get NullPointerException

    public static void main(String[] args) {
        Demo d=null;
        System.out.println("main start");
        d.m1(); //Null Pointer Exception
        System.out.println("Main ends");
    }
}
