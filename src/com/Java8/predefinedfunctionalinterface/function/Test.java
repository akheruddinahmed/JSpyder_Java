package com.Java8.predefinedfunctionalinterface.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
//        Function<String,Integer> func=(String name)->{
//            return name.length();
//        };

        Function<String,Integer> func=name->name.length();




        System.out.println(func.apply("Akher"));
    }


}
