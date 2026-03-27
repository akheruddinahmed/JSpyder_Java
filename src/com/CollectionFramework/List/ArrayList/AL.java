package com.CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AL {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(19);
        l.add(9.5);
        l.add('A');
        l.add("Akher");
        l.add(true);
        System.out.println(l);
        System.out.println(l.get(3));
        System.out.println(l.contains('A'));
        l.add(2,"Mock");
        l.set(4,"Java");
        l.clear();
        System.out.println(l);


    }
}
