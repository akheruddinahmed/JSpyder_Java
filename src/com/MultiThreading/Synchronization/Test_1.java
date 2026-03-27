package com.MultiThreading.Synchronization;

//Object Level Lock

class A
{
    public synchronized void m1(String s){
        for(int i=1;i<=10;i++){
            System.out.println("m1() Executed By : " +s);
        }
    }
}
class Th1 extends Thread{
    A a;
    String s;
    public Th1(A a,String s){
        this.a=a;
        this.s=s;
    }
    @Override
    public void run(){
        a.m1(s);
    }

}

public class Test_1 {
    public static void main(String[] args) {
A a=new A();
Th1 t1=new Th1(a,"T1");
Th1 t2=new Th1(a,"T2");
t1.start();
t2.start();
    }
}
