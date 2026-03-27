package com.Dsa.Stack.UsingLinkedList;

import java.util.EmptyStackException;

public class Stack<I extends Number> {
    Node head;
    int count = 0;

    public void push(Object ele) {
        Node n = new Node(ele);
        if (head==null){
            head=n;
            count++;
            return;
        }
        n.next = head;
        head = n;
        count++;

    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Object peek() {
        if (head == null)
            throw new EmptyStackException();
        return head.ele;
    }

    public Object pop() {
        if (head == null)
            throw new EmptyStackException();

        Object key = head.ele; // get top element
        head = head.next;      // remove top node
        count--;
        return key;
    }
}