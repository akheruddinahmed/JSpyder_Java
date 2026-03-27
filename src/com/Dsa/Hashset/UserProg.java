package com.Dsa.Hashset;

public class UserProg {
    public static void main(String[] args) {
        MyHashSet h=new MyHashSet();
        System.out.println(h.size());
        h.add("Akher");
        h.add("Anis");
        h.add("bulbul");

        h.add("Akher");
        h.add("Anis");
        h.add("bulbul");
        System.out.println(h.size());
        h.remove("Anis");

        System.out.println(h.contains("Akher"));
        h.display();

    }
}
