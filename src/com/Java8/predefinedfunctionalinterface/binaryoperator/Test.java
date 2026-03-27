package com.Java8.predefinedfunctionalinterface.binaryoperator;

import java.util.function.BinaryOperator;


//In BinaryOperator, whatever input type is given , output type also same type,it accepts two argument
public class Test {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator=(a,b)->a*b;
        System.out.println(binaryOperator.apply(2,3));
    }
}
