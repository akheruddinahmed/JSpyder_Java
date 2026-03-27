package com.CollectionFramework.Generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add("Akher");
        System.out.println(l);
        System.out.println("=================");

        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        //list.add("rose")//CTE
        System.out.println(list);
    }
}
