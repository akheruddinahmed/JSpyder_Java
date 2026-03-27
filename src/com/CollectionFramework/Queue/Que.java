package com.CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Que {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.poll());//10
        System.out.println(q.peek());//20

        System.out.println("==============");
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
        System.out.println("==============");
        System.out.println(q.isEmpty());




    }
}
