package com.CollectionFramework.List.Stack;

import java.util.Stack;

public class St1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop()); //50
        System.out.println(stack.peek());//40
        System.out.println("==============");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("===========");
        System.out.println(stack.isEmpty());
    }
}
