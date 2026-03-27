package com.MultiThreading;

class Th1 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){

            }
            System.out.println("T1 : " +i);
        }
    }
}


public class Daem {
    public static void main(String[] args) throws InterruptedException {
        Th1 t1=new Th1();
        t1.setDaemon(true); //non dauemon to daemon
        t1.start();
        for(int i=1;i<=10;i++){
            Thread.sleep(100);
            System.out.println("MAin : "+i);
            if(i==5)
                System.out.println(i/0);

        }
    }
}
//when non daemon thread got an exception , daemon thread will stop
