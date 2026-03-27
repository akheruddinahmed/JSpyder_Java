package com.ExceptionHandling.throw_customException;

public class Matrimony {
    public static void main(String[] args) {
        int age=46;
        if(age>26&& age<36){
            System.out.println("elligible");
        }else {
            throw new AgeInvalidException();
        }
    }
}
