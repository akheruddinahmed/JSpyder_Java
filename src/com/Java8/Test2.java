package com.Java8;

interface Sam1{
    default void name(){
        System.out.println("akher");
    }
}

interface Sam2{

    default void name(){
        System.out.println("akheru");
    }
}


public class Test2 implements  Sam1,Sam2{

    //why we get diamond problem
    //diamond problem geting for duplicate method
    //for constructor
//any one method you need to override
    @Override
    public void name() {
        Sam1.super.name();
        Sam2.super.name();
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.name();


    }
}


//default method how we can call
//Interface name.super.methodname