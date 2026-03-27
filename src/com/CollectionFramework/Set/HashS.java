package com.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class HashS {
    public static void main(String[] args) {
        Set<String> s=new HashSet<String>();
        s.add("java");
        s.add("Ramu");
        s.add(null);
        s.add("java");
        s.add(null);
        //System.out.println(s);
        for(String str:s)
            System.out.println(str);

    }
}
