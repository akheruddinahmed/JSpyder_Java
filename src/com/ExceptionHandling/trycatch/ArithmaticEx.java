package com.ExceptionHandling.trycatch;

public class ArithmaticEx {
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
           e.printStackTrace();
            //System.out.println(e.getMessage());
            //System.out.println("Handled");
        }
        System.out.println("main ends");

    }
}
