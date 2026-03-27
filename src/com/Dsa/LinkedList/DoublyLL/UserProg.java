package com.Dsa.LinkedList.DoublyLL;

public class UserProg {
    public static void main(String[] args) {
        MyDoublyLinkedList d=new MyDoublyLinkedList();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        d.display();
        System.out.println("-----------------------");
        d.revDisplay();
        System.out.println("-----------------------");
        System.out.println(d.contains(20));
        System.out.println("-----------------------");
        System.out.println(d.size());
        System.out.println("-----------------------");
        System.out.println(d.isEmpty());
        System.out.println("-----------------------");
        d.addIndex(1.5,2);
        d.display();
        System.out.println("-----------------------");
        d.addFirst(0);
        d.display();
        System.out.println("-----------------------");
        d.addLast(6);
        d.display();
        System.out.println("-----------------------");
        d.removeFirst();
        d.display();
        System.out.println("-----------------------");
        d.removLast();
        d.display();
        System.out.println("-----------------------");
        d.remove(2);
        d.display();

    }
}
