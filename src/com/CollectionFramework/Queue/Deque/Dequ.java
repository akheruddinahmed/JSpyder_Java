package com.CollectionFramework.Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequ {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        deque.add(60);
        System.out.println(deque.pollFirst());//10
        System.out.println(deque.pollLast());//60
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println("==========");
        while (!deque.isEmpty()) {
            System.out.println(deque.pollLast());
        }
        System.out.println("==============");
        System.out.println(deque.isEmpty());
    }
}
