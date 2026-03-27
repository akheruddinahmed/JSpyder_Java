package com.Java8.lamdafunction.ex1;


@FunctionalInterface
public interface Demo {
    void display();
    default void hi()
    {
        System.out.println("hii");
    }
    default void hi1()
    {
        System.out.println("hi1");
    }
}
