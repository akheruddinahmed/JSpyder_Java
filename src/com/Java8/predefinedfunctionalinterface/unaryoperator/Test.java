package com.Java8.predefinedfunctionalinterface.unaryoperator;

import java.util.function.UnaryOperator;

//In UnaryOperator, whatever input type is given , output type also same type



public class Test {
    public static void main(String[] args) {
        UnaryOperator<Integer> b=a->a*a;
        System.out.println(b.apply(4));
    }
}
