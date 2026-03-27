package com.ExceptionHandling.finallyBlock;

public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("main starts");
        System.out.println("db open");
        try{
            System.out.println(10/0);
            return;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Handled");
        }finally {
            System.out.println("DB closed");
        }
        System.out.println("Main ends");
    }
}
