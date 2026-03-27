package com.Java8.lamdafunction.ex4;

public class Driver implements Sample {
    @Override
    public void sam() {
        System.out.println("sam method");
    }

    public static void main(String[] args) {
        Sample s=()-> {
            System.out.println("sam method from anonymous classs");
        };
        s.sam();
    }

}
