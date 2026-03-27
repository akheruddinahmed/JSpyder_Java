package com.CollectionFramework.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSe {

    public static void main(String[] args) {

        Set<String> s = new TreeSet<>();

        s.add("heman");
        s.add("heman");
        s.add("ram");
        s.add("ram");
        // s.add(null); // NullPointerException

        System.out.println(s);
    }
}