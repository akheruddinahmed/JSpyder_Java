package com.Practice.OOPS;

public class B {
    B(){
        System.out.println("b-constructor");
    }
    B(int i){
        this(20,30);
        System.out.println("B (int)-constructor" +i);
    }
    B(int i,int j){
        this();
        System.out.println(i+" "+ j);

    }

    public static void main(String[] args) {
        B b=new B(10);
    }
}
