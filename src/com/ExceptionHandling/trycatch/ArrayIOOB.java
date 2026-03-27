package com.ExceptionHandling.trycatch;

public class ArrayIOOB {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        System.out.println("Main Starts");
        try{
            System.out.println(a[a.length-1/0]);
        }catch (ArrayIndexOutOfBoundsException |ArithmeticException e ){
            e.printStackTrace();
            System.out.println(e.getMessage());
           System.out.println("Handled");
            //System.out.println(a[0]);
        }
        System.out.println("Main ends");

    }
}
//Catch Block Provides alternate solution for that critical line of try block
