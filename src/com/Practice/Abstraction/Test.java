package com.Practice.Abstraction;


abstract class A{
    abstract public void m1();
    public void m2(){
        System.out.println("M2() in A");
    }
}

class B extends A{
    @Override
    public void m1() {
        System.out.println("M1() from B");
    }


}

public class Test {
    public static void main(String[] args) {
        A a=new B();
        a.m1();
        a.m2();
    }
}
