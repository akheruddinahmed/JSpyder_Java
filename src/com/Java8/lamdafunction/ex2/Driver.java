package com.Java8.lamdafunction.ex2;

public class Driver {

    public static void main(String[] args) {

        //if there is only one statement,no need to use curley bracket
        Test t=()->System.out.println("show method from anonymous classs");
        t.show();
    }
}
