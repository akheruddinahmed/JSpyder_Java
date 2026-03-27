package com.Dsa.ArrayList;

public class StackUsingArrayList {
    Object[] o = new Object[10];
    int count = 0;

    public void push(Object ele) {
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

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Object pop() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");

        Object ele = o[count - 1];
        o[count - 1] = null;
        count--;
        return ele;
    }

    public Object peek() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");

        return o[count - 1];
    }
}