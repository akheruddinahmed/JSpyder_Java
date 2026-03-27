package com.CollectionFramework.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Itera {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(10);

        Iterator<Integer> i=l.iterator();
        while (i.hasNext()){
            int n=i.next();
            if(n==40)
                i.remove();
        }
        System.out.println(l);
    }
}
