package com.Dsa.ArrayList;

public class StackImp {
    MyArrayList a=new MyArrayList();
    public void push(Object ele){
        a.add(ele);
    }

    public Object pop(){
        Object key=a.get(a.size()-1);
        a.remove(a.size()-1);
        return key;
    }
    public  int size(){
        return a.size();
    }

    public boolean isEmpty(){
        return a.isEmpty();
    }

    public static void main(String[] args) {
        StackImp a=new StackImp();
        a.push(10);
        a.push(20);
        a.push(30);

    }
}
