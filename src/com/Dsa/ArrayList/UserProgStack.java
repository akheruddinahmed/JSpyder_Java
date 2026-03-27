package com.Dsa.ArrayList;

public class UserProgStack {
    public static void main(String[] args) {
        StackUsingArrayList s=new StackUsingArrayList();
        s.push(10);
        s.push("akher");
        s.push(true);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s.size());
        //System.out.println(s.pop());

        //System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println(s.size());

    }
}
