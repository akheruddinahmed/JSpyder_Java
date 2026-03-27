package com.Practice;


class Node{
    Object ele;
    Node next;

    public Node(Object ele)
    {
        this.ele=ele;
    }

    public Node(Object ele,Node next)
    {
        this.ele=ele;
        this.next=next;
    }
}

class MyLinkedList{
    Node first;
    Node last;
    int count=0;

    public int size()
    {
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }

    public  boolean add(Object ele)
    {
        if (isEmpty())
        {
            first=last=new Node(ele);
            count++;
            return true;
        }
       Node n=new Node(ele);
        last.next=n;
        count++;
        last=n;
        return true;

    }

    public void add(int index, Object ele)
    {
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        }

        if(index == 0){
            first = new Node(ele, first);
            if(last == null){
                last = first;
            }
            count++;
            return;
        }

        Node curr = first;

        for(int i = 1; i < index; i++){
            curr = curr.next;
        }

        Node newNode = new Node(ele, curr.next);
        curr.next = newNode;

        if(newNode.next == null){
            last = newNode;
        }

        count++;
    }

}

public class main {
    public static void main(String[] args) {
        MyLinkedList m =new MyLinkedList();
        System.out.println(m.add(10));
    }
}
