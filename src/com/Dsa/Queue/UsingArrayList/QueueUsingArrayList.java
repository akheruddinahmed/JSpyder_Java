package com.Dsa.Queue.UsingArrayList;

import java.util.NoSuchElementException;

public class QueueUsingArrayList {

    Object[] o = new Object[10];
    int count = 0;

    public void add(Object ele) {
        if (count >= o.length)
            increase();
        o[count++] = ele;
    }

    private void increase() {
        Object[] a = new Object[o.length + 5];
        for (int i = 0; i < o.length; i++)
            a[i] = o[i];
        o = a;
    }

    public Object peek() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");
        return o[0];
    }

    public Object poll() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");

        Object key = o[0];

        // shift elements left
        for (int i = 1; i < count; i++) {
            o[i - 1] = o[i];
        }

        o[--count] = null; // avoid memory leak
        return key;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}