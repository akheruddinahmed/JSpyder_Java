package com.MapFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(10,"Ram");
        m.put(20,"Dev");
        m.put(32,"Shambo");
        m.put(45,"Manoj");
        System.out.println(m.get(10)); //Ram
        System.out.println(m.containsKey(55)); //false
        System.out.println(m.containsValue("manoj")); //false
        Set<Integer> keyset=m.keySet();
        System.out.println(keyset);
        Set<Map.Entry<Integer,String>> entrySet=m.entrySet();
        System.out.println(entrySet);
    }
}
