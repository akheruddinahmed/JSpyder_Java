package com.Java8.lamdafunction.anonymousclassobject;

public class Test {

    public static void main(String[] args) {
        Thread t1=new Thread(()-> System.out.println("i am caaling run()"));
//        Thread tr=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("i am calling run");
//            }
//        });//annonymous class or object

        //tr.start();
        t1.start();

    }
}
