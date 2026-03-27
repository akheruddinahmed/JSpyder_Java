package com.CollectionFramework.Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterat2 {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);

        Iterator<Integer> i=s.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
