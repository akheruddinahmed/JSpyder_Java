package com.Java8.lamdafunction.ex3;

public class Driver  {


    public static void main(String[] args) {
        Panter p=()-> {
            System.out.println("PAnter from anonymous classs");
        };
        p.display();

    }
}
