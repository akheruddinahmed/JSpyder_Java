package com.Java8.predefinedfunctionalinterface.supplier;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Supplier<Double> supplier= ()->Math.random();
        System.out.println(supplier.get());
    }
}
