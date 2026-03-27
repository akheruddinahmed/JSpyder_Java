package com.Java8.predefinedfunctionalinterface.bipredicate;

import java.util.function.BiPredicate;

public class Test {
    public static void main(String[] args) {
//        BiPredicate<Integer,Integer> biPredicate=
//                (Integer num1 ,Integer num2)-> {
//                    if (num1 > num2) {
//                        return true;
//                    } else return false;
//                };

        BiPredicate<Integer,Integer> biPredicate= (num1,num2)-> num1 > num2;

        System.out.println(biPredicate.test(5,2));
    }
}
