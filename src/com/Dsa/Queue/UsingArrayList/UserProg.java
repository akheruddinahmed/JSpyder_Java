package com.Dsa.Queue.UsingArrayList;

public class UserProg {
    public static void main(String[] args) {
        QueueUsingArrayList q=new QueueUsingArrayList();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println("=====================");
        while (!q.isEmpty())
            System.out.println(q.poll());
        System.out.println("=====================");
        System.out.println(q.isEmpty());


    }
}
