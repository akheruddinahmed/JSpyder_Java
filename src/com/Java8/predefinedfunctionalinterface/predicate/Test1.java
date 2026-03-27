package com.Java8.predefinedfunctionalinterface.predicate;

import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
//        Predicate<Integer> pr=(num)->{
//            if (num%2==0){
//                return true;
//            }else return false;
//        };
//        System.out.println(pr.test(2));

        Predicate<Integer> pr=num->num%2==0;
        System.out.println(pr.test(2));
    }




}


