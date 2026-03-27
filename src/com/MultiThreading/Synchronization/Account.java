package com.MultiThreading.Synchronization;

public class Account {
    int bal;
    public  Account(int bal){
        this.bal=bal;
    }
    public synchronized  void withdraw(int amount){
        if(amount>bal){
            System.out.println("less bal...");
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        bal-=amount;
        System.out.println(amount+"is withdraw done");
        System.out.println(bal+"is available");
    }

    public synchronized void deposit(int amount){
        System.out.println("Going to deposit");
        bal+=amount;
        notify();
        System.out.println("Deposit done");
    }
}
class Demo{
    public static void main(String[] args) {
        Account a=new Account(5000);
        new Thread(){
            @Override
            public void run(){
                a.withdraw(7000);
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                a.deposit(5000);
            }
        }.start();
    }
}
