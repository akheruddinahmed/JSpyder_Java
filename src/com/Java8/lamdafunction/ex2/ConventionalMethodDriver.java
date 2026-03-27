package com.Java8.lamdafunction.ex2;

public class ConventionalMethodDriver implements Test {
    @Override
    public void show() {
        System.out.println("I am in show method in conventional method not using lambda fn");
    }
//main method will be in another class
    public static void main(String[] args) {
        Test t=new ConventionalMethodDriver();
        t.show();
    }


}
