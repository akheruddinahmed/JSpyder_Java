package com.Dsa.ArrayList;

import java.util.ArrayList;

public class UserProg {
    public static void main(String[] args) {
        MyArrayList a=new MyArrayList();
        a.add(10);
        a.add("akher");
        a.add(true);
        a.add(40);
        a.add(50);
        a.add(60);
//        System.out.println(a.size());
//        System.out.println(a.isEmpty());
       // System.out.println(a.contains(900));

        a.remove(2);
        System.out.println(a.get(0));
        a.clear();
        System.out.println(a.isEmpty());




    }
}
