package com.MultiThreading;

class T1 extends Thread{
    @Override
    public void run(){
        try {
            Demo.m.join();
        }catch (InterruptedException e){

        }
        for(int i=1;i<=10;i++){
            System.out.println("T1 : " +i);
        }

    }
}

class T2 extends Thread{
    @Override
    public void run(){
        try {
            Demo.t1.join();
        }catch (InterruptedException e){

        }
        for (int i=1;i<=10;i++){
            System.out.println("T2 :" + i);
        }
    }
}

public class Demo {
    static Thread m;
    static T1 t1;

    public static void main(String[] args) {
        m=Thread.currentThread();
        t1=new T1();
        T2 t2=new T2();
        t1.start();
        t2.start();
        for (int i=1;i<=10;i++){
            System.out.println("Main :"+ i);
        }
    }
}
