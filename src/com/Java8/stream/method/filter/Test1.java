package com.Java8.stream.method.filter;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

//    static boolean isPrime(int n){
//        if(n <= 1) return false;
//
//        for(int i = 2; i < n; i++){
//            if(n % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(73);




       // list.stream().filter(isPrime);
        list.stream().filter(e->e%2==0).forEach(e-> System.out.println(e));
        //filter() method is used for condition
        //map() is used for process
        //forEach()->printing





    }
}
