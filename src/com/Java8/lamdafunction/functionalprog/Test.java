package com.Java8.lamdafunction.functionalprog;

public class Test {

    void display(Demo d){
        d.show(d);   // calling interface method
    }

    public static void main(String[] args) {

        Test t1 = new Test();

        t1.display((d) -> {
            System.out.println("Calling display from Demo");
        });

    }
}