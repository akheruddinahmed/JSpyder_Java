package com.ExceptionHandling.trycatch;

public class Demo2 {
    public void m1(){
        System.out.println("m1() -demo");
    }
    //by pointion null reference , we can get NullPointerException

    public static void main(String[] args) {
        Demo2 d=null;
        System.out.println("main start");
        d.m1(); //Null Pointer Exception
        System.out.println("Main ends");
    }
}
