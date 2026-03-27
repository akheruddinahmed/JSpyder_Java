package com.CollectionFramework.List.ArrayList;

import java.util.ArrayList;

public class AL2 {
    public static void main(String[] args) {
        //List l= Arrays.asList(10,20,30,40,50);//Like array fixed size

        ArrayList a1=new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);

        ArrayList a2=new ArrayList();
        a2.addAll(a1);
        a2.add(60);
        a2.add(70);
        a2.add(80);
        System.out.println(a2.containsAll(a1));
        //a2.removeAll(a1);
        a2.retainAll(a1);
        System.out.println(a1);
        System.out.println(a2);

    }
}
