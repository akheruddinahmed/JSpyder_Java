package com.Dsa.LinkedList.SinglyLL;

import java.util.LinkedList;

public class UserProg {
    public static void main(String[] args) {

        MyLinkedList l = new MyLinkedList();

        System.out.println("Is list empty? " + l.isEmpty());

        // add()
        l.add(10);
        l.add(20);
        l.add(30);
        l.add("Akher");
        l.add(10.5);
        l.add(true);
        l.add(500L);
        l.reverse();

        System.out.println("\nAfter add():");
        l.display();
        System.out.println("Size: " + l.size());
        System.out.println("-----------------------");
        System.out.println(l.contains(20));
        // addFirst()
        l.addFirst(5);
        System.out.println("\nAfter addFirst(5):");
        l.display();
        System.out.println("Size: " + l.size());

        // addIndex()
        l.addIndex(99, 3);
        System.out.println("\nAfter addIndex(99, 3):");
        l.display();
        System.out.println("Size: " + l.size());

        // removeFirst()
        l.removeFirst();
        System.out.println("\nAfter removeFirst():");
        l.display();
        System.out.println("Size: " + l.size());

        // remove(index)
        l.remove(2);
        System.out.println("\nAfter remove(2):");
        l.display();
        System.out.println("Size: " + l.size());

        // isEmpty()
        System.out.println("\nIs list empty? " + l.isEmpty());


    }
}