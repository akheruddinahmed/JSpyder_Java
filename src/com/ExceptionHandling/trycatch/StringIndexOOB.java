package com.ExceptionHandling.trycatch;

public class StringIndexOOB {
    public static void main(String[] args) {
        String s="java";
        try{
            System.out.println(s.charAt(4));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (Exception e){
            System.out.println("Exception-Block");
        }

    }
}

//to provide multiple solution for multiple try block we use multiple catch block
