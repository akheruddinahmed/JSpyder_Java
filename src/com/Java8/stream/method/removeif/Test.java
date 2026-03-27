package com.Java8.stream.method.removeif;

import java.util.ArrayList;
import java.util.List;

public class Test {
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
        list.add(75);


        //list.remove(1); // remove based on index
        //list.remove(new Integer(20)); // remove based on object

        //this will not work , it throws exception
//        for(Integer integer:list){
//            if (integer%2==0){
//                list.remove(integer);
//            }
//        }
//        System.out.println(list);


//        Predicate<Integer> pr=(e)->{
//            if(e%2==0){
//                return true;
//            }else return false;
//        };
//
//
//        list.removeIf(pr); //not achieve functional programming

        list.removeIf(e->e%2==0); //achieve functional programming//passing the functionality in a method argument

        System.out.println(list);
    }


}
