package com.MultiThreading;

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Child-Thread: "+ i);
        }
    }
}

public class Test {
    public static void main(String[] args){
        MyThread t=new MyThread();
        t.setPriority(1);
        t.start();
        for(int i=1;i<=10;i++){
            System.out.println("Main Thread:"+i);
        }
    }
}
