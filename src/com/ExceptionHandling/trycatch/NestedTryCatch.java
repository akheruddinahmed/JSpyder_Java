package com.ExceptionHandling.trycatch;

public class NestedTryCatch {
    public static void main(String[] args) {
        System.out.println("Main Start");
        int[] a={4,3,2,1};
        try{
            System.out.println("OuterTry");
            System.out.println(a[a.length]);
            try {
                System.out.println("InnerTry");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("InnerCatch");
            }
        }catch (ArithmeticException e){
            System.out.println("OuterCatch");
        }
        System.out.println("Main Ends");
    }
}
