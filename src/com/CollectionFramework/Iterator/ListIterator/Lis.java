package com.CollectionFramework.Iterator.ListIterator;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Lis {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5,6);
        ListIterator<Integer> i= l.listIterator();
        while (i.hasNext())
            System.out.println(i.next());
        System.out.println("=============");
        while (i.hasPrevious())
            System.out.println(i.previous());
    }
}
