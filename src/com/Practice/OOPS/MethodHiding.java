package com.Practice.OOPS;

class A{
    public static void m1(){
        System.out.println("m1 from A");
    }
}

class C extends A{
    public static void m1(){
        System.out.println("m1 from B");
    }


    }






public class MethodHiding {
    public static void main(String[] args) {
        A a=new A();
        C c=new C();

        a.m1();

    }

}
