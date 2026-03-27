package com.Java8.predefinedfunctionalinterface.bifunction;

import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction=(x,y)->x+y;
        System.out.println(biFunction.apply(2,3));


    }

}
